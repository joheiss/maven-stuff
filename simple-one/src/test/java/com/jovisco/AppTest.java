package com.jovisco;

import org.testng.annotations.Test;

/**
 * JUnit 4 tests
 */
public class AppTest {
    /**
     * Rigourous Test :-)
     */
    @Test
    public void testAll() {
        System.out.println("TEST ALL -- TestNG");
        System.out.flush();
    }

    @Test
    public void testAgain() {
        System.out.println("TEST AGAIN -- TestNG");
        System.out.flush();
    }

    @Test
    public void testHi() {
        var app = new App();
        var result = app.hi();
        assert "Hi Josef, how are you?".equals(result);
    }
}
