/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v1.eventdetails;

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
public class EventDetailsUtilsTest {

    public EventDetailsUtilsTest() {
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
     * Test of EventDetailsFlag.
     */
    @Test
    public void testFindEventDetailsFlag() {
        System.out.println("findEventDetailsFlag");
        final String[] values = {
            "group_event", // NOI18N.
            "map_wide", // NOI18N.
            null,
            "" // NOI18N.
        };
        final EventDetailsFlag[] expResults = {
            EventDetailsFlag.GROUP_EVENT,
            EventDetailsFlag.MAP_WIDE,
            EventDetailsFlag.UNKNOWN,
            EventDetailsFlag.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final EventDetailsFlag expResult = expResults[index];
                    final EventDetailsFlag result = EnumValueFactory.INSTANCE.mapEnumValue(EventDetailsFlag.class, value);
                    assertEquals(expResult, result);
                });
    }

    /**
     * Test of EventDetailsLocationType.
     */
    @Test
    public void testFindEventDetailsLocationType() {
        System.out.println("findEventDetailsLocationType");
        final String[] values = {
            "cylinder", // NOI18N.
            "poly", // NOI18N.
            "sphere", // NOI18N.
            null,
            "" // NOI18N.
        };
        final EventDetailsLocationType[] expResults = {
            EventDetailsLocationType.CYLINDER,
            EventDetailsLocationType.POLY,
            EventDetailsLocationType.SPHERE,
            EventDetailsLocationType.UNKNOWN,
            EventDetailsLocationType.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final EventDetailsLocationType expResult = expResults[index];
                    final EventDetailsLocationType result = EnumValueFactory.INSTANCE.mapEnumValue(EventDetailsLocationType.class, value);
                    assertEquals(expResult, result);
                });
    }

}
