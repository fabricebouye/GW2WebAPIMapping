/* 
 * Copyright (C) 2015-2019 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.skins;

import api.web.gw2.mapping.core.ImplementationSpecific;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines all skin types.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/skins") // NOI18N.
public enum SkinType {

    /**
     * Defines the armor skin type.
     */
    ARMOR("Armor"), // NOI18N.
    /**
     * Defines the back item skin type.
     */
    BACK("Back"), // NOI18N.
    /**
     * Defines the weapon skin type.
     */
    WEAPON("Weapon"), // NOI18N.
    // @todo There should be glider skins now?
    /**
     * Fail safe value.
     */
    @ImplementationSpecific
    UNKNOWN(null);

    final String value;

    private SkinType(final String value) {
        this.value = value;
    }
}
