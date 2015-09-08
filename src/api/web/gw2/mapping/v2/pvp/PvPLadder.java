/* 
 * Copyright (C) 2015 Fabrice Bouyé
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
@APIv2(endpoint = "v2/traits")
@ImplementationSpecific
public enum PvPLadder {

    /**
     * Defines the air combo field type.
     */
    RANKED("Ranked"), // NOI18N.
    /**
     * Defines the dark combo field type.
     */
    UNRANKED("Unranked"), // NOI18N.
    /**
     * Fail safe value.
     */
    @ImplementationSpecific
    UNKNOWN(null);

    final String value;

    private PvPLadder(String value) {
        this.value = value;
    }
}
