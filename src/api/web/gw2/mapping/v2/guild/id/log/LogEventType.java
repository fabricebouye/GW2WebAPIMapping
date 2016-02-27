/* 
 * Copyright (C) 2015-2016 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.guild.id.log;

import api.web.gw2.mapping.core.ImplementationSpecific;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines all types of log events.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/guid/:id/log", requiresAuthentication = true, scope = "guilds") // NOI18N.
public enum LogEventType {
    /**
     * Defines the treasury log event type.
     */
    TREASURY("treasury"),
    /**
     * Defines the message of the day log event type.
     */
    MOTD("motd"),
    /**
     * Fail safe value.
     */
    @ImplementationSpecific
    UNKNOWN(null);

    final String value;

    private LogEventType(final String value) {
        this.value = value;
    }
}
