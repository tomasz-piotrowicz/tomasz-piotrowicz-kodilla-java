package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {

    @BeforeClass
    public static void writeLog(){
        Logger.getInstance().log("write log using class Logger");
    }

    @Test
    public void testGetLastLog(){
        //Given
        //When
        String logText = Logger.getInstance().getLastLog();
        //Then
        Assert.assertEquals("write log using class Logger", logText);

    }
}
