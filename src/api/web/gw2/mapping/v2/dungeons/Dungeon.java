/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.dungeons;

import api.web.gw2.mapping.core.ImplementationSpecific;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines dungeons ids.
 * @author Fabrice Bouyé
 */
@ImplementationSpecific
@APIv2(endpoint = "v2/dungeon") // NOI18N.
public enum Dungeon {

    /**
     * Defines the Ascalonian Catacombs.
     */
    ASCALONIAN_CATACOMBS("ascalonian_catacombs"), // NOI18N.
    /**
     * Defines Caudecus' Manor.
     */
    CAUDECUS_MANOR("caudecus_manor"), // NOI18N.
    /**
     * Defines the Twilight Arbor.
     */
    TWILIGHT_ARBOR("twilight_arbor"), // NOI18N.
    /**
     * Defines Sorrow's Embrace.
     */
    SORROWS_EMBRACE("sorrows_embrace"), // NOI18N.
    /**
     * Defines the Citadel of Flames.
     */
    CITADEL_OF_FLAME("citadel_of_flame"), // NOI18N.
    /**
     * Defines the Honor of the Waves.
     */
    HONOR_OF_THE_WAVES("honor_of_the_waves"), // NOI18N.
    /**
     * Defines the Crucible of Eternity.
     */
    CRUCIBLE_OF_ETERNITY("crucible_of_eternity"), // NOI18N.
    /**
     * Defines the Ruined City of Arah.
     */
    RUINED_CITY_OF_ARAH("ruined_city_of_arah"), // NOI18N.
    /**
     * Fail safe value.
     */
    @ImplementationSpecific
    UNKNOWN(null);

    final String value;

    private Dungeon(final String value) {
        this.value = value;
    }
}
