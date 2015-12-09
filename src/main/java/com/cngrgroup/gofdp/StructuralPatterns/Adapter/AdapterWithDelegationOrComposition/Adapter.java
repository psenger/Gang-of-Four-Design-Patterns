/*
 * Copyright (c) 2015. Philip A Senger
 */

package com.cngrgroup.gofdp.StructuralPatterns.Adapter.AdapterWithDelegationOrComposition;

/**
 * Adapter - implements the target interface and delegate functionality to the adaptee.
 * <br />
 * Adapters masquerade as one type of object by implementing its interface; they inherit (or delegate) functionality
 * from another class. That way, you can effectively substitute objects (known as Adaptees) for target (Target) objects.
 * <p/>
 * <a href="Adapter.java.html"><i>View Source</i></a>
 *
 * @author Philip Senger
 * @author <a href="mailto:philip.a.senger@cngrgroup.com">philip.a.senger@cngrgroup.com</a>
 * @version 1.0
 * @date Nov 6, 2005 3:42:45 PM
 * @since SDK1.3
 */
public class Adapter implements Target {
    Adaptee aAdaptee;

    public Adapter() {
        aAdaptee = new Adaptee();
    }

    public void request() {
        aAdaptee.specificRequestForThisClass();
    }
}
