/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.characters.inventory;

import java.util.Arrays;
import java.util.Optional;

/**
 * Utility class for inventory.
 * @author Fabrice Bouyé
 */
public enum InventoryUtils {
    /**
     * The unique instance of this class.
     */
    INSTANCE;

    /**
     * Gets the inventory binding for given value.
     * @param value The source value.
     * @return An {@code InventoryBinding} instance, never {@code null}.
     * <br>If no corresponding value is found, {@code InventoryBinding.UNKNOWN} is returned.
     * @see InventoryBinding
     */
    public static InventoryBinding findInventoryBinding(final String value) {
        final Optional<InventoryBinding> resultOptional = Arrays.stream(InventoryBinding.values())
                .filter(toTest -> value != null && value.equalsIgnoreCase(toTest.value))
                .findFirst();
        final InventoryBinding result = resultOptional.isPresent() ? resultOptional.get() : InventoryBinding.UNKNOWN;
        return result;
    }
}
