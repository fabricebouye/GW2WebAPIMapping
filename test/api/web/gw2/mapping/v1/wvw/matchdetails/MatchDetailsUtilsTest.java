/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api.web.gw2.mapping.v1.wvw.matchdetails;

import java.util.stream.IntStream;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author FabriceB
 */
public class MatchDetailsUtilsTest {

    public MatchDetailsUtilsTest() {
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
     * Test of findMatchDetailsMapType method, of class MatchDetailsUtils.
     */
    @Test
    public void testFindMatchDetailsMapType() {
        System.out.println("findMatchDetailsMapType");
        final String[] values = {
            "BlueHome", // NOI18N.
            "Center", // NOI18N.
            "GreenHome", // NOI18N.
            "RedHome", // NOI18N.
            null,
            "" // NOI18N.
        };
        final MatchDetailsMapType[] expResults = {
            MatchDetailsMapType.BLUE_HOME,
            MatchDetailsMapType.CENTER,
            MatchDetailsMapType.GREEN_HOME,
            MatchDetailsMapType.RED_HOME,
            MatchDetailsMapType.UNKNOWN,
            MatchDetailsMapType.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final MatchDetailsMapType expResult = expResults[index];
                    final MatchDetailsMapType result = MatchDetailsUtils.findMatchDetailsMapType(value);
                    assertEquals(expResult, result);
                });
    }

    /**
     * Test of findMatchDetailsBonusOwner method, of class MatchDetailsUtils.
     */
    @Test
    public void testFindMatchDetailsBonusOwner() {
        System.out.println("findMatchDetailsBonusOwner");
        final String[] values = {
            "Blue", // NOI18N.
            "Green", // NOI18N.
            "Red", // NOI18N.
            null,
            "" // NOI18N.
        };
        final MatchDetailsBonusOwner[] expResults = {
            MatchDetailsBonusOwner.BLUE,
            MatchDetailsBonusOwner.GREEN,
            MatchDetailsBonusOwner.RED,
            MatchDetailsBonusOwner.UNKNOWN,
            MatchDetailsBonusOwner.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final MatchDetailsBonusOwner expResult = expResults[index];
                    final MatchDetailsBonusOwner result = MatchDetailsUtils.findMatchDetailsBonusOwner(value);
                    assertEquals(expResult, result);
                });
    }

    /**
     * Test of findMatchDetailsObjectiveOwner method, of class MatchDetailsUtils.
     */
    @Test
    public void testFindMatchDetailsObjectiveOwner() {
        System.out.println("findMatchDetailsObjectiveOwner");
                final String[] values = {
            "Blue", // NOI18N.
            "Green", // NOI18N.
            "Neutral", // NOI18N.
            "Red", // NOI18N.
            null,
            "" // NOI18N.
        };
        final MatchDetailsObjectiveOwner[] expResults = {
            MatchDetailsObjectiveOwner.BLUE,
            MatchDetailsObjectiveOwner.GREEN,
            MatchDetailsObjectiveOwner.NEUTRAL,
            MatchDetailsObjectiveOwner.RED,
            MatchDetailsObjectiveOwner.UNKNOWN,
            MatchDetailsObjectiveOwner.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final MatchDetailsObjectiveOwner expResult = expResults[index];
                    final MatchDetailsObjectiveOwner result = MatchDetailsUtils.findMatchDetailsObjectiveOwner(value);
                    assertEquals(expResult, result);
                });

    }

}
