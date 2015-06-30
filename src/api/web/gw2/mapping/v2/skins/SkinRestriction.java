/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.skins;

import api.web.gw2.mapping.core.ImplementationSpecific;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines all restrictions set on skins.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/skins") // NOI18N.
public enum SkinRestriction {

    /**
     * Defines the asura restriction.
     */
    ASURA("Asura"),
    /**
     * Defines the charr restriction.
     */
    CHARR("Charr"),
    /**
     * Defines the human restriction.
     */
    HUMAN("Human"),
    /**
     * Defines the norn restriction.
     */
    NORN("Norn"),
    /**
     * Defines the sylvari restriction.
     */
    SYLVARI("Sylvari"),
    /**
     * Fail safe value.
     */
    @ImplementationSpecific
    UNKNOWN(null);
    final String value;

    private SkinRestriction(final String value) {
        this.value = value;
    }
}
