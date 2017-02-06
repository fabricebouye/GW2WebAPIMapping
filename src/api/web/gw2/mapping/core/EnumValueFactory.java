/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.core;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This class will provide a central point for mapping values to the proper enum values.
 * It will replace all separate utilities class that are present in the mapping.
 * @author Fabrice Bouyé
 */
public enum EnumValueFactory {
    INSTANCE;

    private static final String UNKNOWN_FIELD_NAME = "UNKNOWN"; // NOI18N.

    /**
     * Map a string value to a value from the provided enum class.
     * @param <T> The type to use.
     * @param enumClass The target enum class.
     * @param source The source value, may be {@code null}.
     * @return A {@code T} instance, never {@code null}.
     * <br>The enum's default value will be used when it's not possible to map the provided string to another value.
     * @throws NullPointerException If {@code enumClass} is {@code null}.
     * @throws IllegalArgumentException If {@code enumClass} does not provide an {@code UNKNOWN} default value.
     */
    public <T extends Enum> T mapEnumValue(final Class<T> enumClass, final Object source) throws NullPointerException, IllegalArgumentException {
        Objects.requireNonNull(enumClass);
        try {
            final Field unknownField = enumClass.getField(UNKNOWN_FIELD_NAME);
            final T unknown = (T) unknownField.get(null);
            T result = unknown;
            if (!Objects.isNull(source)) {
                try {
                    final Method valuesMethod = enumClass.getMethod("values"); // NOI18N.
                    final Field valueField = enumClass.getDeclaredField("value"); // NOI18N.
                    valueField.setAccessible(true);
                    final T[] enumValues = (T[]) valuesMethod.invoke(null);
                    for (final T enumValue : enumValues) {
                        final Object value = valueField.get(enumValue);
                        if ((source instanceof String) && (value instanceof String)) {
                            final String string = (String) source;
                            final String enumString = (String) value;
                            if (string.equalsIgnoreCase(enumString)) {
                                result = enumValue;
                                break;
                            }
                        } else if ((source instanceof Integer) && (value instanceof Integer)) {
                            final Integer number = (Integer) source;
                            final Number enumNumber = (Integer) value;
                            if (number.equals(enumNumber)) {
                                result = enumValue;
                                break;
                            }
                        }
                    }
                } // If we cannot get the enum's value, we use the default value instead. 
                catch (NoSuchMethodException | NoSuchFieldException | InvocationTargetException ex) {
                    Logger.getLogger(EnumValueFactory.class.getName()).log(Level.WARNING, null, ex);
                }
            }
            // Log default value. 
            // This will help detect when new values are added to the API.
            if (result == unknown) {
                final String message = String.format("Could not map \"%s\" to enum %s; defaulting to %s.", source, enumClass.getName(), unknown);
                Logger.getLogger(EnumValueFactory.class.getName()).log(Level.WARNING, message);
            }
            return result;
        } catch (NoSuchFieldException | SecurityException | IllegalAccessException ex) {
            final String message = String.format("Enum %s does not define an %s fail safe value.", enumClass.getName(), UNKNOWN_FIELD_NAME);
            Logger.getLogger(EnumValueFactory.class.getName()).log(Level.SEVERE, message, ex);
            throw new IllegalArgumentException(message, ex);
        }
    }
}
