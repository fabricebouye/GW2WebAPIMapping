/* 
 * Copyright (C) 2015-2019 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.commerce.listings;

import api.web.gw2.mapping.core.CoinAmount;
import api.web.gw2.mapping.core.CoinValue;
import api.web.gw2.mapping.core.QuantityValue;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines a listing.
 * <br>This interface is used for both:
 * <ul>
 * <li>buys;</li>
 * <li>sells;</li>
 * </ul>
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/commerce/listings") // NOI18N.
public interface Listing {
    /**
    * Gets the number of individual listings this object refers to.
    * If two different players buy/sell the same item for the same price, they will end up being aggregated in the same listing.
    * @return An {@code int}.
    */
    @QuantityValue
    int getListings();

    /**
     * Gets the sell offer or buy order price in coins.
     * @return A {@code CoinAmount} instance, never {@code null}.
     */
    @CoinValue
    CoinAmount getUnitPrice();

    /**
     * Gets the amount of items being sold/bought.
     * @return An {@code int}.
     */
    @QuantityValue
    int getQuantity();
}
