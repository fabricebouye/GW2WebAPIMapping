/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v1.eventnames;

/**
 * Default implementation of the name of an event.
 * @author Fabrice Bouyé
 */
final class DefaultEventName implements EventName {

    String id = "";
    String name = "";

    /**
     * Creates a new empty instance.
     */
    DefaultEventName() {
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

}
