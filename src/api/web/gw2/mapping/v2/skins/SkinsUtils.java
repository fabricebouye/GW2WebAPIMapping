/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.skins;

import java.util.Arrays;
import java.util.Optional;

/**
 * Utility class for skins.
 * @author Fabrice Bouyé
 */
public enum SkinsUtils {

    /**
     * The unique instance of this class.
     */
    INSTANCE;

    /**
     * Gets the skin type for given value.
     * @param value The source value.
     * @return A {@code SkinType} instance, never {@code null}.
     * <br>If no corresponding value is found, {@code SkinType.UNKNOWN} is returned.
     * @see SkinType
     */
    public static SkinType findSkinType(final String value) {
        final Optional<SkinType> resultOptional = Arrays.stream(SkinType.values())
                .filter(toTest -> value != null && value.equalsIgnoreCase(toTest.value))
                .findFirst();
        final SkinType result = resultOptional.isPresent() ? resultOptional.get() : SkinType.UNKNOWN;
        return result;
    }

    /**
     * Gets the skin flag for given value.
     * @param value The source value.
     * @return A {@code SkinFlag} instance, never {@code null}.
     * <br>If no corresponding value is found, {@code SkinFlag.UNKNOWN} is returned.
     * @see SkinFlag
     */
    public static SkinFlag findSkinFlag(final String value) {
        final Optional<SkinFlag> resultOptional = Arrays.stream(SkinFlag.values())
                .filter(toTest -> value != null && value.equalsIgnoreCase(toTest.value))
                .findFirst();
        final SkinFlag result = resultOptional.isPresent() ? resultOptional.get() : SkinFlag.UNKNOWN;
        return result;
    }

    /**
     * Gets the skin armor type for given value.
     * @param value The source value.
     * @return A {@code SkinArmorType} instance, never {@code null}.
     * <br>If no corresponding value is found, {@code SkinArmorType.UNKNOWN} is returned.
     * @see SkinArmorType
     */
    public static SkinArmorType findSkinArmorType(final String value) {
        final Optional<SkinArmorType> resultOptional = Arrays.stream(SkinArmorType.values())
                .filter(toTest -> value != null && value.equalsIgnoreCase(toTest.value))
                .findFirst();
        final SkinArmorType result = resultOptional.isPresent() ? resultOptional.get() : SkinArmorType.UNKNOWN;
        return result;
    }

    /**
     * Gets the skin weapon type for given value.
     * @param value The source value.
     * @return A {@code SkinWeaponType} instance, never {@code null}.
     * <br>If no corresponding value is found, {@code SkinWeaponType.UNKNOWN} is returned.
     * @see SkinWeaponType
     */
    public static SkinWeaponType findSkinWeaponType(final String value) {
        final Optional<SkinWeaponType> resultOptional = Arrays.stream(SkinWeaponType.values())
                .filter(toTest -> value != null && value.equalsIgnoreCase(toTest.value))
                .findFirst();
        final SkinWeaponType result = resultOptional.isPresent() ? resultOptional.get() : SkinWeaponType.UNKNOWN;
        return result;
    }

    /**
     * Gets the skin armor weight class for given value.
     * @param value The source value.
     * @return A {@code SkinArmorWeightClass} instance, never {@code null}.
     * <br>If no corresponding value is found, {@code SkinArmorWeightClass.UNKNOWN} is returned.
     * @see SkinArmorWeightClass
     */
    public static SkinArmorWeightClass findSkinArmorWeightClass(final String value) {
        final Optional<SkinArmorWeightClass> resultOptional = Arrays.stream(SkinArmorWeightClass.values())
                .filter(toTest -> value != null && value.equalsIgnoreCase(toTest.value))
                .findFirst();
        final SkinArmorWeightClass result = resultOptional.isPresent() ? resultOptional.get() : SkinArmorWeightClass.UNKNOWN;
        return result;
    }

    /**
     * Gets the skin damage type for given value.
     * @param value The source value.
     * @return A {@code SkinWeaponDamageType} instance, never {@code null}.
     * <br>If no corresponding value is found, {@code SkinWeaponDamageType.UNKNOWN} is returned.
     * @see SkinWeaponDamageType
     */
    public static SkinWeaponDamageType findSkinWeaponDamageType(final String value) {
        final Optional<SkinWeaponDamageType> resultOptional = Arrays.stream(SkinWeaponDamageType.values())
                .filter(toTest -> value != null && value.equalsIgnoreCase(toTest.value))
                .findFirst();
        final SkinWeaponDamageType result = resultOptional.isPresent() ? resultOptional.get() : SkinWeaponDamageType.UNKNOWN;
        return result;
    }
}
