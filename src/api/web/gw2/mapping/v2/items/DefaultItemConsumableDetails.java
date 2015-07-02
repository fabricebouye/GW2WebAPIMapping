/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.items;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.OptionalLong;

/**
 * Default implementation of a consumable details.
 * @author Fabrice Bouyé
 */
final class DefaultItemConsumableDetails extends DefaultItemDetails implements ItemConsumableDetails {

    ItemConsumableType type = ItemConsumableType.UNKNOWN;
    Optional<String> description = Optional.empty();
    OptionalLong duration = OptionalLong.empty();
    Optional<ItemConsumableUnlockType> unlockType = Optional.empty();
    OptionalInt colorId = OptionalInt.empty();
    OptionalInt recipeId = OptionalInt.empty();

    DefaultItemConsumableDetails() {
        super(ItemType.CONSUMABLE);
    }

    @Override
    public ItemConsumableType getType() {
        return type;
    }

    @Override
    public Optional<String> getDescription() {
        return description;
    }

    @Override
    public OptionalLong getDuration() {
        return duration;
    }

    @Override
    public Optional<ItemConsumableUnlockType> getUnlockType() {
        return unlockType;
    }

    @Override
    public OptionalInt getColorId() {
        return colorId;
    }

    @Override
    public OptionalInt getRecipeId() {
        return recipeId;
    }
}
