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
                .filter(toTest -> value != null && value.equals(toTest.value))
                .findFirst();
        final SkinType result = resultOptional.isPresent() ? resultOptional.get() : SkinType.UNKNOWN;
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
                .filter(toTest -> value != null && value.equals(toTest.value))
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
                .filter(toTest -> value != null && value.equals(toTest.value))
                .findFirst();
        final SkinWeaponType result = resultOptional.isPresent() ? resultOptional.get() : SkinWeaponType.UNKNOWN;
        return result;
    }

    /**
     * Gets the skin armor weight for given value.
     * @param value The source value.
     * @return A {@code SkinArmorWeight} instance, never {@code null}.
     * <br>If no corresponding value is found, {@code SkinArmorWeight.UNKNOWN} is returned.
     * @see SkinWeightClass
     */
    public static SkinWeightClass findSkinArmorWeight(final String value) {
        final Optional<SkinWeightClass> resultOptional = Arrays.stream(SkinWeightClass.values())
                .filter(toTest -> value != null && value.equals(toTest.value))
                .findFirst();
        final SkinWeightClass result = resultOptional.isPresent() ? resultOptional.get() : SkinWeightClass.UNKNOWN;
        return result;
    }

    /**
     * Gets the skin damage type for given value.
     * @param value The source value.
     * @return A {@code SkinDamageType} instance, never {@code null}.
     * <br>If no corresponding value is found, {@code SkinDamageType.UNKNOWN} is returned.
     * @see SkinDamageType
     */
    public static SkinDamageType findSkinDamageType(final String value) {
        final Optional<SkinDamageType> resultOptional = Arrays.stream(SkinDamageType.values())
                .filter(toTest -> value != null && value.equals(toTest.value))
                .findFirst();
        final SkinDamageType result = resultOptional.isPresent() ? resultOptional.get() : SkinDamageType.UNKNOWN;
        return result;
    }
}
