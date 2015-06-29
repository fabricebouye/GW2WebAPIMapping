/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.tokeninfo;

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
public class TokenInfoUtilsTest {

    public TokenInfoUtilsTest() {
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
     * Test of findTokenInfoPermission method, of class TokenInfoUtils.
     */
    @Test
    public void testFindTokenInfoPermission() {
        final String[] values = {
            "account", // NOI18N.
            "characters", // NOI18N.
            "tradingpost", // NOI18N.
            null,
            "" // NOI18N.
        };
        final TokenInfoPermission[] expResults = {
            TokenInfoPermission.ACCOUNT,
            TokenInfoPermission.CHARACTERS,
            TokenInfoPermission.TRADINGPOST,
            TokenInfoPermission.UNKNOWN,
            TokenInfoPermission.UNKNOWN
        };
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final TokenInfoPermission expResult = expResults[index];
                    final TokenInfoPermission result = TokenInfoUtils.findTokenInfoPermission(value);
                    assertEquals(expResult, result);
                });
    }

}
