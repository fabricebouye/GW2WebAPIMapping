/* 
 * Copyright (C) 2015-2019 Fabrice Bouyé
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
    /**
     * Defines the artificer discipline.
     */
    ARTIFICER("Artificer"), // NOI18N.
    /**
     * Defines the armorsmith discipline.
     */
    ARMORSMITH("Armorsmith"), // NOI18N.
    /**
     * Defines the chef discipline.
     */
    CHEF("Chef"), // NOI18N.
    /**
     * Defines the huntsman discipline.
     */
    HUNTSMAN("Huntsman"), // NOI18N.
    /**
     * Defines the jeweler discipline.
     */
    JEWELER("Jeweler"), // NOI18N.
    /**
     * Defines the leatherworker discipline.
     */
    LEATHERWORKER("Leatherworker"), // NOI18N.
    /**
     * Defines the tailor discipline.
     */
    TAILOR("Tailor"), // NOI18N.
    /**
     * Defines the weaponsmith discipline.
     */
    WEAPONSMITH("Weaponsmith"), // NOI18N.
    /**
     * Defines the scribe discipline.
     */
    SCRIBE("Scribe"), // NOI18N.
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
