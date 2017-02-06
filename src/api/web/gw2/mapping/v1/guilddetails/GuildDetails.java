/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v1.guilddetails;

import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.v1.APIv1;

/**
 * Defines the details of a guild.
 * @author Fabrice Bouyé
 */
@APIv1(endpoint = "v1/guild_details.json") // NOI18N.
public interface GuildDetails {

    /**
     * Gets the id of the guild.
     * @return  A {@code String} instance, never {@code null}.
     */
    @IdValue
    String getGuildId();

    /**
     * Gets the name of the guild.
     * @return  A {@code String} instance, never {@code null}.
     */    
    String getGuildName();

    /**
     * Gets the tab of the guild.
     * @return  A {@code String} instance, never {@code null}.
     */
    String getTag();

    /**
     * Gets the description of the emblem of the guild.
     * @return A {@code Emblem} instance, never {@code null}.
     */
    GuildDetailsEmblem getEmblem();
}
