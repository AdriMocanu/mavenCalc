package com.endava.calculator;

import com.endava.calculator.expert.Expert;
import com.endava.calculator.expert.ExpertOperations;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class FactTest {

    @Test
    public void shouldAddNumbersGiven() {
        //GIVEN
        ExpertOperations expert = new Expert();

        //WHERE
        Long result = expert.fact(8);

        //THEN
        assertThat(result, is(40320L));
        assertThat(result, greaterThan(-100L));
        assertThat(result, lessThan(100000L));
        assertThat(result, notNullValue());
    }

    @Test
    public void shouldAddBigNumber() {
        //GIVEN
        ExpertOperations expert = new Expert();

        //WHERE
        Long result = expert.fact(25);

        //THEN
        assertThat(result, is(7034535277573963776L));
        assertThat(result, greaterThan(-100L));
        assertThat(result, notNullValue());
    }


    @Test
    public void shouldAdd0Number() {
        //GIVEN
        ExpertOperations expert = new Expert();

        //WHERE
        Long result = expert.fact(0);

        //THEN
        assertThat(result, is(1L));
        assertThat(result, greaterThan(-100L));
        assertThat(result, lessThan(10L));
        assertThat(result, notNullValue());
    }

}
