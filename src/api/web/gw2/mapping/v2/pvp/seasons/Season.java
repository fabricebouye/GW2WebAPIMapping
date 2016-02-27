/* 
 * Copyright (C) 2015-2016 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.pvp.seasons;

import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.core.LocalizedResource;
import api.web.gw2.mapping.core.SetValue;
import api.web.gw2.mapping.v2.APIv2;
import java.util.Set;

/**
 * Defines a PvP league season.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/pvp/seasons", requiresAuthentication = true, scope = "pvp") // NOI18N.
public interface Season {

    /**
     * Gets the id of this season.
     * @return A {@code String} instance, never {@code null}.
     */
    @IdValue(flavor = IdValue.Flavor.STRING)
    String getId();

    /**
     * Gets the localizs name of this season.
     * @return A {@code String} instance, never {@code null}.
     */
    @LocalizedResource
    String getName();

    /**
     * Gets the set of divisions in this season.
     * @return A {@code Set<SeasonDivision>} instance, never {@code null}.
     */
    @SetValue
    Set<SeasonDivision> getDivisions();
}
