/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.items;

import api.web.gw2.mapping.core.ImplementationSpecific;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines all containers types.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/items") // NOI18N.
public enum ItemContainerType {

    /**
     * Defines the default container type.
     */
    DEFAULT("Default"), // NOI18N.
    /**
     * Defines the gift box container type.
     */
    GIFT_BOX("GiftBox"), // NOI18N.
    /**
     * Defines the open UI container type (ie: Black Lion Chest).
     */
    OPEN_UI("OpenUI"), // NOI18N.
    /**
     * Fail safe value.
     */
    @ImplementationSpecific
    UNKNOWN(null);

    final String value;

    private ItemContainerType(final String value) {
        this.value = value;
    }
}
