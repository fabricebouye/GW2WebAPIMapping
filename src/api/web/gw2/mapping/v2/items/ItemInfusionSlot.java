/* 
 * Copyright (C) 2015-2019 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.items;

import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.core.OptionalValue;
import api.web.gw2.mapping.core.SetValue;
import api.web.gw2.mapping.v2.APIv2;
import java.util.OptionalInt;
import java.util.Set;

/**
 * Defines an item infusion slot.
 * @author FabriceB
 */
@APIv2(endpoint = "v2/items") // NOI18N.
public interface ItemInfusionSlot {

    /**
     * Gets a set of flags on this infusion slot.
     * @return A non-modifiable {@code Set<ItemInfusionSlotFlag>} instance, never {@code null}.
     * When the infusion is an agony resistance infusion, the returned set contains {@code ItemInfusionSlotFlag.AGONY}. 
     */
    @SetValue
    Set<ItemInfusionSlotFlag> getFlags();

    /**
     * Gets the item of of this infusion slot.
     * @return An {@code OptionalInt}, never {@code null}.
     */
    @OptionalValue
    @IdValue
    OptionalInt getItemId();
}
