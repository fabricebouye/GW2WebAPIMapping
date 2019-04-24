/*
 * Copyright (C) 2015-2019 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.raids;

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
public class RaidUtilsTest {

    public RaidUtilsTest() {
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
     * Test of PvPLadder.
     */
    @Test
    public void testFindRaidWingEventType() {
        System.out.println("findRaidWingEventType");
        final String[] values = {
                "Boss", // NOI18N.
                "Checkpoint", // NOI18N.
                null,
                "" // NOI18N.
        };
        final RaidWingEventType[] expResults = {
                RaidWingEventType.BOSS,
                RaidWingEventType.CHECKPOINT,
                RaidWingEventType.UNKNOWN,
                RaidWingEventType.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final RaidWingEventType expResult = expResults[index];
                    final RaidWingEventType result = EnumValueFactory.INSTANCE.mapEnumValue(RaidWingEventType.class, value);
                    assertEquals(expResult, result);
                    assertEquals(expResult, result);
                });
    }
}
