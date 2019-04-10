/* 
 * Copyright (C) 2015-2019 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.mailcarriers;

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
public class MailCarriersUtilsTest {

    public MailCarriersUtilsTest() {
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
     * Test of SkinType.
     */
    @Test
    public void testFindMailCarrierFlag() {
        System.out.println("findMailCarrierFlag");
        final String[] values = {
            "Default", // NOI18N.
            null,
            "" // NOI18N.
        };
        final MailCarrierFlag[] expResults = {
            MailCarrierFlag.DEFAULT,
            MailCarrierFlag.UNKNOWN,
            MailCarrierFlag.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final MailCarrierFlag expResult = expResults[index];
                    final MailCarrierFlag result = EnumValueFactory.INSTANCE.mapEnumValue(MailCarrierFlag.class, value);
                    assertEquals(expResult, result);
                });
    }
}
