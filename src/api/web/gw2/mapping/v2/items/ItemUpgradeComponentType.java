/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.items;

import api.web.gw2.mapping.core.ImplementationSpecific;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Listes des types d'améliorations.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/items") // NOI18N.
public enum ItemUpgradeComponentType {

    DEFAULT("Default"), // NOI18N.
    GEM("Gem"), // NOI18N.
    SIGIL("Sigil"), // NOI18N.
    RUNE("Rune"), // NOI18N.
    /**
     * Fail safe value.
     */
    @ImplementationSpecific
    UNKNOWN(null);

    final String value;

    ItemUpgradeComponentType(final String value) {
        this.value = value;
    }
}
