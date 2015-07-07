/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.quaggans;

import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.core.URLValue;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines a guaggan image.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/quaggans") // NOI18N.
public interface Quaggan {

    /**
     * Gets the id of this guaggan image.
     * @return A {@code String} instance, never {@code null}.
     */
    @IdValue
    String getId();

    /**
     * Gets the URL of the image of this guaggan image.
     * @return A {@code String} instance, never {@code null}.
     */
    @URLValue
    String getUrl();
}
