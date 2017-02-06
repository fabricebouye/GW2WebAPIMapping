/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.guild.permissions;

import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.core.LocalizedResource;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines a guild permission.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/guild/permissions") // NOI18N.
public interface Permission {
    /**
    * Gets this permission's id.
    * @return A {@code GuildPermissionId} instance, never {@code null}.
    */
    @IdValue
    // @todo id values looks suspiciously like enum values!
    PermissionId getId();
    
    /**
    * Gets this permission's localized name.
    * @return A {@code String} instance, never {@code null}.
    */
    @LocalizedResource
    String getName();

    /**
    * Gets this permission's localized description.
    * @return A {@code String} instance, never {@code null}.
    */
    @LocalizedResource
    String getDescription();    
}
