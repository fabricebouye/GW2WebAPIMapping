/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.commerce.exchange;

import java.util.Collections;
import java.util.Set;

/**
 * Default implementation of the exchange result
 * @author Fabrice Bouyé
 */
final class DefaultExchangeResponse implements ExchangeResponse {

    Set<ExchangeResource> resources = Collections.EMPTY_SET;

    /**
     * Creates a new empty result.
     */
    DefaultExchangeResponse() {
    }

    @Override
    public Set<ExchangeResource> getResources() {
        return resources;
    }
}
