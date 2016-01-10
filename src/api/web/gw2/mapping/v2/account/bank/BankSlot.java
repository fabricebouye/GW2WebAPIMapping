/* 
 * Copyright (C) 2015 Fabrice Bouyé
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
     * @return An non-modifiable {@code Optional<List<Integer>>}, never {@code null}.
     */
    @IdValue
    @OptionalValue
    @ListValue
    Optional<List<Integer>> getUpgrades();

    /**
     * Gets a list containing the item ids for each rune or signet applied to the item (if any).
     * @return An non-modifiable {@code Optional<List<Integer>>}, never {@code null}.
     */
    @IdValue
    @OptionalValue
    @ListValue
    Optional<List<Integer>> getInfusions();
}
