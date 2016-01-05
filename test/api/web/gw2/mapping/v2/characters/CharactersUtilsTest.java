/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.characters;

import api.web.gw2.mapping.core.EnumValueFactory;
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
     * Test of CharacterRace.
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
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final CharacterRace expResult = expResults[index];
                    final CharacterRace result = EnumValueFactory.INSTANCE.mapEnumValue(CharacterRace.class, value);
                    assertEquals(expResult, result);
                });
    }

    /**
     * Test of CharacterProfession.
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
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final CharacterProfession expResult = expResults[index];
                    final CharacterProfession result = EnumValueFactory.INSTANCE.mapEnumValue(CharacterProfession.class, value);
                    assertEquals(expResult, result);
                });
    }

    /**
     * Test of CharacterGender.
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
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final CharacterGender expResult = expResults[index];
                    final CharacterGender result = EnumValueFactory.INSTANCE.mapEnumValue(CharacterGender.class, value);
                    assertEquals(expResult, result);
                });
    }

    /**
     * Test of CharacterGameType.
     */
    @Test
    public void testFindCharacterGameType() {
        System.out.println("findCharacterGameType"); // NOI18N.
        final String[] values = {
            "pve", // NOI18N.
            "pvp", // NOI18N.
            "wvw", // NOI18N.
            null,
            "" // NOI18N.
        };
        final CharacterGameType[] expResults = {
            CharacterGameType.PVE,
            CharacterGameType.PVP,
            CharacterGameType.WVW,
            CharacterGameType.UNKNOWN,
            CharacterGameType.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final CharacterGameType expResult = expResults[index];
                    final CharacterGameType result = EnumValueFactory.INSTANCE.mapEnumValue(CharacterGameType.class, value);
                    assertEquals(expResult, result);
                });
    }
}
