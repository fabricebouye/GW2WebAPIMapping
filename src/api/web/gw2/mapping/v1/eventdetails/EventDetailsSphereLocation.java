/* 
 * Copyright (C) 2015-2016 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v1.eventdetails;

import api.web.gw2.mapping.v1.APIv1;

/**
 * Defines a sphere event details location.
 * @author Fabrice Bouyé
 */
@APIv1(endpoint = "v1/event_details.json") // NOI18N.
public interface EventDetailsSphereLocation extends EventDetailsLocation {

    /**
     * Gets the radius of this sphere location.
     * @return A {@code double}.
     */
    double getRadius();

    /**
     * Gets the rotation of this sphere location.
     * @return A {@code double}.
     */
    double getRotation();

}
