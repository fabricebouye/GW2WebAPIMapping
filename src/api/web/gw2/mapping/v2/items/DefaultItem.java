/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.items;

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
    short level = -1;
    ItemRarity rarity = ItemRarity.UNKNOWN;
    int vendorValue = -1;
    OptionalInt defaultSkin = OptionalInt.empty();
    Set<ItemFlag> flags = Collections.EMPTY_SET;
    Set<ItemGameType> gameTypes = Collections.EMPTY_SET;
    Set<ItemRestriction> restrictions = Collections.EMPTY_SET;
    String icon = "";
    Optional<Details> details = Optional.empty();

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
    public short getLevel() {
        return level;
    }

    @Override
    public ItemRarity getRarity() {
        return rarity;
    }

    @Override
    public int getVendorValue() {
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
    public String getIcon() {
        return icon;
    }

    @Override
    public Optional<Details> getDetails() {
        return details;
    }
}
