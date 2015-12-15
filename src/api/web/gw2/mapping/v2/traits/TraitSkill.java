/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.traits;

import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.core.LocalizedResource;
import api.web.gw2.mapping.core.OptionalValue;
import api.web.gw2.mapping.core.URLValue;
import java.net.URL;
import java.util.Optional;
import java.util.Set;

/**
 * Defines a trait skill.
 * @author Fabrice Bouyé
 */
public interface TraitSkill {

    /**
     * Gets the id of this trait skill.
     * @return A {@code int}.
     */
    @IdValue
    int getId();

    /**
     * Gets the localized name of this trait skill.
     * @return A {@code String}, never {@code null}.
     */
    @LocalizedResource
    String getName();

    /**
     * Gets the URL for the icon of this trait skill.
     * @return An {@code Optional<URL>} instance, never {@code null}.
     */
    @OptionalValue
    @URLValue
    Optional<URL> getIcon();

    /**
     * Gets the localized description of this trait skill.
     * @return A {@code String}, never {@code null}.
     */
    @LocalizedResource
    String getDescription();

    /**
     * Gets the set of traited facts that may be associated by this trait skill.
     * @return An {@code Optional<Set<TraitFact>>} instance, never {@code null}.
     * <br>If present, the underlying set is non-modifiable and can be empty.
     */
    @OptionalValue
    Optional<Set<TraitFact>> getFacts();

    /**
     * Gets an additional set of traited facts that may be associated by this trait skill.
     * @return An {@code Optional<Set<TraitFact>>} instance, never {@code null}.
     * <br>If present, the underlying set is non-modifiable and can be empty.
     */
    @OptionalValue
    Optional<Set<TraitFact>> getTraitedFacts();
}
