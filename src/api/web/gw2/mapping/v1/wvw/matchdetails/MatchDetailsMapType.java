/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v1.wvw.matchdetails;

import api.web.gw2.mapping.core.ImplementationSpecific;
import api.web.gw2.mapping.v1.APIv1;

/**
 * Define all WvW match map types.
 * @author Fabrice Bouyé
 */
@APIv1(endpoint = "v1/wvw/match_details.json") // NOI18N.
public enum MatchDetailsMapType {

    RED_HOME("RedHome"), // NOI18N.
    BLUE_HOME("BlueHome"), // NOI18N.
    GREEN_HOME("GreenHome"), // NOI18N.
    CENTER("Center"), // NOI18N.
    /**
     * Fail safe value.
     */
    @ImplementationSpecific
    UNKNOWN(null);

    final String value;

    private MatchDetailsMapType(String value) {
        this.value = value;
    }
}
