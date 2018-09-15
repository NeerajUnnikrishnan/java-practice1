package com.company;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeCheckerTest {
    PalindromeChecker checker;
    @Before
    public void setUp() throws Exception {
        checker= new PalindromeChecker();
    }

    @After
    public void tearDown() throws Exception {
        checker = null;
    }

    @Test
    public void PalindromeChecker() {
        boolean result = checker.PalindromeCheck(7887);
        assertTrue(result);

    }
    @Test
    public void isEven() {
        boolean result = checker.isEven(2352353);
        assertFalse(result);

    }
}