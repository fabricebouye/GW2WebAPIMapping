/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.characters.inventory;

import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

/**
 * Default implementation of an inventory item.
 * @author Fabrice Bouyé
 */
final class DefaultInventory implements Inventory {

    int id = -1;
    int count = 0;
    OptionalInt skin = OptionalInt.empty();
    Optional<List<Integer>> upgrades = Optional.empty();
    Optional<List<Integer>> infusions = Optional.empty();
    Optional<InventoryBinding> binding = Optional.empty();
    Optional<String> boundTo = Optional.empty();

    /**
     * Creates a new empty instance.
     */
    public DefaultInventory() {
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public int getCount() {
        return count;
    }

    @Override
    public OptionalInt getSkin() {
        return skin;
    }

    @Override
    public Optional<List<Integer>> getUpgrades() {
        return upgrades;
    }

    @Override
    public Optional<List<Integer>> getInfusions() {
        return infusions;
    }

    @Override
    public Optional<InventoryBinding> getBinding() {
        return binding;
    }

    @Override
    public Optional<String> getBoundTo() {
        return boundTo;
    }
}
