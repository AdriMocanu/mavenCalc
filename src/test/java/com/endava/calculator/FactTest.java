package com.endava.calculator;

import com.endava.calculator.expert.Expert;
import com.endava.calculator.expert.ExpertOperations;
import org.junit.jupiter.api.Test;

public class FactTest {

    @Test
    public void shouldAddNumbersGiven() {
        //GIVEN
        ExpertOperations expert = new Expert();

        //WHERE
        Long result = expert.fact(8);

        //THEN
        System.out.println(result);
    }

    @Test
    public void shouldAddBigNumber() {
        //GIVEN
        ExpertOperations expert = new Expert();

        //WHERE
        Long result = expert.fact(25);

        //THEN
        System.out.println(result);
    }


    @Test
    public void shouldAdd0Number() {
        //GIVEN
        ExpertOperations expert = new Expert();

        //WHERE
        Long result = expert.fact(0);


        //THEN
        System.out.println(result);
    }

}
