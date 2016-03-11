/* 
 * Copyright (C) 2015-2016 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.worlds;

import api.web.gw2.mapping.core.ImplementationSpecific;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines regions to which a world can be attached.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/worlds")
@ImplementationSpecific
public enum WorldRegion {
    /**
     * US region.
     */
    @ImplementationSpecific
    US("1"), // NOI18N.
    /**
     * EU region.
     */
    @ImplementationSpecific
    EU("2"), // NOI18N.
    /**
     * Fail safe value.
     */
    @ImplementationSpecific
    UNKNOWN(null);

    final String value;

    private WorldRegion(String value) {
        this.value = value;
    }
}
