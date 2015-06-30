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
     * @return A {@code ItemType} instance, never {@code null}.
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
     * @return A {@code ItemRarity} instance, never {@code null}.
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
     * @return A {@code ItemGameType} instance, never {@code null}.
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
     * @return A {@code ItemFlag} instance, never {@code null}.
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
     * @return A {@code ItemRestriction} instance, never {@code null}.
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
}
