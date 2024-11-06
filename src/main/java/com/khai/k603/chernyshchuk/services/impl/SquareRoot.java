package com.khai.k603.chernyshchuk.services.impl;

import com.khai.k603.chernyshchuk.services.SquareRootService;

public class SquareRoot implements SquareRootService {

    @Override
    public double squareRoot(double a) {
        return Math.sqrt(a);
    }
}
