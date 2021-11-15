package com.example.testdata;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SampleTest {

    @Test
    public void testAssertTrue() {
        boolean threw = false;
        System.out.println("testAssertTrue");
        Assertions.assertTrue(threw);
    }

    @Test
    public void testAssertEquals() {
        System.out.println("testAssertEquals");
        String strTemp1 = "This is a cat.";
        String strTemp2 = "This is a dog.";
        Assertions.assertEquals(strTemp1, strTemp2);
    }

    @Test
    public void printMessage() {
        System.out.println("printMessage");
    }
}
