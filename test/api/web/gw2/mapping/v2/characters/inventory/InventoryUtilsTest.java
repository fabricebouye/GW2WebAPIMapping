/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.characters.inventory;

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
public class InventoryUtilsTest {

    public InventoryUtilsTest() {
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
    public void testFindInventoryBinding() {
        System.out.println("findInventoryBinding");
        final String[] values = {
            "Account", // NOI18N.
            "Character", // NOI18N.
            null,
            "" // NOI18N.
        };
        final InventoryBinding[] expResults = {
            InventoryBinding.ACCOUNT,
            InventoryBinding.CHARACTER,
            InventoryBinding.UNKNOWN,
            InventoryBinding.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final InventoryBinding expResult = expResults[index];
                    final InventoryBinding result = EnumValueFactory.INSTANCE.mapEnumValue(InventoryBinding.class, value);
                    assertEquals(expResult, result);
                });
    }
}
