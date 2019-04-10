/* 
 * Copyright (C) 2015-2019 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.commerce.delivery;

import api.web.gw2.mapping.core.CoinAmount;
import api.web.gw2.mapping.core.CoinValue;
import api.web.gw2.mapping.core.ListValue;
import api.web.gw2.mapping.v2.APIv2;
import java.util.List;

/**
 * Defines a delivery on the Black Lion Trading Company.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/commerce/delivery", requiresAuthentication = true, scope = {"account", "trading"}) // NOI18N.
public interface Delivery {

    /**
     * Gets the number of coins in this delivery.
     * @return A {@code CointAmount} instance, never {@code null}. May be empty.
     */
    @CoinValue
    CoinAmount getCoins();

    /**
     * Gets the list of items in this delivery.
     * @return A non-modifiable {@code List<DeliveryItem>} instance, never {@code null}. May be empty.
     */
    @ListValue
    List<DeliveryItem> getItems();
}
