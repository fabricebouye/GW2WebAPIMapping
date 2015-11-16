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
        System.out.println("findTokenInfoPermission");
        final String[] values = {
            "account", // NOI18N.
            "characters", // NOI18N.
            "inventories", // NOI18N.
            "tradingpost", // NOI18N.
            "builds", // NOI18N.
            "unlocks", // NOI18N.
            "pvp", // NOI18N.
            "wallet", // NOI18N.
            "progression", //NOI18N.
            null,
            "" // NOI18N.
        };
        final TokenInfoPermission[] expResults = {
            TokenInfoPermission.ACCOUNT,
            TokenInfoPermission.CHARACTERS,
            TokenInfoPermission.INVENTORIES,
            TokenInfoPermission.TRADINGPOST,
            TokenInfoPermission.BUILDS,
            TokenInfoPermission.UNLOCKS,
            TokenInfoPermission.PVP,
            TokenInfoPermission.WALLET,
            TokenInfoPermission.PROGRESSION,
            TokenInfoPermission.UNKNOWN,
            TokenInfoPermission.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final TokenInfoPermission expResult = expResults[index];
                    final TokenInfoPermission result = TokenInfoUtils.findTokenInfoPermission(value);
                    assertEquals(expResult, result);
                });
    }

}
