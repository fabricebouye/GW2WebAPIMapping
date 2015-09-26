/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v1.wvw.objectivenames;

import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.core.LocalizedResource;
import api.web.gw2.mapping.v1.APIv1;

/**
 * Defines a WvW objective name.
 * @author Fabrice Bouyé
 */
@APIv1(endpoint = "v1/wvw/objective_names.json") // NOI18N.
public interface ObjectiveName {

    /**
     * Gets the id of this objective.
     * @return A {@code String} instance, never {@code null}.
     */
    @IdValue
    String getId();

    /**
     * Gets the localized abstract name of this objective.
     * <br>Note: this may not be the same as the name in game.
     * @return A {@code String} instance, never {@code null}.
     */
    @LocalizedResource
    String getName();

}
