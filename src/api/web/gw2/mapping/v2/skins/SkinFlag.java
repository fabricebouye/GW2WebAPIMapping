/* 
 * Copyright (C) 2015-2016 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.skins;

import api.web.gw2.mapping.core.ImplementationSpecific;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines all flags on skins.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/skins") // NOI18N.
public enum SkinFlag {

    /**
     * The skin is listed in the account wardrobe.
     */
    SHOW_IN_WARDROBE("ShowInWardrobe"), // NOI18N.
    /**
     * The skin can be applied at no cost.
     */
    NO_COST("NoCost"), // NOI18N.
    /**
     * The skin is hidden.
     */
    HIDE_IF_LOCKED("HideIfLocked"), // NOI18N.
    /**
     * The skin overrides the rarity of the item.
     */
    OVERRIDE_RARITY("OverrideRarity"), // NOI18N.
    /**
     * Fail safe value.
     */
    @ImplementationSpecific
    UNKNOWN(null);

    final String value;

    private SkinFlag(final String value) {
        this.value = value;
    }
}
