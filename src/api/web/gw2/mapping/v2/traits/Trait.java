/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.traits;

import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.core.LocalizedResource;
import api.web.gw2.mapping.core.OptionalValue;
import api.web.gw2.mapping.core.SetValue;
import api.web.gw2.mapping.core.URLReference;
import api.web.gw2.mapping.core.URLValue;
import api.web.gw2.mapping.v2.APIv2;
import java.util.Optional;
import java.util.Set;

/**
 * Defines a trait.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/traits") // NOI18N.
public interface Trait {

    /**
     * Gets the id of this trait.
     * @return A {@code int}.
     */
    @IdValue
    int getId();

    /**
     * Gets the i18n name of this trait.
     * @return A {@code String}, never {@code null}.
     */
    @LocalizedResource
    String getName();

    /**
     * Gets the URL for the icon of this trait.
     * @return A {@code URLReference} instance, never {@code null}.
     */
    @URLValue
    URLReference getIcon();

    /**
     * Gets the i18n description of this trait.
     * @return A {@code String}, never {@code null}.
     */
    @LocalizedResource
    String getDescription();

    /**
     * Gets the id of the specialization of this trait.
     * @return An {@code int}.
     */
    @IdValue
    int getSpecialization();

    /**
     * Gets the tier this trait.
     * @return A {@code TraitTier} instance, never {@code null}.
     */
    TraitTier getTier();

    /**
     * Gets the slot this trait.
     * @return A {@code TraitSlotType} instance, never {@code null}.
     */
    TraitSlotType getSlot();

    /**
     * Gets the set of facts that may be triggered by this trait.
     * @return A non-modifiable {@code Set<TraitFact>} instance, never {@code null}; may be empty.
     */
    @SetValue
    Set<TraitFact> getFacts();

    /**
     * Gets the set of traited facts that may be triggered by this trait.
     * @return A non-modifiable {@code Set<TraitFact>} instance, never {@code null}; may be empty.
     */
    @SetValue
    Set<TraitFact> getTraitedFacts();

    /**
     * Gets the set of skills that may be triggered by this trait.
     * @return A non-modifiable {@code Set<TraitSkill>} instance, never {@code null}; may be empty.
     */
    @SetValue
    Set<TraitSkill> getSkills();
}
