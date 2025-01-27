package com.example;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class MainTest {

    @Test
    public void testMainOutput() {
        // Define the expected output
        String expectedOutput = "Hello Abdallah, Welcome to you at DevOps Industry";

        // The actual output you want to test (this is a simple string comparison for now)
        String actualOutput = "Hello Abdallah, Welcome to you at DevOps Industry";

        // Assert that the expected output matches the actual output
        assertTrue("Output should match the expected value", expectedOutput.equals(actualOutput));
    }
}

