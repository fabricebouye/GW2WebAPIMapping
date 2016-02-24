/* 
 * Copyright (C) 2015-2016 Fabrice Bouyé
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
@APIv2(endpoint = "v2/wvw/objectives") // NOI18N.
public enum ObjectiveType {

    /**
     * Defines the camp objective type.
     */
    CAMP("Camp"), // NOI18N.
    /**
     * Defines the generic objective type.
     */
    GENERIC("Generic"), // NOI18N.
    /**
     * Defines the keep objective type.
     */
    KEEP("Keep"), // NOI18N.
    /**
     * Defines the resource objective type.
     */
    RESOURCE("Resource"), // NOI18N.
    /**
     * Defines the ruins objective type.
     */
    RUINS("Ruins"), // NOI18N.
    /**
     * Defines the tower objective type.
     */
    TOWER("Tower"), // NOI18N.
    /**
     * Defines the castle objective type.
     */
    CASTLE("Castle"), // NOI18N.
    /**
     * Defines the mercenary objective type.
     */
    MERCENARY("Mercenary"), // NOI18N.
    /**
     * Defines the spawn objective type.
     */
    SPAWN("Spawn"), // NOI18N.
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
