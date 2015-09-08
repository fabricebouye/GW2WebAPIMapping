/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.traits;

import api.web.gw2.mapping.core.LocalizedResource;
import api.web.gw2.mapping.core.OptionalValue;
import java.net.URL;
import java.util.Optional;

/**
 * Defines the base type of trait facts.
 * @author Fabrice Bouyé
 */
public interface TraitFact {

    /**
     * Gets the localized text of this fact.
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
     * Gets the URL to the icon of this fact.
     * @return An {@code Optional<URL>} instance, never {@code null}.
     */
    @OptionalValue
    Optional<URL> getIcon();
}
