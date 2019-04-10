/* 
 * Copyright (C) 2015-2019 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.guild.upgrades;

import api.web.gw2.mapping.core.LocalizedResource;
import api.web.gw2.mapping.core.OptionalValue;
import api.web.gw2.mapping.core.QuantityValue;
import api.web.gw2.mapping.v2.APIv2;
import java.util.OptionalInt;

/**
 * Defines a guild upgrade cost.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/guild/upgrades") // NOI18N.
public interface GuildUpgradeCost {

    /**
     * Gets the type of this cost.
     * @return An {@code GuildUpgradeCostType} instance, never {@code null}.
     */
    GuildUpgradeCostType getType();

    /**
     * Gets the i18n name of this cost.
     * @return A {@code String} instance, never {@code null}.
     */
    @LocalizedResource
    String getName();

    /**
     * Gets the amount needed for this cost.
     * @return An {@code int} &gt; .
     */
    @QuantityValue
    int getCount();

    /**
     * Gets the item id associated with this cost (if any).
     * @return An {@code OptionalInt} instance, never {@code null}.
     */
    @OptionalValue
    OptionalInt getItemId();
}
