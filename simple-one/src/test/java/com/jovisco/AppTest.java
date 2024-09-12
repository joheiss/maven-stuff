package com.jovisco;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigourous Test :-)
     */
    @Test
    public void testAll() {
        System.out.println("TEST ALL");
        System.out.flush();
        assertTrue(true);
    }

    @Test
    public void testAgain() {
        System.out.println("TEST AGAIN");
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
