package com.github.letsrokk.suites;

import org.junit.Assert;
import org.junit.Test;

import java.util.Calendar;

public class Parallel {

    @Test
    public void test1() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println(Calendar.getInstance().getTime());
        Assert.assertEquals(1, 1);
    }

    @Test
    public void test2() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println(Calendar.getInstance().getTime());
        Assert.assertEquals(1, 1);
    }

    @Test
    public void test3() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println(Calendar.getInstance().getTime());
        Assert.assertEquals(1, 1);
    }
}
