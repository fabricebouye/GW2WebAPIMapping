/* 
 * Copyright (C) 2015-2019 Fabrice Bouyé
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

    /**
     * Defines the default upgrade component type.
     */
    DEFAULT("Default"), // NOI18N.
    /**
     * Defines the gem upgrade component type.
     */
    GEM("Gem"), // NOI18N.
    /**
     * Defines the sigil upgrade component type.
     */
    SIGIL("Sigil"), // NOI18N.
    /**
     * Defines the run upgrade component type.
     */
    RUNE("Rune"), // NOI18N.
    /**
     * Fail safe value.
     */
    @ImplementationSpecific
    UNKNOWN(null);

    final String value;

    private ItemUpgradeComponentType(final String value) {
        this.value = value;
    }
}
