/* 
 * Copyright (C) 2015-2019 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.gliders;

import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.core.ListValue;
import api.web.gw2.mapping.core.LocalizedResource;
import api.web.gw2.mapping.core.QuantityValue;
import api.web.gw2.mapping.core.SetValue;
import api.web.gw2.mapping.core.URLReference;
import api.web.gw2.mapping.core.URLValue;
import api.web.gw2.mapping.v2.APIv2;
import java.util.List;
import java.util.Set;

/**
 * Defines a glider.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/gliders") // NOI18N.
public interface Glider {

    /**
     * Gets the id of this glider.
     * @return An {@code int} &gt; 1.
     */
    @IdValue
    int getId();

    /**
     * Gets the set of items ids required to unlock this glider.
     * @return A {@code Set<Integer>}, never {@code null}. May be empty.
     */
    @IdValue
    @SetValue
    Set<Integer> getUnlockItems();

    /**
     * Gets the sort order for this glider.
     * @return An {@code int} &gt; 1.
     */
    @QuantityValue
    int getOrder();

    /**
     * Gets the URL to this glider's icon.
     * @return A {@code URLReference} instance, never {@code null}.
     */
    @URLValue
    URLReference getIcon();

    /**
     * Gets the i18n name of this glider.
     * @return A {@code String} instance, never {@code null}.
     */
    @LocalizedResource
    String getName();

    /**
     * Gets the localized description of this glider.
     * @return A {@code String} instance, never {@code null}.
     */
    @LocalizedResource
    String getDescription();

    /**
     * Gets the list of default dye ids for this glider.
     * @return A {@code List<Integer>}, never {@code null}. May be empty.
     * @see api.web.gw2.mapping.v2.colors.ColorDye#getId() 
     */
    @IdValue
    @ListValue
    List<Integer> getDefaultDyes();
}
