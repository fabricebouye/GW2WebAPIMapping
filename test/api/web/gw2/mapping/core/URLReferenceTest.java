/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api.web.gw2.mapping.core;

import java.net.URL;
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
public class URLReferenceTest {

    public URLReferenceTest() {
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
     * Test of of method, of class URLReference.
     */
    @Test
    public void testOf_URL() {
        System.out.println("of");
        final URL url = null;
        final URLReference expResult = URLReference.EMPTY;
        final URLReference result = URLReference.of(url);
        assertEquals(expResult, result);
    }

    /**
     * Test of of method, of class URLReference.
     */
    @Test
    public void testOf_String() {
        System.out.println("of");
        final String path = null;
        final URLReference expResult = URLReference.EMPTY;
        final URLReference result = URLReference.of(path);
        assertEquals(expResult, result);
    }

    /**
     * Test of empty method, of class URLReference.
     */
    @Test
    public void testEmpty() {
        System.out.println("empty");
        URLReference expResult = URLReference.EMPTY;
        URLReference result = URLReference.empty();
        assertEquals(expResult, result);
    }

    /**
     * Test of ifPresent method, of class URLReference.
     */
    @Test
    public void testIfPresent() {
        System.out.println("ifPresent");
    }

    /**
     * Test of isPresent method, of class URLReference.
     */
    @Test
    public void testIsPresent() {
        System.out.println("isPresent");
        final String values[] = {
            null,
            "http://www.google.com/"
        };
        final boolean[] expResults = {
            false, true
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length)
                .forEach(index -> {
                    final String value = values[index];
                    final URLReference instance = URLReference.of(value);
                    final boolean expResult = expResults[index];
                    final boolean result = instance.isPresent();
                    assertEquals(expResult, result);
                });
    }

    /**
     * Test of get method, of class URLReference.
     */
    @Test
    public void testGet() {
        System.out.println("get");
    }
}
