/* 
 * Copyright (C) 2015-2019 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.characters.id.equipment;

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
public class CharacterEquipmentUtilsTest {

    public CharacterEquipmentUtilsTest() {
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
     * Test of EquipmentSlot.
     */
    @Test
    public void testFindCharacterEquipmentSlot() {
        System.out.println("findCharacterEquipmentSlot");
        final String[] values = {
            "HelmAquatic", // NOI18N.
            "Backpack", // NOI18N.
            "Coat", // NOI18N.
            "Boots", // NOI18N.
            "Gloves", // NOI18N.
            "Helm", // NOI18N.
            "Leggings", // NOI18N.
            "Shoulders", // NOI18N.
            "Accessory1", // NOI18N.
            "Accessory2", // NOI18N.
            "Ring1", // NOI18N.
            "Ring2", // NOI18N.
            "Amulet", // NOI18N.
            "WeaponAquaticA", // NOI18N.
            "WeaponAquaticB", // NOI18N.
            "WeaponA1", // NOI18N.
            "WeaponA2", // NOI18N.
            "WeaponB1", // NOI18N.
            "WeaponB2", // NOI18N.
            "Sickle", // NOI18N.
            "Axe", // NOI18N.
            "Pick", // NOI18N.
            null,
            "" // NOI18N.
        };
        final CharacterEquipmentSlot[] expResults = {
            CharacterEquipmentSlot.HELM_AQUATIC,
            CharacterEquipmentSlot.BACKPACK,
            CharacterEquipmentSlot.COAT,
            CharacterEquipmentSlot.BOOTS,
            CharacterEquipmentSlot.GLOVES,
            CharacterEquipmentSlot.HELM,
            CharacterEquipmentSlot.LEGGINGS,
            CharacterEquipmentSlot.SHOULDERS,
            CharacterEquipmentSlot.ACCESSORY_1,
            CharacterEquipmentSlot.ACCESSORY_2,
            CharacterEquipmentSlot.RING_1,
            CharacterEquipmentSlot.RING_2,
            CharacterEquipmentSlot.AMULET,
            CharacterEquipmentSlot.WEAPON_AQUATIC_A,
            CharacterEquipmentSlot.WEAPON_AQUATIC_B,
            CharacterEquipmentSlot.WEAPON_A1,
            CharacterEquipmentSlot.WEAPON_A2,
            CharacterEquipmentSlot.WEAPON_B1,
            CharacterEquipmentSlot.WEAPON_B2,
            CharacterEquipmentSlot.SICKLE,
            CharacterEquipmentSlot.AXE,
            CharacterEquipmentSlot.PICK,
            CharacterEquipmentSlot.UNKNOWN,
            CharacterEquipmentSlot.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final CharacterEquipmentSlot expResult = expResults[index];
                    final CharacterEquipmentSlot result = EnumValueFactory.INSTANCE.mapEnumValue(CharacterEquipmentSlot.class, value);
                    assertEquals(expResult, result);
                });
    }

    /**
     * Test of EquipmentBinding.
     */
    @Test
    public void testFindCharacterEquipmentBinding() {
        System.out.println("findCharacterEquipmentBinding");
        final String[] values = {
            "Account", // NOI18N.
            "Character", // NOI18N.
            null,
            "" // NOI18N.
        };
        final CharacterEquipmentBinding[] expResults = {
            CharacterEquipmentBinding.ACCOUNT,
            CharacterEquipmentBinding.CHARACTER,
            CharacterEquipmentBinding.UNKNOWN,
            CharacterEquipmentBinding.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final CharacterEquipmentBinding expResult = expResults[index];
                    final CharacterEquipmentBinding result = EnumValueFactory.INSTANCE.mapEnumValue(CharacterEquipmentBinding.class, value);
                    assertEquals(expResult, result);
                });
    }

    /**
     * Test of EquipmentAttribute.
     */
    @Test
    public void testFindCharacterEquipmentAttribute() {
        System.out.println("findCharacterEquipmentAttribute");
        final String[] values = {
            "BoonDuration", // NOI18N.
            "ConditionDamage", // NOI18N.
            "ConditionDuration", // NOI18N.
            "CritDamage", // NOI18N.
            "Healing", // NOI18N.
            "Power", // NOI18N.
            "Precision", // NOI18N.
            "Toughness", // NOI18N.
            "Vitality", // NOI18N.
            null,
            "" // NOI18N.
        };
        final CharacterEquipmentAttribute[] expResults = {
            CharacterEquipmentAttribute.BOON_DURATION,
            CharacterEquipmentAttribute.CONDITION_DAMAGE,
            CharacterEquipmentAttribute.CONDITION_DURATION,
            CharacterEquipmentAttribute.CRIT_DAMAGE,
            CharacterEquipmentAttribute.HEALING,
            CharacterEquipmentAttribute.POWER,
            CharacterEquipmentAttribute.PRECISION,
            CharacterEquipmentAttribute.TOUGHNESS,
            CharacterEquipmentAttribute.VITALITTY,
            CharacterEquipmentAttribute.UNKNOWN,
            CharacterEquipmentAttribute.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final CharacterEquipmentAttribute expResult = expResults[index];
                    final CharacterEquipmentAttribute result = EnumValueFactory.INSTANCE.mapEnumValue(CharacterEquipmentAttribute.class, value);
                    assertEquals(expResult, result);
                });
    }
}
