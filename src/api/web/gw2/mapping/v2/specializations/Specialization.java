/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.specializations;

import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.core.LocalizedResource;
import api.web.gw2.mapping.core.SetValue;
import api.web.gw2.mapping.core.URLReference;
import api.web.gw2.mapping.core.URLValue;
import api.web.gw2.mapping.v2.APIv2;
import api.web.gw2.mapping.v2.characters.CharacterProfession;
import java.util.Set;

/**
 * Defines a specialization.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/specializations") // NOI18N.
public interface Specialization {

    /**
     * Gets the id of this specialization.
     * @return A {@code int}.
     */
    @IdValue
    int getId();

    /**
     * Gets the localized name of this specialization.
     * @return A {@code String}, never {@code null}.
     */
    @LocalizedResource
    String getName();

    /**
     * Gets the profession this specialization belongs to.
     * @return A {@code CharacterProfession} instance, never {@code null}.
     */
    CharacterProfession getProfession();

    /**
     * Indicates whether this specialization is a elite.
     * @return {@code True} if this specialization is a elite; {@code false} otherwise.
     */
    boolean isElite();

    /**
     * Gets the URL for the icon of this specialization.
     * @return A {@code URLReference} instance, never {@code null}.
     */
    @URLValue
    URLReference getIcon();

    /**
     * Gets the URL for the background image of this specialization.
     * <br>Note: background image may need to be cropped/clipped before it can be used.
     * @return A {@code URLReference} instance, never {@code null}.
     */
    @URLValue
    URLReference getBackground();

    /**
     * Gets the ids of minor traits for this specialization.
     * @return A non-modifiable {@code Set<Integer>}, never {@code null}.
     */
    @SetValue
    Set<Integer> getMinorTraits();

    /**
     * Gets the ids of major traits for this specialization.
     * @return A non-modifiable {@code Set<Integer>}, never {@code null}.
     */
    @SetValue
    Set<Integer> getMajorTraits();
}
