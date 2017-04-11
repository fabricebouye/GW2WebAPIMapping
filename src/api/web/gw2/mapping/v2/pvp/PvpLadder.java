/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.pvp;

import api.web.gw2.mapping.core.ImplementationSpecific;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines all PvP ladder types.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/pvp")
@ImplementationSpecific
public enum PvpLadder {
    /**
     * Defines no ladder.
     */
    NONE("none"),
    /**
     * Defines the ranked ladder.
     */
    RANKED("Ranked"), // NOI18N.
    /**
     * Defines unranked ladder.
     */
    UNRANKED("Unranked"), // NOI18N.
    /**
     * Fail safe value.
     */
    @ImplementationSpecific
    UNKNOWN(null);

    final String value;

    private PvpLadder(String value) {
        this.value = value;
    }
}
