/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.guild.id.treasury;

import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.core.QuantityValue;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines a guild upgrade simple description (the reference of a guild upgrade used by the treasury).
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/guild/:id/treasury", requiresAuthentication = true, scope = "guilds") // NOI18N.
public interface TreasuryUpgrade {

    /**
     * Gets the id of the upgrade.
     * @return An {@code int} &gt; 0.
     */
    @IdValue
    int getUpgradeId();

    /**
     * Gets the total number of treasury item needed by this upgrade.
     * @return An {@code int} &ge; 0.
     */
    @QuantityValue
    int getCount();
}
