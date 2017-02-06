/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.achievements;

import api.web.gw2.mapping.core.ImplementationSpecific;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines all achievement types.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/achievements") // NOI18N.
public enum AchievementType {

    /**
     * Defines a default achievement.
     */
    DEFAULT("Default"),
    /**
     * Defines a collection achievement.
     */
    ITEM_SET("ItemSet"),
    @ImplementationSpecific
    /**
     * Fail safe value.
     */
    UNKNOWN(null);

    final String value;

    private AchievementType(final String value) {
        this.value = value;
    }
}
