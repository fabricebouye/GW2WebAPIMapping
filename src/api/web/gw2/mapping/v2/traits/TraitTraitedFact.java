/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.traits;

import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.core.OptionalValue;
import api.web.gw2.mapping.v2.APIv2;
import java.util.OptionalInt;

/**
 * Defines a trait traited fact.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/traits") // NOI18N.
public interface TraitTraitedFact {

    /**
     * Gets the trait that has to be selected for this fact to take effect.
     * @return A {@code int}.
     */
    @IdValue
    int getRequiresTrait();

    /**
     * Gets index of the [@code TraitFact} that is overriden.
     * @return An {@code OptionalInt} instance, never {@code null}.
     */
    @OptionalValue
    OptionalInt getOverrides();
}
