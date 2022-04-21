package com.endava.calculator;

import com.endava.calculator.basic.Basic;
import com.endava.calculator.basic.BasicOperations;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MultiplyTest {

    @Test
    public void shouldAddNumbersGivenOperand() {
        //GIVEN
        BasicOperations basic = new Basic();

        //WHERE
        Long result = basic.multiply(2, 4);

        //THEN
        assertThat(result, is(8L));
        assertThat(result, greaterThan(4L));
        assertThat(result, lessThan(10L));
        assertThat(result, notNullValue());
    }

    @Test
    public void shouldAdd1NegativeNumber() {
        //GIVEN
        BasicOperations basic = new Basic();

        //WHERE
        Long result = basic.multiply(-2, 4);

        //THEN
        assertThat(result, is(-8L));
        assertThat(result, greaterThan(-10L));
        assertThat(result, lessThan(10L));
        assertThat(result, notNullValue());
    }

    @Test
    public void shouldAddBigNumbers() {
        //GIVEN
        BasicOperations basic = new Basic();

        //WHERE
        Long result = basic.multiply(165, 456);

        //THEN
        assertThat(result, is(75240L));
        assertThat(result, greaterThan(100L));
        assertThat(result, lessThan(100000L));
        assertThat(result, notNullValue());
    }

    @Test
    public void shouldAdd0Operand() {

        assertThrows(AssertionError.class, () ->

        {
            //GIVEN
            BasicOperations basic = new Basic();

            //WHERE
            Long result = basic.multiply(5, 0);

            //THEN
            assertThat(result, is(0L));
            assertThat(result, greaterThan(-10L));
            assertThat(result, lessThan(10L));
            assertThat(result, nullValue());
        });
    }

    @Test
    public void shouldAdd1Operands() {
        //GIVEN
        BasicOperations basic = new Basic();

        //WHERE
        Long result = basic.multiply(5);

        //THEN
        assertThat(result, is(5L));
        assertThat(result, greaterThan(-10L));
        assertThat(result, lessThan(10L));
        assertThat(result, notNullValue());

    }

    @Test
    public void shouldAddMoreThan2Operands() {
        //GIVEN
        BasicOperations basic = new Basic();

        //WHERE
        Long result = basic.multiply(5, 2, 5);

        //THEN
        assertThat(result, is(50L));
        assertThat(result, greaterThan(-10L));
        assertThat(result, lessThan(100L));
        assertThat(result, notNullValue());
    }
}
