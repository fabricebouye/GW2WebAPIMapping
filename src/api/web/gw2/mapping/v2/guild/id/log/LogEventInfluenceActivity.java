/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.guild.id.log;

import api.web.gw2.mapping.core.ImplementationSpecific;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines all types activities for the influence log event type.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/guid/:id/log", requiresAuthentication = true, scope = "guilds") // NOI18N.
public enum LogEventInfluenceActivity {
    /**
     * Defines daily login influence activity.
     */
    DAILY_LOGIN("daily_login"),
    /**
     * Defines gifted influence activity.
     */
    GIFTED("gifted"),
    /**
     * Fail safe value.
     */
    @ImplementationSpecific
    UNKNOWN(null);

    final String value;

    private LogEventInfluenceActivity(final String value) {
        this.value = value;
    }
}
