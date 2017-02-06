/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.guild.id.stash;

import api.web.gw2.mapping.core.CoinAmount;
import api.web.gw2.mapping.core.CoinValue;
import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.core.QuantityValue;
import api.web.gw2.mapping.v2.APIv2;
import java.util.List;

/**
 * Defines a guild stash.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/guid/:id/stash", requiresAuthentication = true, scope = "guilds") // NOI18N.
public interface Stash {

    /**
     * Gets the id the guild upgrade that granted access to this section of the guild vault.
     * @return An {@code int} &gt; 0.
     */
    @IdValue
    int getUpgradeId();

    /**
     * Gets the number of slots in the stash.
     * @return An {@code int} &ge; 0.
     */
    @QuantityValue
    int getSize();

    /**
     * Gets the amount of copper in the stash.
     * @return A {@code CointAmount} instance, never {@code null}.
     */
    @CoinValue
    CoinAmount getCoins();

    /**
     * Gets the description of the stash.
     * @return A {@code String} instance, can be {@code null}.
     */
    String getNote();

    /**
     * Gets the list of inventory slots of the stash.
     * @return A non-modifiable {@code List<StashInventory>} instance, never {@code null}.
     * <br>Can be empty.
     */
    List<StashInventory> getInventory();
}
