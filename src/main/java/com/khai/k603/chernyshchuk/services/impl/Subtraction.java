package com.khai.k603.chernyshchuk.services.impl;

import com.khai.k603.chernyshchuk.services.SubtractionService;

public class Subtraction implements SubtractionService {

    @Override
    public double minus(double a, double b) {
        return a - b;
    }
}
