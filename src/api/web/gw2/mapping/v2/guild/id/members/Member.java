/* 
 * Copyright (C) 2015-2016 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.guild.id.members;

import api.web.gw2.mapping.core.DateValue;
import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.core.OptionalValue;
import api.web.gw2.mapping.v2.APIv2;
import java.time.ZonedDateTime;
import java.util.Optional;

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
    @IdValue(flavor = IdValue.Flavor.STRING)
    String getName();

    /**
     * Gets the name of the rank.
     * @return A {@code String} instance, never {@code null}.
     */
    @IdValue(flavor = IdValue.Flavor.STRING)
    String getRank();

    /**
     * Gets date this member joined the guild.
     * Note: people who joined before March 19, 2013 do not have this date set, see <a href="https://forum-en.guildwars2.com/forum/community/api/New-endpoints-guild-ranks-members/5860679">the official forums</a> for more details.
     * @return An {@code Optional<ZonedDateTime>} instance, never {@code null}.
     */
    @DateValue
    @OptionalValue
    Optional<ZonedDateTime> getJoined();
}
