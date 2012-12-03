package com.thoughtworks.mvn;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class CoverageTest {
    @Test
    public void fakeIntegrationTest(){
        Coverage coverage = new Coverage();
        String methodName = "method";
        String output = coverage.output(methodName);
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        assertEquals("Coverage for " + methodName, output);
    }
}
