/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v1.eventdetails;

import api.web.gw2.mapping.core.NumericRange;
import api.web.gw2.mapping.core.Point2D;
import java.util.Collections;
import java.util.List;

/**
 * Default implementation of a poly event details location.
 * @author Fabrice Bouyé
 */
final class DefaultEventDetailsLocationPoly extends DefaultEventDetailsLocation implements EventDetailsLocationPoly {

    NumericRange<Double> zRange = new NumericRange<>(0d, 0d);
    List<Point2D<Double>> points = Collections.EMPTY_LIST;

    /**
     * Creates a new empty instance.
     */
    DefaultEventDetailsLocationPoly() {
    }

    @Override
    public NumericRange<Double> getZRange() {
        return zRange;
    }

    @Override
    public List<Point2D<Double>> getPoints() {
        return points;
    }
}
