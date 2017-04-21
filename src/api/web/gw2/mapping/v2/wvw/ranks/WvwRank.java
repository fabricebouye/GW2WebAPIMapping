/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.wvw.ranks;

import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.core.LocalizedResource;
import api.web.gw2.mapping.core.QuantityValue;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines a WvW rank.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/wvw/ranks") // NOI18N.
public interface WvwRank {

    /**
     * Gets the id of this WvW rank.
     * @return An {@code int}.
     */
    @IdValue
    int getId();

    /**
     * Gets the i18n title of this WvW rank.
     * @return A {@code String} instance, never {@code null}.
     */
    @LocalizedResource
    String getTitle();

    /**
     * Gets the min value of this WvW rank.
     * @return An {@code int} &ge; 0.
     */
    @QuantityValue
    int getMinRank();
}
