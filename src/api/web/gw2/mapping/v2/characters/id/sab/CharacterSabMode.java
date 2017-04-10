/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api.web.gw2.mapping.v2.characters.id.sab;

import api.web.gw2.mapping.core.ImplementationSpecific;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines the equipment slots of a character.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/characters/:id/sab", requiresAuthentication = true, scope = {"characters", "progression"}) // NOI18N.
public enum CharacterSabMode {
    /**
     * Defines the infantile mode.
     */
    INFANTILE("infantile"), // NOI18N.
    /**
     * Defines the normal mode.
     */
    NORMAL("normal"), // NOI18N.
    /**
     * Defines the tribulation mode.
     */
    TRIBULATION("tribulation"), // NOI18N.

    /**
     * Fail safe value.
     */
    @ImplementationSpecific
    UNKNOWN(null);

    final String value;

    private CharacterSabMode(final String value) {
        this.value = value;
    }
}
