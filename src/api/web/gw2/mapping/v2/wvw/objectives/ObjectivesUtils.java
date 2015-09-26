/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.wvw.objectives;

import java.util.Arrays;
import java.util.Optional;

/**
 * Utility class for WvW objectives.
 * @author Fabrice Bouyé
 */
public enum ObjectivesUtils {

    /**
     * The unique instance of this class.
     */
    INSTANCE;

    /**
     * Gets the objective type for given value.
     * @param value The source value.
     * @return A {@code ObjectiveType} instance, never {@code null}.
     * <br>If no corresponding value is found, {@code ObjectiveType.UNKNOWN} is returned.
     * @see ObjectiveType
     */
    public static ObjectiveType findObjectiveType(final String value) {
        final Optional<ObjectiveType> resultOptional = Arrays.stream(ObjectiveType.values())
                .filter(toTest -> value != null && value.equalsIgnoreCase(toTest.value))
                .findFirst();
        final ObjectiveType result = resultOptional.isPresent() ? resultOptional.get() : ObjectiveType.UNKNOWN;
        return result;
    }
}
