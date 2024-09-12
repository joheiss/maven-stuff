package com.jovisco;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * JUnit 4 tests
 */
public class App4Test {
    /**
     * Rigourous Test :-)
     */
    @Test
    public void testAll() {
        System.out.println("TEST ALL -- JUnit 4");
        System.out.flush();
        assertTrue(true);
    }

    @Test
    public void testAgain() {
        System.out.println("TEST AGAIN -- JUnit 4");
        System.out.flush();
        assertTrue(true);
    }

    @Test
    public void testHi() {
        var app = new App();
        var result = app.hi();
        assertEquals("Hi Josef, how are you?", result);
    }
}
