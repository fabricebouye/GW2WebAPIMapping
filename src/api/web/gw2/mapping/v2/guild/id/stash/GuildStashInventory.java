/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.guild.id.stash;

import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.core.QuantityValue;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines an inventory object within a guild stash.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/characters/:id/stash", requiresAuthentication = true, scope = "guild") // NOI18N.
public interface GuildStashInventory {

    /**
     * Gets the Id of this object in inventory.
     * @return An {@code int}.
     */
    @IdValue
    int getId();

    /**
     * Gets the number of this object in inventory.
     * @return An {@code int}.
     */
    @QuantityValue
    int getCount();
}
