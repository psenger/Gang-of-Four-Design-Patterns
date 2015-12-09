/*
 * Copyright (c) 2015. Philip A Senger
 */

package com.cngrgroup.gofdp.CreationalPatterns.Prototype;

/**
 * CellDivision - Insert comments here.
 * <p/>
 * <a href="CellDivision.java.html"><i>View Source</i></a>
 *
 * @author Philip Senger
 * @author <a href="mailto:philip.a.senger@cngrgroup.com">philip.a.senger@cngrgroup.com</a>
 * @version 1.0
 * @date Nov 6, 2005 7:27:10 PM
 * @since SDK1.3
 */
public class CellDivision {
    public static void main(String[] args) {
        PlantCell cell = new PlantCell();
        PlantCell newPlantCell = (PlantCell) cell.split(); // create a clone
    }
}
