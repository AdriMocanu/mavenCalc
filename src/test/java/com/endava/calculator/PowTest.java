package com.endava.calculator;

import com.endava.calculator.expert.Expert;
import com.endava.calculator.expert.ExpertOperations;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class PowTest {

    @Test
    public void shouldAddNumbersGiven() {
        //GIVEN
        ExpertOperations expert = new Expert();

        //WHERE
        Double result = expert.pow(10, 2);

        //THEN
        assertThat(result, is(100D));
        assertThat(result, greaterThan(-10D));
        assertThat(result, lessThan(1000D));
        assertThat(result, notNullValue());
    }

    @Test
    public void shouldAddNegativeBaseNumber() {
        //GIVEN
        ExpertOperations expert = new Expert();

        //WHERE
        Double result = expert.pow(-2, 2);

        //THEN
        assertThat(result, is(4D));
        assertThat(result, greaterThan(-10D));
        assertThat(result, lessThan(10D));
        assertThat(result, notNullValue());
    }

    @Test
    public void shouldAddNegativeExponentNumber() {
        //GIVEN
        ExpertOperations expert = new Expert();

        //WHERE
        Double result = expert.pow(2, -2);

        //THEN
        assertThat(result, is(0.25D));
        assertThat(result, greaterThan(-10D));
        assertThat(result, lessThan(10D));
        assertThat(result, notNullValue());
    }

    @Test
    public void shouldAdd0Base() {
        //GIVEN
        ExpertOperations expert = new Expert();

        //WHERE
        Double result = expert.pow(0, 2);

        //THEN
        assertThat(result, is(0D));
        assertThat(result, greaterThan(-10D));
        assertThat(result, lessThan(10D));
        assertThat(result, notNullValue());
    }

    @Test
    public void shouldAdd0Exponent() {
        //GIVEN
        ExpertOperations expert = new Expert();

        //WHERE
        Double result = expert.pow(2, 0);

        //THEN
        assertThat(result, is(1D));
        assertThat(result, greaterThan(-10D));
        assertThat(result, lessThan(10D));
        assertThat(result, notNullValue());
    }


    @Test
    public void shouldAdd1Exponent() {
        //GIVEN
        ExpertOperations expert = new Expert();

        //WHERE
        Double result = expert.pow(5, 1);

        //THEN
        System.out.println(result);
    }
}
