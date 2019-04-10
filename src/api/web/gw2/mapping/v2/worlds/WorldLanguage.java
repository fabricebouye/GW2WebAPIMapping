/* 
 * Copyright (C) 2015-2019 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.worlds;

import api.web.gw2.mapping.core.ImplementationSpecific;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines languages a world can have.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/worlds")
@ImplementationSpecific
public enum WorldLanguage {
    /**
     * English speaking world.
     */
    @ImplementationSpecific
    EN("0"),
    /**
     * French speaking world.
     */
    @ImplementationSpecific
    FR("1"),
    /**
     * German speaking world.
     */
    @ImplementationSpecific
    DE("2"),
    /**
     * Spanish speaking world.
     */
    @ImplementationSpecific
    ES("3"),
    /**
     * Fail safe value.
     */
    @ImplementationSpecific
    UNKNOWN(null);

    final String value;

    private WorldLanguage(String value) {
        this.value = value;
    }
}
