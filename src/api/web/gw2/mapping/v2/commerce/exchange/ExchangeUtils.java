/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.commerce.exchange;

import java.util.Arrays;
import java.util.Optional;

/**
 * Utility class for exchange.
 * @author Fabrice Bouyé
 */
public enum ExchangeUtils {

    /**
     * The unique instance of this class.
     */
    INSTANCE;

    /**
     * Gets the exchange resource for given value.
     * @param value The source value.
     * @return A {@code ExchangeResource} instance, never {@code null}.
     * <br>If no corresponding value is found, {@code ExchangeResource.UNKNOWN} is returned.
     * @see ExchangeResource
     */
    public static ExchangeResource findExchangeResource(final String value) {
        final Optional<ExchangeResource> resultOptional = Arrays.stream(ExchangeResource.values())
                .filter(toTest -> value != null && value.equals(toTest.value))
                .findFirst();
        final ExchangeResource result = resultOptional.isPresent() ? resultOptional.get() : ExchangeResource.UNKNOWN;
        return result;
    }
}
