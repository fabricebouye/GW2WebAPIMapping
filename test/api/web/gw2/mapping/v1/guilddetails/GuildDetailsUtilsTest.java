/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v1.guilddetails;

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
public class GuildDetailsUtilsTest {

    public GuildDetailsUtilsTest() {
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
     * Test of findGuildDetailsEmblemFlag method, of class GuildDetailsUtils.
     */
    @Test
    public void testFindGuildDetailsEmblemFlag() {
        System.out.println("findGuildDetailsEmblemFlag"); // NOI18N.
        final String[] values = {
            "FlipBackgroundHorizontal", // NOI18N.
            "FlipBackgroundVertical", // NOI18N.
            "FlipForegroundHorizontal", // NOI18N.
            "FlipForegroundVertical", // NOI18N.
            null,
            "" // NOI18N.
        };
        final GuildDetailsEmblemFlag[] expResults = {
            GuildDetailsEmblemFlag.FLIP_BACKGROUND_HORIZONTAL,
            GuildDetailsEmblemFlag.FLIP_BACKGROUND_VERTICAL,
            GuildDetailsEmblemFlag.FLIP_FOREGROUND_HORIZONTAL,
            GuildDetailsEmblemFlag.FLIP_FOREGROUND_VERTICAL,
            GuildDetailsEmblemFlag.UNKNOWN,
            GuildDetailsEmblemFlag.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final GuildDetailsEmblemFlag expResult = expResults[index];
                    final GuildDetailsEmblemFlag result = GuildDetailsUtils.findGuildDetailsEmblemFlag(value);
                    assertEquals(expResult, result);
                });
    }
}
