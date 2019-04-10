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
 * Defines all achievement bit types.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/achievements") // NOI18N.
public enum AchievementBitType {

    /**
     * Defines the text achievement bit type.
     */
    TEXT("Text"),
    /**
     * Defines the item achievement bit type.
     */    
    ITEM("Item"),
    /**
     * Defines the minipet achievement bit type.
     */    
    MINIPET("Minipet"),
    /**
     * Defines the skin achievement bit type.
     */    
    SKIN("Skin"),
    /**
     * Fail safe value.
     */
    @ImplementationSpecific
    UNKNOWN(null);

    final String value;

    private AchievementBitType(final String value) {
        this.value = value;
    }
}
