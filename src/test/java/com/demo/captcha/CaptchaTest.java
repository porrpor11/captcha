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
}