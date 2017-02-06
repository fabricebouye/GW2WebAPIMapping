/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
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
            "stash", // NOI18N.
            "treasury", // NOI18N.
            "motd", // NOI18N.
            "influence", // NOI18N.
            "upgrade", // NOI18N.
            "invited", // NOI18N.
            "invite_declined", // NOI18N.
            "joined", // NOI18N.
            "kick", // NOI18N.
            "rank_change", // NOI18N.
            null,
            "" // NOI18N.
        };
        final LogEventType[] expResults = {
            LogEventType.STASH,
            LogEventType.TREASURY,
            LogEventType.MOTD,
            LogEventType.INFLUENCE,
            LogEventType.UPGRADE,
            LogEventType.INVITED,
            LogEventType.INVITE_DECLINED,
            LogEventType.JOINED,
            LogEventType.KICK,
            LogEventType.RANK_CHANGE,
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

    /**
     * Test of LogEventInfluenceActivity.
     */
    @Test
    public void testFindLogEventInfluenceActivity() {
        System.out.println("findLogEventInfluenceActivity");
        final String[] values = {
            "daily_login", // NOI18N.
            "gifted", // NOI18N.
            null,
            "" // NOI18N.
        };
        final LogEventInfluenceActivity[] expResults = {
            LogEventInfluenceActivity.DAILY_LOGIN,
            LogEventInfluenceActivity.GIFTED,
            LogEventInfluenceActivity.UNKNOWN,
            LogEventInfluenceActivity.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final LogEventInfluenceActivity expResult = expResults[index];
                    final LogEventInfluenceActivity result = EnumValueFactory.INSTANCE.mapEnumValue(LogEventInfluenceActivity.class, value);
                    assertEquals(expResult, result);
                });
    }

    /**
     * Test of LogEventStashOperation.
     */
    @Test
    public void testFindLogEventStashOperation() {
        System.out.println("findLogEventStashOperation");
        final String[] values = {
            "deposit", // NOI18N.
            "withdraw", // NOI18N.
            null,
            "" // NOI18N.
        };
        final LogEventStashOperation[] expResults = {
            LogEventStashOperation.DEPOSIT,
            LogEventStashOperation.WITHDRAW,
            LogEventStashOperation.UNKNOWN,
            LogEventStashOperation.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final LogEventStashOperation expResult = expResults[index];
                    final LogEventStashOperation result = EnumValueFactory.INSTANCE.mapEnumValue(LogEventStashOperation.class, value);
                    assertEquals(expResult, result);
                });
    }

    /**
     * Test of LogEventUpgradeAction.
     */
    @Test
    public void testFindLogEventUpgradeAction() {
        System.out.println("findLogEventUpgradeAction");
        final String[] values = {
            "queued", // NOI18N.
            null,
            "" // NOI18N.
        };
        final LogEventUpgradeAction[] expResults = {
            LogEventUpgradeAction.QUEUED,
            LogEventUpgradeAction.UNKNOWN,
            LogEventUpgradeAction.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final LogEventUpgradeAction expResult = expResults[index];
                    final LogEventUpgradeAction result = EnumValueFactory.INSTANCE.mapEnumValue(LogEventUpgradeAction.class, value);
                    assertEquals(expResult, result);
                });
    }
}
