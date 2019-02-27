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
        Assert.assertEquals("1+one",captcha.toString());
    }

    @Test
    public void firstPatternLeftOperandShouldBe2(){
        Captcha captcha = new Captcha(1,2,1,1);
        Assert.assertEquals("2+one",captcha.toString());
    }

    @Test
    public void firstPatternLeftOperandShoouldBe3(){
        Captcha captcha = new Captcha(1,3,1,1);
        Assert.assertEquals("3+one",captcha.toString());
    }

}