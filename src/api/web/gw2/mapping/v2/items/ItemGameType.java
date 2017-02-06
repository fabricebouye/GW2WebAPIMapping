/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.items;

import api.web.gw2.mapping.core.ImplementationSpecific;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines the game modes in which an item is allowed to be used.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/items") // NOI18N.
public enum ItemGameType {

    /**
     * Defines the activity (keg brawl, sanctum sprint, etc.) game mode.
     */
    ACTIVITY("Activity"), // NOI18N.
    /**
     * Defines the dungeon game mode.
     */
    DUNGEON("Dungeon"), // NOI18N.
    /**
     * Defines the PvE (Player vs. Environment) game mode.
     */
    PVE("Pve"), // NOI18N.
    /**
     * Defines the PvP (Player vs. Player) game mode.
     */
    PVP("Pvp"), // NOI18N.
    /**
     * Defines the PvP Lobby (Heart of the Mists) game mode.
     */
    PVP_LOBBY("PvpLobby"), // NOI18N.
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

    private ItemGameType(final String value) {
        this.value = value;
    }
}
