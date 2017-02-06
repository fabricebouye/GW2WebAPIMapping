/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.account.wallet;

import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.core.QuantityValue;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines a currency quantity in the account wallet.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/account/wallet", requiresAuthentication = true, scope = "wallet") // NOI18N.
public interface CurrencyAmount {

    /**
     * The id of the currency.
     * @return An {@code int}.
     */
    @IdValue
    public int getId();

    /**
     * Gets the amount of this currency.
     * @return An {@code int}.
     */
    @QuantityValue
    int getValue();
}
