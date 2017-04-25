/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.pvp.seasons;

import api.web.gw2.mapping.core.ImplementationSpecific;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines a all PvP season ladder types.
 * As of 2017-02-06 there are 3 types of ladders:
 * <ul>
 * <li>legendary - in season 1-4.</li>
 * <li>guild - in season 1-4.</li>
 * <li>ladder - in season 5+.</li>
 * </ul>
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/pvp/seasons") // NOI18N.
public enum PvpSeasonLadderType {
    /**
     * Legendary ladder uses in season 1-4.
     */
    LEGENDARY("legendary"), // NOI18N.
    /**
     * Guild ladder uses in season 1-4.
     */
    GUILD("guild"), // NOI18N.
    /**
     * Regular ladder uses in season 5+.
     */
    LADDER("ladder"), // NOI18N.
    /**
     * Fail safe value.
     */
    @ImplementationSpecific
    UNKNOWN(null);

    final String value;

    private PvpSeasonLadderType(String value) {
        this.value = value;
    }
}
