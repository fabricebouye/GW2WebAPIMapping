/*
 * Copyright (C) 2015-2019 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.commerce.exchange;

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
public class ExchangeUtilsTest {

    public ExchangeUtilsTest() {
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
     * Test of ExchangeResource.
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
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final ExchangeResource expResult = expResults[index];
                    final ExchangeResource result = EnumValueFactory.INSTANCE.mapEnumValue(ExchangeResource.class, value);
                    assertEquals(expResult, result);
                });
    }

}
