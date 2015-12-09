/*
 * Copyright (c) 2015. Philip A Senger
 */

package com.cngrgroup.gofdp.StructuralPatterns.Facade;

/**
 * @author Philip Senger
 * @author <a href="mailto:philip.a.senger@cngrgroup.com">philip.a.senger@cngrgroup.com</a>
 * @version 1.0
 * @date Nov 6, 2005 6:35:58 PM
 * @since SDK1.3
 */
public class FacadeCuppaMakerFacade {
    boolean teaBagIsSteeped;

    public FacadeCuppaMakerFacade() {
        System.out.println("FacadeCuppaMaker ready to make you a cuppa!");
    }

    public FacadeTeaCup makeACuppa() {
        FacadeTeaCup cup = new FacadeTeaCup();
        FacadeTeaBag teaBag = new FacadeTeaBag();
        FacadeWater water = new FacadeWater();
        cup.addFacadeTeaBag(teaBag);
        water.boilFacadeWater();
        cup.addFacadeWater(water);
        cup.steepTeaBag();
        return cup;
    }
}
