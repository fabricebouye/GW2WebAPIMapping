/*
 * Copyright (C) 2015-2019 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.color;

import api.web.gw2.mapping.core.EnumValueFactory;
import api.web.gw2.mapping.v2.colors.ColorCategories;

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
public class ColorUtilsTest {
    public ColorUtilsTest() {
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
     * Test of {@code ColorCategories}.
     */
    @Test
    public void testFindColorCategories() {
        System.out.println("findColorCategories");
        final String[] values = {
                "Blue", // NOI18N.
                "Brown", // NOI18N.
                "Common", // NOI18N.
                "Exclusive", // NOI18N.
                "Gray", // NOI18N.
                "Green", // NOI18N.
                "Leather", // NOI18N.
                "Metal", // NOI18N.
                "Orange", // NOI18N.
                "Purple", // NOI18N.
                "Rare", // NOI18N.
                "Red", // NOI18N.
                "Starter", // NOI18N.
                "Uncommon", // NOI18N.
                "Vibrant", // NOI18N.
                "Yellow", // NOI18N.
                null,
                "" // NOI18N.
        };
        final ColorCategories[] expResults = {
                ColorCategories.BLUE,
                ColorCategories.BROWN,
                ColorCategories.COMMON,
                ColorCategories.EXCLUSIVE,
                ColorCategories.GRAY,
                ColorCategories.GREEN,
                ColorCategories.LEATHER,
                ColorCategories.METAL,
                ColorCategories.ORANGE,
                ColorCategories.PURPLE,
                ColorCategories.RARE,
                ColorCategories.RED,
                ColorCategories.STARTER,
                ColorCategories.UNCOMMON,
                ColorCategories.VIBRANT,
                ColorCategories.YELLOW,
                ColorCategories.UNKNOWN,
                ColorCategories.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final ColorCategories expResult = expResults[index];
                    final ColorCategories result = EnumValueFactory.INSTANCE.mapEnumValue(ColorCategories.class, value);
                    assertEquals(expResult, result);
                });
    }
}
