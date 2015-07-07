/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.commerce.prices;

import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines the tradingpost price of an item.
 * @author Fabrice Bouyé
 * @see api.web.gw2.mapping.v2.items.Item
 */
@APIv2(endpoint = "v2/commerce/prices") // NOI18N.
public interface Price {

    /**
     * Gets the id of the item.
     * @return And {@code int}.
     */
    @IdValue
    int getId();

    /**
     * Gets the buy order on this item.
     * @return An {@code Order} instance, never {@code null}.
     */
    Order getBuys();

    /**
     * Gets the sell offer on this item.
     * @return An {@code Order} instance, never {@code null}.
     */
    Order getSells();
}
