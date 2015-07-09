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
    PriceOrder buys = PriceOrder.EMPTY;
    PriceOrder sells = PriceOrder.EMPTY;

    @Override
    public int getId() {
        return id;
    }

    @Override
    public PriceOrder getBuys() {
        return buys;
    }

    @Override
    public PriceOrder getSells() {
        return sells;
    }
}
