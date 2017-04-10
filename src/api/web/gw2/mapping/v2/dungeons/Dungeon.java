/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.dungeons;

import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.core.ImplementationSpecific;
import api.web.gw2.mapping.core.SetValue;
import api.web.gw2.mapping.v2.APIv2;
import java.util.Set;

/**
 * Defines dungeons ids.
 * @author Fabrice Bouyé
 */
@ImplementationSpecific
@APIv2(endpoint = "v2/dungeon") // NOI18N.
public interface Dungeon {

    /**
     * Gets the id of this dungeon.
     * @return A {@code String} instance, never {@code null}.
     */
    @IdValue(flavor = IdValue.Flavor.STRING)
    String getId();

    /**
     * Gets the set of paths in this dungeon.
     * @return A {@code Set<DungeonPath>}, never {@code null}. May be empty.
     */
    @SetValue
    Set<DungeonPath> getPaths();
}
