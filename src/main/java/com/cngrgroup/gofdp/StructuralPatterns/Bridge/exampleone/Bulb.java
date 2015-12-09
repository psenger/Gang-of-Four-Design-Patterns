/*
 * Copyright (c) 2015. Philip A Senger
 */

package com.cngrgroup.gofdp.StructuralPatterns.Bridge.exampleone;

/**
 * Bulb
 *
 * @author Philip Senger
 * @author <a href="mailto:philip.a.senger@cngrgroup.com">philip.a.senger@cngrgroup.com</a>
 * @version 1.0
 * @date Nov 6, 2005 4:13:41 PM
 * @since SDK1.3
 */
public class Bulb implements Switch {
    // Two positions of switch.
    public void switchOn() {
        System.out.println("BULB Switched ON");
    }

    public void switchOff() {
        System.out.println("BULB Switched OFF");
    }
}
