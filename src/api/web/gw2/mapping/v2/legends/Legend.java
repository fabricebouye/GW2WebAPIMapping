/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.legends;

import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.core.SetValue;
import api.web.gw2.mapping.v2.APIv2;
import java.util.Set;

/**
 * Defines a Revenant's legend.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/legends") // NOI18N.
public interface Legend {

    /**
     * Gets the id of this legend.
     * @return A {@code String} instance, never {@code null}.
     */
    @IdValue(flavor = IdValue.Flavor.STRING)
    String getId();

    /**
     * Gets the id of the swap skill for this legend.
     * @return An {@code int}.
     * @see api.web.gw2.mapping.v2.skills.Skill
     */
    @IdValue
    int getSwap();

    /**
     * Gets the id of the heal skill for this legend.
     * @return An {@code int}.
     * @see api.web.gw2.mapping.v2.skills.Skill
     */
    @IdValue
    int getHeal();

    /**
     * Gets the id of the elite skill for this legend.
     * @return An {@code int}.
     * @see api.web.gw2.mapping.v2.skills.Skill
     */
    @IdValue
    int getElite();

    /**
     * Gets the ids of the utility skills for this legend.
     * @return A {@code Set<Integer>} instance, never {@code null}.
     * @see api.web.gw2.mapping.v2.skills.Skill
     */
    @IdValue
    @SetValue
    Set<Integer> getUtilities();
}
