/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.minis;

import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.core.LocalizedResource;
import api.web.gw2.mapping.core.OptionalValue;
import api.web.gw2.mapping.core.URLReference;
import api.web.gw2.mapping.core.URLValue;
import api.web.gw2.mapping.v2.APIv2;
import java.util.Optional;

/**
 * Defines a miniature.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/minis") // NOI18N.
public interface Mini {

    /**
     * Gets the id of this mini.
     * @return An {@code int}.
     */
    @IdValue
    public int getId();

    /**
     * Gets the i18n name of this mini.
     * @return A {@code String} instance, never {@code null}.
     */
    @LocalizedResource
    public String getName();

    /**
     * Gets a tip on how to unlock this mini.
     * @return An {@code Optional<String>} instance, never {@code null}.
     */
    @LocalizedResource
    @OptionalValue
    public Optional<String> getUnlock();

    /**
     * Gets the URL of the icon of this mini.
     * @return A {@code URLReference} instance, never {@code null}.
     */
    @URLValue
    public URLReference getIcon();

    /**
     * Gets the order of this mini.
     * @return An {@code int}.
     */
    public int getOrder();

    /**
     * Gets the item id of this mini.
     * @return An {@code int}.
     */
    @IdValue
    public int getItemId();
}
