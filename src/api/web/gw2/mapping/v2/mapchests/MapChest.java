/*
 * Copyright (C) 2015-2019 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.mapchests;

import api.web.gw2.mapping.core.ImplementationSpecific;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines a map chest.
 * <br>As of 2019/04, this only includes Heart of Thorns map chests.
 *
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/mapchests") // NOI18N.
public enum MapChest {
    /**
     * Defines map chest: Auric Basin.
     */
    AURIC_BASIN_HEROS_CHOICE_CHEST("auric_basin_heros_choice_chest"), // NOI18N.
    /**
     * Defines map chest: Dragon Stand.
     */
    DRAGON_STAND_HEROS_CHOICE_CHEST("dragons_stand_heros_choice_chest"), // NOI18N.
    /**
     * Defines map chest: Tangled Depths.
     */
    TANGLED_DEPTHS_HEROS_CHOICE_CHEST("tangled_depths_heros_choice_chest"), // NOI18N.
    /**
     * Defines map chest: Verdant Brink.
     */
    VERDANT_BRINK_HEROS_CHOICE_CHEST("verdant_brink_heros_choice_chest"), // NOI18N.
    /**
     * Fail safe value.
     */
    @ImplementationSpecific
    UNKNOWN(null);

    final String value;

    MapChest(final String value) {
        this.value = value;
    }
}
