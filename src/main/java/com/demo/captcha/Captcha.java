package com.demo.captcha;

public class Captcha {

    private int pattern;
    private int leftOperand;
    private int operator;
    private int rightOperand;


    public Captcha(int pattern, int leftOperand, int operator, int rightOperand) {
        this.setPattern(pattern);
        this.setLeftOperand(leftOperand);
        this.setOperator(operator);
        this.setRightOperand(rightOperand);
    }

    @Override
    public String toString(){
        String rightOp;
        if(this.getRightOperand()==1)
            rightOp = "One";
        else  if (this.getRightOperand()==2)
            rightOp = "Two";
        else  //if (this.getRightOperand()==3)
            rightOp = "Three";

        return String.format("%s %s %s",leftOperand,"+",rightOp);
    }
    public String operand

    public int getPattern() {
        return pattern;
    }

    public void setPattern(int pattern) {
        this.pattern = pattern;
    }

    public int getLeftOperand() {
        return leftOperand;
    }

    public void setLeftOperand(int leftOperand) {
        this.leftOperand = leftOperand;
    }

    public int getOperator() {
        return operator;
    }

    public void setOperator(int operator) {
        this.operator = operator;
    }

    public int getRightOperand() {
        return rightOperand;
    }

    public void setRightOperand(int rightOperand) {
        this.rightOperand = rightOperand;
    }
}
