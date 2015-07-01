/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.items;

import java.util.Arrays;
import java.util.Optional;

/**
 * Utility class for items.
 * @author Fabrice Bouyé
 */
public enum ItemsUtils {

    /**
     * The unique instance of this class.
     */
    INSTANCE;

    /**
     * Gets the item type for given value.
     * @param value The source value.
     * @return An {@code ItemType} instance, never {@code null}.
     * <br>If no corresponding value is found, {@code ItemType.UNKNOWN} is returned.
     * @see ItemType
     */
    public static ItemType findItemType(final String value) {
        final Optional<ItemType> resultOptional = Arrays.stream(ItemType.values())
                .filter(toTest -> value != null && value.equals(toTest.value))
                .findFirst();
        final ItemType result = resultOptional.isPresent() ? resultOptional.get() : ItemType.UNKNOWN;
        return result;
    }

    /**
     * Gets the item rarity for given value.
     * @param value The source value.
     * @return An {@code ItemRarity} instance, never {@code null}.
     * <br>If no corresponding value is found, {@code ItemRarity.UNKNOWN} is returned.
     * @see ItemRarity
     */
    public static ItemRarity findItemRarity(final String value) {
        final Optional<ItemRarity> resultOptional = Arrays.stream(ItemRarity.values())
                .filter(toTest -> value != null && value.equals(toTest.value))
                .findFirst();
        final ItemRarity result = resultOptional.isPresent() ? resultOptional.get() : ItemRarity.UNKNOWN;
        return result;
    }

    /**
     * Gets the item game type for given value.
     * @param value The source value.
     * @return An {@code ItemGameType} instance, never {@code null}.
     * <br>If no corresponding value is found, {@code ItemGameType.UNKNOWN} is returned.
     * @see ItemGameType
     */
    public static ItemGameType findItemGameType(final String value) {
        final Optional<ItemGameType> resultOptional = Arrays.stream(ItemGameType.values())
                .filter(toTest -> value != null && value.equals(toTest.value))
                .findFirst();
        final ItemGameType result = resultOptional.isPresent() ? resultOptional.get() : ItemGameType.UNKNOWN;
        return result;
    }

    /**
     * Gets the item flag for given value.
     * @param value The source value.
     * @return An {@code ItemFlag} instance, never {@code null}.
     * <br>If no corresponding value is found, {@code ItemFlag.UNKNOWN} is returned.
     * @see ItemFlag
     */
    public static ItemFlag findItemFlag(final String value) {
        final Optional<ItemFlag> resultOptional = Arrays.stream(ItemFlag.values())
                .filter(toTest -> value != null && value.equals(toTest.value))
                .findFirst();
        final ItemFlag result = resultOptional.isPresent() ? resultOptional.get() : ItemFlag.UNKNOWN;
        return result;
    }

    /**
     * Gets the item restriction for given value.
     * @param value The source value.
     * @return An {@code ItemRestriction} instance, never {@code null}.
     * <br>If no corresponding value is found, {@code ItemRestriction.UNKNOWN} is returned.
     * @see ItemRestriction
     */
    public static ItemRestriction findItemRestriction(final String value) {
        final Optional<ItemRestriction> resultOptional = Arrays.stream(ItemRestriction.values())
                .filter(toTest -> value != null && value.equals(toTest.value))
                .findFirst();
        final ItemRestriction result = resultOptional.isPresent() ? resultOptional.get() : ItemRestriction.UNKNOWN;
        return result;
    }

    /**
     * Gets the item armor type for given value.
     * @param value The source value.
     * @return An {@code ItemArmorType} instance, never {@code null}.
     * <br>If no corresponding value is found, {@code ItemArmorType.UNKNOWN} is returned.
     * @see ItemArmorType
     */
    public static ItemArmorType findItemArmorType(final String value) {
        final Optional<ItemArmorType> resultOptional = Arrays.stream(ItemArmorType.values())
                .filter(toTest -> value != null && value.equals(toTest.value))
                .findFirst();
        final ItemArmorType result = resultOptional.isPresent() ? resultOptional.get() : ItemArmorType.UNKNOWN;
        return result;
    }

