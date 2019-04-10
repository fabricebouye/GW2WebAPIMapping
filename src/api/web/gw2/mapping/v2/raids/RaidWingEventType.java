/* 
 * Copyright (C) 2015-2019 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.raids;

import api.web.gw2.mapping.v2.wvw.matches.*;
import api.web.gw2.mapping.core.ImplementationSpecific;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Define all raid wing event types.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/wvw/matches") // NOI18N.
public enum RaidWingEventType {

    /**
     * Defines a boss raid wing event type.
     */
    BOSS("Boss"), // NOI18N.
    /**
     * Defines a checkpoint raid wing event type (ie: Spirit Woods or Twisted Castle).
     */
    CHECKPOINT("Checkpoint"), // NOI18N.
    /**
     * Fail safe value.
     */
    @ImplementationSpecific
    UNKNOWN(null);

    final String value;

    private RaidWingEventType(String value) {
        this.value = value;
    }
}
