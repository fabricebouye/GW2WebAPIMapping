/* 
 * Copyright (C) 2015-2019 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.traits;

import api.web.gw2.mapping.core.QuantityValue;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines a radius fact.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/traits") // NOI18N.
public interface TraitRadiusFact extends TraitFact {

    /**
     * {@inheritDoc}
     * @return Always {@code TraitFactType.RADIUS}.
     */
    @Override
    default TraitFactType getType() {
        return TraitFactType.RADIUS;
    }

    /**
     * Gets the distance of this fact.
     * @return An {@code int} &ge; 0.
     */
    @QuantityValue
    int getDistance();
}
