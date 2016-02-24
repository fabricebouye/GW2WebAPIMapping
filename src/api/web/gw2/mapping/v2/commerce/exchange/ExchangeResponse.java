/* 
 * Copyright (C) 2015-2016 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.commerce.exchange;

import api.web.gw2.mapping.core.ImplementationSpecific;
import api.web.gw2.mapping.core.SetValue;
import api.web.gw2.mapping.v2.APIv2;
import java.util.Set;

/**
 * Defines the exchange response.
 * @author Fabrice Bouyé
 */
@ImplementationSpecific
@APIv2(endpoint = "v2/commerce/exchange") // NOI18N.
public interface ExchangeResponse {

    /**
     * Gets the resources used by this endpoint.
     * @return A non-modifiable {@code Set<ExchangeResource>}, never {@code null}.
     */
    @ImplementationSpecific
    @SetValue
    Set<ExchangeResource> getResources();
}
