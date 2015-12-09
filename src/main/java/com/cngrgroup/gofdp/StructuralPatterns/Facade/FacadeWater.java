/*
 * Copyright (c) 2015. Philip A Senger
 */

package com.cngrgroup.gofdp.StructuralPatterns.Facade;

/**
 * @author Philip Senger
 * @author <a href="mailto:philip.a.senger@cngrgroup.com">philip.a.senger@cngrgroup.com</a>
 * @version 1.0
 * @date Nov 6, 2005 6:33:52 PM
 * @since SDK1.3
 */
public class FacadeWater {
    boolean waterIsBoiling;

    public FacadeWater() {
        setWaterIsBoiling(false);
        System.out.println("behold the wonderous water");
    }

    public void boilFacadeWater() {
        setWaterIsBoiling(true);
        System.out.println("water is boiling");
    }

    public boolean getWaterIsBoiling() {
        return waterIsBoiling;
    }

    public void setWaterIsBoiling(boolean isWaterBoiling) {
        waterIsBoiling = isWaterBoiling;
    }
}
