/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.characters.id.inventory;

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
public class CharacterInventoryUtilsTest {

    public CharacterInventoryUtilsTest() {
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
     * Test of InventoryBinding.
     */
    @Test
    public void testFindCharacterInventoryBinding() {
        System.out.println("findCharacterInventoryBinding");
        final String[] values = {
            "Account", // NOI18N.
            "Character", // NOI18N.
            null,
            "" // NOI18N.
        };
        final CharacterInventoryBinding[] expResults = {
            CharacterInventoryBinding.ACCOUNT,
            CharacterInventoryBinding.CHARACTER,
            CharacterInventoryBinding.UNKNOWN,
            CharacterInventoryBinding.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final CharacterInventoryBinding expResult = expResults[index];
                    final CharacterInventoryBinding result = EnumValueFactory.INSTANCE.mapEnumValue(CharacterInventoryBinding.class, value);
                    assertEquals(expResult, result);
                });
    }
}
