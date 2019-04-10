/* 
 * Copyright (C) 2015-2019 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.traits;

import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.core.LocalizedResource;
import api.web.gw2.mapping.core.OptionalValue;
import api.web.gw2.mapping.core.URLReference;
import api.web.gw2.mapping.core.URLValue;
import api.web.gw2.mapping.v2.APIv2;
import java.util.Optional;
import java.util.OptionalInt;

/**
 * Defines the base type of trait facts.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/traits") // NOI18N.
public interface TraitFact {

    /**
     * Gets the i18n text of this fact.
     * @return An {@code Optional<String>} instance, never {@code null}.
     */
    @LocalizedResource
    @OptionalValue
    Optional<String> getText();

    /**
     * Gets the type of this fact.
     * @return A {@code TraitFactType} instance, never {@code null}.
     */
    TraitFactType getType();

    /**
     * Gets the optional URL to the icon of this fact.
     * @return A {@code URLReference} instance, never {@code null}.
     */
    @URLValue
    URLReference getIcon();

    /**
     * Gets the trait that has to be selected for this fact to take effect.
    * @return An {@code OptionalInt} instance, never {@code null}.
     */
    @OptionalValue
    @IdValue
    OptionalInt getRequiresTrait();

    /**
     * Gets index of the [@code TraitFact} that is overridden.
     * @return An {@code OptionalInt} instance, never {@code null}.
     */
    @OptionalValue
    OptionalInt getOverrides();
}
