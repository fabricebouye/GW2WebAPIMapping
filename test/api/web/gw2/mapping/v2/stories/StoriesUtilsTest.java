/*
 * Copyright (C) 2015-2019 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.stories;

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
public class StoriesUtilsTest {

    public StoriesUtilsTest() {
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
     * Test of TokenInfoPermission.
     */
    @Test
    public void testFindStoryFlag() {
        System.out.println("findStoryFlag");
        final String[] values = {
                "RequiresUnlock", // NOI18N.
                null,
                "" // NOI18N.
        };
        final StoryFlag[] expResults = {
                StoryFlag.REQUIRES_UNLOCK,
                StoryFlag.UNKNOWN,
                StoryFlag.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final StoryFlag expResult = expResults[index];
                    final StoryFlag result = EnumValueFactory.INSTANCE.mapEnumValue(StoryFlag.class, value);
                    assertEquals(expResult, result);
                });
    }

}
