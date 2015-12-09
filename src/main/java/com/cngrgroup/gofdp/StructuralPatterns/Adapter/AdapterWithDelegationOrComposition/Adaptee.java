/*
 * Copyright (c) 2015. Philip A Senger
 */

package com.cngrgroup.gofdp.StructuralPatterns.Adapter.AdapterWithDelegationOrComposition;

/**
 * Adaptee - Insert comments here.
 * <p/>
 * <a href="Adaptee.java.html"><i>View Source</i></a>
 *
 * @author Philip Senger
 * @author <a href="mailto:philip.a.senger@cngrgroup.com">philip.a.senger@cngrgroup.com</a>
 * @version 1.0
 * @date Nov 6, 2005 3:47:06 PM
 * @since SDK1.3
 */
public class Adaptee {
    public Adaptee() {
    }

    public void specificRequestForThisClass() {
        System.out.println("From Specific Request.");
    }
}
