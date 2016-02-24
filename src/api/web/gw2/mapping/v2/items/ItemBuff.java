/* 
 * Copyright (C) 2015-2016 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.items;

import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.core.LocalizedResource;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines an item buff.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/items") // NOI18N.
public interface ItemBuff {

    /**
     * Gets the id of the skill of this buff.
     * @return An {@code int}
     */
    @IdValue
    int getSkillId();

    /**
     * Gets the localized description of this buff.
     * @return A {@code String} instance, never {@code null}.
     */
    @LocalizedResource
    String getDescription();
}
