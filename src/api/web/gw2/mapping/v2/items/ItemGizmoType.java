/* 
 * Copyright (C) 2015-2016 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.items;

import api.web.gw2.mapping.core.ImplementationSpecific;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines all gizmo types.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/items") // NOI18N.
public enum ItemGizmoType {

    /**
     * Defines the default gizmo type.
     */
    DEFAULT("Default"), // NOI18N.
    /**
     * Defines the container key gizmo type (ie: Black Lion Chest Key).
     */
    CONTAINER_KEY("ContainerKey"), // NOI18N.
    /**
     * Defines the rentable contract NPC gizmo type (ie: Golem Banker).
     */
    RENTABLE_CONTRACT_NPC("RentableContractNpc"), // NOI18N.
    /**
     * Defines the unlimited use gizmo type (ie: Permanent Self-Style Hair Kit).
     */
    UNLIMITED_CONSUMABLE("UnlimitedConsumable"), // NOI18N.
    /**
     * Fail safe value.
     */
    @ImplementationSpecific
    UNKNOWN(null);

    final String value;

    private ItemGizmoType(final String value) {
        this.value = value;
    }
}
