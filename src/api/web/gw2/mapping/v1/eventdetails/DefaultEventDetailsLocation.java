/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v1.eventdetails;

import api.web.gw2.mapping.core.Point3D;

/**
 * Default implementation of the location of the details of an event.
 * @author Fabrice Bouyé
 */
abstract class DefaultEventDetailsLocation implements EventDetailsLocation {

    EventDetailsLocationType type = EventDetailsLocationType.UNKNOWN;
    Point3D<Double> center = new Point3D<>(0d, 0d, 0d);

    /**
     * Creates a new empty instance.
     */
    DefaultEventDetailsLocation() {
    }

    @Override
    public final EventDetailsLocationType getType() {
        return type;
    }

    @Override
    public final Point3D<Double> getCenter() {
        return center;
    }
}
