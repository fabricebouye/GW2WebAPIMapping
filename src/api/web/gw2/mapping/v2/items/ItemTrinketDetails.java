/* 
 * Copyright (C) 2015-2016 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.items;

import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.core.ListValue;
import api.web.gw2.mapping.core.OptionalValue;
import api.web.gw2.mapping.core.SetValue;
import api.web.gw2.mapping.v2.APIv2;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Set;

/**
 * Defines a trinket details.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/items") // NOI18N.
public interface ItemTrinketDetails extends ItemDetails {

    /**
     * Gets the type of this trinket.
     * @return An {@code ItemTrinketType} instance, never {@code null}.
     */
    ItemTrinketType getType();

    /**
     * Gets the list of infusion slots on this trinket.
     * @return A non-modifiable {@code List<ItemInfusionSlot>}, never {@code null}.
     */
    @ListValue
    List<ItemInfusionSlot> getInfusionSlots();

    /**
     * Gets the infix upgrade on this trinket.
     * @return An {@code Optional<ItemInfixUpgrade>} instance, never {@code null}.
     */
    @OptionalValue
    Optional<ItemInfixUpgrade> getInfixUpgrade();

    /**
     * Gets the id of the suffix item (ie: jewel) on this trinket.
     * @return An {@code OptionalInt}, never {@code null}.
     */
    @OptionalValue
    @IdValue
    OptionalInt getSuffixItemId();

    /**
     * Gets the id of the secondary suffix item on this trinket.
     * @return A {@code String} instance, never {@code null}.
     */
    @IdValue
    String getSecondarySuffixItemId();

    /**
     * Gets the available stats choices for this trinket.
     * @return A non-modifiable {@code Set<Integer>} instance, never {@code null}. 
     * <br>May be empty if no stat choice is available.
     * @see api.web.gw2.mapping.v2.itemstats
     */
    @SetValue
    @IdValue
    Set<Integer> getStatsChoices();
}
