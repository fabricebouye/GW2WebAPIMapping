/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.traits;

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
public class TraitsUtilsTest {

    public TraitsUtilsTest() {
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
     * Test of findTraitAttribute method, of class TraitsUtils.
     */
    @Test
    public void testFindTraitAttribute() {
        System.out.println("findTraitAttribute");
        final String[] values = {
            "ConditionDamage", // NOI18N.
            "CritDamage", // NOI18N.
            "Healing", // NOI18N.
            "None", // NOI18N.
            "Power", // NOI18N.
            "Precision", // NOI18N.
            "Toughness", // NOI18N.
            "Vitality", // NOI18N.
            null,
            "" // NOI18N.
        };
        final TraitAttribute[] expResults = {
            TraitAttribute.CONDITION_DAMAGE,
            TraitAttribute.FEROCITY,
            TraitAttribute.HEALING,
            TraitAttribute.NONE,
            TraitAttribute.POWER,
            TraitAttribute.PRECISION,
            TraitAttribute.TOUGHNESS,
            TraitAttribute.VITALITY,
            TraitAttribute.UNKNOWN,
            TraitAttribute.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final TraitAttribute expResult = expResults[index];
                    final TraitAttribute result = TraitsUtils.findTraitAttribute(value);
                    assertEquals(expResult, result);
                });
    }

    /**
     * Test of findTraitComboFieldType method, of class TraitsUtils.
     */
    @Test
    public void testFindTraitComboFieldType() {
        System.out.println("findTraitComboFieldType");
        final String[] values = {
            "Air", // NOI18N.
            "Dark", // NOI18N.
            "Ethereal", // NOI18N.
            "Fire", // NOI18N.
            "Ice", // NOI18N.
            "Light", // NOI18N.
            "Lightning", // NOI18N.
            "Poison", // NOI18N.
            "Smoke", // NOI18N.
            "Water", // NOI18N.
            null,
            "" // NOI18N.
        };
        final TraitComboFieldType[] expResults = {
            TraitComboFieldType.AIR,
            TraitComboFieldType.DARK,
            TraitComboFieldType.ETHEREAL,
            TraitComboFieldType.FIRE,
            TraitComboFieldType.ICE,
            TraitComboFieldType.LIGHT,
            TraitComboFieldType.LIGHTNING,
            TraitComboFieldType.POISON,
            TraitComboFieldType.SMOKE,
            TraitComboFieldType.WATER,
            TraitComboFieldType.UNKNOWN,
            TraitComboFieldType.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final TraitComboFieldType expResult = expResults[index];
                    final TraitComboFieldType result = TraitsUtils.findTraitComboFieldType(value);
                    assertEquals(expResult, result);
                });
    }

    /**
     * Test of findTraitComboFinisherType method, of class TraitsUtils.
     */
    @Test
    public void testFindTraitComboFinisherType() {
        System.out.println("findTraitComboFinisherType");
        final String[] values = {
            "Blast", // NOI18N.
            "Leap", // NOI18N.
            "Projectile", // NOI18N.
            "Whirl", // NOI18N.
            null,
            "" // NOI18N.
        };
        final TraitComboFinisherType[] expResults = {
            TraitComboFinisherType.BLAST,
            TraitComboFinisherType.LEAP,
            TraitComboFinisherType.PROJECTILE,
            TraitComboFinisherType.WHIRL,
            TraitComboFinisherType.UNKNOWN,
            TraitComboFinisherType.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final TraitComboFinisherType expResult = expResults[index];
                    final TraitComboFinisherType result = TraitsUtils.findTraitComboFinisherType(value);
                    assertEquals(expResult, result);
                });
    }

    /**
     * Test of findTraitFactType method, of class TraitsUtils.
     */
    @Test
    public void testFindTraitFactType() {
        System.out.println("findTraitFactType");
        final String[] values = {
            "AttributeAdjust", // NOI18N.
            "Buff", // NOI18N.
            "BuffConversion", // NOI18N.
            "ComboField", // NOI18N.
            "ComboFinisher", // NOI18N.
            "Damage", // NOI18N.
            "Distance", // NOI18N.
            "NoData", // NOI18N.
            "Number", // NOI18N.
            "Percent", // NOI18N.
            "PrefixedBuff", // NOI18N.
            "Radius", // NOI18N.
            "Range", // NOI18N.
            "Recharge", // NOI18N.
            "Time", // NOI18N.
            "Unblockable", // NOI18N.
            null,
            "" // NOI18N.
        };
        final TraitFactType[] expResults = {
            TraitFactType.ATTRIBUTE_ADJUST,
            TraitFactType.BUFF,
            TraitFactType.BUFF_CONVERSION,
            TraitFactType.COMBO_FIELD,
            TraitFactType.COMBO_FINISHER,
            TraitFactType.DAMAGE,
            TraitFactType.DISTANCE,
            TraitFactType.NO_DATA,
            TraitFactType.NUMBER,
            TraitFactType.PERCENT,
            TraitFactType.PREFIXED_BUFF,
            TraitFactType.RADIUS,
            TraitFactType.RANGE,
            TraitFactType.RECHARGE,
            TraitFactType.TIME,
            TraitFactType.UNBLOCKABLE,
            TraitFactType.UNKNOWN,
            TraitFactType.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final TraitFactType expResult = expResults[index];
                    final TraitFactType result = TraitsUtils.findTraitFactType(value);
                    assertEquals(expResult, result);
                });
    }

    /**
     * Test of findTraitSlotType method, of class TraitsUtils.
     */
    @Test
    public void testFindTraitSlotType() {
        System.out.println("findTraitSlotType");
        final String[] values = {
            "major", // NOI18N.
            "minor", // NOI18N.
            null,
            "" // NOI18N.
        };
        final TraitSlotType[] expResults = {
            TraitSlotType.MAJOR,
            TraitSlotType.MINOR,
            TraitSlotType.UNKNOWN,
            TraitSlotType.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final TraitSlotType expResult = expResults[index];
                    final TraitSlotType result = TraitsUtils.findTraitSlotType(value);
                    assertEquals(expResult, result);
                });
    }

    /**
     * Test of findTraitTier method, of class TraitsUtils.
     */
    @Test
    public void testFindTraitTier() {
        System.out.println("findTraitTier");
        final int[] values = {
            0,
            1,
            2,
            3,
            -1,
            Integer.MAX_VALUE
        };
        final TraitTier[] expResults = {
            TraitTier.TIER_0,
            TraitTier.TIER_1,
            TraitTier.TIER_2,
            TraitTier.TIER_3,
            TraitTier.UNKNOWN,
            TraitTier.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final int value = values[index];
                    final TraitTier expResult = expResults[index];
                    final TraitTier result = TraitsUtils.findTraitTier(value);
                    assertEquals(expResult, result);
                });
    }
}
