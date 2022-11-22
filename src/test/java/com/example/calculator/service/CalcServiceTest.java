package com.example.calculator.service;

import com.example.calculator.exceptions.IllegalDivisionArgumentException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class CalcServiceTest {
    CalcService calcService;

    @BeforeEach
    void setUp() {
        calcService = new CalcService();
    }

    @Test
    void sumWithoutFirstArgumentReturnIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> calcService.sum(null, 2));
    }

    @Test
    void sumWithoutSecondArgumentReturnIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> calcService.sum(25, null));
    }

    @Test
    void differWithoutFirstArgumentReturnIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> calcService.differ(null, 2));
    }

    @Test
    void differWithoutSecondArgumentReturnIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> calcService.differ(25, null));
    }

    @Test
    void multWithoutFirstArgumentReturnIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> calcService.mult(null, 2));
    }

    @Test
    void multWithoutSecondArgumentReturnIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> calcService.mult(25, null));
    }

    @Test
    void divisionWithoutFirstArgumentReturnIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> calcService.divide(null, 2));
    }

    @Test
    void divisionWithoutSecondArgumentReturnIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> calcService.divide(25, null));
    }

    @Test
    void divisionByZeroReturnIllegalDivisionArgumentException() {
        assertThrows(IllegalDivisionArgumentException.class, () -> calcService.divide(25, 0));
    }
}