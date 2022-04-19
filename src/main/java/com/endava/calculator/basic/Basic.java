package com.endava.calculator.basic;

public class Basic implements BasicOperations {

    protected int decimals;

    public Basic() {
    decimals = 10;
    }

    public Basic(int decimals){
        this.decimals = decimals;

    }

    @Override
    public long add(int... no) {   //... = numar variabil de argumente de tip int, se comporta identic ca un int[]
        int sum = 0;  //0 este element neutru pentru adunare
        for (int n : no) {
            sum = sum + n;  //sum+=n;
        }
        return sum;
    }

    @Override
    public int substract(int... no) {
        int result = no[0];
        for (int i = 1; i < no.length; i++) {
            result -= no[i];
        }
        return result;
    }

    //trebuie sa castam a la long si il inmultesc cu b
    @Override
    public long multiply(int... no) {
        long result = 1;
        for (int n : no) {
            result *= n;
        }
        return result;

        //return ((long) a) * b;
    }

    //trebuie sa castam a la double si il impart la b
    @Override
    public double divide(int... no) {
        double result = no[0];
        for (int i = 1; i < no.length; i++) {
            result /= no[i];
        }
        return formatNumber(result);

        //return ((double) a) / b;
    }

    @Override
    public long add(long... no) {
        long sum = 0;
        for (long n : no) {
            sum = sum + n;
        }
        return sum;
    }

    @Override
    public double add(double... no) {
        double sum = 0;
        for (double n : no) {
            sum = sum + n;
        }
        return formatNumber(sum);
    }

    @Override
    public long substract(long... no) {
        long result = no[0];
        for (int i = 1; i < no.length; i++) {
            result -= no[i];
        }
        return result;
    }

    @Override
    public double substract(double... no) {
        double result = no[0];
        for (int i = 1; i < no.length; i++) {
            result -= no[i];
        }
        return formatNumber(result);
    }

    @Override
    public long multiply(long... no) {
        long result = 1;
        for (long n : no) {
            result -= n;
        }
        return result;
    }

    @Override
    public double multiply(double... no) {
        double result = 1;
        for (double n : no) {
            result *= n;
        }
        return formatNumber(result);
    }

    @Override
    public double divide(long... no) {
        double result = no[0];
        for (int i = 1; i < no.length; i++) {
            result /= no[i];
        }
        return formatNumber(result);

        //return ((double) a) / b;
    }

    @Override
    public double divide(double... no) {
        double result = no[0];
        for (int i = 1; i < no.length; i++) {
            result /= no[i];
        }
        return formatNumber(result);
    }

    protected double formatNumber(double n) {
        String s = String.format("%." + decimals + "f", n);  //intoarce 2 zecimale
        return Double.parseDouble(s);
    }
}
