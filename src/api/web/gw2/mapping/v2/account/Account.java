/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.account;

import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.v2.APIv2;
import java.util.Set;

/**
 * Defines an account.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/account", requiresAuthentication = true) // NOI18N.
public interface Account {

    /**
     * Gets the id of this account.
     * @return A {@code String}, never {@code null}.
     */
    @IdValue
    String getId();

    /**
     * Gets the name of this account.
     * @return A {@code String}, never {@code null}.
     */
    String getName();

    /**
     * Gets the id of the account's world.
     * @return An {@code int}.
     */
    @IdValue
    int getWorld();

    /**
     * Gets a set of guilds attached to this account.
     * @return A non-modifiable {@code Set<String>} instance, never {@code null}, may be empty.
     */
    @IdValue
    Set<String> getGuilds();
}
