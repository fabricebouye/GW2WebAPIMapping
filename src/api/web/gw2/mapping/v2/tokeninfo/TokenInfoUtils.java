/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.tokeninfo;

import java.util.Arrays;
import java.util.Optional;

/**
 * Utility class for token info.
 * @author Fabrice Bouyé
 */
public enum TokenInfoUtils {
    /**
    * The unique instance of this class.
    */
    INSTANCE;

    /**
     * Gets the token info permission for given value.
     * @param value The source value.
     * @return A {@code TokenInfoPermission} instance, never {@code null}.
     * <br>If no corresponding value is found, {@code TokenInfoPermission.UNKNOWN} is returned.
     * @see TokenInfoPermission
     */
    public static TokenInfoPermission findTokenInfoPermission(final String value) {
        final Optional<TokenInfoPermission> resultOptional = Arrays.stream(TokenInfoPermission.values())
                .filter(toTest -> value != null && value.equals(toTest.value))
                .findFirst();
        final TokenInfoPermission result = resultOptional.isPresent() ? resultOptional.get() : TokenInfoPermission.UNKNOWN;
        return result;
    }

}
