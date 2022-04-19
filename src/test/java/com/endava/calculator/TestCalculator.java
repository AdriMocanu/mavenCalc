package com.endava.calculator;

import com.endava.calculator.basic.Basic;
import com.endava.calculator.basic.BasicOperations;
import com.endava.calculator.expert.Expert;
import com.endava.calculator.expert.ExpertOperations;

public class TestCalculator {
    public static void main(String[] args) {

        BasicOperations b = new Basic(1); //ne facem o instanta

        System.out.println("Add: " + b.add(2, 3, 4, 11));
        System.out.println("Substract: " + b.substract(1.2, 0.8));
        System.out.println("Multiply: " + b.multiply(2.58, -6.5));
        System.out.println("Divide: " + b.divide(1042, 342));
        System.out.println("Divide: " + b.divide(-5, -14));
        System.out.println("=================================");

        ExpertOperations e = new Expert(1);
        System.out.println("Pow: " + e.pow(2, -5));
        System.out.println("Root: " + e.root(4));
        System.out.println("Root: " + e.root(7));
        System.out.println("Fact: " + e.fact(3));
        System.out.println("==================================");

        System.out.println(e.calculate("22.50 + 33.35 + 5 + 8"));
        System.out.println(e.calculate("-3-5*3"));
        System.out.println(e.calculate("2 * (-3 +2)"));
        System.out.println(e.calculate("2 + (-3-5) * (-7-5) "));
        System.out.println(e.calculate("(3+2)/5 * 5 - (8/2)"));
        System.out.println("==================================");

        System.out.println(e.calculate("4^5"));
        System.out.println(e.calculate("5 + (2^3 + 2) / (5-3)"));

    }
}
