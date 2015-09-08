/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api.web.gw2.mapping.core;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Fabrice
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
        CoinAmount instance = CoinAmount.ofCopper(15704);
        String expResult = "1G57S04C";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of compareTo method, of class CoinAmount.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        CoinAmount o = null;
        CoinAmount instance = null;
        int expResult = 0;
        int result = instance.compareTo(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toCopper method, of class CoinAmount.
     */
    @Test
    public void testToCopper() {
        System.out.println("toCopper");
        CoinAmount instance = null;
        long expResult = 0L;
        long result = instance.toCopper();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toSilver method, of class CoinAmount.
     */
    @Test
    public void testToSilver() {
        System.out.println("toSilver");
        CoinAmount instance = null;
        long expResult = 0L;
        long result = instance.toSilver();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toGold method, of class CoinAmount.
     */
    @Test
    public void testToGold() {
        System.out.println("toGold");
        CoinAmount instance = null;
        long expResult = 0L;
        long result = instance.toGold();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ofCopper method, of class CoinAmount.
     */
    @Test
    public void testOfCopper() {
        System.out.println("ofCopper");
        long amount = 0L;
        CoinAmount expResult = null;
        CoinAmount result = CoinAmount.ofCopper(amount);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ofSilver method, of class CoinAmount.
     */
    @Test
    public void testOfSilver() {
        System.out.println("ofSilver");
        long amount = 0L;
        CoinAmount expResult = null;
        CoinAmount result = CoinAmount.ofSilver(amount);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ofGold method, of class CoinAmount.
     */
    @Test
    public void testOfGold() {
        System.out.println("ofGold");
        long amount = 0L;
        CoinAmount expResult = null;
        CoinAmount result = CoinAmount.ofGold(amount);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dividedBy method, of class CoinAmount.
     */
    @Test
    public void testDividedBy() {
        System.out.println("dividedBy");
        long divisor = 0L;
        CoinAmount instance = null;
        CoinAmount expResult = null;
        CoinAmount result = instance.dividedBy(divisor);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of multiplyBy method, of class CoinAmount.
     */
    @Test
    public void testMultiplyBy() {
        System.out.println("multiplyBy");
        long multiplicand = 0L;
        CoinAmount instance = null;
        CoinAmount expResult = null;
        CoinAmount result = instance.multiplyBy(multiplicand);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of plus method, of class CoinAmount.
     */
    @Test
    public void testPlus() {
        System.out.println("plus");
        CoinAmount amount = null;
        CoinAmount instance = null;
        CoinAmount expResult = null;
        CoinAmount result = instance.plus(amount);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of plusCopper method, of class CoinAmount.
     */
    @Test
    public void testPlusCopper() {
        System.out.println("plusCopper");
        long amount = 0L;
        CoinAmount instance = null;
        CoinAmount expResult = null;
        CoinAmount result = instance.plusCopper(amount);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of plusSilver method, of class CoinAmount.
     */
    @Test
    public void testPlusSilver() {
        System.out.println("plusSilver");
        long amount = 0L;
        CoinAmount instance = null;
        CoinAmount expResult = null;
        CoinAmount result = instance.plusSilver(amount);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of plusGold method, of class CoinAmount.
     */
    @Test
    public void testPlusGold() {
        System.out.println("plusGold");
        long amount = 0L;
        CoinAmount instance = null;
        CoinAmount expResult = null;
        CoinAmount result = instance.plusGold(amount);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of minus method, of class CoinAmount.
     */
    @Test
    public void testMinus() {
        System.out.println("minus");
        CoinAmount amount = null;
        CoinAmount instance = null;
        CoinAmount expResult = null;
        CoinAmount result = instance.minus(amount);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of minusCopper method, of class CoinAmount.
     */
    @Test
    public void testMinusCopper() {
        System.out.println("minusCopper");
        long amount = 0L;
        CoinAmount instance = null;
        CoinAmount expResult = null;
        CoinAmount result = instance.minusCopper(amount);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of minusSilver method, of class CoinAmount.
     */
    @Test
    public void testMinusSilver() {
        System.out.println("minusSilver");
        long amount = 0L;
        CoinAmount instance = null;
        CoinAmount expResult = null;
        CoinAmount result = instance.minusSilver(amount);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of minusGold method, of class CoinAmount.
     */
    @Test
    public void testMinusGold() {
        System.out.println("minusGold");
        long amount = 0L;
        CoinAmount instance = null;
        CoinAmount expResult = null;
        CoinAmount result = instance.minusGold(amount);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
