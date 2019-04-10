/* 
 * Copyright (C) 2015-2019 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.build;

import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines a build (the build id of the game).
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/build") // NOI18N.
public interface Build {

    /**
     * Gets the id of the build 
     * @return An {@code int}.
     */
    @IdValue
    int getId();
}
