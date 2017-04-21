/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.wvw.upgrades;

import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.core.SetValue;
import java.util.Set;

/**
 * Defines a WvW upgrade response.
 * <br>This is the object returned when querying v2/wvw/upgrades.
 * @author Fabrice Bouyé
 */
public interface WvwUpgradeResponse {

    /**
     * Gets the id of this upgrade response.
     * @return A {@code String} instance, never {@code null}.
     */
    @IdValue(flavor = IdValue.Flavor.STRING)
    String getId();

    /**
     * Gets a set of all tiers in this upgrade response.
     * @return A {@code Set<WvwUpgradeTier>} instance, never {@code null}. The
     * returned collection may be empty.
     */
    @SetValue
    Set<WvwUpgradeTier> getTiers();
}
