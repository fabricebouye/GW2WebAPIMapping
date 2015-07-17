/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v1.eventdetails;

/**
 * Default implementation of a sphere event details location.
 * @author Fabrice Bouyé
 */
final class DefaultEventDetailsLocationSphere extends DefaultEventDetailsLocation implements EventDetailsLocationSphere {

    double radius = 0;
    double rotation = 0;

    /**
     * Creates a new empty instance.
     */
    DefaultEventDetailsLocationSphere() {
    }

    @Override
    public double getRadius() {
        return radius;
    }

    @Override
    public double getRotation() {
        return rotation;
    }
}
