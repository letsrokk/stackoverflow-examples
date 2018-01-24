package com.github.letsrokk;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Calendar;

public class TestClass {

    @Test
    public void test1() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println(Calendar.getInstance().getTime());
        Assert.assertEquals(1, 1);
    }

    @Test
    public void test2() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println(Calendar.getInstance().getTime());
        Assert.assertEquals(1, 1);
    }

    @Test
    public void test3() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println(Calendar.getInstance().getTime());
        Assert.assertEquals(1, 1);
    }

}
