package com.endava.calculator;

import com.endava.calculator.basic.Basic;
import com.endava.calculator.basic.BasicOperations;
import com.endava.extensions.TestReporterExtension;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;

@ExtendWith(TestReporterExtension.class)

public class CalculatorIT {

    private BasicOperations basic;


    @BeforeAll
    public static void setUpAllTests() {
        System.out.println("Before All");
    }

    @AfterAll
    public static void tearDownAllTests() {
        System.out.println("After All");
    }

    @BeforeEach
    public void setUpEachTest() {
        basic = new Basic();
        System.out.println("Before Each");
    }

    @AfterEach
    public void tearDownEachTest() {
        System.out.println("After Each");
    }


    @Tags({@Tag("smoke"), @Tag("ui")})
    @ParameterizedTest
    @MethodSource("numberProvider")
    public void shouldAddNumbersGivenOperand0(int a, int b) {   //shouldXXXGivenXXXX
        //WHEN - o singura actiune
        Long result = basic.add(a, b);

        //THEN
        System.out.println(result);
    }

    public static List<Arguments> numberProvider() {
        List<Arguments> argumentsList = new ArrayList<>();
        argumentsList.add(Arguments.of(0, 2));
        argumentsList.add(Arguments.of(2, 0));

        return argumentsList;
    }

    @Tag("smoke")
    @Test
    public void shouldAddNegativeNumbers() {
        //WHERE
        Long result = basic.add(-2, -4);

        //THEN
        System.out.println(result);
    }

    @Tags({@Tag("smoke"), @Tag("api")})
    @Test
    public void shouldAddBigNumbers() {
        //WHERE
        Long result = basic.add(Integer.MAX_VALUE, 1);

        //THEN
        System.out.println(result);
    }

    @Test
    public void shouldAddNoOperands() {
        //WHERE
        Long result = basic.add();

        //THEN
        System.out.println(result);
    }

    @Test
    public void shouldAdd1Operands() {
        //WHERE
        Long result = basic.add(167);

        //THEN
        System.out.println(result);
    }

    @ParameterizedTest
    @CsvSource( {"1,2,3", "2,4,5"} )
    @CsvFileSource(resources = "numberSource.csv")
    public void shouldAddMoreThan2Operands(Integer a1, Integer a2, Integer a3) {
        //WHERE
        Long result = basic.add(a1, a2, a3);

        //THEN
        System.out.println(result);
    }
}
