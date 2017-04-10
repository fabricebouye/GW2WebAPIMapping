/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.outfits;

import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.core.LocalizedResource;
import api.web.gw2.mapping.core.SetValue;
import api.web.gw2.mapping.core.URLReference;
import api.web.gw2.mapping.core.URLValue;
import api.web.gw2.mapping.v2.APIv2;
import java.util.Set;

/**
 * Defines an outfit (a costume).
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/outfits") // NOI18N.
public interface Outfit {

    /**
     * Gets the id of this outfit.
     * @return An {@code int}.
     */
    @IdValue
    int getId();

    /**
     * Gets the i18n name of this outfit.
     * @return A {@code String}, never {@code null}.
     */
    @LocalizedResource
    String getName();

    /**
     * Gets the URL to the icon of this outfit.
     * @return An {@code URLValue}, never {@code null}.
     */
    @URLValue
    URLReference getIcon();

    /**
     * Gets the set of ids of all items unlocked by this outfit.
     * @return A non-modifiable {@code Set<Integer>}, never {@code null}. May be empty.
     */
    @SetValue
    @IdValue
    Set<Integer> getUnlockItems();
}
