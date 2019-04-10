/* 
 * Copyright (C) 2015-2019 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.wvw.upgrades;

import api.web.gw2.mapping.core.LocalizedResource;
import api.web.gw2.mapping.core.QuantityValue;
import api.web.gw2.mapping.core.SetValue;
import java.util.Set;

/**
 * Defines a tier in the WvW upgrade response.
 * @author Fabrice Bouyé
 */
public interface WvwUpgradeTier {

    /**
     * Gets the i18n name of this tier.
     * @return A {@code String} instance, never {@code null}.
     */
    @LocalizedResource
    String getName();

    /**
     * Gets the number of dolyaks required to complete this tier.
     * @return A {@code int} &ge; 0.
     */
    @QuantityValue
    int getYaksRequired();

    /**
     * Gets a set of all upgrades in this tier.
     * @return A {@code Set<WvwUpgrade>} instance, never {@code null}. The
     * returned collection may be empty.
     */
    @SetValue
    Set<WvwUpgrade> getUpgrades();
}
