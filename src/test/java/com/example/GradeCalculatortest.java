package com.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GradeCalculatortest {

    // 1. Test Total
    @Test
    void testTotal() {
        assertEquals(225, GradeCalculator.calculateTotal(75, 68, 82));
    }

    // 2. Test Average
    @Test
    void testAverage() {
        assertEquals(75.0, GradeCalculator.calculateAverage(75, 68, 82));
    }

    // 3. Test Pass
    @Test
    void testPass() {
        assertTrue(GradeCalculator.isPass(75.0));
    }

    // 4. Test Fail
    @Test
    void testFail() {
        assertFalse(GradeCalculator.isPass(35.0));
    }
}
