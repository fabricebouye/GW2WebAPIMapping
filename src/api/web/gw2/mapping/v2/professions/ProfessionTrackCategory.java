/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.professions;

import api.web.gw2.mapping.core.ImplementationSpecific;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines all track categories.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/professions") // NOI18N.
public enum ProfessionTrackCategory {
    /**
     * Defines a skill track.
     */
    SKILLS("Skills"), // NOI18N.
    /**
     * Defines a specialization track.
     */
    SPECIALIZATIONS("Specializations"), // NOI18N.
    /**
     * Defines an elite specialization track.
     */
    ELITE_SPECIALIZATIONS("EliteSpecializations"), // NOI18N.
    /**
     * Fail safe value.
     */
    @ImplementationSpecific
    UNKNOWN(null);

    private final String value;

    private ProfessionTrackCategory(final String value) {
        this.value = value;
    }
}
