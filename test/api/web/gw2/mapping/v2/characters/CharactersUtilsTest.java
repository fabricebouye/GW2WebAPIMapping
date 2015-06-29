/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.characters;

import java.util.stream.IntStream;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit test.
 * @author Fabrice Bouyé
 */
public class CharactersUtilsTest {

    public CharactersUtilsTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of findCharacterRace method, of class CharactersUtils.
     */
    @Test
    public void testFindCharacterRace() {
        System.out.println("findCharacterRace");
        final String[] values = {
            "Asura", // NOI18N.
            "Charr", // NOI18N.
            "Human", // NOI18N.
            "Norn", // NOI18N.
            "Sylvari", // NOI18N.
            null,
            "" // NOI18N.
        };
        final CharacterRace[] expResults = {
            CharacterRace.ASURA,
            CharacterRace.CHARR,
            CharacterRace.HUMAN,
            CharacterRace.NORN,
            CharacterRace.SYLVARI,
            CharacterRace.UNKNOWN,
            CharacterRace.UNKNOWN
        };
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final CharacterRace expResult = expResults[index];
                    final CharacterRace result = CharactersUtils.findCharacterRace(value);
                    assertEquals(expResult, result);
                });
    }

    /**
     * Test of findCharacterProfession method, of class CharacterUtils.
     */
    @Test
    public void testFindCharacterProfession() {
        System.out.println("findCharacterProfession");
        final String[] values = {
            "Elementalist", // NOI18N.
            "Engineer", // NOI18N.
            "Guardian", // NOI18N.
            "Mesmer", // NOI18N.
            "Necromancer", // NOI18N.
            "Ranger", // NOI18N.
            "Revenant", // NOI18N.
            "Thief", // NOI18N.
            "Warrior", // NOI18N.
            null,
            "" // NOI18N.
        };
        final CharacterProfession[] expResults = {
            CharacterProfession.ELEMENTALIST,
            CharacterProfession.ENGINEER,
            CharacterProfession.GUARDIAN,
            CharacterProfession.MESMER,
            CharacterProfession.NECROMANCER,
            CharacterProfession.RANGER,
            CharacterProfession.REVENANT,
            CharacterProfession.THIEF,
            CharacterProfession.WARRIOR,
            CharacterProfession.UNKNOWN,
            CharacterProfession.UNKNOWN
        };
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final CharacterProfession expResult = expResults[index];
                    final CharacterProfession result = CharactersUtils.findCharacterProfession(value);
                    assertEquals(expResult, result);
                });
    }

    /**
     * Test of findCharacterGender method, of class CharacterUtils.
     */
    @Test
    public void testFindCharacterGender() {
        System.out.println("findCharacterGender"); // NOI18N.
        final String[] values = {
            "Female", // NOI18N.
            "Male", // NOI18N.
            null,
            "" // NOI18N.
        };
        final CharacterGender[] expResults = {
            CharacterGender.FEMALE,
            CharacterGender.MALE,
            CharacterGender.UNKNOWN,
            CharacterGender.UNKNOWN
        };
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final CharacterGender expResult = expResults[index];
                    final CharacterGender result = CharactersUtils.findCharacterGender(value);
                    assertEquals(expResult, result);
                });
    }
}
