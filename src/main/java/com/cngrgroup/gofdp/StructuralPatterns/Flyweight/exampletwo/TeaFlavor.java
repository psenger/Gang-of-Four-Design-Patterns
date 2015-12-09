/*
 * Copyright (c) 2015. Philip A Senger
 */

package com.cngrgroup.gofdp.StructuralPatterns.Flyweight.exampletwo;

public class TeaFlavor extends TeaOrder {
    String teaFlavor;

    TeaFlavor(String teaFlavor) {
        this.teaFlavor = teaFlavor;
    }

    public String getFlavor() {
        return this.teaFlavor;
    }

    public void serveTea(TeaOrderContext teaOrderContext) {
        System.out.println("Serving tea flavor " +
                teaFlavor +
                " to table number " +
                teaOrderContext.getTable());
    }
}

