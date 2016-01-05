/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.achievements;

import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.core.LocalizedResource;
import api.web.gw2.mapping.core.OptionalValue;
import api.web.gw2.mapping.core.URLValue;
import api.web.gw2.mapping.v2.APIv2;
import java.net.URL;
import java.util.Optional;
import java.util.Set;

/**
 * Defines an achievements.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/achievements") // NOI18N.
public interface Achievement {

    /**
     * Gets the id of this achievement.
     * @return An {@code int}.
     */
    @IdValue
    int getId();

    /**
     * Gets the URL of the icon for this achievement.
     * @return An {@code Optional<URL>}, never {@code null}.
     */
    @URLValue
    @OptionalValue
    Optional<URL> getIcon();

    /**
     * Gets the localized name of this achievement.
     * @return A {@code String} instance, never {@code null}.
     */
    @LocalizedResource
    String getName();

    /**
     * Gets the localized description of this achievement.
     * @return A {@code String} instance, never {@code null}.
     */
    @LocalizedResource
    String getDescription();

    /**
     * Gets the localized requirement of this achievement.
     * @return A {@code String} instance, never {@code null}.
     */
    @LocalizedResource
    String getRequirement();

    /**
     * Gets the type of this achievement.
     * @return An {@code AchievementType} instance, never {@code null}.
     */
    AchievementType getType();

    /**
     * Gets the flags of this achievement.
     * @return A non-modifiable {@code Set<AchievementFlag>} instance, never {@code null}.
     */
    Set<AchievementFlag> getFlags();

    /**
     * Gets the tiers for this achievement.
     * @return A non-modifiable {@code Set<AchievementTier>} instance, never {@code null}.
     */
    Set<AchievementTier> getTiers();

    /**
     * Gets the rewards for this achievement.
     * @return An {@code Optional<Set<AchievementReward>>} instance, never {@code null}.
     * <br>If present the contained set is non-modifiable and may be empty.
     */
    @OptionalValue
    Optional<Set<AchievementReward>> getRewards();

    /**
     * Gets the bits for this achievement.
     * @return An {@code Optional<Set<AchievementBit>>} instance, never {@code null}.
     * <br>If present the contained set is non-modifiable and may be empty.
     */
    @OptionalValue
    Optional<Set<AchievementBit>> getBits();
}
