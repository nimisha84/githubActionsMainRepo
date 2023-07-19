package com.learn;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    @DisplayName("Dummy Test")
    @Test
    void dummyTest() {
        assertEquals("HI", "HI");
    }
    @DisplayName("Another Dummy Test")
    @Test
    void anotherDummyTest() {
        assertEquals("HI", "HI");
    }
    @DisplayName("Yet Another Dummy Test")
    @Test
    void YetAnotherDummyTest() {
        assertEquals("HI", "HI");
    }
}
