/* 
 * Copyright (C) 2015-2016 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.professions;

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
public class ProfessionsUtilsTest {

    public ProfessionsUtilsTest() {
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
     * Test of ProfessionTrackCategory.
     */
    @Test
    public void testFindProfessionTrackCategory() {
        System.out.println("findProfessionTrackCategory");
        final String[] values = {
            "Skills", // NOI18N.
            "Specializations", // NOI18N.
            "EliteSpecializations", // NOI18N.
            null,
            "" // NOI18N.
        };
        final ProfessionTrackCategory[] expResults = {
            ProfessionTrackCategory.SKILLS,
            ProfessionTrackCategory.SPECIALIZATIONS,
            ProfessionTrackCategory.ELITE_SPECIALIZATIONS,
            ProfessionTrackCategory.UNKNOWN,
            ProfessionTrackCategory.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final ProfessionTrackCategory expResult = expResults[index];
                    final ProfessionTrackCategory result = EnumValueFactory.INSTANCE.mapEnumValue(ProfessionTrackCategory.class, value);
                    assertEquals(expResult, result);
                });
    }

    /**
     * Test of ProfessionTrackCostType.
     */
    @Test
    public void testFindProfessionTrackCostType() {
        System.out.println("findProfessionTrackCostType");
        final String[] values = {
            "Skill", // NOI18N.
            "Trait", // NOI18N.
            null,
            "" // NOI18N.
        };
        final ProfessionTrackCostType[] expResults = {
            ProfessionTrackCostType.SKILL,
            ProfessionTrackCostType.TRAIT,
            ProfessionTrackCostType.UNKNOWN,
            ProfessionTrackCostType.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final ProfessionTrackCostType expResult = expResults[index];
                    final ProfessionTrackCostType result = EnumValueFactory.INSTANCE.mapEnumValue(ProfessionTrackCostType.class, value);
                    assertEquals(expResult, result);
                });
    }

    /**
     * Test of ProfessionWeaponSlot.
     */
    @Test
    public void testFindProfessionWeaponSlot() {
        System.out.println("findProfessionWeaponSlot");
        final String[] values = {
            "Weapon_1", // NOI18N.
            "Weapon_2", // NOI18N.
            "Weapon_3", // NOI18N.
            "Weapon_4", // NOI18N.
            "Weapon_5", // NOI18N.
            null,
            "" // NOI18N.
        };
        final ProfessionWeaponSlot[] expResults = {
            ProfessionWeaponSlot.WEAPON_1,
            ProfessionWeaponSlot.WEAPON_2,
            ProfessionWeaponSlot.WEAPON_3,
            ProfessionWeaponSlot.WEAPON_4,
            ProfessionWeaponSlot.WEAPON_5,
            ProfessionWeaponSlot.UNKNOWN,
            ProfessionWeaponSlot.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final ProfessionWeaponSlot expResult = expResults[index];
                    final ProfessionWeaponSlot result = EnumValueFactory.INSTANCE.mapEnumValue(ProfessionWeaponSlot.class, value);
                    assertEquals(expResult, result);
                });
    }
}
