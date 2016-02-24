/* 
 * Copyright (C) 2015-2016 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.wvw.matches;

import api.web.gw2.mapping.core.ImplementationSpecific;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Define all WvW match map bonus types.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/wvw/matches") // NOI18N.
public enum MatchMapBonusType {

    /**
     * Defines the bloodlust bonus.
     */
    BLOODLUST("Bloodlust"), // NOI18N.
    /**
     * Defines the eternal battlegrounds.
     */
    CENTER("Center"), // NOI18N.
    /**
     * Fail safe value.
     */
    @ImplementationSpecific
    UNKNOWN(null);

    final String value;

    private MatchMapBonusType(String value) {
        this.value = value;
    }
}
