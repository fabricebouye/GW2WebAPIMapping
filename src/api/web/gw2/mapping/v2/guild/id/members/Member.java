/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.guild.id.members;

import api.web.gw2.mapping.core.DateValue;
import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.v2.APIv2;
import java.time.ZonedDateTime;

/**
 * Defines a guild member.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/guid/:id/ranks", requiresAuthentication = true, scope = "guilds") // NOI18N.
public interface Member {

    /**
     * Gets the name of the account.
     * @return A {@code String} instance, never {@code null}.
     */
    @IdValue
    String getName();

    /**
     * Gets the name of the rank.
     * @return A {@code String} instance, never {@code null}.
     */
    @IdValue
    String getRank();

    /**
     * Gets date this member joined the guild.
     * @return A {@code ZonedDateTime} instance, never {@code null}.
     */
    @DateValue
    ZonedDateTime getJoined();
}
