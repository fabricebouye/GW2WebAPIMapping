/* 
 * Copyright (C) 2015-2019 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.pvp.heroes;

import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.core.LocalizedResource;
import api.web.gw2.mapping.core.URLReference;
import api.web.gw2.mapping.core.URLValue;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines a skin for a PvP heroe.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/pvp/heroes")
public interface PvpHeroSkin {

    /**
     * Gets the id of this PvP hero skin.
     * @return An {@code int} &gt; 0.
     */
    @IdValue
    int getId();

    /**
     * Gets the localized name of this PvP hero skin.
     * @return A {@code String} instance, never {@code null}.
     */
    @LocalizedResource
    String getName();

    /**
     * Gets the URL to the icon of this PvP hero skin.
     * @return A {@code URLReference} instance, never {@code null}.
     */
    @URLValue
    URLReference getIcon();

    /**
     * Indicates whether this skin is the default skin of the PvP hero.
     * @return {@code True} if the property is verified, {@code false} otherwise.
     */
    boolean isDefault();
}
