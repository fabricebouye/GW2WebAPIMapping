/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.commerce.prices;

import api.web.gw2.mapping.core.CoinAmount;
import api.web.gw2.mapping.core.CoinValue;
import api.web.gw2.mapping.core.QuantityValue;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines an order.
 * <br>This interface is used for both:
 * <ul>
 * <li>buys;</li>
 * <li>sells;</li>
 * </ul>
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/commerce/prices") // NOI18N.
public interface PriceOrder {

    /**
     * Singleton empty instance.
     */
    public static final PriceOrder EMPTY = new PriceOrder() {
        @Override
        public CoinAmount getUnitPrice() {
            return CoinAmount.ZERO;
        }

        @Override
        public int getQuantity() {
            return 0;
        }
    };

    /**
     * Gets the highest buy order or lowest sell offer price in coins.
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
