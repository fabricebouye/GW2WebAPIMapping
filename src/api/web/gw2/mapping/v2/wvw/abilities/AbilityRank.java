/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.wvw.abilities;

import api.web.gw2.mapping.core.LocalizedResource;
import api.web.gw2.mapping.core.QuantityValue;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines a WvW ability rank.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/wvw/abilities") // NOI18N.
public interface AbilityRank {

    /**
     * Gets the cost of this ability rank.
     * @return An {@code int} &ge; 0.
     */
    @QuantityValue
    int getCost();

    /**
     * Gets the i18n effect of this ability rank.
     * @return A {@code String} instance, never {@code null}.
     */
    @LocalizedResource
    String getEffect();
}
