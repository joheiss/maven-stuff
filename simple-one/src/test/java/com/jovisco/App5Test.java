package com.jovisco;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class App5Test {
    /**
     * Rigourous Test :-)
     */
    @Test
    public void testAll() {
        System.out.println("TEST ALL -- JUnit 5");
        System.out.flush();
        assertTrue(true);
    }

    @Test
    public void testAgain() {
        System.out.println("TEST AGAIN -- JUnit 5");
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
