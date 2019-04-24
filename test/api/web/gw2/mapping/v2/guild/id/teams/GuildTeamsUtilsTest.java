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

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * Unit test.
 *
 * @author Fabrice Bouyé
 */
public final class GuildTeamsUtilsTest {

    public GuildTeamsUtilsTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
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
