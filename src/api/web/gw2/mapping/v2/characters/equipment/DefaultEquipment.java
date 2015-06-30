/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.characters.equipment;

import java.util.List;
import java.util.Optional;

/**
 * Default implementation of the equipment.
 * @author Fabrice Bouyé
 */
final class DefaultEquipment implements Equipment {

    int id = -1;
    EquipmentSlot slot = EquipmentSlot.UNKNOWN;
    Optional<List<Integer>> upgrades = Optional.empty();
    Optional<List<Integer>> infusions = Optional.empty();
    int skin = -1;

    /**
     * Creates a new empty instance.
     */
    DefaultEquipment() {
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public EquipmentSlot getSlot() {
        return slot;
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
    public int getSkin() {
        return skin;
    }
}