    /**
     * Gets the armor item weight class for given value.
     * @param value The source value.
     * @return An {@code ItemArmorWeightClass} instance, never {@code null}.
     * <br>If no corresponding value is found, {@code ItemArmorWeightClass.UNKNOWN} is returned.
     * @see ItemArmorWeightClass
     */
    public static ItemArmorWeightClass findItemArmorWeightClass(final String value) {
        final Optional<ItemArmorWeightClass> resultOptional = Arrays.stream(ItemArmorWeightClass.values())
                .filter(toTest -> value != null && value.equals(toTest.value))
                .findFirst();
        final ItemArmorWeightClass result = resultOptional.isPresent() ? resultOptional.get() : ItemArmorWeightClass.UNKNOWN;
        return result;
    }

    /**
     * Gets the item weapon damage type for given value.
     * @param value The source value.
     * @return An {@code ItemWeaponDamageType} instance, never {@code null}.
     * <br>If no corresponding value is found, {@code ItemWeaponDamageType.UNKNOWN} is returned.
     * @see ItemWeaponDamageType
     */
    public static ItemWeaponDamageType findItemWeaponDamageType(final String value) {
        final Optional<ItemWeaponDamageType> resultOptional = Arrays.stream(ItemWeaponDamageType.values())
                .filter(toTest -> value != null && value.equals(toTest.value))
                .findFirst();
        final ItemWeaponDamageType result = resultOptional.isPresent() ? resultOptional.get() : ItemWeaponDamageType.UNKNOWN;
        return result;
    }

    /**
     * Gets the item infusion slot flag for given value.
     * @param value The source value.
     * @return An {@code ItemInfusionSlotFlag} instance, never {@code null}.
     * <br>If no corresponding value is found, {@code ItemInfusionSlotFlag.UNKNOWN} is returned.
     * @see ItemInfusionSlotFlag
     */
    public static ItemInfusionSlotFlag findItemInfusionSlotFlag(final String value) {
        final Optional<ItemInfusionSlotFlag> resultOptional = Arrays.stream(ItemInfusionSlotFlag.values())
                .filter(toTest -> value != null && value.equals(toTest.value))
                .findFirst();
        final ItemInfusionSlotFlag result = resultOptional.isPresent() ? resultOptional.get() : ItemInfusionSlotFlag.UNKNOWN;
        return result;
    }

    /**
     * Gets the item infix upgrade attribute for given value.
     * @param value The source value.
     * @return An {@code ItemInfixUpgradeAttribute} instance, never {@code null}.
     * <br>If no corresponding value is found, {@code ItemInfixUpgradeAttribute.UNKNOWN} is returned.
     * @see ItemInfixUpgradeAttribute
     */
    public static ItemInfixUpgradeAttribute findItemInfixUpgradeAttribute(final String value) {
        final Optional<ItemInfixUpgradeAttribute> resultOptional = Arrays.stream(ItemInfixUpgradeAttribute.values())
                .filter(toTest -> value != null && value.equals(toTest.value))
                .findFirst();
        final ItemInfixUpgradeAttribute result = resultOptional.isPresent() ? resultOptional.get() : ItemInfixUpgradeAttribute.UNKNOWN;
        return result;
    }

    /**
     * Gets the item upgrade component flag for given value.
     * @param value The source value.
     * @return An {@code ItemUpgradeComponentFlag} instance, never {@code null}.
     * <br>If no corresponding value is found, {@code ItemUpgradeComponentFlag.UNKNOWN} is returned.
     * @see ItemUpgradeComponentFlag
     */
    public static ItemUpgradeComponentFlag findItemUpgradeComponentFlag(final String value) {
        final Optional<ItemUpgradeComponentFlag> resultOptional = Arrays.stream(ItemUpgradeComponentFlag.values())
                .filter(toTest -> value != null && value.equals(toTest.value))
                .findFirst();
        final ItemUpgradeComponentFlag result = resultOptional.isPresent() ? resultOptional.get() : ItemUpgradeComponentFlag.UNKNOWN;
        return result;
    }

    /**
     * Gets the item upgrade component type for given value.
     * @param value The source value.
     * @return An {@code ItemUpgradeComponentType} instance, never {@code null}.
     * <br>If no corresponding value is found, {@code ItemUpgradeComponentType.UNKNOWN} is returned.
     * @see ItemUpgradeComponentType
     */
    public static ItemUpgradeComponentType findItemUpgradeComponentType(final String value) {
        final Optional<ItemUpgradeComponentType> resultOptional = Arrays.stream(ItemUpgradeComponentType.values())
                .filter(toTest -> value != null && value.equals(toTest.value))
                .findFirst();
        final ItemUpgradeComponentType result = resultOptional.isPresent() ? resultOptional.get() : ItemUpgradeComponentType.UNKNOWN;
        return result;
    }
}
