package com.endava.calculator;

import com.endava.calculator.expert.Expert;
import com.endava.calculator.expert.ExpertOperations;
import org.junit.jupiter.api.Test;

public class PowTest {

    @Test
    public void shouldAddNumbersGiven() {
        //GIVEN
        ExpertOperations expert = new Expert();

        //WHERE
        Double result = expert.pow(10, 2);

        //THEN
        System.out.println(result);
    }

    @Test
    public void shouldAddNegativeBaseNumber() {
        //GIVEN
        ExpertOperations expert = new Expert();

        //WHERE
        Double result = expert.pow(-2, 2);

        //THEN
        System.out.println(result);
    }

    @Test
    public void shouldAddNegativeExponentNumber() {
        //GIVEN
        ExpertOperations expert = new Expert();

        //WHERE
        Double result = expert.pow(2, -2);

        //THEN
        System.out.println(result);
    }

    @Test
    public void shouldAdd0Base() {
        //GIVEN
        ExpertOperations expert = new Expert();

        //WHERE
        Double result = expert.pow(0, 2);

        //THEN
        System.out.println(result);
    }

    @Test
    public void shouldAdd0Exponent() {
        //GIVEN
        ExpertOperations expert = new Expert();

        //WHERE
        Double result = expert.pow(2, 0);

        //THEN
        System.out.println(result);
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
