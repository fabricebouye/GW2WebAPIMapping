/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.pvp;

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
public class PvpUtilsTest {

    public PvpUtilsTest() {
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
