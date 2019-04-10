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
import api.web.gw2.mapping.core.MapValue;
import api.web.gw2.mapping.core.SetValue;
import api.web.gw2.mapping.core.URLReference;
import api.web.gw2.mapping.core.URLValue;
import api.web.gw2.mapping.v2.APIv2;
import java.util.Map;
import java.util.Set;

/**
 * Defines a PvP hero.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/pvp/heroes")
public interface PvpHero {

    /**
     * Gets the id of this PvP hero.
     * @return A {@code String} instance, never {@code null}.
     */
    @IdValue(flavor = IdValue.Flavor.STRING)
    String getId();

    /**
     * Gets the localized name of this PvP hero.
     * @return A {@code String} instance, never {@code null}.
     */
    @LocalizedResource
    String getName();

    /**
     * Gets the localized type of this PvP hero.
     * @return A {@code String} instance, never {@code null}.
     */
    @LocalizedResource
    String getType();

    /**
     * Gets the localized description of this PvP hero.
     * @return A {@code String} instance, never {@code null}.
     */
    @LocalizedResource
    String getDescription();

    /**
     * Gets a map of the stats for this PvP hero.
     * @return A non-modifiable {@code Map<PvpHeroStat, Integer>}, never {@code null}. 
     * May be empty.
     */
    @MapValue
    Map<PvpHeroStat, Integer> getStats();

    /**
     * Gets the URL to the overlay art of this PvP hero.
     * @return A {@code URLReference} instance, never {@code null}.
     */
    @URLValue
    URLReference getOverlay();

    /**
     * Gets the URL to the underlay art of this PvP hero.
     * @return A {@code URLReference} instance, never {@code null}.
     */
    @URLValue
    URLReference getUnderlay();

    /**
     * Gets a set of all skins for this PvP hero.
     * @return A non-modifiable {@code Set<PvpHeroSkin>}, never {@code null}. 
     * May be empty.
     */
    @SetValue
    Set<PvpHeroSkin> getSkins();
}
