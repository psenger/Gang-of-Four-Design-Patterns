/*
 * Copyright (c) 2015. Philip A Senger
 */

package com.cngrgroup.gofdp.StructuralPatterns.Flyweight.exampletwo;

public class TeaOrderContext {
    int tableNumber;

    TeaOrderContext(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    public int getTable() {
        return this.tableNumber;
    }
}

