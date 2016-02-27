/* 
 * Copyright (C) 2015-2016 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.guild.id.log;

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
public final class LogEventUtilsTest {

    public LogEventUtilsTest() {
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
     * Test of LogEventType.
     */
    @Test
    public void testFindLogEventType() {
        System.out.println("findLogEventType");
        final String[] values = {
            "treasury", // NOI18N.
            "motd", // NOI18N.
            null,
            "" // NOI18N.
        };
        final LogEventType[] expResults = {
            LogEventType.TREASURY,
            LogEventType.MOTD,
            LogEventType.UNKNOWN,
            LogEventType.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final LogEventType expResult = expResults[index];
                    final LogEventType result = EnumValueFactory.INSTANCE.mapEnumValue(LogEventType.class, value);
                    assertEquals(expResult, result);
                });
    }
}
