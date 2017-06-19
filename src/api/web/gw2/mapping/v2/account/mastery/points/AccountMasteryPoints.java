/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.account.mastery.points;

import api.web.gw2.mapping.core.SetValue;
import api.web.gw2.mapping.v2.APIv2;
import java.util.Set;

/**
 * Defines an account mastery points report.
 * @author Fabrice Bouyé
 * @see api.web.gw2.mapping.v2.masteries.Mastery
 */
@APIv2(endpoint = "v2/account/mastery/points", requiresAuthentication = true, scope = "progression") // NOI18N.
public interface AccountMasteryPoints {

    /**
     * Gets the region summaries.
     * @return A non-modifiable {@code Set<MasteryPointsTotal>}, never {@code null}. Maybe empty.
     */
    @SetValue
    Set<AccountMasteryPointsTotal> getTotals();

    /**
     * Gets all mastery points unlocked by this account.
     * @return A non-modifiable {@code Set<Integer>}, never {@code null}. Maybe empty.
     */
    @SetValue
    Set<Integer> getUnlocked();
}
