/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.guild.upgrades;

import java.util.Arrays;
import java.util.Optional;

/**
 * Utility class for guild permissions.
 * @author Fabrice Bouyé
 */
public enum UpgradesUtils {
    /**
     * The unique instance of this class.
     */
    INSTANCE;

    /**
     * Gets the upgrade type for given value.
     * @param value The source value.
     * @return A {@code UpgradeType} instance, never {@code null}.
     * <br>If no corresponding value is found, {@code UpgradeType.UNKNOWN} is returned.
     * @see UpgradeType
     */
    public static UpgradeType findUpgradeType(final String value) {
        final Optional<UpgradeType> resultOptional = Arrays.stream(UpgradeType.values())
                .filter(toTest -> value != null && value.equalsIgnoreCase(toTest.value))
                .findFirst();
        final UpgradeType result = resultOptional.isPresent() ? resultOptional.get() : UpgradeType.UNKNOWN;
        return result;
    }
}
