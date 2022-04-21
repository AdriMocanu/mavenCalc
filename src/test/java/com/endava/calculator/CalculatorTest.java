package com.endava.calculator;

import com.endava.calculator.basic.Basic;
import com.endava.calculator.basic.BasicOperations;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;

//@ExtendWith(TestReporterExtension.class)

public class CalculatorTest {

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
        System.out.println("Before Each\n");
    }

    @AfterEach
    public void tearDownEachTest() {
        System.out.println("After Each\n");
    }


    @Tags({@Tag("smoke"), @Tag("ui")})
    @ParameterizedTest
    @MethodSource("numberProvider")
    public void shouldAddNumbersGivenOperand0(int a, int b, Long expected) {   //shouldXXXGivenXXXX

        //WHEN - o singura actiune
        Long result = basic.add(a, b);

        //THEN
        //System.out.println(result);
        assertThat(result, is(expected));
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
        //System.out.println(result);
        assertEquals(-7, result);
        assertTrue(result.equals(-6L));
    }

    @Tags({@Tag("smoke"), @Tag("api")})
    @Test
    @DisplayName("Test that adds a big number as: MAX INT")
    public void shouldAddBigNumbers() {

        assertThrows(AssertionError.class, () -> {

            //WHERE
            Long result = basic.add(Integer.MAX_VALUE, 1);

            //THEN
            //System.out.println(result);
            //assertThat(result, is(Integer.MAX_VALUE + 1L));
            assertThat(result, greaterThan(0L));
            assertThat(result, notNullValue());
        });
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
    @CsvSource({"1,2,3,6", "2,4,5,11"})
    @CsvFileSource(resources = "numberSource.csv")
    public void shouldAddMoreThan2Operands(Integer a1, Integer a2, Integer a3, Long expected) {
        //WHERE
        Long result = basic.add(a1, a2, a3);

        //THEN
        //System.out.println(result);
        assertThat(result, is(expected));

    }
}
