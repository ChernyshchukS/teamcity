package com.khai.k603.chernyshchuk.services.impl;

import com.khai.k603.chernyshchuk.services.DivisionService;

public class Division implements DivisionService {

    @Override
    public double divide(double a, double b) {
        System.out.println("Checking for zero");
        if (a == 0 || b == 0) {
            return 0;
        }
        return a / b;
    }
}
