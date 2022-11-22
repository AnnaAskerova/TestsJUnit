package com.example.calculator.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;


class CalcServiceParamTest {
    CalcService calcService;

    @BeforeEach
    void setUp() {
        calcService = new CalcService();
    }

    public static Stream<Arguments> provideParamsForSumTests() {
        return Stream.of(
                Arguments.of(1, 1, 2),
                Arguments.of(2, -2, 0),
                Arguments.of(7, 3, 10)
        );
    }

    @ParameterizedTest
    @MethodSource("provideParamsForSumTests")
    void shouldReturnCorrectSum(Integer num1, Integer num2, Integer result) {
        assertEquals(result, calcService.sum(num1, num2));
    }

    public static Stream<Arguments> provideParamsForDifferTests() {
        return Stream.of(
                Arguments.of(1, 1, 0),
                Arguments.of(2, 4, -2),
                Arguments.of(7, 3, 4)
        );
    }

    @ParameterizedTest
    @MethodSource("provideParamsForDifferTests")
    void shouldReturnCorrectDiffer(Integer num1, Integer num2, Integer result) {
        assertEquals(result, calcService.differ(num1, num2));
    }

    public static Stream<Arguments> provideParamsForMultTests() {
        return Stream.of(
                Arguments.of(1, 1, 1),
                Arguments.of(2, -2, -4),
                Arguments.of(7, 3, 21)
        );
    }

    @ParameterizedTest
    @MethodSource("provideParamsForMultTests")
    void shouldReturnCorrectMult(Integer num1, Integer num2, Integer result) {
        assertEquals(result, calcService.mult(num1, num2));
    }

    public static Stream<Arguments> provideParamsForDivisionTests() {
        return Stream.of(
                Arguments.of(1, 1, 1),
                Arguments.of(2, -2, -1),
                Arguments.of(25, 5, 5)
        );
    }

    @ParameterizedTest
    @MethodSource("provideParamsForDivisionTests")
    void shouldReturnCorrectDivide(Integer num1, Integer num2, Integer result) {
        assertEquals(result, calcService.divide(num1, num2));
    }
}