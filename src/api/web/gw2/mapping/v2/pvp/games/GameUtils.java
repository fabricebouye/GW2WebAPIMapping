/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.pvp.games;

import java.util.Arrays;
import java.util.Optional;

/**
 * Utility class for PvP games.
 * @author Fabrice Bouyé
 */
public enum GameUtils {

    /**
     * Unique instance of this class.
     */
    INSTANCE;

    /**
     * Gets the game team for given value.
     * @param value The source value.
     * @return A {@code GameTeam} instance, never {@code null}.
     * <br>If no corresponding value is found, {@code GameTeam.UNKNOWN} is returned.
     * @see GameTeam
     */
    public static GameTeam findGameTeam(final String value) {
        final Optional<GameTeam> resultOptional = Arrays.stream(GameTeam.values())
                .filter(toTest -> value != null && value.equalsIgnoreCase(toTest.value))
                .findFirst();
        final GameTeam result = resultOptional.isPresent() ? resultOptional.get() : GameTeam.UNKNOWN;
        return result;
    }

    /**
     * Gets the game result for given value.
     * @param value The source value.
     * @return A {@code GameResult} instance, never {@code null}.
     * <br>If no corresponding value is found, {@code GameResult.UNKNOWN} is returned.
     * @see GameResult
     */
    public static GameResult findGameResult(final String value) {
        final Optional<GameResult> resultOptional = Arrays.stream(GameResult.values())
                .filter(toTest -> value != null && value.equals(toTest.value))
                .findFirst();
        final GameResult result = resultOptional.isPresent() ? resultOptional.get() : GameResult.UNKNOWN;
        return result;
    }
}
