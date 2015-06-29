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
 * Defines the character gender.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/characters", requiresAuthentication = true) // NOI18N.
public enum CharacterGender {

    /**
     * Defines female gender.
     */
    /**
     * Defines female gender.
     */
    FEMALE("Female"), // NOI18N.
    /**
     * Defines male gender.
     */
    MALE("Male"), // NOI18N.
    /**
     * Fail safe value.
     */
    @ImplementationSpecific
    UNKNOWN(null);
    final String value;

    CharacterGender(final String value) {
        this.value = value;
    }
}
