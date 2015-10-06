/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v1.wvw.matchdetails;

import java.util.Arrays;
import java.util.Optional;

/**
 * Utility class for WvW match details.
 * @author Fabrice Bouyé
 */
public enum MatchDetailsUtils {

    /**
     * Unique instance of this class.
     */
    INSTANCE;

    /**
     * Gets the match details map type for given value.
     * @param value The source value.
     * @return A {@code MatchDetailsMapType} instance, never {@code null}.
     * <br>If no corresponding value is found, {@code MatchDetailsMapType.UNKNOWN} is returned.
     * @see MatchDetailsMapType
     */
    public static MatchDetailsMapType findMatchDetailsMapType(final String value) {
        final Optional<MatchDetailsMapType> resultOptional = Arrays.stream(MatchDetailsMapType.values())
                .filter(toTest -> value != null && value.equalsIgnoreCase(toTest.value))
                .findFirst();
        final MatchDetailsMapType result = resultOptional.isPresent() ? resultOptional.get() : MatchDetailsMapType.UNKNOWN;
        return result;
    }

    /**
     * Gets the match details bonus owner for given value.
     * @param value The source value.
     * @return A {@code MatchDetailsBonusOwner} instance, never {@code null}.
     * <br>If no corresponding value is found, {@code MatchDetailsBonusOwner.UNKNOWN} is returned.
     * @see MatchDetailsBonusOwner
     */
    public static MatchDetailsBonusOwner findMatchDetailsBonusOwner(final String value) {
        final Optional<MatchDetailsBonusOwner> resultOptional = Arrays.stream(MatchDetailsBonusOwner.values())
                .filter(toTest -> value != null && value.equalsIgnoreCase(toTest.value))
                .findFirst();
        final MatchDetailsBonusOwner result = resultOptional.isPresent() ? resultOptional.get() : MatchDetailsBonusOwner.UNKNOWN;
        return result;
    }

    /**
     * Gets the match details objective owner for given value.
     * @param value The source value.
     * @return A {@code MatchDetailsObjectiveOwner} instance, never {@code null}.
     * <br>If no corresponding value is found, {@code MatchDetailsObjectiveOwner.UNKNOWN} is returned.
     * @see MatchDetailsObjectiveOwner
     */
    public static MatchDetailsObjectiveOwner findMatchDetailsObjectiveOwner(final String value) {
        final Optional<MatchDetailsObjectiveOwner> resultOptional = Arrays.stream(MatchDetailsObjectiveOwner.values())
                .filter(toTest -> value != null && value.equalsIgnoreCase(toTest.value))
                .findFirst();
        final MatchDetailsObjectiveOwner result = resultOptional.isPresent() ? resultOptional.get() : MatchDetailsObjectiveOwner.UNKNOWN;
        return result;
    }
}
