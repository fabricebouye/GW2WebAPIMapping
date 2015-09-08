/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.traits;

import api.web.gw2.mapping.core.PercentValue;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines a buff conversion fact.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/traits") // NOI18N.
public interface TraitBuffConversionFact  extends TraitFact {

    /**
     * {@inheritDoc}
     * @return Always {@code TraitFactType.BUFF_CONVERSION}.
     */
    @Override
    default TraitFactType getType() {
        return TraitFactType.BUFF_CONVERSION;
    }

    /**
     * Gets the percent value.
     * @return An {@code int}
     */
    @PercentValue
    int getPercent();

    /**
     * Gets the source attribute.
     * @return A {@code TraitAttribute} instance, never {@code null}.
     */
    TraitAttribute getSource();

    /**
     * Gets the target attribute.
     * @return A {@code TraitAttribute} instance, never {@code null}.
     */
    TraitAttribute getTarget();
}
