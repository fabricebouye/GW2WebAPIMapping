/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
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
@APIv2(endpoint = "v2/pvp/games", requiresAuthentication = true, scope = "pvp") // NOI18N.
public enum PvpGameTeam {

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

    private PvpGameTeam(final String value) {
        this.value = value;
    }
}
