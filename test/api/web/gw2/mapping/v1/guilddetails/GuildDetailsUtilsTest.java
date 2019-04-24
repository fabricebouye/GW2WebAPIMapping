/*
 * Copyright (C) 2015-2019 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v1.guilddetails;

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
public class GuildDetailsUtilsTest {

    public GuildDetailsUtilsTest() {
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
     * Test of GuildDetailsEmblemFlag.
     */
    @Test
    public void testFindGuildDetailsEmblemFlag() {
        System.out.println("findGuildDetailsEmblemFlag"); // NOI18N.
        final String[] values = {
                "FlipBackgroundHorizontal", // NOI18N.
                "FlipBackgroundVertical", // NOI18N.
                "FlipForegroundHorizontal", // NOI18N.
                "FlipForegroundVertical", // NOI18N.
                null,
                "" // NOI18N.
        };
        final GuildDetailsEmblemFlag[] expResults = {
                GuildDetailsEmblemFlag.FLIP_BACKGROUND_HORIZONTAL,
                GuildDetailsEmblemFlag.FLIP_BACKGROUND_VERTICAL,
                GuildDetailsEmblemFlag.FLIP_FOREGROUND_HORIZONTAL,
                GuildDetailsEmblemFlag.FLIP_FOREGROUND_VERTICAL,
                GuildDetailsEmblemFlag.UNKNOWN,
                GuildDetailsEmblemFlag.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final GuildDetailsEmblemFlag expResult = expResults[index];
                    final GuildDetailsEmblemFlag result = EnumValueFactory.INSTANCE.mapEnumValue(GuildDetailsEmblemFlag.class, value);
                    assertEquals(expResult, result);
                });
    }
}
