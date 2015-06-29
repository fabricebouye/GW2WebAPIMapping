/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v1.guilddetails;

import java.util.Arrays;
import java.util.Optional;

/**
 * Utility class for guild details.
 * @author Fabrice Bouyé
 */
public enum GuildDetailsUtils {
    /**
    * Unique instance of this class.
    */
    INSTANCE;

    /**
     * Gets the emblem flag for given value.
     * @param value The source value. 
     * @return An {@code EmblemFlag} instance, never {@code null}.
     * <br>If no corresponding value is found, {@code EmblemFlag.UNKNOWN} is returned.
     * @see EmblemFlag
     */
    public static EmblemFlag findEmblemFlag(final String value) {
        final Optional<EmblemFlag> resultOptional = Arrays.stream(EmblemFlag.values())
                .filter(toTest -> value != null && value.equals(toTest.value))
                .findFirst();
        final EmblemFlag result = resultOptional.isPresent() ? resultOptional.get() : EmblemFlag.UNKNOWN;
        return result;
    }
}
