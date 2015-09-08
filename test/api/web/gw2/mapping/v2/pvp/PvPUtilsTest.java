/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.pvp;

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
public class PvPUtilsTest {

    public PvPUtilsTest() {
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
     * Test of findPvPLadder method, of class PvPUtils.
     */
    @Test
    public void testFindPvPLadder() {
        System.out.println("findPvPLadder");
        final String[] values = {
            "ranked", // NOI18N.
            "unranked", // NOI18N.
            null,
            "" // NOI18N.
        };
        final PvPLadder[] expResults = {
            PvPLadder.RANKED,
            PvPLadder.UNRANKED,
            PvPLadder.UNKNOWN,
            PvPLadder.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final PvPLadder expResult = expResults[index];
                    final PvPLadder result = PvPUtils.findPvPLadder(value);
                    assertEquals(expResult, result);
                });
    }
}
