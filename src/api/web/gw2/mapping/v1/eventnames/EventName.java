/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v1.eventnames;

import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.core.LocalizedResource;

/**
 * Defines the name of an event.
 * @author Fabrice Bouyé
 */
public interface EventName {

    /**
     * Gets the id of this event.
     * @return A {@code String} instance, never {@code null}.
     */
    @IdValue(flavor = IdValue.Flavor.STRING)
    String getId();

    /**
     * Gets the i18n name of this event.
     * @return A {@code String} instance, never {@code null}.
     */
    @LocalizedResource
    String getName();

}
