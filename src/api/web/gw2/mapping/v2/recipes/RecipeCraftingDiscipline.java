/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.recipes;

import api.web.gw2.mapping.core.ImplementationSpecific;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines all recipe crafting disciplines.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/recipes") // NOI18N.
public enum RecipeCraftingDiscipline {

    ARTIFICIER("Artificier"), // NOI18N.
    ARMORSMITH("Armorsmith"), // NOI18N.
    CHEF("Chef"), // NOI18N.
    HUNTSMAN("Huntsman"), // NOI18N.
    JEWELER("Jeweler"), // NOI18N.
    LEATHERWORKER("Leatherworker"), // NOI18N.
    TAILOR("Tailor"), // NOI18N.
    WEAPONSMITH("Weaponsmith"), // NOI18N.
    /**
     * Fail safe value.
     */
    @ImplementationSpecific
    UNKNOWN(null);

    final String value;

    private RecipeCraftingDiscipline(final String value) {
        this.value = value;
    }

}
