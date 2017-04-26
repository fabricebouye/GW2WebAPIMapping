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
import java.util.Set;

/**
 * Defines a guild treasury (items needed for guild upgrades).
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/guild/:id/treasury", requiresAuthentication = true, scope = "guilds") // NOI18N.
public interface GuildTreasury {

    /**
     * Gets the id of this item this treasury.
     * @return An {@code int} &gt; 0.
     * @see api.web.gw2.mapping.v2.items.Item#getId() 
     */
    @IdValue
    int getItemId();

    /**
     * Gets the number of this item in the treasury.
     * @return An {@code int} &ge; 0.
     */
    @QuantityValue
    int getCount();

    /**
     * Gets the set of guild upgrades which need this treasury item.
     * @return A non-modifiable {@code Set<GuildTreasuryUpgrade>}, never {@code null}.
     */
    Set<GuildTreasuryUpgrade> getNeededBy();
}
