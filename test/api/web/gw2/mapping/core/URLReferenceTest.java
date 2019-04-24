/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api.web.gw2.mapping.core;

import java.net.URL;
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
public class URLReferenceTest {

    public URLReferenceTest() {
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
     * Test of of method, of class URLReference.
     */
    @Test
    public void testOf_URL() {
        System.out.println("of");
        final URL url = null;
        final URLReference expResult = URLReference.empty();
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
        final URLReference expResult = URLReference.empty();
        final URLReference result = URLReference.of(path);
        assertEquals(expResult, result);
    }

    /**
     * Test of empty method, of class URLReference.
     */
    @Test
    public void testEmpty() {
        System.out.println("empty");
        final URLReference instance = URLReference.empty();
        final boolean expResult = false;
        final boolean result = instance.isPresent();
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
        final String[] values = {
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
