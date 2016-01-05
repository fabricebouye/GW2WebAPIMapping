/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.achievements;

import api.web.gw2.mapping.core.OptionalValue;
import api.web.gw2.mapping.v2.APIv2;
import java.util.Optional;

/**
 * Defines an achievement's bit.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/achievements") // NOI18N.
public interface AchievementBit {

    /**
     * Gets the of this achievement bit.
     * @return An {@code AchievementBitType} instance, never {@code null}.
     */
    AchievementBitType getType();

    /**
     * Gets the id of the item, minipet or skin if applicable.
     * @return An {@code Optional<Integer>}, never {@code null}.
     */
    @OptionalValue
    Optional<Integer> getId();

    /**
     * Gets the text of the bit.
     * @return An {@code Optional<String>}, never {@code null}.
     */
    @OptionalValue
    Optional<String> getText();
}
