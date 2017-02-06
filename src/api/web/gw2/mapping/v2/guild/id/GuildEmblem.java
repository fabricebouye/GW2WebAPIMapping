/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.guild.id;

import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.core.SetValue;
import api.web.gw2.mapping.v2.APIv2;
import java.util.Set;

/**
 * Defines the emblem of a guild.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/guid/:id", requiresAuthentication = true, scope = "guilds") // NOI18N.
public interface GuildEmblem {

    /**
     * Gets the background layer of this emblem.
     * @return A {@code GuildEmblemLayer} instance, never {@code null}.
     */
    @IdValue
    GuildEmblemLayer getBackground();

    /**
     * Gets the foreground layer of this emblem.
     * @return A {@code GuildEmblemLayer} instance, never {@code null}.
     */
    @IdValue
    GuildEmblemLayer getForeground();

    /**
     * Gets a set of flags applied to each layer in this emblem.
     * @return A non-modifiable {@code Set<GuildsEmblemFlag>}, never {@code null}, may be empty.
     */
    @SetValue
    Set<GuildsEmblemFlag> getFlags();
}
