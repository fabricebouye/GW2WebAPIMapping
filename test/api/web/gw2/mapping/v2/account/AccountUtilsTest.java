/*
 * Copyright (C) 2015-2019 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.account;

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
public final class AccountUtilsTest {

    public AccountUtilsTest() {
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
     * Test of AccountAccessType.
     */
    @Test
    public void testFindAccountAccessType() {
        System.out.println("findAccountAccessType"); // NOI18N.
        final String[] values = {
                "None", // NOI18N.
                "PlayForFree", // NOI18N.
                "GuildWars2", // NOI18N.
                "HeartOfThorns", // NOI18N.
                "PathOfFire", // NOI18N.
                null,
                "" // NOI18N.
        };
        final AccountAccessType[] expResults = {
                AccountAccessType.NONE,
                AccountAccessType.PLAY_FOR_FREE,
                AccountAccessType.GUILD_WARS_2,
                AccountAccessType.HEART_OF_THORNS,
                AccountAccessType.PATH_OF_FIRE,
                AccountAccessType.UNKNOWN,
                AccountAccessType.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final AccountAccessType expResult = expResults[index];
                    final AccountAccessType result = EnumValueFactory.INSTANCE.mapEnumValue(AccountAccessType.class, value);
                    assertEquals(expResult, result);
                });

    }

}
