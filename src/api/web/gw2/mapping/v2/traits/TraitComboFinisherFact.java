/* 
 * Copyright (C) 2015-2019 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.traits;

import api.web.gw2.mapping.core.PercentValue;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines a combo field fact.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/traits") // NOI18N.
public interface TraitComboFinisherFact extends TraitFact {

    /**
     * {@inheritDoc}
     * @return Always {@code TraitFactType.COMBO_FINISHER}.
     */
    @Override
    default TraitFactType getType() {
        return TraitFactType.COMBO_FINISHER;
    }

    /**
     * Gets the percent value of this fact.
     * @return An {@code int} &ge; 0.
     */
    @PercentValue
    int getPercent();

    /**
     * Gets the combo finisher type of this fact.
     * @return A {@code TraitComboFinisherType} instance, never {@code null}.
     */
    TraitComboFinisherType getFinisherType();
}
