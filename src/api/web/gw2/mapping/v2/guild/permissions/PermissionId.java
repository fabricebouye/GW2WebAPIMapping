/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.guild.permissions;

import api.web.gw2.mapping.core.ImplementationSpecific;

/**
 * Defines existing guild permissions ids.
 * @author Fabrice Bouyé
 */
public enum PermissionId {
    /**
     * Allows to administrate lower ranks.
     */
    ADMIN("Admin"),
    /**
     * Allows to edit guild-owned claimables.
     */
    CLAIMABLE_EDIT_OPTIONS("ClaimableEditOptions"),
    /**
     * Allows to edit guild anthem.
     */
    EDIT_ANTHEM("EditAnthem"),
    /**
     * Fail safe value.
     */
    @ImplementationSpecific
    UNKNOWN(null);

    final String value;

    private PermissionId(String value) {
        this.value = value;
    }
}
