/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.achievements.daily;

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
public class DailyUtilsTest {

    public DailyUtilsTest() {
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
     * Test of DailyAchievementGameType.
     */
    @Test
    public void testFindDailyAchievementGameType() {
        System.out.println("findDailyAchievementGameType"); // NOI18N.
        final String[] values = {
            "pve", // NOI18N.
            "pvp", // NOI18N.
            "wvw", // NOI18N.
            "special", // NOI18N.
            null,
            "" // NOI18N.
        };
        final DailyAchievementGameType[] expResults = {
            DailyAchievementGameType.PVE,
            DailyAchievementGameType.PVP,
            DailyAchievementGameType.WVW,
            DailyAchievementGameType.SPECIAL,
            DailyAchievementGameType.UNKNOWN,
            DailyAchievementGameType.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final DailyAchievementGameType expResult = expResults[index];
                    final DailyAchievementGameType result = EnumValueFactory.INSTANCE.mapEnumValue(DailyAchievementGameType.class, value);
                    assertEquals(expResult, result);
                });
    }

    /**
     * Test of DailyAchievementGameType.
     */
    @Test
    public void testFindDailyAchievementCampaign() {
        System.out.println("findDailyAchievementCampaign"); // NOI18N.
        final String[] values = {
            "GuildWars2", // NOI18N.
            "HeartOfThorns", // NOI18N.
            null,
            "" // NOI18N.
        };
        final DailyAchievementCampaign[] expResults = {
            DailyAchievementCampaign.GUILD_WARS_2,
            DailyAchievementCampaign.HEART_OF_THORNS,
            DailyAchievementCampaign.UNKNOWN,
            DailyAchievementCampaign.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final DailyAchievementCampaign expResult = expResults[index];
                    final DailyAchievementCampaign result = EnumValueFactory.INSTANCE.mapEnumValue(DailyAchievementCampaign.class, value);
                    assertEquals(expResult, result);
                });
    }
}
