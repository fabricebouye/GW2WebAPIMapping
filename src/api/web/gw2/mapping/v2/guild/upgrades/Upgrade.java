/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.guild.upgrades;

import api.web.gw2.mapping.core.CoinAmount;
import api.web.gw2.mapping.core.CoinValue;
import api.web.gw2.mapping.core.DurationValue;
import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.core.LevelValue;
import api.web.gw2.mapping.core.LocalizedResource;
import api.web.gw2.mapping.core.OptionalValue;
import api.web.gw2.mapping.core.QuantityValue;
import api.web.gw2.mapping.core.SetValue;
import api.web.gw2.mapping.core.URLReference;
import api.web.gw2.mapping.core.URLValue;
import api.web.gw2.mapping.v2.APIv2;
import java.time.Duration;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Set;

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

    /**
     * Gets the icon of this upgrade.
     * @return A {@code URLReference} instance, never {@code null}.
     */
    @URLValue
    URLReference getIcon();

    /**
     * Gets the build time of this upgrade in seconds.
     * @return A {@code Duration} instance, never {@code null}.
     */
    @DurationValue
    Duration getBuildTime();

    /**
     * Gets the required guild level to build this upgrade.
     * @return An {@code int} &gt; 0.
     */
    // @todo create @GuildLevelValue?
    @LevelValue
    int getRequiredLevel();

    /**
     * Gets the amount of experience gained from building this upgrade.
     * @return An {@code int} &gt; 0.
     */
    @QuantityValue
    int getExperience();

    /**
     * Gets a set of all upgrade ids required to be built before allowed to build this upgrade.
     * @return A non-modifiable {@code Set<Integer>}, never {@code null}.
     */
    @IdValue
    @SetValue
    Set<Integer> getPrerequisites();

    /**
     * Gets a set of costs required before allowed to build this upgrade.
     * @return A non-modifiable {@code Set<UpgradeCost>}, never {@code null}.
     */
    @SetValue
    Set<UpgradeCost> getCosts();

    // @todo Not sure about the need to split into a sub itnerface for those 2 fields.
    /** 
     * Gets the maximum number item slots for this bank tab.
     * @return An {@code OptionalInt}, never {@code null}.
     */
    @OptionalValue
    @QuantityValue
    OptionalInt getBagMaxItems();

    /**
     * Gets the maximum number of coins for this bank tab.
     * @return An {@code Optional<CoinAmount>}, never {@code null}.
     */
    @OptionalValue
    @CoinValue
    Optional<CoinAmount> getBagMaxCoins();
}
