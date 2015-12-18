/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.guild.permissions;

import java.util.Arrays;
import java.util.Optional;

/**
 * Utility class for guild permissions.
 * @author Fabrice Bouyé
 */
public enum PermissionsUtils {
    /**
     * The unique instance of this class.
     */
    INSTANCE;

    /**
     * Gets the permission id for given value.
     * @param value The source value.
     * @return A {@code PermissionId} instance, never {@code null}.
     * <br>If no corresponding value is found, {@code PermissionId.UNKNOWN} is returned.
     * @see PermissionId
     */
    public static PermissionId findPermissionId(final String value) {
        final Optional<PermissionId> resultOptional = Arrays.stream(PermissionId.values())
                .filter(toTest -> value != null && value.equalsIgnoreCase(toTest.value))
                .findFirst();
        final PermissionId result = resultOptional.isPresent() ? resultOptional.get() : PermissionId.UNKNOWN;
        return result;
    }

}
