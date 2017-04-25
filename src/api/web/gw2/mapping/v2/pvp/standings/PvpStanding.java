/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.pvp.standings;

import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines a PvP standing.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/pvp/standings", requiresAuthentication = true, scope = "pvp") // NOI18N.
public interface PvpStanding {

    /**
     * Gets the id of the season of this standing.
     * @return An int &gt; 0.
     */
    @IdValue(flavor = IdValue.Flavor.STRING)
    String getSeasonId();

    /**
     * Gets the current standing report.
     * @return A {@code PvpStandingReport} instance, never {@code null}.
     */
    PvpStandingReport getCurrent();

    /**
     * Gets the best standing report.
     * @return A {@code PvpStandingReport} instance, never {@code null}.
     */
    PvpStandingReport getBest();
}
