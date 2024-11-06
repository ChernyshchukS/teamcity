package com.khai.k603.chernyshchuk.services.impl;

import com.khai.k603.chernyshchuk.services.SquareService;

public class Square implements SquareService {

    @Override
    public double square(double a) {
        return a * a;
    }
}
