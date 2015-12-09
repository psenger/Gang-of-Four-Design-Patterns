/*
 * Copyright (c) 2015. Philip A Senger
 */

package com.cngrgroup.gofdp.StructuralPatterns.Bridge.exampletwo;

public class MediumSoda extends Soda {
    public MediumSoda() {
        setSodaImp();
    }

    public void pourSoda() {
        SodaImp sodaImp = this.getSodaImp();
        for (int i = 0; i < 2; i++) {
            System.out.print("...glug...");
            sodaImp.pourSodaImp();
        }
        System.out.println(" ");
    }
}


