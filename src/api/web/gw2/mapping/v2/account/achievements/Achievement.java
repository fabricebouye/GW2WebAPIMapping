/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.account.achievements;

import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.core.OptionalValue;
import api.web.gw2.mapping.core.QuantityValue;
import api.web.gw2.mapping.v2.APIv2;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Set;

/**
 * Defines an account achievements.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/account/achievements", requiresAuthentication = true, scope = "progression") // NOI18N.
public interface Achievement {

    /**
     * Gets the id of this achievement.
     * @return An {@code int}.
     */
    @IdValue
    int getId();

    /**
     * Gets the current progress of this achievement (if any).
     * @return An {@code OptionalInt} instance, never {@code null}.
     */
    @OptionalValue
    @QuantityValue
    OptionalInt getCurrent();

    /**
     * Gets the max progress of this achievement (if any).
     * <br>Might be -1 for WvW achievements.
     * @return An {@code OptionalInt} instance, never {@code null}.
     */
    @OptionalValue
    @QuantityValue
    OptionalInt getMax();

    /**
     * Indicates if this achievement is done.
     * @return A {@code boolean}.
     */
    boolean isDone();

    /**
     * Gets the list of bits for this achievement.
     * @return An {@code Optional<Set<Integer>>} instance, never {@code null}:
     * <br>If present, the set is non-modifiable and may be empty.
     */
    @OptionalValue
    Optional<Set<Integer>> getBits();
}
