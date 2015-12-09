/*
 * Copyright (c) 2015. Philip A Senger
 */

package com.cngrgroup.gofdp.StructuralPatterns.Bridge.exampletwo;

public class SuperSizeSoda extends Soda {
    public SuperSizeSoda() {
        setSodaImp();
    }

    public void pourSoda() {
        SodaImp sodaImp = this.getSodaImp();
        for (int i = 0; i < 5; i++) {
            System.out.print("...glug...");
            sodaImp.pourSodaImp();
        }
        System.out.println(" ");
    }
}

