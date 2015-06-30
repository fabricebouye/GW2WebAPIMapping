/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.commerce.exchange;

import api.web.gw2.mapping.core.ImplementationSpecific;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines the exchange resources.
 * @author Fabrice Bouyé
 */
@ImplementationSpecific
@APIv2(endpoint = "v2/commerce/exchange") // NOI18N.
public enum ExchangeResource {

    /**
     * Defines the coins exchange resource.
     */
    COINS("Coins"),
    /**
     * Defines the gems exchange resource.
     */
    GEMS("Gems"),
    /**
     * Fail safe value.
     */
    @ImplementationSpecific
    UNKNOWN(null);

    final String value;

    private ExchangeResource(final String value) {
        this.value = value;
    }
}
