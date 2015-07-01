/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.items;

import java.util.Collections;
import java.util.OptionalInt;
import java.util.Set;

/**
 * Default implementation of an item infusion slot.
 * @author Fabrice Bouyé
 */
final class DefaultItemInfusionSlot implements ItemInfusionSlot {

    OptionalInt itemId = OptionalInt.empty();
    Set<ItemInfusionSlotFlag> flags = Collections.EMPTY_SET;

    /**
     * Creates a new empty instance.
     */
    DefaultItemInfusionSlot() {
    }

    @Override
    public OptionalInt getItemId() {
        return itemId;
    }

    @Override
    public Set<ItemInfusionSlotFlag> getFlags() {
        return flags;
    }
}
