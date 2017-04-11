/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.raids;

import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines a raid wing event.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/raids") // NOI18N.
public interface RaidWingEvent {

    /**
     * Gets the id of this raid wing event.
     * @return A {@code String} instance, never {@code null}.
     */
    @IdValue(flavor = IdValue.Flavor.STRING)
    String getId();

    /**
     * Gets the type of this raid wing event.
     * @return A {@code RaidWingEventType} instance, never {@code null}.
     */
    RaidWingEventType getType();
}
