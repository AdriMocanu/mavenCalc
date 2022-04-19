package com.endava.calculator;

import com.endava.calculator.basic.Basic;
import com.endava.calculator.basic.BasicOperations;
import org.junit.jupiter.api.Test;

public class MultiplyTest {

    @Test
    public void shouldAddNumbersGivenOperand() {
        //GIVEN
        BasicOperations basic = new Basic();

        //WHERE
        Long result = basic.multiply(2,4);

        //THEN
        System.out.println(result);
    }

    @Test
    public void shouldAdd1NegativeNumber() {
        //GIVEN
        BasicOperations basic = new Basic();

        //WHERE
        Long result = basic.multiply(-2,4);

        //THEN
        System.out.println(result);
    }

    @Test
    public void shouldAddBigNumbers() {
        //GIVEN
        BasicOperations basic = new Basic();

        //WHERE
        Long result = basic.multiply(165,456);

        //THEN
        System.out.println(result);
    }

    @Test
    public void shouldAdd0Operand() {
        //GIVEN
        BasicOperations basic = new Basic();

        //WHERE
        Long result = basic.multiply(5,0);

        //THEN
        System.out.println(result);
    }

    @Test
    public void shouldAdd1Operands() {
        //GIVEN
        BasicOperations basic = new Basic();

        //WHERE
        Long result = basic.multiply(5);

        //THEN
        System.out.println(result);
    }

    @Test
    public void shouldAddMoreThan2Operands() {
        //GIVEN
        BasicOperations basic = new Basic();

        //WHERE
        Long result = basic.multiply(5, 2, 5);

        //THEN
        System.out.println(result);
    }
}
