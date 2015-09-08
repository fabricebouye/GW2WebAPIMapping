/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.pvp.games;

import api.web.gw2.mapping.core.ImplementationSpecific;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines all teams in a PvP match.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/traits")
public enum GameTeam {

    /**
     * Defines the blue team.
     */
    BLUE("Blue"), // NOI18N.
    /**
     * Defines the red team.
     */
    RED("Red"), // NOI18N.
    /**
     * Fail safe value.
     */
    @ImplementationSpecific
    UNKNOWN(null);

    final String value;

    private GameTeam(final String value) {
        this.value = value;
    }
}
