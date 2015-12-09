/*
 * Copyright (c) 2015. Philip A Senger
 */

package com.cngrgroup.gofdp.StructuralPatterns.Bridge.exampletwo;

public class SodaImpSingleton {
    private static SodaImp sodaImp;

    public SodaImpSingleton(SodaImp sodaImpIn) {
        sodaImp = sodaImpIn;
    }

    public static SodaImp getTheSodaImp() {
        return sodaImp;
    }
}

