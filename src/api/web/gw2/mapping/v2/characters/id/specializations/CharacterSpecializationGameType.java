/* 
 * Copyright (C) 2015-2019 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.characters.id.specializations;

import api.web.gw2.mapping.core.ImplementationSpecific;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines the game modes for a character's specializations.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/characters/:id/specializations", requiresAuthentication = true, scope = "characters") // NOI18N.
public enum CharacterSpecializationGameType {

    /**
     * Defines the PvE (Player vs. Environment) game mode.
     */
    PVE("Pve"), // NOI18N.
    /**
     * Defines the PvP (Player vs. Player) game mode.
     */
    PVP("Pvp"), // NOI18N.
    /**
     * Defines the WvW (World vs. World) game mode.
     */
    WVW("Wvw"), // NOI18N.
    /**
     * Fail safe value.
     */
    @ImplementationSpecific
    UNKNOWN(null);

    final String value;

    private CharacterSpecializationGameType(final String value) {
        this.value = value;
    }
}
