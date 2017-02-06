/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.account.inventory;

import api.web.gw2.mapping.v2.characters.inventory.InventoryBinding;
import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.core.ListValue;
import api.web.gw2.mapping.core.OptionalValue;
import api.web.gw2.mapping.core.QuantityValue;
import api.web.gw2.mapping.v2.APIv2;
import java.util.List;
import java.util.OptionalInt;

/**
 * Defines an inventory slot.
 * @author Fabrice Bouyé
 * @see InventoryBag
 */
@APIv2(endpoint = "v2/account/inventory", requiresAuthentication = true, scope = "inventories") // NOI18N.
public interface SharedInventory {

    /**
     * Gets the Id of the object in this inventory slot.
     * @return An {@code int}.
     */
    @IdValue
    int getId();

    /**
     * Gets the number of this object in this inventory slot.
     * @return An {@code int}.
     */
    @QuantityValue
    int getCount();

    /**
     * Gets the binding status of this inventory slot.
     * @return Always {@code InventoryBinding.ACCOUNT}.
     * @see InventoryBinding#ACCOUNT
     */
    default InventoryBinding getBinding() {
        return InventoryBinding.ACCOUNT;
    }

    /**
     * Gets the number of charges for this object in this inventory slot.
     * @return An {@code OptionalInt} instance, never {@code null}:
     */
    @OptionalValue
    @QuantityValue
    OptionalInt getCharges();

    /**
     * Gets the list of infusions ids on this object in inventory slot.
     * @return A non-modifiable {@code List<Integer>} instance, never {@code null}; may be empty.
     */
    @IdValue
    @ListValue
    List<Integer> getInfusions();
}
