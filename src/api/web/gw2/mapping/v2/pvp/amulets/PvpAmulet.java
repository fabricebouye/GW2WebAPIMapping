/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.pvp.amulets;

import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.core.LocalizedResource;
import api.web.gw2.mapping.core.MapValue;
import api.web.gw2.mapping.core.URLReference;
import api.web.gw2.mapping.core.URLValue;
import api.web.gw2.mapping.v2.APIv2;
import java.util.Map;

/**
 * Defines all PvP ladder types.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/pvp/amulets")
public interface PvpAmulet {

    /**
     * Gets the id of this PvP amulet.
     * @return A {@code String}, never {@code null}.
     */
    @IdValue
    int getId();

    /**
     * Gets the i18n name of this PvP amulet.
     * @return A {@code String}, never {@code null}.
     */
    @LocalizedResource
    String getName();

    /**
     * Gets the URL to the icon of this PvP amulet.
     * @return A {@code URLReference}, never {@code null}.
     */
    @URLValue
    URLReference getIcon();

    /**
     * Gets the attributes values for this PvP amulet.
     * @return A non-modifiable {@code Map<PvpAmuletAttribute, Integer>}, never {@code null}.
     */
    @MapValue
    Map<PvpAmuletAttribute, Integer> getAttributes();
}
