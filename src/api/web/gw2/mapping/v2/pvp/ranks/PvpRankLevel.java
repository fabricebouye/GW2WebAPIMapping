/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.pvp.ranks;

import api.web.gw2.mapping.core.LevelValue;
import api.web.gw2.mapping.core.QuantityValue;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines an PvP rank level.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/pvp/ranks")
public interface PvpRankLevel {

    /**
     * Gets the min rank of this PvP rank level.
     * @return An {@code int}.
     */
    @LevelValue
    int getMinRank();

    /**
     * Gets the max rank of this PvP rank level.
     * @return An {@code int}.
     */
    @LevelValue
    int getMaxRank();

    /**
     * Gets amount of points needed to go from min rank to max rank of this PvP
     * rank level.
     * @return An {@code int}.
     */
    @QuantityValue
    int getPoints();
}
