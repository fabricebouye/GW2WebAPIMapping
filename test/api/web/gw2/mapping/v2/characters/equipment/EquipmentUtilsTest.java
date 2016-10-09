/* 
 * Copyright (C) 2015-2016 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.characters.equipment;

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
public class EquipmentUtilsTest {

    public EquipmentUtilsTest() {
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
    public void testFindEquipmentSlot() {
        System.out.println("findEquipmentSlot");
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
        final EquipmentSlot[] expResults = {
            EquipmentSlot.HELM_AQUATIC,
            EquipmentSlot.BACKPACK,
            EquipmentSlot.COAT,
            EquipmentSlot.BOOTS,
            EquipmentSlot.GLOVES,
            EquipmentSlot.HELM,
            EquipmentSlot.LEGGINGS,
            EquipmentSlot.SHOULDERS,
            EquipmentSlot.ACCESSORY_1,
            EquipmentSlot.ACCESSORY_2,
            EquipmentSlot.RING_1,
            EquipmentSlot.RING_2,
            EquipmentSlot.AMULET,
            EquipmentSlot.WEAPON_AQUATIC_A,
            EquipmentSlot.WEAPON_AQUATIC_B,
            EquipmentSlot.WEAPON_A1,
            EquipmentSlot.WEAPON_A2,
            EquipmentSlot.WEAPON_B1,
            EquipmentSlot.WEAPON_B2,
            EquipmentSlot.SICKLE,
            EquipmentSlot.AXE,
            EquipmentSlot.PICK,
            EquipmentSlot.UNKNOWN,
            EquipmentSlot.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final EquipmentSlot expResult = expResults[index];
                    final EquipmentSlot result = EnumValueFactory.INSTANCE.mapEnumValue(EquipmentSlot.class, value);
                    assertEquals(expResult, result);
                });
    }

    /**
     * Test of EquipmentBinding.
     */
    @Test
    public void testFindEquipmentBinding() {
        System.out.println("findEquipmentBinding");
        final String[] values = {
            "Account", // NOI18N.
            "Character", // NOI18N.
            null,
            "" // NOI18N.
        };
        final EquipmentBinding[] expResults = {
            EquipmentBinding.ACCOUNT,
            EquipmentBinding.CHARACTER,
            EquipmentBinding.UNKNOWN,
            EquipmentBinding.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final EquipmentBinding expResult = expResults[index];
                    final EquipmentBinding result = EnumValueFactory.INSTANCE.mapEnumValue(EquipmentBinding.class, value);
                    assertEquals(expResult, result);
                });
    }

    /**
     * Test of EquipmentAttribute.
     */
    @Test
    public void testFindEquipmentAttribute() {
        System.out.println("findEquipmentAttribute");
        final String[] values = {
            "ConditionDamage", // NOI18N.
            "CritDamage", // NOI18N.
            "Healing", // NOI18N.
            "Power", // NOI18N.
            "Precision", // NOI18N.
            "Toughness", // NOI18N.
            "Vitality", // NOI18N.
            null,
            "" // NOI18N.
        };
        final EquipmentAttribute[] expResults = {
            EquipmentAttribute.CONDITION_DAMAGE,
            EquipmentAttribute.CRIT_DAMAGE,
            EquipmentAttribute.HEALING,
            EquipmentAttribute.POWER,
            EquipmentAttribute.PRECISION,
            EquipmentAttribute.TOUGHNESS,
            EquipmentAttribute.VITALITTY,
            EquipmentAttribute.UNKNOWN,
            EquipmentAttribute.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final EquipmentAttribute expResult = expResults[index];
                    final EquipmentAttribute result = EnumValueFactory.INSTANCE.mapEnumValue(EquipmentAttribute.class, value);
                    assertEquals(expResult, result);
                });
    }
}
