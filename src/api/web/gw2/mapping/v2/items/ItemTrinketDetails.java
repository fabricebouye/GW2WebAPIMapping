/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.items;

import api.web.gw2.mapping.core.OptionalValue;
import api.web.gw2.mapping.v2.APIv2;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

/**
 * Defines a trinket details.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/items") // NOI18N.
public interface ItemTrinketDetails {

    /**
     * Gets the list of infusion slots on this trinket.
     * @return A non-modifiable {@code List<ItemInfusionSlot>}, never {@code null}.
     */
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
    OptionalInt getSuffixItemId();

    /**
     * Gets the id of the secondary suffix item on this trinket.
     * @return A {@code String} instance, never {@code null}.
     */
    String getSecondarySuffixItemId();

}
