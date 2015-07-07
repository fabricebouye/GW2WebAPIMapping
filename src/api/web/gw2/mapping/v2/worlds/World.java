/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.worlds;

import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.core.LocalizedResource;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines a world.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/worlds") // NOI18N.
public interface World {

    /**
     * Gets the id of this world.
     * @return An {@code int}.
     */
    @IdValue
    int getId();

    /**
     * Gets the localized name of this world.
     * @return An {@code String} instance, never {@code null}.
     */
    @LocalizedResource
    String getName();
}
