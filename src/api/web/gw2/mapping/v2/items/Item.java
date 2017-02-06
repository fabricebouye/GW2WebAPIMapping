/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.items;

import api.web.gw2.mapping.core.CoinAmount;
import api.web.gw2.mapping.core.CoinValue;
import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.core.LevelValue;
import api.web.gw2.mapping.core.LocalizedResource;
import api.web.gw2.mapping.core.OptionalValue;
import api.web.gw2.mapping.core.SetValue;
import api.web.gw2.mapping.core.URLReference;
import api.web.gw2.mapping.core.URLValue;
import api.web.gw2.mapping.v2.APIv2;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Set;

/**
 * Defines an item.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/items") // NOI18N.
public interface Item {

    /**
     * Gets the id of this item.
     * @return An {@code int}.
     */
    @IdValue
    int getId();

    /**
     * Gets the localized name of this item.
     * @return A {@code String} instance, never {@code null}.
     */
    @LocalizedResource
    String getName();

    /**
     * Gets the localized description of this item.
     * @return An {@code Optional<String>} instance, never {@code null}.
     */
    @LocalizedResource
    @OptionalValue
    Optional<String> getDescription();

    /**
     * Gets the type of this item.
     * @return An {@code ItemType} instance, never {@code null}.
     */
    ItemType getType();

    /**
     * Gets the required level to use this item.
     * @return An {@code int}.
     */
    @LevelValue
    int getLevel();

    /**
     * Gets the rarity of this item.
     * @return An {@code ItemRarity} instance, never {@code null}.
     */
    ItemRarity getRarity();

    /**
     * Gets the vendor value of this item in coins.
     * @return A {@code CoinAmount} instance, never {@code null}.
     */
    @CoinValue
    CoinAmount getVendorValue();

    /**
     * Gets the id of the default skin of this item.
     * @return An {@code OptionalInt} instance, never {@code null}.
     */
    @OptionalValue
    @IdValue
    OptionalInt getDefaultSkin();

    /**
     * Get a set of flags on this items.
     * @return A non-modifiable {@code Set<ItemFlag>} instance, never {@code null}, set may be empty.
     */
    @SetValue
    Set<ItemFlag> getFlags();

    /**
     * Get a set of game types on this items.
     * @return A non-modifiable {@code Set<ItemGameType>} instance, never {@code null}, set may be empty.
     */
    @SetValue
    Set<ItemGameType> getGameTypes();

    /**
     * Get a set of restrictions on this items.
     * @return A non-modifiable {@code Set<ItemRestriction>} instance, never {@code null}, set may be empty.
     */
    @SetValue
    Set<ItemRestriction> getRestrictions();

    /**
     * Gets the URL to the icon of this item.
     * @return A {@code URLReference} instance, never {@code null}.
     */
    @URLValue
    URLReference getIcon();

    /**
     * Gets the details of this object.
     * @param <T> The type of the details.
     * @return An {@code Optional<T>} instance, never {@code null}.
     */
    @OptionalValue
    <T extends ItemDetails> Optional<T> getDetails();

    /**
     * Gets the chat link needed to pass this item to other players.
     * @return A {@code String} instance, never {@code null}.
     * <br>Old JSON files from earlier versions of the API or items that cannot be linked may return an empty {@code string}.
     */
    @OptionalValue
    String getChatLink();
}
