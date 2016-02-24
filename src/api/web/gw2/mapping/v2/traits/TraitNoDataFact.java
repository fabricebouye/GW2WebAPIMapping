/* 
 * Copyright (C) 2015-2016 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.traits;

import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines a "no data" fact.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/traits") // NOI18N.
public interface TraitNoDataFact extends TraitFact {

    /**
     * {@inheritDoc}
     * @return Always {@code TraitFactType.NO_DATA}.
     */
    @Override
    default TraitFactType getType() {
        return TraitFactType.NO_DATA;
    }
}
