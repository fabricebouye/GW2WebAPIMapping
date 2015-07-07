/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.characters;

import api.web.gw2.mapping.core.ImplementationSpecific;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines the character race.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/characters", requiresAuthentication = true) // NOI18N.
public enum CharacterRace {

    /**
     * Defines asura race.
     */
    ASURA("Asura"), // NOI18N.
    /**
     * Defines charr race.
     */
    CHARR("Charr"), // NOI18N.
    /**
     * Defines human race.
     */
    HUMAN("Human"), // NOI18N.
    /**
     * Defines norn race.
     */
    NORN("Norn"), // NOI18N.
    /**
     * Defines sylvari race.
     */
    SYLVARI("Sylvari"), // NOI18N.
    /**
     * Fail safe value.
     */
    @ImplementationSpecific
    UNKNOWN(null);

    final String value;

    CharacterRace(final String value) {
        this.value = value;
    }
}
