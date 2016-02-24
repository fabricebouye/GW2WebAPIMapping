/* 
 * Copyright (C) 2015-2016 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.core;

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
public class CoinAmountTest {

    public CoinAmountTest() {
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
     * Test of toString method, of class CoinAmount.
     */
    @Test
    public void testToString() {
        final CoinAmount instance = CoinAmount.ofCopper(15704);
        final String expResult = "1G57S04C";
        final String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class CoinAmount.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        final CoinAmount instance = CoinAmount.ofCopper(15704);
        final CoinAmount[] values = {
            CoinAmount.ofCopper(0),
            CoinAmount.ofCopper(1),
            CoinAmount.ofCopper(15704),
            CoinAmount.ofCopper(Integer.MAX_VALUE),
            null
        };
        final boolean expResults[] = {
            false,
            false,
            true,
            false,
            false
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length)
                .forEach(index -> {
                    final CoinAmount value = values[index];
                    final boolean expResult = expResults[index];
                    final boolean result = instance.equals(value);
                    assertEquals(expResult, result);
                });
    }

    /**
     * Test of compareTo method, of class CoinAmount.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        final CoinAmount instance = CoinAmount.ofCopper(15704);
        final CoinAmount[] values = {
            CoinAmount.ofCopper(0),
            CoinAmount.ofCopper(1),
            CoinAmount.ofCopper(15704),
            CoinAmount.ofCopper(Integer.MAX_VALUE)
        };
        final int expResults[] = {
            1,
            1,
            0,
            -1
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length)
                .forEach(index -> {
                    final CoinAmount value = values[index];
                    final int expResult = expResults[index];
                    final int result = instance.compareTo(value);
                    assertEquals(expResult, result);
                });
    }

    /**
     * Test of toCopper method, of class CoinAmount.
     */
    @Test
    public void testToCopper() {
        System.out.println("toCopper");
        final CoinAmount[] instances = {
            CoinAmount.ofCopper(0),
            CoinAmount.ofCopper(1),
            CoinAmount.ofCopper(15704),
            CoinAmount.ofCopper(Integer.MAX_VALUE)
        };
        final long expResults[] = {
            0,
            1,
            15704,
            Integer.MAX_VALUE
        };
        assertEquals(instances.length, expResults.length);
        IntStream.range(0, instances.length)
                .forEach(index -> {
                    final CoinAmount values = instances[index];
                    final long expResult = expResults[index];
                    final long result = values.toCopper();
                    assertEquals(expResult, result);
                });
    }

    /**
     * Test of toSilver method, of class CoinAmount.
     */
    @Test
    public void testToSilver() {
        System.out.println("toSilver");
        final CoinAmount[] instances = {
            CoinAmount.ofCopper(0),
            CoinAmount.ofCopper(1),
            CoinAmount.ofCopper(15704),
            CoinAmount.ofCopper(Integer.MAX_VALUE)
        };
        final long expResults[] = {
            0,
            1 / 100L,
            15704 / 100L,
            Integer.MAX_VALUE / 100L
        };
        assertEquals(instances.length, expResults.length);
        IntStream.range(0, instances.length)
                .forEach(index -> {
                    final CoinAmount values = instances[index];
                    final long expResult = expResults[index];
                    final long result = values.toSilver();
                    assertEquals(expResult, result);
                });
    }

    /**
     * Test of toGold method, of class CoinAmount.
     */
    @Test
    public void testToGold() {
        System.out.println("toGold");
        final CoinAmount[] instances = {
            CoinAmount.ofCopper(0),
            CoinAmount.ofCopper(1),
            CoinAmount.ofCopper(15704),
            CoinAmount.ofCopper(Integer.MAX_VALUE)
        };
        final long expResults[] = {
            0,
            1 / 10000L,
            15704 / 10000L,
            Integer.MAX_VALUE / 10000L
        };
        assertEquals(instances.length, expResults.length);
        IntStream.range(0, instances.length)
                .forEach(index -> {
                    final CoinAmount values = instances[index];
                    final long expResult = expResults[index];
                    final long result = values.toGold();
                    assertEquals(expResult, result);
                });
    }

    /**
     * Test of ofCopper method, of class CoinAmount.
     */
    @Test
    public void testOfCopper() {
        System.out.println("ofCopper");
        final CoinAmount[] instances = {
            CoinAmount.ofCopper(0),
            CoinAmount.ofCopper(1),
            CoinAmount.ofCopper(15704),
            CoinAmount.ofCopper(Integer.MAX_VALUE),
            CoinAmount.ofCopper(-1),
            CoinAmount.ofCopper(Integer.MIN_VALUE)
        };
        final long expResults[] = {
            0,
            1,
            15704,
            Integer.MAX_VALUE,
            0,
            0
        };
        assertEquals(instances.length, expResults.length);
        IntStream.range(0, instances.length)
                .forEach(index -> {
                    final CoinAmount values = instances[index];
                    final long expResult = expResults[index];
                    final long result = values.toCopper();
                    assertEquals(expResult, result);
                });
    }

    /**
     * Test of ofSilver method, of class CoinAmount.
     */
    @Test
    public void testOfSilver() {
        System.out.println("ofSilver");
        final CoinAmount[] instances = {
            CoinAmount.ofSilver(0),
            CoinAmount.ofSilver(1),
            CoinAmount.ofSilver(15704),
            CoinAmount.ofSilver(Integer.MAX_VALUE),
            CoinAmount.ofSilver(-1),
            CoinAmount.ofSilver(Integer.MIN_VALUE)
        };
        final long expResults[] = {
            0,
            1 * 100L,
            15704 * 100L,
            Integer.MAX_VALUE * 100L,
            0,
            0
        };
        assertEquals(instances.length, expResults.length);
        IntStream.range(0, instances.length)
                .forEach(index -> {
                    final CoinAmount values = instances[index];
                    final long expResult = expResults[index];
                    final long result = values.toCopper();
                    assertEquals(expResult, result);
                });
    }

    /**
     * Test of ofGold method, of class CoinAmount.
     */
    @Test
    public void testOfGold() {
        System.out.println("ofGold");
        final CoinAmount[] instances = {
            CoinAmount.ofGold(0),
            CoinAmount.ofGold(1),
            CoinAmount.ofGold(15704),
            CoinAmount.ofGold(Integer.MAX_VALUE),
            CoinAmount.ofGold(-1),
            CoinAmount.ofGold(Integer.MIN_VALUE)
        };
        final long expResults[] = {
            0,
            1 * 10000L,
            15704 * 10000L,
            Integer.MAX_VALUE * 10000L,
            0,
            0
        };
        assertEquals(instances.length, expResults.length);
        IntStream.range(0, instances.length)
                .forEach(index -> {
                    final CoinAmount values = instances[index];
                    final long expResult = expResults[index];
                    final long result = values.toCopper();
                    assertEquals(expResult, result);
                });
    }

    /**
     * Test of dividedBy method, of class CoinAmount.
     */
    @Test
    public void testDividedBy() {
        System.out.println("dividedBy");
        final CoinAmount instance = CoinAmount.ofCopper(15704);
        final long[] values = {
            //            0,
            2,
            15704,
            Integer.MAX_VALUE,
            -1,
            Integer.MIN_VALUE
        };
        final CoinAmount[] expResults = {
            //            CoinAmount.ofCopper(0),
            CoinAmount.ofCopper(15704 / (long) 2),
            CoinAmount.ofCopper(15704 / (long) 15704),
            CoinAmount.ofCopper(15704 / (long) Integer.MAX_VALUE),
            CoinAmount.ofCopper(0),
            CoinAmount.ofCopper(0)
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length)
                .forEach(index -> {
                    final long value = values[index];
                    final CoinAmount expResult = expResults[index];
                    final CoinAmount result = instance.dividedBy(value);
                    assertEquals(expResult, result);
                });
    }

    /**
     * Test of multiplyBy method, of class CoinAmount.
     */
    @Test
    public void testMultiplyBy() {
        System.out.println("multiplyBy");
        final CoinAmount instance = CoinAmount.ofCopper(15704);
        final long[] values = {
            0,
            2,
            15704,
            Integer.MAX_VALUE,
            -1,
            Integer.MIN_VALUE
        };
        final CoinAmount[] expResults = {
            CoinAmount.ofCopper(0),
            CoinAmount.ofCopper(15704 * (long) 2),
            CoinAmount.ofCopper(15704 * (long) 15704),
            CoinAmount.ofCopper(15704 * (long) Integer.MAX_VALUE),
            CoinAmount.ofCopper(0),
            CoinAmount.ofCopper(0)
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length)
                .forEach(index -> {
                    final long value = values[index];
                    final CoinAmount expResult = expResults[index];
                    final CoinAmount result = instance.multiplyBy(value);
                    assertEquals(expResult, result);
                });
    }

    /**
     * Test of plus method, of class CoinAmount.
     */
    @Test
    public void testPlus() {
        System.out.println("plus");
        final CoinAmount instance = CoinAmount.ofCopper(15704);
        final CoinAmount[] values = {
            CoinAmount.ofCopper(0),
            CoinAmount.ofCopper(2),
            CoinAmount.ofCopper(15704),
            CoinAmount.ofCopper(Integer.MAX_VALUE),
            CoinAmount.ofCopper(-1),
            CoinAmount.ofCopper(Integer.MIN_VALUE)
        };
        final CoinAmount[] expResults = {
            CoinAmount.ofCopper(15704 + 0),
            CoinAmount.ofCopper(15704 + 2),
            CoinAmount.ofCopper(15704 + 15704),
            CoinAmount.ofCopper(15704 + (long) Integer.MAX_VALUE),
            CoinAmount.ofCopper(15704 + 0),
            CoinAmount.ofCopper(15704 + 0)
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length)
                .forEach(index -> {
                    final CoinAmount value = values[index];
                    final CoinAmount expResult = expResults[index];
                    final CoinAmount result = instance.plus(value);
                    assertEquals(expResult, result);
                });
    }

    /**
     * Test of plusCopper method, of class CoinAmount.
     */
    @Test
    public void testPlusCopper() {
        System.out.println("plusCopper");
        final CoinAmount instance = CoinAmount.ofCopper(15704);
        final long[] values = {
            0,
            2,
            15704,
            Integer.MAX_VALUE,
            -1,
            Integer.MIN_VALUE
        };
        final CoinAmount[] expResults = {
            CoinAmount.ofCopper(15704 + 0),
            CoinAmount.ofCopper(15704 + 2),
            CoinAmount.ofCopper(15704 + 15704),
            CoinAmount.ofCopper(15704 + (long) Integer.MAX_VALUE),
            CoinAmount.ofCopper(15704 - 1),
            CoinAmount.ofCopper(0)
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length)
                .forEach(index -> {
                    final long value = values[index];
                    final CoinAmount expResult = expResults[index];
                    final CoinAmount result = instance.plusCopper(value);
                    assertEquals(expResult, result);
                });
    }

    /**
     * Test of plusSilver method, of class CoinAmount.
     */
    @Test
    public void testPlusSilver() {
        System.out.println("plusSilver");
        final CoinAmount instance = CoinAmount.ofCopper(15704);
        final long[] values = {
            0,
            2,
            15704,
            Integer.MAX_VALUE,
            -1,
            Integer.MIN_VALUE
        };
        final CoinAmount[] expResults = {
            CoinAmount.ofCopper(15704 + 0),
            CoinAmount.ofCopper(15704 + 2 * 100L),
            CoinAmount.ofCopper(15704 + 15704 * 100L),
            CoinAmount.ofCopper(15704 + Integer.MAX_VALUE * 100L),
            CoinAmount.ofCopper(15704 - 1 * 100L),
            CoinAmount.ofCopper(0)
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length)
                .forEach(index -> {
                    final long value = values[index];
                    final CoinAmount expResult = expResults[index];
                    final CoinAmount result = instance.plusSilver(value);
                    assertEquals(expResult, result);
                });
    }

    /**
     * Test of plusGold method, of class CoinAmount.
     */
    @Test
    public void testPlusGold() {
        System.out.println("plusGold");
        final CoinAmount instance = CoinAmount.ofCopper(15704);
        final long[] values = {
            0,
            2,
            15704,
            Integer.MAX_VALUE,
            -1,
            Integer.MIN_VALUE
        };
        final CoinAmount[] expResults = {
            CoinAmount.ofCopper(15704 + 0),
            CoinAmount.ofCopper(15704 + 2 * 10000L),
            CoinAmount.ofCopper(15704 + 15704 * 10000L),
            CoinAmount.ofCopper(15704 + Integer.MAX_VALUE * 10000L),
            CoinAmount.ofCopper(15704 - 1 * 10000L),
            CoinAmount.ofCopper(0)
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length)
                .forEach(index -> {
                    final long value = values[index];
                    final CoinAmount expResult = expResults[index];
                    final CoinAmount result = instance.plusGold(value);
                    assertEquals(expResult, result);
                });
    }

    /**
     * Test of minus method, of class CoinAmount.
     */
    @Test
    public void testMinus() {
        System.out.println("minus");
        final CoinAmount instance = CoinAmount.ofCopper(15704);
        final CoinAmount[] values = {
            CoinAmount.ofCopper(0),
            CoinAmount.ofCopper(2),
            CoinAmount.ofCopper(15704),
            CoinAmount.ofCopper(Integer.MAX_VALUE),
            CoinAmount.ofCopper(-1),
            CoinAmount.ofCopper(Integer.MIN_VALUE)
        };
        final CoinAmount[] expResults = {
            CoinAmount.ofCopper(15704),
            CoinAmount.ofCopper(15704 - 2),
            CoinAmount.ofCopper(0),
            CoinAmount.ofCopper(0),
            CoinAmount.ofCopper(15704),
            CoinAmount.ofCopper(15704)
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length)
                .forEach(index -> {
                    final CoinAmount value = values[index];
                    final CoinAmount expResult = expResults[index];
                    final CoinAmount result = instance.minus(value);
                    assertEquals(expResult, result);
                });
    }

    /**
     * Test of minusCopper method, of class CoinAmount.
     */
    @Test
    public void testMinusCopper() {
        System.out.println("minusCopper");
        final CoinAmount instance = CoinAmount.ofCopper(15704);
        final long[] values = {
            0,
            2,
            15704,
            Integer.MAX_VALUE,
            -1,
            Integer.MIN_VALUE
        };
        final CoinAmount[] expResults = {
            CoinAmount.ofCopper(15704),
            CoinAmount.ofCopper(15704 - 2),
            CoinAmount.ofCopper(15704 - 15704),
            CoinAmount.ofCopper(15704 - (long) Integer.MAX_VALUE),
            CoinAmount.ofCopper(15704 - -1),
            CoinAmount.ofCopper(15704 - (long) Integer.MIN_VALUE)
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length)
                .forEach(index -> {
                    final long value = values[index];
                    final CoinAmount expResult = expResults[index];
                    final CoinAmount result = instance.minusCopper(value);
                });
    }

    /**
     * Test of minusSilver method, of class CoinAmount.
     */
    @Test
    public void testMinusSilver() {
        System.out.println("minusSilver");
        final CoinAmount instance = CoinAmount.ofCopper(15704);
        final long[] values = {
            0,
            2,
            15704,
            Integer.MAX_VALUE,
            -1,
            Integer.MIN_VALUE
        };
        final CoinAmount[] expResults = {
            CoinAmount.ofCopper(15704),
            CoinAmount.ofCopper(15704 - 2 * 100L),
            CoinAmount.ofCopper(15704 - 15704 * 100L),
            CoinAmount.ofCopper(15704 - Integer.MAX_VALUE * 100L),
            CoinAmount.ofCopper(15704 - -1 * 100L),
            CoinAmount.ofCopper(15704 - Integer.MIN_VALUE * 100L)
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length)
                .forEach(index -> {
                    final long value = values[index];
                    final CoinAmount expResult = expResults[index];
                    final CoinAmount result = instance.minusSilver(value);
                    assertEquals(expResult, result);
                });
    }

    /**
     * Test of minusGold method, of class CoinAmount.
     */
    @Test
    public void testMinusGold() {
        System.out.println("minusGold");
        final CoinAmount instance = CoinAmount.ofCopper(15704);
        final long[] values = {
            0,
            2,
            15704,
            Integer.MAX_VALUE,
            -1,
            Integer.MIN_VALUE
        };
        final CoinAmount[] expResults = {
            CoinAmount.ofCopper(15704),
            CoinAmount.ofCopper(15704 - 2 * 10000L),
            CoinAmount.ofCopper(15704 - 15704 * 10000L),
            CoinAmount.ofCopper(15704 - Integer.MAX_VALUE * 10000L),
            CoinAmount.ofCopper(15704 - -1 * 10000L),
            CoinAmount.ofCopper(15704 - Integer.MIN_VALUE * 10000L)
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length)
                .forEach(index -> {
                    final long value = values[index];
                    final CoinAmount expResult = expResults[index];
                    final CoinAmount result = instance.minusGold(value);
                    assertEquals(expResult, result);
                });
    }
}
