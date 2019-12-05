package com.jpm.tdd.app;

public class MathApplication {
    private Calculator calculator;

    public MathApplication(){
        super();
    }
    public MathApplication(Calculator calculator) {
        this.calculator = calculator;
    }

    public int performAddition(int x, int y){
        return calculator.addition(x,y);
    }

    public int performSubstraction(int x, int y){
        return calculator.substraction(x,y);
    }

    public int performMultiplication(int x, int y){
        return calculator.multiplication(x,y);
    }

    public int performDivision(int x, int y){
        return calculator.division(x,y);
    }
}
