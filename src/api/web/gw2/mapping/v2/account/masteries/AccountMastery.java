/* 
 * Copyright (C) 2015-2019 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.account.masteries;

import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.core.QuantityValue;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines an account mastery unlock.
 * @author Fabrice Bouyé
 * @see api.web.gw2.mapping.v2.masteries.Mastery
 */
@APIv2(endpoint = "v2/account/masteries", requiresAuthentication = true, scope = "progression") // NOI18N.
public interface AccountMastery {

    /**
     * Gets the id of the mastery.
     * @return An {@code int}
     * @see api.web.gw2.mapping.v2.masteries.Mastery#getId() 
     */
    @IdValue
    int getId();

    /**
     * Gets the level of the mastery.
     * @return A {@code int} &gt; 0.
     */
    @QuantityValue
    int getLevel();
}
