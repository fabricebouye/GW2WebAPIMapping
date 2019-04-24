/*
 * Copyright (C) 2015-2019 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.itemstats;

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
public class ItemStatsUtilsTest {

    public ItemStatsUtilsTest() {
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
     * Test of SkinType.
     */
    @Test
    public void testFindItemstatsAttribute() {
        System.out.println("findItemstatsAttribute");
        final String[] values = {
                "AgonyResistance", // NOI18N.
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
        final ItemstatsAttribute[] expResults = {
                ItemstatsAttribute.AGONY_RESISTANCE,
                ItemstatsAttribute.BOON_DURATION,
                ItemstatsAttribute.CONDITION_DAMAGE,
                ItemstatsAttribute.CONDITION_DURATION,
                ItemstatsAttribute.FEROCITY,
                ItemstatsAttribute.HEALING,
                ItemstatsAttribute.POWER,
                ItemstatsAttribute.PRECISION,
                ItemstatsAttribute.TOUGHNESS,
                ItemstatsAttribute.VITALITY,
                ItemstatsAttribute.UNKNOWN,
                ItemstatsAttribute.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final ItemstatsAttribute expResult = expResults[index];
                    final ItemstatsAttribute result = EnumValueFactory.INSTANCE.mapEnumValue(ItemstatsAttribute.class, value);
                    assertEquals(expResult, result);
                });
    }
}
