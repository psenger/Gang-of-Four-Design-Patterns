/*
 * Copyright (c) 2015. Philip A Senger
 */

package com.cngrgroup.gofdp.DesignPatterns.Visitor;

/**
 * MainProgram
 *
 * @author Philip Senger
 * @author <a href="mailto:philip.a.senger@cngrgroup.com">philip.a.senger@cngrgroup.com</a>
 * @version 1.0
 * @date Apr 26, 2006 10:43:03 AM
 * @since SDK1.3
 */
public class MainProgram {
    public static void main(String[] args) {
        Car car = new Car();
        Visitor visitor = new PrintVisitor();
        car.accept(visitor);
    }
}
