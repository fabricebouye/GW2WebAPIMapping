/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.items;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

/**
 * Default implementation of an item armor details.
 * @author Fabrice Bouyé
 */
final class DefaultItemArmorDetails extends DefaultItemDetails implements ItemArmorDetails {

    ItemArmorType type = ItemArmorType.UNKNOWN;
    ItemArmorWeightClass weightClass = ItemArmorWeightClass.UNKNOWN;
    int defense = -1;
    List<ItemInfusionSlot> infusions = Collections.EMPTY_LIST;
    Optional<ItemInfixUpgrade> infixUpgrade = Optional.empty();
    OptionalInt suffixItemId = OptionalInt.empty();
    String secondarySuffixItemId = "";

    /**
     * Create a new empty instance.
     */
    DefaultItemArmorDetails() {
        super(ItemType.ARMOR);
    }

    @Override
    public ItemArmorType getType() {
        return type;
    }

    @Override
    public ItemArmorWeightClass getWeightClass() {
        return weightClass;
    }

    @Override
    public int getDefense() {
        return defense;
    }

    @Override
    public List<ItemInfusionSlot> getInfusionSlots() {
        return infusions;
    }

    @Override
    public Optional<ItemInfixUpgrade> getInfixUpgrade() {
        return infixUpgrade;
    }

    @Override
    public OptionalInt getSuffixItemId() {
        return suffixItemId;
    }

    @Override
    public String getSecondarySuffixItemId() {
        return secondarySuffixItemId;
    }
}
