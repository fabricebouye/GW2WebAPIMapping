/* 
 * Copyright (C) 2015-2019 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.traits;

import api.web.gw2.mapping.core.ImplementationSpecific;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines the tiers of a trait.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/traits")
public enum TraitTier {

    /**
     * Defines tier 0.
     * <br> Only used by elite specializations.
     */
    TIER_0(0),
    /**
     * Defines tier 1.
     */
    TIER_1(1),
    /**
     * Defines tier 2.
     */
    TIER_2(2),
    /**
     * Defines tier 3.
     */
    TIER_3(3),
    /**
     * Fail safe value.
     */
    @ImplementationSpecific
    UNKNOWN(-1);

    final int value;

    private TraitTier(Integer value) {
        this.value = value;
    }
}
