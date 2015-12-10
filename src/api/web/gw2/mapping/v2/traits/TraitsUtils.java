/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.traits;

import java.util.Arrays;
import java.util.Optional;

/**
 * Utility class for traits.
 * @author Fabrice Bouyé
 */
public enum TraitsUtils {

    /**
     * The unique instance of this class.
     */
    INSTANCE;

    /**
     * Gets the trait attribute for given value.
     * @param value The source value.
     * @return A {@code TraitAttribute} instance, never {@code null}.
     * <br>If no corresponding value is found, {@code TraitAttribute.UNKNOWN} is returned.
     * @see TraitAttribute
     */
    public static TraitAttribute findTraitAttribute(final String value) {
        final Optional<TraitAttribute> resultOptional = Arrays.stream(TraitAttribute.values())
                .filter(toTest -> value != null && value.equalsIgnoreCase(toTest.value))
                .findFirst();
        final TraitAttribute result = resultOptional.isPresent() ? resultOptional.get() : TraitAttribute.UNKNOWN;
        return result;
    }

    /**
     * Gets the trait combo field type for given value.
     * @param value The source value.
     * @return A {@code TraitComboFieldType} instance, never {@code null}.
     * <br>If no corresponding value is found, {@code TraitComboFieldType.UNKNOWN} is returned.
     * @see TraitComboFieldType
     */
    public static TraitComboFieldType findTraitComboFieldType(final String value) {
        final Optional<TraitComboFieldType> resultOptional = Arrays.stream(TraitComboFieldType.values())
                .filter(toTest -> value != null && value.equalsIgnoreCase(toTest.value))
                .findFirst();
        final TraitComboFieldType result = resultOptional.isPresent() ? resultOptional.get() : TraitComboFieldType.UNKNOWN;
        return result;
    }

    /**
     * Gets the trait combo finisher type for given value.
     * @param value The source value.
     * @return A {@code TraitComboFinisherType} instance, never {@code null}.
     * <br>If no corresponding value is found, {@code TraitComboFinisherType.UNKNOWN} is returned.
     * @see TraitComboFinisherType
     */
    public static TraitComboFinisherType findTraitComboFinisherType(final String value) {
        final Optional<TraitComboFinisherType> resultOptional = Arrays.stream(TraitComboFinisherType.values())
                .filter(toTest -> value != null && value.equalsIgnoreCase(toTest.value))
                .findFirst();
        final TraitComboFinisherType result = resultOptional.isPresent() ? resultOptional.get() : TraitComboFinisherType.UNKNOWN;
        return result;
    }

    /**
     * Gets the trait fact type for given value.
     * @param value The source value.
     * @return A {@code TraitFactType} instance, never {@code null}.
     * <br>If no corresponding value is found, {@code TraitFactType.UNKNOWN} is returned.
     * @see TraitFactType
     */
    public static TraitFactType findTraitFactType(final String value) {
        final Optional<TraitFactType> resultOptional = Arrays.stream(TraitFactType.values())
                .filter(toTest -> value != null && value.equalsIgnoreCase(toTest.value))
                .findFirst();
        final TraitFactType result = resultOptional.isPresent() ? resultOptional.get() : TraitFactType.UNKNOWN;
        return result;
    }

    /**
     * Gets the trait slot type for given value.
     * @param value The source value.
     * @return A {@code TraitSlotType} instance, never {@code null}.
     * <br>If no corresponding value is found, {@code TraitSlotType.UNKNOWN} is returned.
     * @see TraitSlotType
     */
    public static TraitSlotType findTraitSlotType(final String value) {
        final Optional<TraitSlotType> resultOptional = Arrays.stream(TraitSlotType.values())
                .filter(toTest -> value != null && value.equalsIgnoreCase(toTest.value))
                .findFirst();
        final TraitSlotType result = resultOptional.isPresent() ? resultOptional.get() : TraitSlotType.UNKNOWN;
        return result;
    }

    /**
     * Gets the trait tier for given value.
     * @param value The source value.
     * @return A {@code TraitTier} instance, never {@code null}.
     * <br>If no corresponding value is found, {@code TraitTier.UNKNOWN} is returned.
     * @see TraitTier
     */
    public static TraitTier findTraitTier(final Integer value) {
        return findTraitTier(value.intValue());
    }
    
    /**
     * Gets the trait tier for given value.
     * @param value The source value.
     * @return A {@code TraitTier} instance, never {@code null}.
     * <br>If no corresponding value is found, {@code TraitTier.UNKNOWN} is returned.
     * @see TraitTier
     */
    public static TraitTier findTraitTier(final int value) {
        final Optional<TraitTier> resultOptional = Arrays.stream(TraitTier.values())
                .filter(toTest -> value == toTest.value)
                .findFirst();
        final TraitTier result = resultOptional.isPresent() ? resultOptional.get() : TraitTier.UNKNOWN;
        return result;
    }
}
