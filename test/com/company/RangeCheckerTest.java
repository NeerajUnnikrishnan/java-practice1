package com.company;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RangeCheckerTest {

    RangeChecker checker;
    @Before
    public void setUp() throws Exception {
         checker = new RangeChecker();
    }

    @After
    public void tearDown() throws Exception {
        checker = null;
    }

    @Test
    public void numCheck() {
        assertEquals("Tom", checker.Check(26));
    }
}