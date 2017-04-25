/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.mailcarriers;

import api.web.gw2.mapping.core.ImplementationSpecific;

/**
 * Defines all mail carrier flags.
 * @author Fabrice Bouyé
 */
public enum MailCarrierFlag {
    /**
     * Defines the air attunement.
     */
    DEFAULT("Default"), // NOI18N.
    /**
     * Fail safe value.
     */
    @ImplementationSpecific
    UNKNOWN(null);

    private final String value;

    private MailCarrierFlag(final String value) {
        this.value = value;
    }
}
