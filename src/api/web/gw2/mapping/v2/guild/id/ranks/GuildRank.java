/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.guild.id.ranks;

import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.core.QuantityValue;
import api.web.gw2.mapping.core.SetValue;
import api.web.gw2.mapping.core.URLReference;
import api.web.gw2.mapping.core.URLValue;
import api.web.gw2.mapping.v2.APIv2;
import api.web.gw2.mapping.v2.guild.permissions.PermissionId;
import java.util.Set;

/**
 * Defines a guild rank.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/guild/:id/ranks", requiresAuthentication = true, scope = "guilds") // NOI18N.
public interface GuildRank {

    /**
     * Gets the id of this rank.
     * @return A {@code String} instance, never {@code null}.
     */
    // @todo Need to check if those are enum values of the user value when editing guild ranks.
    @IdValue
    String getId();

    /**
     * Gets the order of this rank in the UI.
     * @return An {@code int} &ge; 0.
     */
    @QuantityValue
    int getOrder();

    /**
     * Gets a set of permissions for this rank.
     * @return A non-modifiable {@code Set<PermissionId>} instance, never {@code null}.
     * @see api.web.gw2.mapping.v2.guild.permissions.PermissionId
     */
    @SetValue
    Set<PermissionId> getPermissions();

    /**
     * Gets the URL to the icon of this item.
     * @return A {@code URLReference} instance, never {@code null}.
     */
    @URLValue
    URLReference getIcon();
}
