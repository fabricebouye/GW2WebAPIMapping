/*
 * Copyright (C) 2015-2019 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.masteries;

import api.web.gw2.mapping.core.ImplementationSpecific;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines all mastery regions.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/masteries") // NOI18N.
public enum MasteryRegion {
    /**
     * Defines the Maguuma mastery region (Heart of Thorns, Raid, Living World Season 3).
     */
    MAGUUMA("Maguuma"), // NOI18N.
    /**
     * Defines the Tyria mastery region (core game, Living World Season 1, Living World Season 2).
     */
    TYRIA("Tyria"), // NOI18N.
    /**
     * Fail safe value.
     */
    @ImplementationSpecific
    UNKNOWN(null);

    private final String value;

    private MasteryRegion(final String value) {
        this.value = value;
    }
}
