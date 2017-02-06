/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.stories;

import api.web.gw2.mapping.core.ImplementationSpecific;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines all story flags.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/stories")
public enum StoryFlag {
    /**
     * Defines unranked ladder.
     */
    REQUIRES_UNLOCK("RequiresUnlock"), // NOI18N.
    /**
     * Fail safe value.
     */
    @ImplementationSpecific
    UNKNOWN(null);

    final String value;

    private StoryFlag(String value) {
        this.value = value;
    }
}
