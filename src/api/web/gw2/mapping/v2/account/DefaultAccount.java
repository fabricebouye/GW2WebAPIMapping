/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.account;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Collections;
import java.util.Set;

/**
 * Default implementation of an account.
 * @author Fabrice Bouyé
 */
final class DefaultAccount implements Account {

    String id = "";
    String name = "";
    int world = -1;
    Set<String> guilds = Collections.EMPTY_SET;
    ZonedDateTime created = ZonedDateTime.parse("1970-01-01T00:00:00Z"); // NOI18N.

    /**
     * Creates an empty instance.
     */
    DefaultAccount() {
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getWorld() {
        return world;
    }

    @Override
    public Set<String> getGuilds() {
        return guilds;
    }

    @Override
    public ZonedDateTime getCreated() {
        return created;
    }
}
