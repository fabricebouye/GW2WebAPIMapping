/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v1.eventdetails;

import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.core.LocalizedResource;
import api.web.gw2.mapping.core.SetValue;
import api.web.gw2.mapping.v1.APIv1;
import java.util.Set;

/**
 * Defines the details of an event.
 * @author Fabrice Bouyé
 */
@APIv1(endpoint = "v1/event_details.json") // NOI18N.
public interface EventDetails {

    /**
     * Gets the i18n name of the event.
     * @return A {@code String} instance, never {@code null}.
     */
    @LocalizedResource
    String getName();

    /**
     * Gets the required level for this event.
     * @return An {@code int}.
     */
    int getLevel();

    /**
     * Gets the map id for this event.
     * @return An {@code int}.
     */
    @IdValue
    int getMapId();

    /**
     * Gets the set of flags for this event.
     * @return  A non-modifiable {@code Set<EventDetailsFlag>} instance, never {@code null}.
     */
    @SetValue
    Set<EventDetailsFlag> getFlags();

    /**
     * Gets the location for this event.
     * @return  An {@code EventDetailsLocation} instance, never {@code null}.
     */
    EventDetailsLocation getLocation();

}
