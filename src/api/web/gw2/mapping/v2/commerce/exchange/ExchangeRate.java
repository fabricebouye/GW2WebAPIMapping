/* 
 * Copyright (C) 2015-2019 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.commerce.exchange;

import api.web.gw2.mapping.core.CoinAmount;
import api.web.gw2.mapping.core.CoinValue;
import api.web.gw2.mapping.core.QuantityValue;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines the exchange rate.
 * <br>This interface is used for both:
 * <ul>
 * <li>Converting gold to gems.</li>
 * <li>Converting gems to gold.</li>
 * </ul>
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/commerce/exchange/coins") // NOI18N.
@APIv2(endpoint = "v2/commerce/exchange/gems") // NOI18N.
public interface ExchangeRate {

    /**
     * Gets the number of coins you get for a single gem.
     * @return A {@code CoinAmount} instance, never {@code null}.
     */
    @CoinValue
    CoinAmount getCoinsPerGem();

    /**
     * The returned quantity.
     * @return An {@code int}.
     */
    @QuantityValue
    int getQuantity();
}
