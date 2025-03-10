package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DateTimeCheckerTest {


    private final DateTimeChecker dateTimeChecker = new DateTimeChecker();

    @Test
    public void testValidDate_15_6_2023() {
        assertTrue(dateTimeChecker.isValidDate(15, 6, 2023));
    }

    @Test
    public void testValidDate_29_2_2024() {
        assertTrue(dateTimeChecker.isValidDate(29, 2, 2024));
    }

    @Test
    public void testValidDate_31_1_2023() {
        assertTrue(dateTimeChecker.isValidDate(31, 1, 2023));
    }

    @Test
    public void testInvalidDate_31_4_2023() {
        assertFalse(dateTimeChecker.isValidDate(31, 4, 2023));
    }

    @Test
    public void testInvalidDate_30_2_2023() {
        assertFalse(dateTimeChecker.isValidDate(30, 2, 2023));
    }

    @Test
    public void testInvalidDate_29_2_2023() {
        assertFalse(dateTimeChecker.isValidDate(29, 2, 2023));
    }

    @Test
    public void testInvalidDate_32_1_2023() {
        assertFalse(dateTimeChecker.isValidDate(32, 1, 2023));
    }

    @Test
    public void testInvalidDate_15_13_2023() {
        assertFalse(dateTimeChecker.isValidDate(15, 13, 2023));
    }

    @Test
    public void testInvalidDate_15_0_2023() {
        assertFalse(dateTimeChecker.isValidDate(15, 0, 2023));
    }

    @Test
    public void testInvalidDate_NegativeDay() {
        assertFalse(dateTimeChecker.isValidDate(-5, 5, 2023));
    }

    @Test
    public void testInvalidDate_NegativeYear() {
        assertFalse(dateTimeChecker.isValidDate(5, 5, -2023));
    }

    @Test
    public void testInvalidDate_NegativeMonth() {
        assertFalse(dateTimeChecker.isValidDate(5, -5, 2023));
    }

    @Test
    public void testInvalidDate_32_2_2023() {
        assertFalse(dateTimeChecker.isValidDate(32, 2, 2023));
    }

    @Test
    public void testInvalidDate_31_6_2023() {
        assertFalse(dateTimeChecker.isValidDate(31, 6, 2023));
    }
}