/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.traits;

import api.web.gw2.mapping.core.DurationValue;
import api.web.gw2.mapping.v2.APIv2;
import java.time.Duration;

/**
 * Defines a time fact.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/traits") // NOI18N.
public interface TraitTimeFact extends TraitFact {

    /**
     * Gets the type of this fact.
     * @return Always {@code TraitFactType.TIME}.
     */
    @Override
    default TraitFactType getType() {
        return TraitFactType.TIME;
    }

    /**
     * Gets the duration of this fact in seconds.
     * @return A {@code Duration} instance, never {@code null}.
     */
    @DurationValue
    Duration getDuration();
}
