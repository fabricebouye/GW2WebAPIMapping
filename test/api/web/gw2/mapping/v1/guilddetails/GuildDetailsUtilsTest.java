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
     * Test of findEmblemFlag method, of class GuildDetailsUtils.
     */
    @Test
    public void testFindEmblemFlag() {
        System.out.println("findEmblemFlag"); // NOI18N.
        final String[] values = {
            "FlipBackgroundHorizontal", // NOI18N.
            "FlipBackgroundVertical", // NOI18N.
            "FlipForegroundHorizontal", // NOI18N.
            "FlipForegroundVertical", // NOI18N.
            null,
            "" // NOI18N.
        };
        final EmblemFlag[] expResults = {
            EmblemFlag.FLIP_BACKGROUND_HORIZONTAL,
            EmblemFlag.FLIP_BACKGROUND_VERTICAL,
            EmblemFlag.FLIP_FOREGROUND_HORIZONTAL,
            EmblemFlag.FLIP_FOREGROUND_VERTICAL,
            EmblemFlag.UNKNOWN,
            EmblemFlag.UNKNOWN
        };
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final EmblemFlag expResult = expResults[index];
                    final EmblemFlag result = GuildDetailsUtils.findEmblemFlag(value);
                    assertEquals(expResult, result);
                });
    }
}
