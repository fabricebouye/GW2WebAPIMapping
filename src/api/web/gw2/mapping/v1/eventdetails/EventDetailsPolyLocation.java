/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v1.eventdetails;

import api.web.gw2.mapping.core.Coord2DValue;
import api.web.gw2.mapping.core.NumericRange;
import api.web.gw2.mapping.core.Point2D;
import api.web.gw2.mapping.v1.APIv1;
import java.util.List;

/**
 * Defines an extruded poly shape event details location.
 * @author Fabrice Bouyé
 */
@APIv1(endpoint = "v1/event_details.json") // NOI18N.
public interface EventDetailsPolyLocation extends EventDetailsLocation {

    /**
     * Gets the z range of this extruded poly shape event details location.
     * @return A {@code NumericRange<Double>} instance, never {@code null}.
     */
    NumericRange<Double> getZRange();

    /**
     * Gets the list of points of this extruded poly shape event details location.
     * @return A non-modifiable {@code List<Point2D>} instance, never {@code null}.
     */
    @Coord2DValue
    List<Point2D> getPoints();

}
