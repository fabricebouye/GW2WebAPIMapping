/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.commerce.delivery;

import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.core.QuantityValue;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines a delivery on the Black Lion Trading Company.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/commerce/delivery", requiresAuthentication = true, scope = {"account", "trading"}) // NOI18N.
public interface DeliveryItem {

    /**
     * Gets the id of the item.
     * @return An {@code int}.
     */
    @IdValue
    int getId();

    /**
     * Gets the number of items.
     * @return An {@code int} &gt; 0.
     */
    @QuantityValue
    int getCount();
}
