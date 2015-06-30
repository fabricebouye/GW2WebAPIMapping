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
final class DefaultOrder implements Order {

    int unitPrice = -1;
    int quantity = -1;

    /**
     * Creates a new empty instance.
     */
    DefaultOrder() {
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
