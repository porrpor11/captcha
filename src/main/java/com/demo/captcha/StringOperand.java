package com.demo.captcha;

public class StringOperand {
    private int strOperand;

    public int getStrOperand() {
        return strOperand;
    }

    public void setStrOperand(int strOperand) {
        this.strOperand = strOperand;
    }

    public StringOperand(int r) {
        this.setStrOperand(r);
    }

    @Override
    public String toString() {
        if(this.strOperand == 1){
            return "One";
        }else if(this.strOperand == 2){
            return "Two";
        }else {
            return "Three";
        }
        return "StringOperand{}";

    }
}
