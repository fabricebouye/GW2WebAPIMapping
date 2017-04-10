/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.account.bank;

import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.core.ListValue;
import api.web.gw2.mapping.core.OptionalValue;
import api.web.gw2.mapping.core.QuantityValue;
import api.web.gw2.mapping.v2.APIv2;
import api.web.gw2.mapping.v2.characters.id.inventory.CharacterInventoryBinding;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.List;

/**
 * Defines an account bank slot.
 * <br>Each slot contains 1 type of object.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/account/bank", requiresAuthentication = true, scope = "inventories") // NOI18N.
public interface BankSlot {

    /**
     * Gets the id of this account bank slot.
     * @return An {@code int}.
     */
    @IdValue
    int getId();

    /**
     * Gets the amount of item in this account bank slot.
     * @return An {@code int}.
     */
    @QuantityValue
    int getCount();

    /**
     * Gets the id of this skin in this account bank slot (if any).
     * @return An {@code OptionalInt}, never {@code null}.
     */
    @IdValue
    @OptionalValue
    OptionalInt getSkin();

    /**
     * Gets a list containing the item ids for each rune or signet applied to the item (if any).
     * @return An non-modifiable {@code List<Integer>}, never {@code null}; may be empty.
     */
    @IdValue
    @ListValue
    List<Integer> getUpgrades();

    /**
     * Gets a list containing the item ids for each rune or signet applied to the item (if any).
     * @return An non-modifiable {@code List<Integer>}, never {@code null}; may be empty.
     */
    @IdValue
    @ListValue
    List<Integer> getInfusions();

    /**
     * Gets the binding of this item.
     * @return An {@code Optional<CharacterInventoryBinding>} instance, never {@code null}.
     */
    @OptionalValue
    Optional<CharacterInventoryBinding> getBinding();

    /**
     * Gets the name of the character to which this item is bound to.
     * @return An {@code Optional<String>} instance, never {@code null}.
     */
    @IdValue
    @OptionalValue
    Optional<String> getBoundTo();

    /**
     * Gets the amount of charges.
     * @return An {@code OptionalInt} instance, never {@code null}.
     */
    @QuantityValue
    @OptionalValue
    OptionalInt getCharges();
}
