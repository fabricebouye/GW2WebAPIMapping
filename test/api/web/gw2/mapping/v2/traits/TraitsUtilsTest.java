/*
 * Copyright (C) 2015-2019 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.traits;

import api.web.gw2.mapping.core.EnumValueFactory;

import java.util.stream.IntStream;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test.
 *
 * @author Fabrice Bouyé
 */
public class TraitsUtilsTest {

    public TraitsUtilsTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of TraitAttribute.
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
                    final TraitAttribute result = EnumValueFactory.INSTANCE.mapEnumValue(TraitAttribute.class, value);
                    assertEquals(expResult, result);
                });
    }

    /**
     * Test of TraitComboFieldType.
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
                    final TraitComboFieldType result = EnumValueFactory.INSTANCE.mapEnumValue(TraitComboFieldType.class, value);
                    assertEquals(expResult, result);
                });
    }

    /**
     * Test of TraitComboFinisherType.
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
                    final TraitComboFinisherType result = EnumValueFactory.INSTANCE.mapEnumValue(TraitComboFinisherType.class, value);
                    assertEquals(expResult, result);
                });
    }

    /**
     * Test of TraitFactType.
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
                    final TraitFactType result = EnumValueFactory.INSTANCE.mapEnumValue(TraitFactType.class, value);
                    assertEquals(expResult, result);
                });
    }

    /**
     * Test of TraitSlotType.
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
                    final TraitSlotType result = EnumValueFactory.INSTANCE.mapEnumValue(TraitSlotType.class, value);
                    assertEquals(expResult, result);
                });
    }

    /**
     * Test of TraitTier.
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
                    final TraitTier result = EnumValueFactory.INSTANCE.mapEnumValue(TraitTier.class, value);
                    assertEquals(expResult, result);
                });
    }
}
