/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.backstory.questions;

import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.core.LocalizedResource;
import api.web.gw2.mapping.core.QuantityValue;
import api.web.gw2.mapping.core.SetValue;
import api.web.gw2.mapping.v2.APIv2;
import api.web.gw2.mapping.v2.characters.CharacterProfession;
import api.web.gw2.mapping.v2.characters.CharacterRace;
import java.util.Set;

/**
 * Defines a backstory (character's biography) question.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/backstory/questions") // NOI18N.
public interface BackstoryQuestion {

    /**
     * Gets the id of this question.
     * @return An {@code int}.
     */
    @IdValue
    int getId();

    /**
     * Gets the i18n title of this question.
     * @return A {@code String}, never {@code null}.
     */
    @LocalizedResource
    String getTitle();

    /**
     * Gets the i18n description of this question.
     * @return A {@code String}, never {@code null}.
     */
    @LocalizedResource
    String getDescription();

    /**
     * Gets the ids of valid answers to this question.
     * @return A non-modifiable {@code  Set<Integer>}, never {@code null}.
     */
    @SetValue
    @IdValue
    Set<Integer> getAnswers();

    /**
     * Gets the sorting order of this question.
     * @return An {@code int}.
     */
    @QuantityValue
    int getOrder();

    /**
     * Gets the professions for which this question is valid.
     * @return A non-modifiable {@code  Set<CharacterProfession>}, never {@code null}.
     * @see api.web.gw2.mapping.v2.characters.CharacterProfession
     */
    @SetValue
    Set<CharacterProfession> getProfessions();

    /**
     * Gets the races for which this question is valid.
     * @return A non-modifiable {@code Set<CharacterRace>}, never {@code null}.
     * @see api.web.gw2.mapping.v2.characters.CharacterRace
     */
    @SetValue
    Set<CharacterRace> getRace();
}
