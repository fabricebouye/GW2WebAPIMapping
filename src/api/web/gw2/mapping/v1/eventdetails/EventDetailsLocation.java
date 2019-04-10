/* 
 * Copyright (C) 2015-2019 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v1.eventdetails;

import api.web.gw2.mapping.core.Point3D;
import api.web.gw2.mapping.v1.APIv1;

/**
 * Defines the location of the details of an event.
 * @author Fabrice Bouyé
 */
@APIv1(endpoint = "v1/event_details.json") // NOI18N.
public interface EventDetailsLocation {

    /**
     * Gets the type of this event details location.
     * @return An {@code EventDetailsLocationType} instance, never {@code null}.
     */
    EventDetailsLocationType getType();

    /**
     * Gets the center coordinate of this event details location.
     * @return A {@code Point3D} instance, never {@code null}.
     */
    Point3D getCenter();
}
