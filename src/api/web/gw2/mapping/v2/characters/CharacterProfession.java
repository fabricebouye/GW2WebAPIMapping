/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api.web.gw2.mapping.v2.characters;

import api.web.gw2.mapping.core.ImplementationSpecific;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines the character profession
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/characters", requiresAuthentication = true) // NOI18N.
public enum CharacterProfession {

    /**
     * Defines elementalist profession.
     */
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
    @ImplementationSpecific
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
