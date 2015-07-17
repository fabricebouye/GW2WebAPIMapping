/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v1.eventdetails;

import java.util.Arrays;
import java.util.Optional;

/**
 * Utility class for event details.
 * @author Fabrice Bouyé
 */
public enum EventDetailsUtils {

    /**
     * Unique instance of this class.
     */
    INSTANCE;

    /**
     * Gets the event details flag for given value.
     * @param value The source value. 
     * @return An {@code EventDetailsFlag} instance, never {@code null}.
     * <br>If no corresponding value is found, {@code EventDetailsFlag.UNKNOWN} is returned.
     * @see EventDetailsFlag
     */
    public static EventDetailsFlag findEventDetailsFlag(final String value) {
        final Optional<EventDetailsFlag> resultOptional = Arrays.stream(EventDetailsFlag.values())
                .filter(toTest -> value != null && value.equals(toTest.value))
                .findFirst();
        final EventDetailsFlag result = resultOptional.isPresent() ? resultOptional.get() : EventDetailsFlag.UNKNOWN;
        return result;
    }

    /**
     * Gets the event details location type for given value.
     * @param value The source value. 
     * @return An {@code EventDetailsLocationType} instance, never {@code null}.
     * <br>If no corresponding value is found, {@code EventDetailsLocationType.UNKNOWN} is returned.
     * @see EventDetailsLocationType
     */
    public static EventDetailsLocationType findEventDetailsLocationType(final String value) {
        final Optional<EventDetailsLocationType> resultOptional = Arrays.stream(EventDetailsLocationType.values())
                .filter(toTest -> value != null && value.equals(toTest.value))
                .findFirst();
        final EventDetailsLocationType result = resultOptional.isPresent() ? resultOptional.get() : EventDetailsLocationType.UNKNOWN;
        return result;
    }
}
