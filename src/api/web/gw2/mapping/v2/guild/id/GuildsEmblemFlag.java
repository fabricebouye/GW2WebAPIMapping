/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.guild.id;

import api.web.gw2.mapping.core.ImplementationSpecific;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Implements guild emblem flag.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/guid/:id", requiresAuthentication = true, scope = "guilds") // NOI18N.
public enum GuildsEmblemFlag {

    /**
     * The image of the emblem is flipped horizontally in this layer.
     */
    FLIP_BACKGROUND_HORIZONTAL("FlipBackgroundHorizontal"), // NOI18N.
    /**
     * The image of the emblem is flipped horizontally in this layer.
     */
    FLIP_BACKGROUND_VERTICAL("FlipBackgroundVertical"), // NOI18N.
    /**
     * Fail safe value.
     */
    @ImplementationSpecific
    UNKNOWN(null);

    final String value;

    GuildsEmblemFlag(final String value) {
        this.value = value;
    }
}
