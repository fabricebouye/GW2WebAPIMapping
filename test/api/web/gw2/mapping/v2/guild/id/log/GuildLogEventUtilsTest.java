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
public final class GuildLogEventUtilsTest {

    public GuildLogEventUtilsTest() {
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
     * Test of GuildLogEventType.
     */
    @Test
    public void testFindGuildLogEventType() {
        System.out.println("findGuildLogEventType");
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
        final GuildLogEventType[] expResults = {
            GuildLogEventType.STASH,
            GuildLogEventType.TREASURY,
            GuildLogEventType.MOTD,
            GuildLogEventType.INFLUENCE,
            GuildLogEventType.UPGRADE,
            GuildLogEventType.INVITED,
            GuildLogEventType.INVITE_DECLINED,
            GuildLogEventType.JOINED,
            GuildLogEventType.KICK,
            GuildLogEventType.RANK_CHANGE,
            GuildLogEventType.UNKNOWN,
            GuildLogEventType.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final GuildLogEventType expResult = expResults[index];
                    final GuildLogEventType result = EnumValueFactory.INSTANCE.mapEnumValue(GuildLogEventType.class, value);
                    assertEquals(expResult, result);
                });
    }

    /**
     * Test of GuildLogEventInfluenceActivity.
     */
    @Test
    public void testFindGuildLogEventInfluenceActivity() {
        System.out.println("findGuildLogEventInfluenceActivity");
        final String[] values = {
            "daily_login", // NOI18N.
            "gifted", // NOI18N.
            null,
            "" // NOI18N.
        };
        final GuildLogEventInfluenceActivity[] expResults = {
            GuildLogEventInfluenceActivity.DAILY_LOGIN,
            GuildLogEventInfluenceActivity.GIFTED,
            GuildLogEventInfluenceActivity.UNKNOWN,
            GuildLogEventInfluenceActivity.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final GuildLogEventInfluenceActivity expResult = expResults[index];
                    final GuildLogEventInfluenceActivity result = EnumValueFactory.INSTANCE.mapEnumValue(GuildLogEventInfluenceActivity.class, value);
                    assertEquals(expResult, result);
                });
    }

    /**
     * Test of GuildLogEventStashOperation.
     */
    @Test
    public void testFindGuildLogEventStashOperation() {
        System.out.println("findGuildLogEventStashOperation");
        final String[] values = {
            "deposit", // NOI18N.
            "withdraw", // NOI18N.
            null,
            "" // NOI18N.
        };
        final GuildLogEventStashOperation[] expResults = {
            GuildLogEventStashOperation.DEPOSIT,
            GuildLogEventStashOperation.WITHDRAW,
            GuildLogEventStashOperation.UNKNOWN,
            GuildLogEventStashOperation.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final GuildLogEventStashOperation expResult = expResults[index];
                    final GuildLogEventStashOperation result = EnumValueFactory.INSTANCE.mapEnumValue(GuildLogEventStashOperation.class, value);
                    assertEquals(expResult, result);
                });
    }

    /**
     * Test of GuildLogEventUpgradeAction.
     */
    @Test
    public void testFindGuildLogEventUpgradeAction() {
        System.out.println("findGuildLogEventUpgradeAction");
        final String[] values = {
            "queued", // NOI18N.
            null,
            "" // NOI18N.
        };
        final GuildLogEventUpgradeAction[] expResults = {
            GuildLogEventUpgradeAction.QUEUED,
            GuildLogEventUpgradeAction.UNKNOWN,
            GuildLogEventUpgradeAction.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final GuildLogEventUpgradeAction expResult = expResults[index];
                    final GuildLogEventUpgradeAction result = EnumValueFactory.INSTANCE.mapEnumValue(GuildLogEventUpgradeAction.class, value);
                    assertEquals(expResult, result);
                });
    }
}
