/* 
 * Copyright (C) 2015-2016 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.skills;

import api.web.gw2.mapping.v2.skins.*;
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
public class SkillsUtilsTest {

    public SkillsUtilsTest() {
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
     * Test of SkinType.
     */
    @Test
    public void testFindSkillSlot() {
        System.out.println("findSkillSlot");
        final String[] values = {
            "Downed_1", // NOI18N.
            "Downed_2", // NOI18N.
            "Downed_3", // NOI18N.
            "Downed_4", // NOI18N.
            "Profession_1", // NOI18N.
            "Profession_2", // NOI18N.
            "Profession_3", // NOI18N.
            "Profession_4", // NOI18N.
            "Profession_5", // NOI18N.
            "Utility", // NOI18N.
            "Weapon_1", // NOI18N.
            "Weapon_2", // NOI18N.
            "Weapon_3", // NOI18N.
            "Weapon_4", // NOI18N.
            "Weapon_5", // NOI18N.
            null,
            "" // NOI18N.
        };
        final SkillSlot[] expResults = {
            SkillSlot.DOWNED_1,
            SkillSlot.DOWNED_2,
            SkillSlot.DOWNED_3,
            SkillSlot.DOWNED_4,
            SkillSlot.PROFESSION_1,
            SkillSlot.PROFESSION_2,
            SkillSlot.PROFESSION_3,
            SkillSlot.PROFESSION_4,
            SkillSlot.PROFESSION_5,
            SkillSlot.UTILITY,
            SkillSlot.WEAPON_1,
            SkillSlot.WEAPON_2,
            SkillSlot.WEAPON_3,
            SkillSlot.WEAPON_4,
            SkillSlot.WEAPON_5,
            SkillSlot.UNKNOWN,
            SkillSlot.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final SkillSlot expResult = expResults[index];
                    final SkillSlot result = EnumValueFactory.INSTANCE.mapEnumValue(SkillSlot.class, value);
                    assertEquals(expResult, result);
                });
    }

    /**
     * Test of SkillWeaponType.
     */
    @Test
    public void testFindSkillWeaponType() {
        System.out.println("findSkillWeaponType");
        final String[] values = {
            "Axe", // NOI18N.
            "Dagger", // NOI18N.
            "Focus", // NOI18N.
            "Greatsword", // NOI18N.
            "Hammer", // NOI18N.
            "Harpoon", // NOI18N.
            "LongBow", // NOI18N.
            "Mace", // NOI18N.
            "Pistol", // NOI18N.
            "Rifle", // NOI18N.
            "Scepter", // NOI18N.
            "Shield", // NOI18N.
            "ShortBow", // NOI18N.
            "Speargun", // NOI18N.
            "Staff", // NOI18N.
            "Sword", // NOI18N.
            "Torch", // NOI18N.
            "Trident", // NOI18N.
            "Warhorn", // NOI18N.
            "None", // NOI18N.
            null,
            "" // NOI18N.
        };
        final SkillWeaponType[] expResults = {
            SkillWeaponType.AXE,
            SkillWeaponType.DAGGER,
            SkillWeaponType.FOCUS,
            SkillWeaponType.GREATSWORD,
            SkillWeaponType.HAMMER,
            SkillWeaponType.HARPOON,
            SkillWeaponType.LONG_BOW,
            SkillWeaponType.MACE,
            SkillWeaponType.PISTOL,
            SkillWeaponType.RIFLE,
            SkillWeaponType.SCEPTER,
            SkillWeaponType.SHIELD,
            SkillWeaponType.SHORT_BOW,
            SkillWeaponType.SPEARGUN,
            SkillWeaponType.STAFF,
            SkillWeaponType.SWORD,
            SkillWeaponType.TORCH,
            SkillWeaponType.TRIDENT,
            SkillWeaponType.WARHORN,
            SkillWeaponType.NONE,
            SkillWeaponType.UNKNOWN,
            SkillWeaponType.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final SkillWeaponType expResult = expResults[index];
                    final SkillWeaponType result = EnumValueFactory.INSTANCE.mapEnumValue(SkillWeaponType.class, value);
                    assertEquals(expResult, result);
                });
    }

    /**
     * Test of SkillType.
     */
    @Test
    public void testFindSkillType() {
        System.out.println("findSkillType");
        final String[] values = {
            "Bundle", // NOI18N.
            "Elite", // NOI18N.
            "Heal", // NOI18N.
            "Profession", // NOI18N.
            "Utility", // NOI18N.
            "Weapon", // NOI18N.
            null,
            "" // NOI18N.
        };
        final SkillType[] expResults = {
            SkillType.BUNDLE,
            SkillType.ELITE,
            SkillType.HEAL,
            SkillType.PROFESSION,
            SkillType.UTILITY,
            SkillType.WEAPON,
            SkillType.UNKNOWN,
            SkillType.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final SkillType expResult = expResults[index];
                    final SkillType result = EnumValueFactory.INSTANCE.mapEnumValue(SkillType.class, value);
                    assertEquals(expResult, result);
                });
    }
}
