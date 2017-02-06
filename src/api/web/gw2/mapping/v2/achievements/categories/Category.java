/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.achievements.categories;

import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.core.LocalizedResource;
import api.web.gw2.mapping.core.QuantityValue;
import api.web.gw2.mapping.core.URLReference;
import api.web.gw2.mapping.core.URLValue;
import api.web.gw2.mapping.v2.APIv2;
import java.util.Set;

/**
 * Defines an achievement category.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/achievements/categories") // NOI18N.
public interface Category {

    /**
     * Gets the id of this category.
     * @return An {@code int} &gt: 0.
     */
    @IdValue
    int getId();

    /**
     * Gets the localized name of this category.
     * @return A {@code String} instance, never {@code null}.
     */
    @LocalizedResource
    String getName();

    /**
     * Gets the localized description of this category.
     * @return A {@code String} instance, never {@code null}.
     */
    @LocalizedResource
    String getDescription();

    /**
     * Gets the order of this category.
     * @return An {@code int} &ge: 0.
     */
    @QuantityValue
    int getOrder();

    /**
     * Gets the url of the icon of this category.
     * @return A {@code URLReference} instance, never {@code null}.
     */
    @URLValue
    URLReference getIcon();

    /**
     * Gets the list of achievments ids in this category.
     * @return A non-modifiable {@code Set<Integer>} instance, never {@code null}.
     */
    @IdValue
    Set<Integer> getAchievements();
}
