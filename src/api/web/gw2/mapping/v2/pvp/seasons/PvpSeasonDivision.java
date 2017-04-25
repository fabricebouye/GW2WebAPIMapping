/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.pvp.seasons;

import api.web.gw2.mapping.core.LocalizedResource;
import api.web.gw2.mapping.core.URLReference;
import api.web.gw2.mapping.core.URLValue;
import api.web.gw2.mapping.v2.APIv2;
import java.util.Set;

/**
 * Defines a PvP league season division.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/pvp/seasons") // NOI18N.
public interface PvpSeasonDivision {

    /**
     * Gets the i18n name of this season.
     * @return A {@code String} instance, never {@code null}.
     */
    @LocalizedResource
    String getName();

    /**
     * Gets the set of flags of this division.
     * @return A non-modifiable {@code Set<PvpSeasonDivisionFlag>} instance, never {@code null}.
     * <br>Can be empty.
     */
    Set<PvpSeasonDivisionFlag> getFlags();

    /**
     * Gets the URL of the large icon for this division.
     * @return An {@code URLReference} instance, never {@code null}.
     */
    @URLValue
    URLReference getLargeIcon();

    /**
     * Gets the URL of the small icon for this division.
     * @return An {@code URLReference} instance, never {@code null}.
     */
    @URLValue
    URLReference getSmallIcon();

    /**
     * Gets the URL of the pip icon for this division.
     * @return An {@code URLReference} instance, never {@code null}.
     */
    @URLValue
    URLReference getPipIcon();

    /**
     * Gets the set of tiers of this division.
     * @return A non-modifiable {@code Set<PvpSeasonTier>} instance, never {@code null}.
     * <br>Can be empty.
     */
    Set<PvpSeasonTier> getTiers();
}
