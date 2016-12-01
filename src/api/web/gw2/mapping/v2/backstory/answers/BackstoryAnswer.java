/* 
 * Copyright (C) 2015-2016 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.backstory.answers;

import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.core.LocalizedResource;
import api.web.gw2.mapping.core.SetValue;
import api.web.gw2.mapping.v2.APIv2;
import api.web.gw2.mapping.v2.characters.CharacterProfession;
import api.web.gw2.mapping.v2.characters.CharacterRace;
import java.util.Set;

/**
 * Defines a backstory (character's biography) answer.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/backstory/answers") // NOI18N.
public interface BackstoryAnswer {

    /**
     * Gets the id of this answer.
     * @return A {@code String} instance, never {@code null}.
     */
    @IdValue(flavor = IdValue.Flavor.STRING)
    String getId();

    /**
     * Gets the i18n title of this answer.
     * @return A {@code String}, never {@code null}.
     */
    @LocalizedResource
    String getTitle();

    /**
     * Gets the i18n description of this answer.
     * @return A {@code String}, never {@code null}.
     */
    @LocalizedResource
    String getDescription();

    /**
     * Gets the i18n journal entry of this answer.
     * @return A {@code String}, never {@code null}.
     */
    @LocalizedResource
    String getJournal();

    /**
     * Gets the id of the parent question of this answer.
     * @return An {@code int}.
     */
    @IdValue
    int getQuestion();

    /**
     * Gets the professions for which this answer is valid.
     * @return A non-modifiable {@code  Set<CharacterProfession>}, never {@code null}.
     * @see api.web.gw2.mapping.v2.characters.CharacterProfession
     */
    @SetValue
    Set<CharacterProfession> getProfessions();

    /**
     * Gets the races for which this answer is valid.
     * @return A non-modifiable {@code Set<CharacterRace>}, never {@code null}.
     * @see api.web.gw2.mapping.v2.characters.CharacterRace
     */
    @SetValue
    Set<CharacterRace> getRace();
}
