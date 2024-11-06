package com.khai.k603.chernyshchuk.services.impl;

import com.khai.k603.chernyshchuk.services.MultiplicationService;

public class Multiplication implements MultiplicationService {

    @Override
    public double multiply(double a, double b) {
        return a * b;
    }
}
