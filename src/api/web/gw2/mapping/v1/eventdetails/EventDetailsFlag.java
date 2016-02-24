/* 
 * Copyright (C) 2015-2016 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v1.eventdetails;

import api.web.gw2.mapping.v1.APIv1;
import api.web.gw2.mapping.core.ImplementationSpecific;

/**
 * Implements event details flag.
 * @author Fabrice Bouyé
 */
@APIv1(endpoint = "v1/event_details.json") // NOI18N.
public enum EventDetailsFlag {

    /**
     * Defines group event.
     */
    GROUP_EVENT("group_event"), // NOI18N.
    /**
     * Defines a map wide event (ie: Karka queen).
     */
    MAP_WIDE("map_wide"), // NOI18N.
    /**
     * Fail safe value.
     */
    @ImplementationSpecific
    UNKNOWN(null);

    final String value;

    EventDetailsFlag(final String value) {
        this.value = value;
    }
}
