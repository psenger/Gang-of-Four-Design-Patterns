/*
 * Copyright (c) 2015. Philip A Senger
 */

package com.cngrgroup.gofdp.StructuralPatterns.Flyweight.exampleone;

public class MainProgram {

    static public void main(String[] argv) {

        Integer five = new Integer(5);
        Integer myfive = new Integer(5);

        System.out.println(five == myfive);

        String fred = new String("fred");
        String fred1 = new String("fred");

        System.out.println(fred == fred1);
    }
}
