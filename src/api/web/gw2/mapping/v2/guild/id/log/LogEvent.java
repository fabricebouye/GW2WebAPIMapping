/* 
 * Copyright (C) 2015-2016 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.guild.id.log;

import api.web.gw2.mapping.core.DateValue;
import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.v2.APIv2;
import java.time.ZonedDateTime;
import java.util.Optional;
import java.util.OptionalInt;

/**
 * Defines a guild log event.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/guid/:id/log", requiresAuthentication = true, scope = "guilds") // NOI18N.
public interface LogEvent {

    /**
     * Gets the id of this log event.
     * @return An {@code int}.
     */
    @IdValue
    int getId();

    /**
     * Gets the time of this log event.
     * @return A {@code ZonedDateTime} instance, never {@code null}.
     */
    @DateValue
    ZonedDateTime getTime();

    /**
     * Gets the name of the user responsible for this log event.
     * @return A {@code String} instance, never {@code null}.
     */
    @IdValue(flavor = IdValue.Flavor.STRING)
    String getUser();

    /**
     * Gets the type of this log event.
     * @return A {@code LogEventType} instance, never {@code null}.
     */
    LogEventType getType();

    /**
     * Gets the id of the item for a treasury log event.
     * @return An {@code OptionalInt} instance, never {@code null}.
     * <br>May be empty.
     * @see LogEventType
     */
    OptionalInt getItemId();

    /**
     * Gets the count of the item for a treasury log event.
     * @return An {@code OptionalInt} instance, never {@code null}.
     * <br>May be empty.
     * @see LogEventType
     */
    OptionalInt getCount();

    /**
     * Gets the message of the day for a motd log event.
     * @return An {@code Optional<String>} instance, never {@code null}.
     * <br>May be empty.
     * @see LogEventType
     */
    Optional<String> getMotd();
}
