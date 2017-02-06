/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.achievements.groups;

import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.core.LocalizedResource;
import api.web.gw2.mapping.core.QuantityValue;
import api.web.gw2.mapping.v2.APIv2;
import java.util.Set;

/**
 * Defines an achievement category group.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/achievements/categories") // NOI18N.
public interface Group {

    /**
     * Gets the id of this category group.
     * @return A {@code String} instance, never {@code null}.
     */
    @IdValue(flavor = IdValue.Flavor.STRING)
    String getId();

    /**
     * Gets the localized name of this category group.
     * @return A {@code String} instance, never {@code null}.
     */
    @LocalizedResource
    String getName();

    /**
     * Gets the localized description of this category group.
     * @return A {@code String} instance, never {@code null}.
     */
    @LocalizedResource
    String getDescription();

    /**
     * Gets the order of this category group.
     * @return An {@code int} &ge: 0.
     */
    @QuantityValue
    int getOrder();

    /**
     * Gets the list of achievments categories ids in this group.
     * @return A non-modifiable {@code Set<Integer>} instance, never {@code null}.
     */
    @IdValue
    Set<Integer> getCategories();
}
