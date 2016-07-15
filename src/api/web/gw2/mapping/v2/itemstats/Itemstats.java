/* 
 * Copyright (C) 2015-2016 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.itemstats;

import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.core.LocalizedResource;
import api.web.gw2.mapping.core.MapValue;
import api.web.gw2.mapping.v2.APIv2;
import java.util.Map;

/**
 * Defines an item stats set.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/itemstats") // NOI18N.
public interface Itemstats {

    /**
     * Gets the id of this item stats set.
     */
    @IdValue
    int getId();

    /**
     * Gets the localized name of this item stats set.
     */
    @LocalizedResource
    String getName();

    /**
     * Gets the attributes values for this items stats set.
     * @return A non-modifiable {@code Map<ItemstatsAttribute, Integer>}, never {@code null}.
     */
    @MapValue
    Map<ItemstatsAttribute, Integer> getAttributes();
}
