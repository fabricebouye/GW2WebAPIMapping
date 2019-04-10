/*
 * Copyright (C) 2015-2019 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.home.nodes;

import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines a gathering node that can be unlocked by the account for the home instance.
 *
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/home/hodes") // NOI18N.
public interface HomeNode {
    /**
     * Gets the id of this home node.
     *
     * @return A {@code String} instance, never {@code null}.
     */
    @IdValue(flavor = IdValue.Flavor.STRING)
    String getId();
}
