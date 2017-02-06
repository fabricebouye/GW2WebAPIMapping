/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.guild.id;

import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.core.LevelValue;
import api.web.gw2.mapping.core.QuantityValue;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines a guild.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/guid/:id", requiresAuthentication = true, scope = "guilds") // NOI18N.
public interface Guild {

    /**
     * Gets the id of a guild.
     * @return A {@code String} instance, never {@code null}.
     */
    @IdValue(flavor = IdValue.Flavor.STRING)
    String getId();

    /**
     * Gets the name of the guild.
     * @return A {@code String} instance, never {@code null}.
     */
    String getName();

    /**
     * Gets the tag of the guild.
     * @return A {@code String} instance, never {@code null}.
     */
    String getTag();

    /**
     * Gets the current level of the guild.
     * @return An {@code int} &ge; 0.
     */
    @LevelValue
    int getLevel();

    /**
     * Gets the current message of the day of the guild.
     * @return A {@code String} instance, may be {@code null} (?).
     */
    String getMotd();

    /**
     * Gets the current amount of influence of the guild.
     * @return An {@code int} &ge; 0.
     */
    @QuantityValue
    int getInfluence();

    /**
     * Gets the current amount of aetherium of the guild.
     * @return An {@code int} &ge; 0.
     */
    @QuantityValue
    int getAetherium();

    /**
     * Gets the current amount of favor of the guild.
     * @return An {@code int} &ge; 0.
     */
    @QuantityValue
    int getFavor();

    /**
     * Gets the current amount of resonance of the guild.
     * @return An {@code int} &ge; 0.
     */
    @QuantityValue
    int getResonance();

    /**
     * Gets the current emblem of the guild.
     * @return A {@code GuildEmblem}, never {@code null}.
     */
    GuildEmblem getEmblem();
}
