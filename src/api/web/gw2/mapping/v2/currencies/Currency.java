/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.currencies;

import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.core.URLReference;
import api.web.gw2.mapping.core.URLValue;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines a currency.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/currencies") // NOI18N.
public interface Currency {

    /**
     * Gets the id of this currency.
     * @return An {@code int}
     */
    @IdValue
    int getId();

    /**
     * Gets the localized name of this currency.
     * @return A {@code String} instance, never {@code null}
     */
    String getName();

    /**
     * Gets the localized description of this currency.
     * @return A {@code String} instance, never {@code null}
     */
    String getDescription();

    /**
     * Gets the URL of the icon of this currency.
     * @return A {@code URLReference} instance, never {@code null}.
     */
    @URLValue
    URLReference getIcon();

    /**
     * Gets the sorting order of this currency.
     * @return An {@code int}
     */
    @IdValue
    int getOrder();
}
