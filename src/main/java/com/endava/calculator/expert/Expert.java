package com.endava.calculator.expert;

import com.endava.calculator.basic.Basic;

public class Expert extends Basic implements ExpertOperations {

    private String[] operators = {"+", "-", "%", "*", "/", "^"};  //ordinea e de fapt inversa

    public Expert() {
        decimals = 10;
    }

    public Expert(int decimals) {
        this.decimals = decimals;

    }

    @Override
    public double pow(int base, int exponent) {

        double result = 1;
        for (int i = 1; i <= Math.abs(exponent); i++) {    // "Math.abs" = valoare absoluta (-5 -> 5)
            result *= base;
        }
        if (exponent >= 0) {
            return formatNumber(result);
        } else {
            return formatNumber(1 / result);
        }
    }

    @Override
    public double root(int a) {
        return formatNumber(Math.sqrt(a));
    }

    @Override
    public long fact(int n) {
        //n! = 1*2*...*n
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    @Override
    public long factRec(int n) {  //factorial recursiv
        //n! = n*(n-1)!
        if (n == 0) {
            return 1;
        } else if (n > 0) {
            return n * factRec(n - 1);
        } else {                    //if (n<0)
            throw new IllegalArgumentException("You cannot calculate factorial from a negative number");

        }
    }

    @Override
    public double calculate(String s) {
        //s = 2+2;

//        boolean hasOperator = false;
//
//        for (String o : operators) {
//            if (s.contains(o)) {
//                hasOperator = true;
//            }
//        }

        try {
            return Double.parseDouble(s);
        } catch (NumberFormatException e) {
            if (s.contains("(")) {
                int startIndex = s.indexOf("(");
                int endIndex = s.indexOf(")");

                String left = s.substring(0, startIndex);
                String center = s.substring((startIndex + 1), endIndex);
                String right = s.substring(endIndex + 1);

                double result = calculate(center);
                return calculate(left + result + right);

            } else {
                for (String o : operators) {
                    int index = s.lastIndexOf(o);
                    if (index == -1) {
                        continue;
                    }

                    //boolean b = age>18:true:false;  //expresie ternara
                    //double leftOperand = calculate(s.substring(0, index));  //de la 0 la index (fara index)
                    //trim() -> elimina spatiile de dinainte si dupa
                    //charAt() -> returneaza caracterul de la indexul specificat dintr-un string

                    String leftSide = s.substring(0, index);
                    if (index != 0 && (leftSide.trim().charAt(leftSide.trim().length() - 1) == '+' || leftSide.trim().charAt(leftSide.trim().length() - 1) == '-'
                            || leftSide.trim().charAt(leftSide.trim().length() - 1) == '*' || leftSide.trim().charAt(leftSide.trim().length() - 1) == '/'
                            || leftSide.trim().charAt(leftSide.trim().length() - 1) == '^')) {
                        continue;
                    }
                    double leftOperand = index == 0 ? 0.0 : calculate(leftSide);
                    double rightOperand = calculate(s.substring(index + 1)); //de la index pana la final; inclusiv indexul (index e operatorul)

                    switch (o) {
                        case "+":
                            return add(leftOperand, rightOperand);
                        case "-":
                            return substract(leftOperand, rightOperand);
                        case "*":
                            return multiply(leftOperand, rightOperand);
                        case "/":
                            return divide(leftOperand, rightOperand);
                        case "%":
                            return leftOperand % rightOperand;
                        case "^":
                            return pow((int) leftOperand, (int) rightOperand);
                        default:
                            throw new IllegalArgumentException("Invalid operator " + o);
                    }
                }
                throw new RuntimeException("Operator field need to have at least one value");
            }

        }

        //verificam daca este operator
//        if (!hasOperator) {
//            return Double.parseDouble(s);

        //metoda simpla
//        String[] operands = s.split("\\+");       //imparte in stanga si dreapta dupa operator  "\\\\" escapam \\
//        double leftOperand = Double.parseDouble(operands[0]);
//        double rightOperand = Double.parseDouble(operands[1]);
//
//        return leftOperand + rightOperand;

    }
}
