/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v1.guilddetails;

import api.web.gw2.mapping.v1.APIv1;
import api.web.gw2.mapping.core.ImplementationSpecific;

/**
 * Implements guild emblem flag.
 * @author Fabrice Bouyé
 */
@APIv1(endpoint = "v1/guild_details.json") // NOI18N.
public enum GuildDetailsEmblemFlag {

    /**
     * The background image of the emblem is flipped horizontally.
     */
    FLIP_BACKGROUND_HORIZONTAL("FlipBackgroundHorizontal"), // NOI18N.
    /**
     * The background image of the emblem is flipped vertically.
     */
    FLIP_BACKGROUND_VERTICAL("FlipBackgroundVertical"), // NOI18N.
    /**
     * The foreground image of the emblem is flipped horizontally.
     */
    FLIP_FOREGROUND_HORIZONTAL("FlipForegroundHorizontal"), // NOI18N.
    /**
     *  The foreground image of the emblem is flipped vertically.
     */
    FLIP_FOREGROUND_VERTICAL("FlipForegroundVertical"), // NOI18N.
    /**
     * Fail safe value.
     */
    @ImplementationSpecific
    UNKNOWN(null);

    final String value;

    GuildDetailsEmblemFlag(final String value) {
        this.value = value;
    }
}
