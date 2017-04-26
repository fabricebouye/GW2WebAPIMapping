/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.mailcarriers;

import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.core.LocalizedResource;
import api.web.gw2.mapping.core.QuantityValue;
import api.web.gw2.mapping.core.SetValue;
import api.web.gw2.mapping.core.URLReference;
import api.web.gw2.mapping.core.URLValue;
import api.web.gw2.mapping.v2.APIv2;
import java.util.Set;

/**
 * Defines a mail carrier.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/mailcarrier") // NOI18N.
public interface MailCarrier {

    /**
     * Gets the id of this mail carrier.
     * @return An {@code int}.
     */
    @IdValue
    int getId();

    /**
     * Gets the set of item ids required to unlock this mail carrier.
     * @return A {@code Set<Integer>} instance; never {@code null}. May be empty.
     * @see api.web.gw2.mapping.v2.items.Item#getId() 
     */
    @IdValue
    @SetValue
    Set<Integer> getUnlockItems();

    /**
     * Gets the order in which to sort this mail carrier.
     * @return An {@code int} &ge; 0.
     */
    @QuantityValue
    int getOrder();

    /**
     * Gets the URL to the icon of this mail carrier.
     * @return A {@code URLReference} instance; never {@code null}. May be empty.
     */
    @URLValue
    URLReference getIcon();

    /**
     * Gets the i18n name of this mail carrier.
     * @return A {@code String} instance; never {@code null}.
     */
    @LocalizedResource
    String getName();

    /**
     * Gets the set of flags on this mail carrier.
     * @return A {@code Set<MailCarrierFlag>} instance; never {@code null}. May 
     * be empty.
     */
    @SetValue
    Set<MailCarrierFlag> getFlags();
}
