/* 
 * Copyright (C) 2015-2019 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.stories.seasons;

import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.core.LocalizedResource;
import api.web.gw2.mapping.core.QuantityValue;
import api.web.gw2.mapping.core.SetValue;
import api.web.gw2.mapping.v2.APIv2;
import java.util.Set;

/**
 * Defines a story season (is: Personal Story, Living World Season 2, Heart of Thorns, etc.).
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/stories/seasons")
public interface StorySeason {

    /**
     * Gets the id of this story season.
     * @return A {@code String} instance, never {@code null}.
     */
    @IdValue(flavor = IdValue.Flavor.STRING)
    String getId();

    /**
     * Gets the i18n name of this story season.
     * @return A {@code String} instance, never {@code null}.
     */
    @LocalizedResource
    String getName();

    /**
     * Gets the sorting value of this story season.
     * @return An {@code int}.
     */
    @QuantityValue
    int getOrder();

    /**
     * Gets the ids of all stories in this story season.
     * @return A non-modifiable {@code Set<Integer>}, never {@code null}.
     * @see api.web.gw2.mapping.v2.stories.Story#getId() 
     */
    @SetValue
    @IdValue
    Set<Integer> getStories();
}
