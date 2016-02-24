/* 
 * Copyright (C) 2015-2016 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.traits;

import api.web.gw2.mapping.core.PercentValue;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines a percent fact.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/traits") // NOI18N.
public interface TraitPercentFact extends TraitFact {

    /**
     * {@inheritDoc}
     * @return Always {@code TraitFactType.PERCENT}.
     */
    @Override
    default TraitFactType getType() {
        return TraitFactType.PERCENT;
    }

    /**
     * Gets the percent value of this fact.
     * @return An {@code int} &ge; 0.
     */
    @PercentValue
    int getPercent();
}
