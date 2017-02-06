/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.guild.id;

import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.core.ListValue;
import api.web.gw2.mapping.v2.APIv2;
import java.util.List;

/**
 * Defines one of the layers (background / foreground) that makes the emblem of a guild.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/guid/:id", requiresAuthentication = true, scope = "guilds") // NOI18N.
public interface GuildEmblemLayer {

    /**
     * Gets the id of this emblem.
     * @return An {@code int}.
     */
    @IdValue
    int getId();

    /**
     * Gets the list of colors ids used in this layer.
     * @return A non-modifiable {@code List<Integer>}, never {@code null}; may be empty.
     */
    @ListValue
    @IdValue
    List<Integer> getColors();
}
