/*
 * Copyright (c) 2015. Philip A Senger
 */

package com.cngrgroup.gofdp.CreationalPatterns.Prototype;

/**
 * PlantCell - Insert comments here.
 * <p/>
 * <a href="PlantCell.java.html"><i>View Source</i></a>
 *
 * @author Philip Senger
 * @author <a href="mailto:philip.a.senger@cngrgroup.com">philip.a.senger@cngrgroup.com</a>
 * @version 1.0
 * @date Nov 6, 2005 7:26:21 PM
 * @since SDK1.3
 */
public class PlantCell implements Cloneable {
    public Object split() {
        try {
            return super.clone();
        } catch (Exception e) {
            System.out.println("Exception occured: " + e.getMessage());
            return null;
        }
    }
}
