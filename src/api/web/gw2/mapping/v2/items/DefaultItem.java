/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.items;

import api.web.gw2.mapping.core.CoinAmount;
import api.web.gw2.mapping.core.CoinValue;
import api.web.gw2.mapping.core.LevelValue;
import java.net.URL;
import java.util.Collections;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Set;

/**
 * Default implementation of an item.
 * @author Fabrice Bouyé
 */
final class DefaultItem implements Item {

    int id = -1;
    String name = "";
    Optional<String> description = Optional.empty();
    ItemType type = ItemType.WEAPON;
    int level = LevelValue.MIN_LEVEL;
    ItemRarity rarity = ItemRarity.UNKNOWN;
    @CoinValue
    CoinAmount vendorValue = CoinAmount.ZERO;
    OptionalInt defaultSkin = OptionalInt.empty();
    Set<ItemFlag> flags = Collections.EMPTY_SET;
    Set<ItemGameType> gameTypes = Collections.EMPTY_SET;
    Set<ItemRestriction> restrictions = Collections.EMPTY_SET;
    Optional<URL> icon = Optional.empty();
    Optional<ItemDetails> details = Optional.empty();

    /**
     * Creates a new empty instance.
     */
    DefaultItem() {
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Optional<String> getDescription() {
        return description;
    }

    @Override
    public ItemType getType() {
        return type;
    }

    @Override
    public int getLevel() {
        return level;
    }

    @Override
    public ItemRarity getRarity() {
        return rarity;
    }

    @Override
    public CoinAmount getVendorValue() {
        return vendorValue;
    }

    @Override
    public OptionalInt getDefaultSkin() {
        return defaultSkin;
    }

    @Override
    public Set<ItemFlag> getFlags() {
        return flags;
    }

    @Override
    public Set<ItemGameType> getGameTypes() {
        return gameTypes;
    }

    @Override
    public Set<ItemRestriction> getRestrictions() {
        return restrictions;
    }

    @Override
    public Optional<URL> getIcon() {
        return icon;
    }

    @Override
    public Optional<ItemDetails> getDetails() {
        return details;
    }
}
