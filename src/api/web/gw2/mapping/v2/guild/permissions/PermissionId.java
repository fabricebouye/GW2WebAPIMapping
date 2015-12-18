/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.guild.permissions;

import api.web.gw2.mapping.core.ImplementationSpecific;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines existing guild permissions ids.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/guild/permissions") // NOI18N.
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
    // @todo Query the endpoint to find out more!
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
