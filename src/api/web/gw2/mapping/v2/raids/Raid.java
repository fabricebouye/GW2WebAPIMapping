/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.raids;

import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.core.SetValue;
import api.web.gw2.mapping.v2.APIv2;
import java.util.Set;

/**
 * Defines a raid.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/raids") // NOI18N.
public interface Raid {

    /**
     * Gets the id of this raid.
     * @return A {@code String} instance, never {@code null}.
     */
    @IdValue(flavor = IdValue.Flavor.STRING)
    String getId();

    /**
     * Gets the set of wings in this raid.
     * @return A {@code Set<RaidWing>} instance, never {@code null}. May be
     * empty.
     */
    @SetValue
    Set<RaidWing> getEvents();
}
