/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.wvw;

import java.util.Arrays;
import java.util.Optional;

/**
 * Utility class for WvW objectives.
 * @author Fabrice Bouyé
 */
public enum WvWUtils {

    /**
     * The unique instance of this class.
     */
    INSTANCE;

    /**
     * Gets the WvW map type for given value.
     * @param value The source value.
     * @return A {@code MapType} instance, never {@code null}.
     * <br>If no corresponding value is found, {@code MapType.UNKNOWN} is returned.
     * @see MapType
     */
    public static MapType findMapType(final String value) {
        final Optional<MapType> resultOptional = Arrays.stream(MapType.values())
                .filter(toTest -> value != null && value.equalsIgnoreCase(toTest.value))
                .findFirst();
        final MapType result = resultOptional.isPresent() ? resultOptional.get() : MapType.UNKNOWN;
        return result;
    }
}
