package com.khai.k603.chernyshchuk.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import com.khai.k603.chernyshchuk.services.impl.Division;

import static org.junit.jupiter.api.Assertions.*;

class DivisionTest {

    @Test
    @DisplayName("Divide two numbers")
    void divide() {
        Division div = new Division();
        assertEquals(1.5, div.divide(3, 2));
    }
}