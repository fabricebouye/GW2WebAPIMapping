/* 
 * Copyright (C) 2015-2019 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.achievements;

import api.web.gw2.mapping.core.ImplementationSpecific;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines all achievement reward types.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/achievements") // NOI18N.
public enum AchievementRewardType {

    /**
     * Defines an item achievement reward type.
     */
    ITEM("Item"),
    /**
     * Defines a mastery achievement reward type.
     */
    MASTERY("Mastery"),
    /**
     * Fail safe value.
     */
    @ImplementationSpecific
    UNKNOWN(null);

    final String value;

    private AchievementRewardType(final String value) {
        this.value = value;
    }
}
