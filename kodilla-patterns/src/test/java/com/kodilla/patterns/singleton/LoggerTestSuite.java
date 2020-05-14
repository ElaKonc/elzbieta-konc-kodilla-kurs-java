package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {
    @Test
    public void getLastLogTest(){
        String log1 = "1st log";
        String log2 = "2nd log";
        String log3 = "3rd log";

        Logger.getInstance().log(log1);
        Logger.getInstance().log(log2);
        Logger.getInstance().log(log3);

        Assert.assertEquals(log2, Logger.getInstance().getLastLog());
    }
}
