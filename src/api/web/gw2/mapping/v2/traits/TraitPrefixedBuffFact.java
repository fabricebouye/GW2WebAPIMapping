/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.traits;

import api.web.gw2.mapping.core.DurationValue;
import api.web.gw2.mapping.core.LocalizedResource;
import api.web.gw2.mapping.core.QuantityValue;
import api.web.gw2.mapping.v2.APIv2;
import java.time.Duration;

/**
 * Defines a prefixed buff fact.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/traits") // NOI18N.
public interface TraitPrefixedBuffFact extends TraitFact {

    /**
     * {@inheritDoc}
     * @return Always {@code TraitFactType.BUFF}.
     */
    @Override
    default TraitFactType getType() {
        return TraitFactType.BUFF;
    }

    /**
     * Gets the duration of this fact in seconds.
     * @return A {@code Duration} instance, never {@code null}.
     */
    @DurationValue
    Duration getDuration();

    /**
     * Gets the localized status of this fact.
     * @return A {@code String} instance, never {@code null}.
     */
    @LocalizedResource
    String getStatus();

    /**
     * Gets the localized description of this fact.
     * @return A {@code String} instance, never {@code null}.
     */
    @LocalizedResource
    String getDescription();

    /**
     * Gets the application count of this fact.
     * @return An {@code int} &ge; 0.
     */
    @QuantityValue
    int getApplyCount();

    /**
     * Gets the prefix of this trait.
     * @return A {@code TraitPrefix} instance, never {@code null}.
     */
    TraitPrefix getPrefix();
}
