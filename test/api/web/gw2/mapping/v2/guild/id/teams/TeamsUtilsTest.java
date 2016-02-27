/* 
 * Copyright (C) 2015-2016 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.guild.id.teams;

import api.web.gw2.mapping.v2.guild.id.log.*;
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
public final class TeamsUtilsTest {

    public TeamsUtilsTest() {
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
     * Test of TeamMemberRole.
     */
    @Test
    public void testFindTeamMemberRole() {
        System.out.println("findTeamMemberRole");
        final String[] values = {
            "Captain", // NOI18N.
            "Member", // NOI18N.
            null,
            "" // NOI18N.
        };
        final TeamMemberRole[] expResults = {
            TeamMemberRole.CAPTAIN,
            TeamMemberRole.MEMBER,
            TeamMemberRole.UNKNOWN,
            TeamMemberRole.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final TeamMemberRole expResult = expResults[index];
                    final TeamMemberRole result = EnumValueFactory.INSTANCE.mapEnumValue(TeamMemberRole.class, value);
                    assertEquals(expResult, result);
                });
    }

    /**
     * Test of TeamState.
     */
    @Test
    public void testFindTeamState() {
        System.out.println("findTeamState");
        final String[] values = {
            "Active", // NOI18N.
            null,
            "" // NOI18N.
        };
        final TeamState[] expResults = {
            TeamState.ACTIVE,
            TeamState.UNKNOWN,
            TeamState.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final TeamState expResult = expResults[index];
                    final TeamState result = EnumValueFactory.INSTANCE.mapEnumValue(TeamState.class, value);
                    assertEquals(expResult, result);
                });
    }
}
