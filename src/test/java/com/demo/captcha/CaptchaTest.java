package com.demo.captcha;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CaptchaTest {

    public CaptchaTest() {
    }

    @Test
    public void firstPatternLeftOperandShouldBe1(){
        Captcha captcha = new Captcha(1,1,1,1);
        Assert.assertEquals("1 + One",captcha.toString());
    }

    @Test
    public void firstPatternLeftOperandShouldBe2(){
        Captcha captcha = new Captcha(1,2,1,1);
        Assert.assertEquals("2 + One",captcha.toString());
    }

    @Test
    public void firstPatternLeftOperandShoouldBe3(){
        Captcha captcha = new Captcha(1,3,1,1);
        Assert.assertEquals("3 + One",captcha.toString());
    }
    @Test
    public void firstPatternRightOperandShouldBeOne(){
        Captcha captcha = new Captcha(1,1,1,1);
        Assert.assertEquals("1 + One",captcha.toString());
    }
    @Test
    public void firstPatternRightOperandShouldBeTwo(){
        Captcha captcha = new Captcha(1,1,1,2);
        Assert.assertEquals("1 + Two",captcha.toString());
    }
    @Test
    public void firstPatternRightOperandShouldBeThree(){
        Captcha captcha = new Captcha(1,1,1,3);
        Assert.assertEquals("1 + Three",captcha.toString());
    }
    @Test
    public void firstStringOperandShouldBeOne(){
        StringOperand stringOperand = new StringOperand(1);
        Assert.assertEquals("One",stringOperand.toString());
    }

}