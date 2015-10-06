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
     * @return An {@code GuildDetailsEmblemFlag} instance, never {@code null}.
     * <br>If no corresponding value is found, {@code GuildDetailsEmblemFlag.UNKNOWN} is returned.
     * @see GuildDetailsEmblemFlag
     */
    public static GuildDetailsEmblemFlag findGuildDetailsEmblemFlag(final String value) {
        final Optional<GuildDetailsEmblemFlag> resultOptional = Arrays.stream(GuildDetailsEmblemFlag.values())
                .filter(toTest -> value != null && value.equalsIgnoreCase(toTest.value))
                .findFirst();
        final GuildDetailsEmblemFlag result = resultOptional.isPresent() ? resultOptional.get() : GuildDetailsEmblemFlag.UNKNOWN;
        return result;
    }
}
