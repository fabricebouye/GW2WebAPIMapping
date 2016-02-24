/* 
 * Copyright (C) 2015-2016 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.worlds;

import java.util.Arrays;
import java.util.Optional;

/**
 * Utility class for worlds.
 * @author Fabrice Bouyé
 */
public enum WorldsUtils {

    /**
     * The unique instance of this class.
     */
    INSTANCE;

    /**
     * Gets the world population for given value.
     * @param value The source value.
     * @return A {@code WorldPopulation} instance, never {@code null}.
     * <br>If no corresponding value is found, {@code WorldPopulation.UNKNOWN} is returned.
     * @see WorldPopulation
     */
    public static WorldPopulation findWorldPopulation(final String value) {
        final Optional<WorldPopulation> resultOptional = Arrays.stream(WorldPopulation.values())
                .filter(toTest -> value != null && value.equalsIgnoreCase(toTest.value))
                .findFirst();
        final WorldPopulation result = resultOptional.isPresent() ? resultOptional.get() : WorldPopulation.UNKNOWN;
        return result;
    }
}
