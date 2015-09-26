/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.wvw;

import api.web.gw2.mapping.core.ImplementationSpecific;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines all WvW map types.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/wvw")
public enum MapType {

    /**
     * Defines the center (Eternal Battleground) map type.
     */
    CENTER("Center"),
    /**
     * Defines the blue home (Blue Borderlands) map type.
     */
    BLUE_HOME("BlueHome"),
    /**
     * Defines the green home (Blue Borderlands) map type.
     */
    GREEN_HOME("GreenHome"),
    /**
     * Defines the red home (Red Borderlands) map type.
     */
    RED_HOME("RedHome"),
    /**
     * Defines the Edge of the Mists map type.
     */
    EDGE_OF_THE_MISTS("EdgeOfTheMists"),
    /**
     * Fail safe value.
     */
    @ImplementationSpecific
    UNKNOWN(null);

    final String value;

    private MapType(String value) {
        this.value = value;
    }
}
