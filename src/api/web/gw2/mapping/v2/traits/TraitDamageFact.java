/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.traits;

import api.web.gw2.mapping.core.QuantityValue;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines a damage fact.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/traits") // NOI18N.
public interface TraitDamageFact extends TraitFact {

    /**
     * {@inheritDoc}
     * @return Always {@code TraitFactType.DAMAGE}.
     */
    @Override
    default TraitFactType getType() {
        return TraitFactType.DAMAGE;
    }

    /**
     * Gets the amount of time this damage hits.
     * @return An {@code int}.
     */
    @QuantityValue
    int getHitCount();
}
