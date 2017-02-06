/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.recipes;

import api.web.gw2.mapping.core.ImplementationSpecific;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines all recipe flags.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/recipes") // NOI18N.
public enum RecipeFlag {
    /**
    * Defines the auto-learned flag.
    */
    AUTO_LEARNED("AutoLearned"), // NOI18N.
    /**
    * Defines the learned from item flag.
    */
    LEARNED_FROM_ITEM("LearedFromItem"), // NOI18N.
    /**
     * Fail safe value.
     */
    @ImplementationSpecific
    UNKNOWN(null);

    final String value;

    private RecipeFlag(final String value) {
        this.value = value;
    }
}
