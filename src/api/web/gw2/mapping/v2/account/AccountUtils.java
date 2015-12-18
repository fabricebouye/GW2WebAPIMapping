/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.account;

import java.util.Arrays;
import java.util.Optional;

/**
 * Utility class for accounts.
 * @author Fabrice Bouyé
 */
public enum AccountUtils {

    /**
     * Unique instance of this class.
     */
    INSTANCE;

    /**
     * Gets the account access type for given value.
     * @param value The source value.
     * @return A {@code AccountAccessType} instance, never {@code null}.
     * <br>If no corresponding value is found, {@code AccountAccessType.UNKNOWN} is returned.
     * @see AccountAccessType
     */
    public static AccountAccessType findAccountAccessType(final String value) {
        final Optional<AccountAccessType> resultOptional = Arrays.stream(AccountAccessType.values())
                .filter(toTest -> value != null && value.equalsIgnoreCase(toTest.value))
                .findFirst();
        final AccountAccessType result = resultOptional.isPresent() ? resultOptional.get() : AccountAccessType.UNKNOWN;
        return result;
    }
}
