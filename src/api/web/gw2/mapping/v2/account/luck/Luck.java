/*
 * Copyright (C) 2015-2019 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.account.luck;

import api.web.gw2.mapping.core.QuantityValue;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines the answer for the luck endpoint.
 *
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/account/luck", requiresAuthentication = true, scope = "unlocks")
public interface Luck {
    /**
     * Gets the luck id.
     * @return Always {@code LuckId.LUCK}.
     * @see LuckId#LUCK
     */
    LuckId getId();

    /**
     * Gets the total amount of luck consumed by the account.
     * @return
     */
    @QuantityValue
    int getValue();
}
