/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.skins;

import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.core.LocalizedResource;
import api.web.gw2.mapping.core.OptionalValue;
import api.web.gw2.mapping.core.SetValue;
import api.web.gw2.mapping.core.URLReference;
import api.web.gw2.mapping.core.URLValue;
import java.util.Optional;
import java.util.Set;

/**
 * Defines a skin.
 * @author Fabrice Bouyé
 */
public interface Skin {

    /**
     * Gets the id of this skin.
     * @return An {@code int}.
     */
    @IdValue
    int getId();

    /**
     * Gets the i18n name of this skin.
     * @return A {@code String} instance, never {@code null}.
     */
    @LocalizedResource
    String getName();

    /**
     * Gets the type of this skin.
     * @return A {@code SkinType} instance, never {@code null}.
     */
    SkinType getType();

    /**
     * Gets a set of flags of this skin.
     * @return A non-modifiable {@code Set<SkinFlags>} instance, never {@code null}.
     */
    @SetValue
    Set<SkinFlag> getFlags();

    /**
     * Gets a set of restrictions of this skin.
     * @return A non-modifiable {@code Set<SkinRestriction>} instance, never {@code null}.
     */
    @SetValue
    Set<SkinRestriction> getRestrictions();

    /**
     * Gets the URL to the icon of this skin.
     * @return A {@code URLReference} instance, never {@code null}.
     */
    @URLValue
    URLReference getIcon();

    /**
     * Gets the i18n description of this skin.
     * @return An {@code Optional<String>} instance, never {@code null}.
     */
    @OptionalValue
    @LocalizedResource
    Optional<String> getDescription();

    /**
     * Gets the details of this skin.
     * @param <T> The type to use.
     * @return An {@code Optional<T>} instance, never {@code null}.
     */
    <T extends SkinDetails> Optional<T> getDetails();

    /**
     * Gets the rarity of this skin.
     * @return A {@code SkinRarity} instance, never {@code null}.
     */
    SkinRarity getRarity();
}
