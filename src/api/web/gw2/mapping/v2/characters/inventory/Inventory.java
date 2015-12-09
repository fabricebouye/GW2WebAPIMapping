/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.characters.inventory;

import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.core.QuantityValue;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines an inventory object within a bag.
 * @author Fabrice Bouyé
 * @see InventoryBag
 */
@APIv2(endpoint = "v2/characters/<name>/inventory", requiresAuthentication = true, scope = "inventories") // NOI18N.
public interface Inventory {

    /**
     * Gets the Id of this object in inventory.
     * @return An {@code int}.
     */
    @IdValue
    int getId();

    /**
     * Gets the number of this object in inventory.
     * @return An {@code int}.
     */
    @QuantityValue
    int getCount();
}
