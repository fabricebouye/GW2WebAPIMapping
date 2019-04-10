/*
 * Copyright (C) 2015-2019 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.colors;

import api.web.gw2.mapping.core.ImplementationSpecific;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines color categories.
 *
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/colors") // NOI18N.
public enum ColorCategories {
    GRAY("Gray"), // NOI18N.
    BROWN("Brown"), // NOI18N.
    RED("Red"), // NOI18N.
    ORANGE("Orange"), // NOI18N.
    YELLOW("Yellow"), // NOI18N.
    GREEN("Green"), // NOI18N.
    BLUE("Blue"), // NOI18N.
    PURPLE("Purple"), // NOI18N.
    VIBRANT("Vibrant"), // NOI18N.
    LEATHER("Leather"), // NOI18N.
    METAL("Metal"), // NOI18N.
    STARTER("Starter"), // NOI18N.
    COMMON("Common"), // NOI18N.
    UNCOMMON("Uncommon"), // NOI18N.
    RARE("Rare"), // NOI18N.
    EXCLUSIVE("Exclusive"), // NOI18N.
    /**
     * Fail safe value.
     */
    @ImplementationSpecific
    UNKNOWN(null);

    final String value;

    ColorCategories(final String value) {
        this.value = value;
    }
}
