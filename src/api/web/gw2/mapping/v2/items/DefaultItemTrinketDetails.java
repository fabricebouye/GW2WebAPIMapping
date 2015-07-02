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
 * Default implementation of a trinket details.
 * @author Fabrice Bouyé
 */
final class DefaultItemTrinketDetails extends DefaultItemDetails implements ItemTrinketDetails {

    List<ItemInfusionSlot> infusionSlots = Collections.EMPTY_LIST;
    Optional<ItemInfixUpgrade> infixUpgrade = Optional.empty();
    OptionalInt suffixItemId = OptionalInt.empty();
    String secondarySuffixItemId = "";

    DefaultItemTrinketDetails() {
        super(ItemType.TRINKET);
    }

    @Override
    public List<ItemInfusionSlot> getInfusionSlots() {
        return infusionSlots;
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
