/* 
 * Copyright (C) 2015-2016 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.pvp.seasons;

import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines a PvP league season division flags.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/pvp/seasons", requiresAuthentication = true, scope = "pvp") // NOI18N.
public enum SeasonDivisionFlag {
    /**
     * Player can lose points in this division.
     */
    CAN_LOSE_POINTS("CanLosePoints"), // NOI18N.
    /**
     * Player can lose tiers in this division.
     */
    CAN_LOSE_TIERS("CanLoseTiers"), // NOI18N.
    /**
     * Player can repeat this division.
     */
    REPEATABLE("Repeatable"), // NOI18N.
    UNKNOWN(null);

    final String value;

    private SeasonDivisionFlag(final String value) {
        this.value = value;
    }
}
