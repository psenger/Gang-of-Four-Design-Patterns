/*
 * Copyright (c) 2015. Philip A Senger
 */

package com.cngrgroup.gofdp.StructuralPatterns.Facade;

/**
 * Provide a unified interface to a set of interfaces in a subsystem. Facade defines a
 * higher-level interface that makes the subsystem easier to use.
 *
 * @author Philip Senger
 * @author <a href="mailto:philip.a.senger@cngrgroup.com">philip.a.senger@cngrgroup.com</a>
 * @version 1.0
 * @date Nov 6, 2005 6:39:08 PM
 * @since SDK1.3
 */
public class MainProgram {
    public static void main(String[] args) {
        FacadeCuppaMakerFacade cuppaMaker = new FacadeCuppaMakerFacade();
        FacadeTeaCup teaCup = cuppaMaker.makeACuppa();
        System.out.println(teaCup);
    }
}
