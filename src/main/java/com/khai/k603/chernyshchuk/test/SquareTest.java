package com.khai.k603.chernyshchuk.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import com.khai.k603.chernyshchuk.services.impl.Square;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    @DisplayName("Square number")
    void square() {
        Square square = new Square();
        assertEquals(16, square.square(4));
    }
}