/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.commerce.prices;

/**
 * Default implementation of an order.
 * @author Fabrice Bouyé
 */
final class DefaultPriceOrder implements PriceOrder {

    int unitPrice = 0;
    int quantity = 0;

    /**
     * Creates a new empty instance.
     */
    DefaultPriceOrder() {
    }

    @Override
    public int getUnitPrice() {
        return unitPrice;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }
}
