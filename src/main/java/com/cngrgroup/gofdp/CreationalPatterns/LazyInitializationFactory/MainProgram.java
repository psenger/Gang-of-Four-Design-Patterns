/*
 * Copyright (c) 2015. Philip A Senger
 */

package com.cngrgroup.gofdp.CreationalPatterns.LazyInitializationFactory;

import java.util.Iterator;

/**
 * MainProgram - Insert comments here.
 * <p/>
 * <a href="MainProgram.java.html"><i>View Source</i></a>
 *
 * @author Philip Senger
 * @author <a href="mailto:philip.a.senger@cngrgroup.com">philip.a.senger@cngrgroup.com</a>
 * @version 1.0
 * @date Nov 15, 2005 1:16:03 PM
 * @since SDK1.3
 */
public class MainProgram {
    public static void main(String[] args) {
        Iterator it = FruitTypes.iterator();
        while (it.hasNext()) {
            System.out.println("==========================================");
            FruitTypes fruitType = (FruitTypes) it.next();
            Fruit fruit = Fruit.getFruit(fruitType);
            System.out.println(">>--------------------------------------");
            fruit.count();
            System.out.println(">>--------------------------------------");
            Fruit fruit2 = Fruit.getFruit(fruitType);
            fruit2.count();
        }
    }
}
