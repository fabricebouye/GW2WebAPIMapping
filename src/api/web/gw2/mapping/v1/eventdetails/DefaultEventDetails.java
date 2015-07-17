/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v1.eventdetails;

import java.util.Collections;
import java.util.Set;

/**
 * Default implementation of the details of an event.
 * @author Fabrice Bouyé
 */
final class DefaultEventDetails implements EventDetails {

    String name = "";
    int level = -1;
    int mapId = -1;
    Set<EventDetailsFlag> flags = Collections.EMPTY_SET;
    EventDetailsLocation location;

    /**
     * Creates a new empty instance.
     */
    DefaultEventDetails() {
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getLevel() {
        return level;
    }

    @Override
    public int getMapId() {
        return mapId;
    }

    @Override
    public Set<EventDetailsFlag> getFlags() {
        return flags;
    }

    @Override
    public EventDetailsLocation getLocation() {
        return location;
    }
}
