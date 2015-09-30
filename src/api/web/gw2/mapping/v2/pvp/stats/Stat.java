/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.pvp.stats;

import api.web.gw2.mapping.v2.APIv2;
import api.web.gw2.mapping.v2.characters.CharacterProfession;
import api.web.gw2.mapping.v2.pvp.PvPLadder;
import java.util.Map;

/**
 * Defines the PvP stats of an account.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/pvp/stats", requiresAuthentication = true, scope = "pvp") // NOI18N.
public interface Stat {

    /**
     * Gets the PvP rank of the account.
     * @return An {@code int}
     */
    int getPvpRank();

    /**
     * Gets the aggregate result for the account.
     * @return A {@code StatResult}, never {@code null}.
     */
    StatResult getAggregate();

    /**
     * Gets the result for each ingame profession for the account.
     * @return A non-modifiable {@code Map<CharacterProfession, StatResult>}, never {@code null}.
     * <br>Professions that haven't been played in PvP, will have their result set to {@code StatResult.EMPTY}.
     * @see StatResult#EMPTY
     */
    Map<CharacterProfession, StatResult> getProfessions();

    /**
     * Gets the result for each ingame ladder mode for the account.
     * @return A non-modifiable {@code Map<PvPLadder, StatResult>}, never {@code null}.
     * <br>Ladder modes that haven't been played in PvP, will have their result set to {@code StatResult.EMPTY}.
     * @see StatResult#EMPTY
     */
    Map<PvPLadder, StatResult> getLadders();
}
