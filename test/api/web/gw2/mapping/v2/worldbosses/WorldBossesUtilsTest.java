/*
 * Copyright (C) 2015-2019 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.worldbosses;

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
public class WorldBossesUtilsTest {
    public WorldBossesUtilsTest() {
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
     * Test of {@code WorldBoss}.
     */
    @Test
    public void testFindWorldBoss() {
        System.out.println("testFindWorldBoss");
        final String[] values = {
                "admiral_taidha_covington", // NOI18N.
                "claw_of_jormag", // NOI18N.
                "fire_elemental", // NOI18N.
                "great_jungle_wurm", // NOI18N.
                "inquest_golem_mark_ii", // NOI18N.
                "karka_queen", // NOI18N.
                "megadestroyer", // NOI18N.
                "modniir_ulgoth", // NOI18N.
                "shadow_behemoth", // NOI18N.
                "svanir_shaman_chief", // NOI18N.
                "tequatl_the_sunless", // NOI18N.
                "the_shatterer", // NOI18N.
                "triple_trouble_wurm", // NOI18N.
                null,
                "" // NOI18N.
        };
        final WorldBoss[] expResults = {
                WorldBoss.ADMIRAL_TAIDHA_COVINGTON,
                WorldBoss.CLAW_OF_JORMAG,
                WorldBoss.FIRE_ELEMENTAL,
                WorldBoss.GREAT_JUNGLE_WURM,
                WorldBoss.INQUEST_GOLEM_MARK_II,
                WorldBoss.KARKA_QUEEN,
                WorldBoss.MEGADESTROYER,
                WorldBoss.MODNIRR_ULGOTH,
                WorldBoss.SHADOW_BEHEMOTH,
                WorldBoss.SVANIR_SHAMAN_CHIEF,
                WorldBoss.TEQUATL_THE_SUNLESS,
                WorldBoss.THE_SHATTERER,
                WorldBoss.TRIPLE_TROUBLE_WURM,
                WorldBoss.UNKNOWN,
                WorldBoss.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final WorldBoss expResult = expResults[index];
                    final WorldBoss result = EnumValueFactory.INSTANCE.mapEnumValue(WorldBoss.class, value);
                    assertEquals(expResult, result);
                });
    }

}
