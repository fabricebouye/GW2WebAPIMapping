/*
 * Copyright (C) 2015-2019 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.account.luck;

import api.web.gw2.mapping.core.ImplementationSpecific;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines luck id.
 *
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/account/luck", requiresAuthentication = true, scope = "unlocks")
public enum LuckId {
    /**
     * Defines luck id.
     */
    LUCK("luck"), // NOI18N.
    /**
     * Fail safe value.
     */
    @ImplementationSpecific
    UNKNOWN(null);

    final String value;

    LuckId(final String value) {
        this.value = value;
    }
}
