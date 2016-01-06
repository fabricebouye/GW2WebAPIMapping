/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.wvw.objectives;

import api.web.gw2.mapping.core.ImplementationSpecific;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines all WvW objective types.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/wvw/objectives")
public enum ObjectiveType {

    /**
     * Defines the camp objective type.
     */
    CAMP("Camp"),
    /**
     * Defines the generic objective type.
     */
    GENERIC("Generic"),
    /**
     * Defines the keep objective type.
     */
    KEEP("Keep"),
    /**
     * Defines the resource objective type.
     */
    RESOURCE("Resource"),
    /**
     * Defines the ruins objective type.
     */
    RUINS("Ruins"),
    /**
     * Defines the tower objective type.
     */
    TOWER("Tower"),
    /**
     * Defines the castle objective type.
     */
    CASTLE("Castle"),
    /**
     * Defines the mercenary objective type.
     */
    MERCENARY("Mercenary"),
    /**
     * Defines the spawn objective type.
     */
    SPAWN("Spawn"),
    /**
     * Fail safe value.
     */
    @ImplementationSpecific
    UNKNOWN(null);

    final String value;

    private ObjectiveType(String value) {
        this.value = value;
    }
}
