/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.guild.upgrades;

import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.core.LocalizedResource;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines a guild upgrade.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/guild/upgrades") // NOI18N.
public interface Upgrade {

    /**
     * Gets the id of this upgrade.
     * @return An {@code int}.
     */
    @IdValue
    int getId();

    /**
     * Gets the localized name of this upgrade.
     * @return A {@code String} instance, never {@code null}.
     */
    @LocalizedResource
    String getName();
}
