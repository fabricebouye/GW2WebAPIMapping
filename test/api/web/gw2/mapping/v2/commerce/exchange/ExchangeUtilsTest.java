/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.commerce.exchange;

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
public class ExchangeUtilsTest {

    public ExchangeUtilsTest() {
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
     * Test of findExchangeResource method, of class ExchangeUtils.
     */
    @Test
    public void testFindExchangeResource() {
        System.out.println("findExchangeResource");
        final String[] values = {
            "Coins", // NOI18N.
            "Gems", // NOI18N.
            null,
            "" // NOI18N.
        };
        final ExchangeResource[] expResults = {
            ExchangeResource.COINS,
            ExchangeResource.GEMS,
            ExchangeResource.UNKNOWN,
            ExchangeResource.UNKNOWN
        };
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final ExchangeResource expResult = expResults[index];
                    final ExchangeResource result = ExchangeUtils.findExchangeResource(value);
                    assertEquals(expResult, result);
                });
    }

}
