/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.characters.equipment;

import java.util.Arrays;
import java.util.Optional;

/**
 * Utility class for equipment.
 * @author Fabrice Bouyé
 */
public enum EquipmentUtils {
    /**
    * The unique instance of this class.
    */
    INSTANCE;

    /**
     * Gets the equipment slot for given value.
     * @param value The source value.
     * @return A {@code EquipmentSlot} instance, never {@code null}.
     * <br>If no corresponding value is found, {@code EquipmentSlot.UNKNOWN} is returned.
     * @see EquipmentSlot
     */
    public static EquipmentSlot findEquipmentSlot(final String value) {
        final Optional<EquipmentSlot> resultOptional = Arrays.stream(EquipmentSlot.values())
                .filter(toTest -> value != null && value.equalsIgnoreCase(toTest.value))
                .findFirst();
        final EquipmentSlot result = resultOptional.isPresent() ? resultOptional.get() : EquipmentSlot.UNKNOWN;
        return result;
    }
}
