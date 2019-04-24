/*
 * Copyright (C) 2015-2019 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.pvp;

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
public class PvpUtilsTest {

    public PvpUtilsTest() {
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
    public void testFindPvPLadder() {
        System.out.println("findPvPLadder");
        final String[] values = {
                "none", // NOI18N.
                "ranked", // NOI18N.
                "unranked", // NOI18N.
                null,
                "" // NOI18N.
        };
        final PvpLadder[] expResults = {
                PvpLadder.NONE,
                PvpLadder.RANKED,
                PvpLadder.UNRANKED,
                PvpLadder.UNKNOWN,
                PvpLadder.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final PvpLadder expResult = expResults[index];
                    final PvpLadder result = EnumValueFactory.INSTANCE.mapEnumValue(PvpLadder.class, value);
                    assertEquals(expResult, result);
                    assertEquals(expResult, result);
                });
    }
}
