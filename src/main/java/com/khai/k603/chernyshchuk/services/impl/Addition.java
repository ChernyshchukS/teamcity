package com.khai.k603.chernyshchuk.services.impl;

import com.khai.k603.chernyshchuk.services.AdditionService;

public class Addition implements AdditionService {

    @Override
    public double plus(double a, double b) {
        return a + b;
    }
}
