/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.pvp.ranks;

import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.core.LevelValue;
import api.web.gw2.mapping.core.LocalizedResource;
import api.web.gw2.mapping.core.SetValue;
import api.web.gw2.mapping.core.URLReference;
import api.web.gw2.mapping.core.URLValue;
import api.web.gw2.mapping.v2.APIv2;
import java.util.Set;

/**
 * Defines an PvP rank.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/pvp/ranks")
public interface PvpRank {

    /**
     * Gets the id of this PvP rank.
     * @return An {@code int} &gt; 0.
     */
    @IdValue
    int getId();

    /**
     * Gets the id of the finisher of this PvP rank.
     * @return An {@code int} &gt; 0.
     * @see api.web.gw2.mapping.v2.finishers.Finisher#getId() 
     */
    @IdValue
    int getFinisherId();

    /**
     * Gets the i18n name of this PvP rank.
     * @return A {@code String} instance, never {@code null}.
     */
    @LocalizedResource
    String getName();

    /**
     * Gets the URL to the icon of this PvP rank.
     * @return A {@code URLReference} instance, never {@code null}.
     */
    @URLValue
    URLReference getIcon();

    /**
     * Gets the min level of this PvP rank.
     * @return An {@code int} &gt; 0.
     */
    @LevelValue
    int getMinRank();

    /**
     * Gets the max level of this PvP rank.
     * @return An {@code int} &gt; 0.
     */
    @LevelValue
    int getMaxRank();

    /**
     * Gets the set of levels included in this PvP rank.
     * @return A {@code Set<PvpRankLevel>} instance, never {@code null}. The set
     * may be empty.
     */
    @SetValue
    Set<PvpRankLevel> getLevels();
}
