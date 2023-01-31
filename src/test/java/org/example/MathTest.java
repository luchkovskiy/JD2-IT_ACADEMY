package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathTest {

    @Test
    void countAverage() {
        Math math = new Math();
        int now = math.countAverage(10,20);
        int expected = 15;
        assertEquals(now,expected);
    }

    @Test
    void minus() {
        Math math = new Math();
        int now = math.minus(5);
        int expected = 5;
        assertEquals(now, expected);
    }
}