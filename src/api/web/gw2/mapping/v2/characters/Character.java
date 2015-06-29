/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.characters;

import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines a character.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/characters", requiresAuthentication = true) // NOI18N.
public interface Character {

    /**
     * Gets the name of this character.
     * @return A {@code String}, never {@code null}.
     */
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
    int getLevel();

    /**
     * Gets the id of the guild of this character.
     * @return A {@code String}, may be {@code null}.
     */
    String getGuild();
}
