/* 
 * Copyright (C) 2015-2016 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.titles;

import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.core.LocalizedResource;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines a title.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/titles")
public interface Title {

    /**
     * Gets the id of this title.
     * @return An {@code int}.
     */
    @IdValue
    int getId();

    /**
     * Gets the localized name of this title.
     * @return A {@code String} instance, never {@code null}.
     */
    @LocalizedResource
    String getName();

    /**
     * Gets the id of the achievement that grants this title.
     * @return An {@code int}.
     */
    @IdValue
    int getAchievement();
}
