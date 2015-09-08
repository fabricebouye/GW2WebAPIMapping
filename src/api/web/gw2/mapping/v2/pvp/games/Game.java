/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.pvp.games;

import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.v2.APIv2;
import api.web.gw2.mapping.v2.characters.CharacterProfession;
import com.oracle.webservices.internal.api.databinding.DatabindingMode;
import java.time.LocalDateTime;
import java.util.Map;

/**
 * Defines a PvP game.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/pvp/games", requiresAuthentication = true) // NOI18N.
public interface Game {

    /**
     * Gets the id of this game.
     * @return An {@code int}.
     */
    @IdValue
    int getId();

    /**
     * Gets the map id of this game.
     * @return An {@code int}.
     */
    @IdValue
    int getMapId();

    /**
     * Gets the time on which the game has started.
     * @return A {@code LocalDateTime} instance, never {@code null}.
     */
    LocalDateTime getStarted();

    /**
     * Gets the time on which the game has ended.
     * @return A {@code LocalDateTime} instance, never {@code null}.
     */
    LocalDateTime getEnded();

    /**
     * Gets the result of the game.
     * @return A {@code GameResult} instance, never {@code null}.
     */
    GameResult getResult();

    /**
     * Gets the team on which was the player during the game.
     * @return A {@code GameTeam} instance, never {@code null}.
     */
    GameTeam getTeam();

    /**
     * Gets the profession played by the player during the game.
     * @return A {@code CharacterProfession} instance, never {@code null}.
     */
    CharacterProfession getProfession();

    /**
     * Gets the scores for each team.
     * @return A non-modifiable {@code Map<GameTeam, Integer>} instance, never {@code null}.
     */
    Map<GameTeam, Integer> getScores();
}
