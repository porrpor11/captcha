package com.demo.captcha;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CaptchaTest {

    @Test
    public void firstPatternLeftOperandShouldBe1(){
        Captcha captcha = new Captcha();
        Assert.assertEquals("1+One",captcha.toString());
    }
}