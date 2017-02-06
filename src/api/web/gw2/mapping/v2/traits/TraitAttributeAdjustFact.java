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
 * Defines an attribute adjust fact.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/traits") // NOI18N.
public interface TraitAttributeAdjustFact extends TraitFact {
    /**
     * {@inheritDoc}
     * @return Always {@code TraitFactType.ATTRIBUTE_ADJUST}.
     */
    @Override
    default TraitFactType getType() {
        return TraitFactType.ATTRIBUTE_ADJUST;
    }

    /**
     * Gets the value of this adjust fact.
     * @return An int.
     */
    @QuantityValue
    int getValue();

    /**
     * Gets the target attribute.
     * @return A {@code TraitAttribute} instance, never {@code null}.
     */
    TraitAttribute getTarget();
}
