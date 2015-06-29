/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.characters;

import java.util.Arrays;
import java.util.Optional;

/**
 * Utility class for characters.
 * @author Fabrice Bouyé
 */
public enum CharactersUtils {

    /**
     * Unique instance of this class.
     */
    INSTANCE;

    /**
     * Gets the character race for given value.
     * @param value The source value.
     * @return A {@code CharacterRace} instance, never {@code null}.
     * <br>If no corresponding value is found, {@code CharacterRace.UNKNOWN} is returned.
     * @see CharacterRace
     */
    public static CharacterRace findCharacterRace(final String value) {
        final Optional<CharacterRace> resultOptional = Arrays.stream(CharacterRace.values())
                .filter(toTest -> value != null && value.equals(toTest.value))
                .findFirst();
        final CharacterRace result = resultOptional.isPresent() ? resultOptional.get() : CharacterRace.UNKNOWN;
        return result;
    }

    /**
     * Gets the character profession for given value.
     * @param value The source value.
     * @return A {@code CharacterProfession} instance, never {@code null}.
     * <br>If no corresponding value is found, {@code CharacterProfession.UNKNOWN} is returned.
     * @see CharacterProfession
     */
    public static CharacterProfession findCharacterProfession(final String value) {
        final Optional<CharacterProfession> resultOptional = Arrays.stream(CharacterProfession.values())
                .filter(toTest -> value != null && value.equals(toTest.value))
                .findFirst();
        final CharacterProfession result = resultOptional.isPresent() ? resultOptional.get() : CharacterProfession.UNKNOWN;
        return result;
    }

    /**
     * Gets the character gender for given value.
     * @param value The source value.
     * @return A {@code CharacterGender} instance, never {@code null}.
     * <br>If no corresponding value is found, {@code CharacterGender.UNKNOWN} is returned.
     * @see CharacterGender
     */
    public static CharacterGender findCharacterGender(final String value) {
        final Optional<CharacterGender> resultOptional = Arrays.stream(CharacterGender.values())
                .filter(toTest -> value != null && value.equals(toTest.value))
                .findFirst();
        final CharacterGender result = resultOptional.isPresent() ? resultOptional.get() : CharacterGender.UNKNOWN;
        return result;
    }
}
