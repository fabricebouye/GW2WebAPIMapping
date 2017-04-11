/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.races;

import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.core.SetValue;
import api.web.gw2.mapping.v2.APIv2;
import java.util.Set;

/**
 * Defines a playable race.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/races") // NOI18N.
public interface Race {

    /**
     * Defines the id of this race.
     * @return A {@code String} instance, never {@code null}.
     */
    @IdValue(flavor = IdValue.Flavor.STRING)
    String getId();

    /**
     * Defines the set of ids for each of the racial skills for this race.
     * @return A {@code Set<Integer>} instance, never {@code null}. The set may
     * be empty.
     */
    @IdValue
    @SetValue
    Set<Integer> getSkills();
}
