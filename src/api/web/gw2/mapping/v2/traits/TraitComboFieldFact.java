/* 
 * Copyright (C) 2015-2019 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.traits;

import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines a combo field fact.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/traits") // NOI18N.
public interface TraitComboFieldFact extends TraitFact {

    /**
     * {@inheritDoc}
     * @return Always {@code TraitFactType.COMBO_FIELD}.
     */
    @Override
    default TraitFactType getType() {
        return TraitFactType.COMBO_FIELD;
    }

    /**
     * Gets the combo field type of this fact.
     * @return A {@code TraitComboFieldType} instance, never {@code null}.
     */
    TraitComboFieldType getFieldType();
}
