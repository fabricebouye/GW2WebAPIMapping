/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.characters;

import api.web.gw2.mapping.core.ImplementationSpecific;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines the character profession
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/characters", requiresAuthentication = true, scope = "characters") // NOI18N.
public enum CharacterProfession {

    /**
     * Defines elementalist profession.
     */
    ELEMENTALIST("Elementalist"), // NOI18N.
    /**
     * Defines engineer profession.
     */
    ENGINEER("Engineer"), // NOI18N.
    /**
     * Defines guardian profession.
     */
    GUARDIAN("Guardian"), // NOI18N.
    /**
     * Defines mesmer profession.
     */
    MESMER("Mesmer"), // NOI18N.
    /**
     * Defines necromancer profession.
     */
    NECROMANCER("Necromancer"), // NOI18N.
    /**
     * Defines ranger profession.
     */
    RANGER("Ranger"), // NOI18N.
    /**
     * Defines revenant profession.
     */
    REVENANT("Revenant"), // NOI18N.
    /**
     * Defines thief profession.
     */
    THIEF("Thief"), // NOI18N.
    /**
     * Defines warrior profession.
     */
    WARRIOR("Warrior"), // NOI18N.
    /**
     * Fail safe value.
     */
    @ImplementationSpecific
    UNKNOWN(null);

    final String value;

    CharacterProfession(final String value) {
        this.value = value;
    }
}
