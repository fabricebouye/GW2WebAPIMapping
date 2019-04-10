/* 
 * Copyright (C) 2015-2019 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.pvp.stats;

import api.web.gw2.mapping.v2.APIv2;
import api.web.gw2.mapping.v2.characters.CharacterProfession;
import api.web.gw2.mapping.v2.pvp.PvpLadder;
import java.util.Map;

/**
 * Defines the PvP stats of an account.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/pvp/stats", requiresAuthentication = true, scope = "pvp") // NOI18N.
public interface PvpStat {

    /**
     * Gets the PvP rank of the account.
     * @return An {@code int}
     */
    int getPvpRank();

    /**
     * Gets the number of points in the current PvP rank.
     * @return An {@code int}
     */
    int getPvpRankPoints();

    /**
     * Gets the number of rollovers since the player has achieved the max rank.
     * @return An {@code int}
     */
    int getPvpRankRollovers();

    /**
     * Gets the aggregate result for the account.
     * @return A {@code PvpStatResult}, never {@code null}.
     */
    PvpStatResult getAggregate();

    /**
     * Gets the result for each ingame profession for the account.
     * @return A non-modifiable {@code Map<CharacterProfession, PvpStatResult>}, never {@code null}.
     * <br>Professions that haven't been played in PvP, will have their result set to {@code PvpStatResult.EMPTY}.
     * @see PvpStatResult#EMPTY
     */
    Map<CharacterProfession, PvpStatResult> getProfessions();

    /**
     * Gets the result for each ingame ladder mode for the account.
     * @return A non-modifiable {@code Map<PvPLadder, PvpStatResult>}, never {@code null}.
     * <br>Ladder modes that haven't been played in PvP, will have their result set to {@code PvpStatResult.EMPTY}.
     * @see PvpStatResult#EMPTY
     */
    Map<PvpLadder, PvpStatResult> getLadders();
}
