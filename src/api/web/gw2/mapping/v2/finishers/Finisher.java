/* 
 * Copyright (C) 2015-2016 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.finishers;

import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.core.LocalizedResource;
import api.web.gw2.mapping.core.OptionalValue;
import api.web.gw2.mapping.core.QuantityValue;
import api.web.gw2.mapping.core.URLReference;
import api.web.gw2.mapping.v2.APIv2;
import java.util.Optional;

/**
 * Defines a finisher.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/finishers") // NOI18N.
public interface Finisher {

    /**
     * Gets the id of this finisher.
     * @return An {@code int}.
     */
    @IdValue
    int getId();

    /**
     * Gets the unlock details for this finisher.
     * @return An {@code Optional<String>} instance, never {@code null}.
     */
    @LocalizedResource
    @OptionalValue
    Optional<String> getUnlockDetails();

    /**
     * Gets the sorting order of this finisher.
     * @return An {@code int}.
     */
    @QuantityValue
    int getOrder();

    /**
     * Gets the URL to this finisher's icon.
     * @return A {@code URLReference} instance, never {@code null}.
     */
    URLReference getIcon();

    /**
     * Gets the i18n name for this finisher.
     * @return A {@code String} instance, never {@code null}.
     */
    @LocalizedResource
    String getName();
}
