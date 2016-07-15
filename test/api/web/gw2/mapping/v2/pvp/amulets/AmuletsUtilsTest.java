/* 
 * Copyright (C) 2015-2016 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.pvp.amulets;

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
public class AmuletsUtilsTest {

    public AmuletsUtilsTest() {
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
     * Test of AmuletAttribute.
     */
    @Test
    public void testFindAmuletAttribute() {
        System.out.println("findAmuletAttribute");
        final String[] values = {
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
        final AmuletAttribute[] expResults = {
            AmuletAttribute.CONDITION_DAMAGE,
            AmuletAttribute.CONDITION_DURATION,
            AmuletAttribute.FEROCITY,
            AmuletAttribute.HEALING,
            AmuletAttribute.POWER,
            AmuletAttribute.PRECISION,
            AmuletAttribute.TOUGHNESS,
            AmuletAttribute.VITALITY,
            AmuletAttribute.UNKNOWN,
            AmuletAttribute.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final AmuletAttribute expResult = expResults[index];
                    final AmuletAttribute result = EnumValueFactory.INSTANCE.mapEnumValue(AmuletAttribute.class, value);
                    assertEquals(expResult, result);
                });
    }
}
