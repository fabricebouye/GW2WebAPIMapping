/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.achievements;

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
public class AchievementsUtilsTest {

    public AchievementsUtilsTest() {
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
     * Test of findAchievementType method, of class AchievementsUtils.
     */
    @Test
    public void testFindAchievementType() {
        System.out.println("findAchievementType"); // NOI18N.
        final String[] values = {
            "Default", // NOI18N.
            "ItemSet", // NOI18N.
            null,
            "" // NOI18N.
        };
        final AchievementType[] expResults = {
            AchievementType.DEFAULT,
            AchievementType.ITEM_SET,
            AchievementType.UNKNOWN,
            AchievementType.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final AchievementType expResult = expResults[index];
                    final AchievementType result = AchievementsUtils.findAchievementType(value);
                    assertEquals(expResult, result);
                });
    }

    /**
     * Test of findAchievementFlag method, of class AchievementsUtils.
     */
    @Test
    public void testFindAchievementFlag() {
        System.out.println("findAchievementFlag"); // NOI18N.
        final String[] values = {
            "CategoryDisplay", // NOI18N.
            "IgnoreNearlyComplete", // NOI18N.
            "MoveToTop", // NOI18N.
            "Pvp", // NOI18N.
            null,
            "" // NOI18N.
        };
        final AchievementFlag[] expResults = {
            AchievementFlag.CATEGORY_DISPLAY,
            AchievementFlag.IGNORE_NEARLY_COMPLETE,
            AchievementFlag.MOVE_TO_TOP,
            AchievementFlag.PVP,
            AchievementFlag.UNKNOWN,
            AchievementFlag.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final AchievementFlag expResult = expResults[index];
                    final AchievementFlag result = AchievementsUtils.findAchievementFlag(value);
                    assertEquals(expResult, result);
                });
    }

}
