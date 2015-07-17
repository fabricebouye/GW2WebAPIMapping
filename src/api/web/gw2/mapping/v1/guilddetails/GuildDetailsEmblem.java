/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v1.guilddetails;

import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.v1.APIv1;
import java.util.Set;

/**
 * Defines the emblem of a guild.
 * @author Fabrice Bouyé
 */
@APIv1(endpoint = "v1/guild_details.json") // NOI18N.
public interface GuildDetailsEmblem {

    /**
     * Gets the id of the background image of this emblem.
     * @return An {@code int} &ge; 0.
     */
    @IdValue
    int getBackgroundId();

    /**
     * Gets the id of the background color of this emblem.
     * @return An {@code int} &ge; 0.
     */
    @IdValue
    int getBackgroundColorId();

    /**
     * Gets the id of the foreground image of this emblem.
     * @return An {@code int} &ge; 0.
     */
    @IdValue
    int getForegroundId();

    /**
     * Gets the id of the foreground primary color of this emblem.
     * @return An {@code int} &ge; 0.
     */
    @IdValue
    int getForegroundPrimaryColorId();

    /**
     * Gets the id of the foreground secondary color of this emblem.
     * @return An {@code int} &ge; 0.
     */
    @IdValue
    int getForegroundSecondaryColorId();

    /**
     * Gets a set of flags applied to this emblem.
     * @return A non-modifiable {@code Set<GuildDetailsEmblemFlag>}, never {@code null}, may be empty.
     */
    Set<GuildDetailsEmblemFlag> getFlags();
}
