/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.characters;

/**
 * Default implementation of a character.
 * @author Fabrice Bouyé
 */
final class DefaultCharacter implements Character {

    String name;
    CharacterRace race;
    CharacterProfession profession;
    CharacterGender gender;
    int level;
    String guild;

    /**
     * Creates a new empty instance.
     */
    DefaultCharacter() {
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public CharacterRace getRace() {
        return race;
    }

    @Override
    public CharacterProfession getProfession() {
        return profession;
    }

    @Override
    public CharacterGender getGender() {
        return gender;
    }

    @Override
    public int getLevel() {
        return level;
    }

    @Override
    public String getGuild() {
        return guild;
    }

}
