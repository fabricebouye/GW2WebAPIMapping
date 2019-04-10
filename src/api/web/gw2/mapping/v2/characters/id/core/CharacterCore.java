/* 
 * Copyright (C) 2015-2019 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.characters.id.core;

import api.web.gw2.mapping.v2.characters.*;
import api.web.gw2.mapping.core.DurationValue;
import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.core.LevelValue;
import api.web.gw2.mapping.core.OptionalValue;
import api.web.gw2.mapping.core.QuantityValue;
import api.web.gw2.mapping.v2.APIv2;
import java.time.Duration;
import java.time.ZonedDateTime;
import java.util.Optional;
import java.util.OptionalInt;

/**
 * Defines the core character view.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/characters/:id/core", requiresAuthentication = true, scope = "characters") // NOI18N.
public interface CharacterCore {

    /**
     * Gets the name of this character.
     * @return A {@code String}, never {@code null}.
     */
    @IdValue(flavor = IdValue.Flavor.STRING)
    String getName();

    /**
     * Gets the race of this character.
     * @return A {@code CharacterRace} instance, never {@code null}.
     */
    CharacterRace getRace();

    /**
     * Gets the profession of this character.
     * @return A {@code CharacterProfession} instance, never {@code null}.
     */
    CharacterProfession getProfession();

    /**
     * Gets the gender of this character.
     * @return A {@code CharacterGender} instance, never {@code null}.
     */
    CharacterGender getGender();

    /**
     * Gets the level of this character.
     * @return An {@code int} &ge; 1 and &le; 80.
     */
    @LevelValue
    int getLevel();

    /**
     * Gets the id of the guild of this character.
     * @return An {@code Optional<String>} instance, never {@code null}.
     */
    @IdValue
    @OptionalValue
    Optional<String> getGuild();

    /**
     * Gets the creation date of this character.
     * @return A {@code ZonedDateTime} instance, never {@code null}.
     */
    ZonedDateTime getCreated();

    /**
     * Gets the age of this character (the amount of second the character was played).
     * @return A {@code long}.
     */
    @DurationValue
    Duration getAge();

    /**
     * Gets the number of deaths of this character.
     * @return An {@code in}.
     */
    @QuantityValue
    int getDeaths();

    /**
     * Gets the id of this character's title.
     * @return An {@code OptionalInt} instance, never {@code null}.
     * @see api.web.gw2.mapping.v2.titles.Title#getId() 
     */
    @OptionalValue
    @IdValue
    OptionalInt getTitle();
}
