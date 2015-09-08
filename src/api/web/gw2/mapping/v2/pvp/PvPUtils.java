/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.pvp;

import api.web.gw2.mapping.v2.pvp.games.*;
import java.util.Arrays;
import java.util.Optional;

/**
 * Utility class for PvP.
 * @author Fabrice Bouyé
 */
public enum PvPUtils {

    /**
     * Unique instance of this class.
     */
    INSTANCE;

    /**
     * Gets the PvP ladder for given value.
     * @param value The source value.
     * @return A {@code PvPLadder} instance, never {@code null}.
     * <br>If no corresponding value is found, {@code PvPLadder.UNKNOWN} is returned.
     * @see PvPLadder
     */
    public static PvPLadder findPvPLadder(final String value) {
        final Optional<PvPLadder> resultOptional = Arrays.stream(PvPLadder.values())
                .filter(toTest -> value != null && value.equalsIgnoreCase(toTest.value))
                .findFirst();
        final PvPLadder result = resultOptional.isPresent() ? resultOptional.get() : PvPLadder.UNKNOWN;
        return result;
    }
}
