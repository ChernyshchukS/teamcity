package com.khai.k603.chernyshchuk.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import com.khai.k603.chernyshchuk.services.impl.Addition;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AdditionTest {

    @Test
    @DisplayName("Add two numbers")
    void plus() {
        Addition add = new Addition();
        assertEquals(5, add.plus(2, 3));
    }
}