/* 
 * Copyright (C) 2015-2019 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.guild.id.teams;

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
public final class GuildTeamsUtilsTest {

    public GuildTeamsUtilsTest() {
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
     * Test of GuildTeamMemberRole.
     */
    @Test
    public void testFindGuildTeamMemberRole() {
        System.out.println("findGuildTeamMemberRole");
        final String[] values = {
            "Captain", // NOI18N.
            "Member", // NOI18N.
            null,
            "" // NOI18N.
        };
        final GuildTeamMemberRole[] expResults = {
            GuildTeamMemberRole.CAPTAIN,
            GuildTeamMemberRole.MEMBER,
            GuildTeamMemberRole.UNKNOWN,
            GuildTeamMemberRole.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final GuildTeamMemberRole expResult = expResults[index];
                    final GuildTeamMemberRole result = EnumValueFactory.INSTANCE.mapEnumValue(GuildTeamMemberRole.class, value);
                    assertEquals(expResult, result);
                });
    }

    /**
     * Test of GuildTeamState.
     */
    @Test
    public void testFindGuildTeamState() {
        System.out.println("findGuildTeamState");
        final String[] values = {
            "Active", // NOI18N.
            null,
            "" // NOI18N.
        };
        final GuildTeamState[] expResults = {
            GuildTeamState.ACTIVE,
            GuildTeamState.UNKNOWN,
            GuildTeamState.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final GuildTeamState expResult = expResults[index];
                    final GuildTeamState result = EnumValueFactory.INSTANCE.mapEnumValue(GuildTeamState.class, value);
                    assertEquals(expResult, result);
                });
    }
}
