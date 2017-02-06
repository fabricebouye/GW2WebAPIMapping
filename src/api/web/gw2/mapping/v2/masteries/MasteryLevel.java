/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.masteries;

import api.web.gw2.mapping.core.LocalizedResource;
import api.web.gw2.mapping.core.QuantityValue;
import api.web.gw2.mapping.core.URLReference;
import api.web.gw2.mapping.core.URLValue;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines a mastery level.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/masteries") // NOI18N.
public interface MasteryLevel {

    /**
     * Gets the i18n name of this mastery level.
     * @return A {@code String} instance, never {@code null}.
     */
    @LocalizedResource
    String getName();

    /**
     * Gets the i18n description of this mastery level.
     * @return A {@code String} instance, never {@code null}.
     */
    @LocalizedResource
    String getDescription();

    /**
     * Gets the i18n instruction of this mastery level.
     * @return A {@code String} instance, never {@code null}.
     */
    @LocalizedResource
    String getInstruction();

    /**
     * Gets the URL to the icon of this mastery level.
     * @return An {@code URLValue} instance, never {@code null}.
     */
    @URLValue
    URLReference getIcon();

    /**
     * Gets cost in mastery points for this mastery level.
     * @return A {@code int} &gt; 0.
     */
    @QuantityValue
    int getPointCost();

    /**
     * Gets cost in experience points for this mastery level.
     * @return A {@code int} &gt; 0.
     */
    @QuantityValue
    int getExpCost();
}
