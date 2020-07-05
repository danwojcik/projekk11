package com.danwo.testing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;

import java.util.logging.LoggingPermission;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator;
    static Logger LOGGER = LoggerFactory.getLogger(CalculatorTest.class);
    @BeforeAll
    static void setupAll(){
        LOGGER.info(() -> "SetupAll launched");
    }

    @BeforeEach
    void setupEach() {
        calculator = new Calculator();
    }

    @Test
    void testAddMethodTrue() {
        //given
        calculator = new Calculator();
        double a = 3.0;
        double b = 5.0;

        //when
        double result = calculator.add(a, b);

        //then
        assertEquals(8.0, result);
        assertThat(result).as("wynik mniejszy niz 9").isGreaterThan(9.0);
    }

    @Test
    void testMinusMethodTrue() {
        //given
        calculator = new Calculator();
        double a = 2.0;
        double b = 3.0;

        //when
        double result = calculator.minus(a, b);

        //then
        assertEquals(-1.0, result);
    }
    @Test
    void testDivMethodTrue(){
        //given

        calculator = new Calculator();
        double a = 3.0;
        double b = 4.0;

        //when
        double result = calculator.div(a, b);

        //then
        assertEquals(15, result);
    }
}
