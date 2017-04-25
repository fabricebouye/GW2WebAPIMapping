/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.titles;

import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.core.LocalizedResource;
import api.web.gw2.mapping.core.OptionalValue;
import api.web.gw2.mapping.core.QuantityValue;
import api.web.gw2.mapping.core.SetValue;
import api.web.gw2.mapping.v2.APIv2;
import java.util.OptionalInt;
import java.util.Set;

/**
 * Defines a title.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/titles")
public interface Title {

    /**
     * Gets the id of this title.
     * @return An {@code int}.
     */
    @IdValue
    int getId();

    /**
     * Gets the i18n name of this title.
     * @return A {@code String} instance, never {@code null}.
     */
    @LocalizedResource
    String getName();

    /**
     * Gets the id of the achievement that grants this title.
     * @return An {@code int}.
     * @deprecated 
     */
    @Deprecated
    @IdValue
    int getAchievement();

    /**
     * Gets the set of achievement ids that grants this title.
     * @return A {@code Set<Integer>} instance; never {@code null}. May be empty.
     * @see api.web.gw2.mapping.v2.achievements.Achievement
     */
    @IdValue
    @SetValue
    Set<Integer> getAchievements();

    /**
     * Gets the number of achievement points required to obtain this title.
     * @return An {@code OptionalInt} instance; never {@code null}. May be empty.
     */
    @QuantityValue
    @OptionalValue
    OptionalInt getApRequired();
}
