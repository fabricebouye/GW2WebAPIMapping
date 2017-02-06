/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v1.eventdetails;

import api.web.gw2.mapping.v1.APIv1;
import api.web.gw2.mapping.core.ImplementationSpecific;

/**
 * Implements event details location type.
 * @author Fabrice Bouyé
 */
@APIv1(endpoint = "v1/event_details.json") // NOI18N.
public enum EventDetailsLocationType {

    /**
     * Defines a sphere location type.
     */
    SPHERE("sphere"), // NOI18N.
    /**
     * Defines cylinder location type.
     */
    CYLINDER("cylinder"), // NOI18N.
    /**
     * Defines an extruded poly shape location type.
     */
    POLY("poly"), // NOI18N.
    /**
     * Fail safe value.
     */
    @ImplementationSpecific
    UNKNOWN(null);

    final String value;

    EventDetailsLocationType(final String value) {
        this.value = value;
    }
}
