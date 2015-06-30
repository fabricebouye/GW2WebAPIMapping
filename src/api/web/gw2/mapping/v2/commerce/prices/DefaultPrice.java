/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.commerce.prices;

/**
 * Default implementation of a price.
 * @author Fabrice Bouyé
 */
final class DefaultPrice implements Price {

    int id = -1;
    Order buys;
    Order sells;

    @Override
    public int getId() {
        return id;
    }

    @Override
    public Order getBuys() {
        return buys;
    }

    @Override
    public Order getSells() {
        return sells;
    }
}
