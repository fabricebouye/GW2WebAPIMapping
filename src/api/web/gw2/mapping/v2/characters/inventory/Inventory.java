/* 
 * Copyright (C) 2015-2016 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.characters.inventory;

import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.core.ListValue;
import api.web.gw2.mapping.core.OptionalValue;
import api.web.gw2.mapping.core.QuantityValue;
import api.web.gw2.mapping.v2.APIv2;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

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

    /**
     * Gets the skin of this object in inventory.
     * @return An {@code OtionalInt} instance, never {@code null}.
     */
    @OptionalValue
    @IdValue
    OptionalInt getSkin();

    /**
     * Gets the list of upgrades ids on this object in inventory.
     * @return An {@code Optional<List<Integer>>} instance, never {@code null}:
     * If present, the list is non-modifiable and may be empty.
     */
    @OptionalValue
    @IdValue
    @ListValue
    Optional<List<Integer>> getUpgrades();

    /**
     * Gets the list of infusions ids on this object in inventory.
     * @return An {@code Optional<List<Integer>>} instance, never {@code null}:
     * If present, the list is non-modifiable and may be empty.
     */
    @OptionalValue
    @IdValue
    @ListValue
    Optional<List<Integer>> getInfusions();

    /**
     * Gets the binding status of this object in inventory.
     * @return An {@code Optional<InventoryBinding>} instance, never {@code null}:
     */
    @OptionalValue
    Optional<InventoryBinding> getBinding();

    /**
     * Gets character to which this object in inventory is bound to.
     * @return An {@code Optional<String>} instance, never {@code null}:
     */
    @OptionalValue
    Optional<String> getBoundTo();
}
