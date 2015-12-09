/*
 * Copyright (c) 2015. Philip A Senger
 */

package com.cngrgroup.gofdp.StructuralPatterns.Bridge.exampleone;

/**
 * Fan
 *
 * @author Philip Senger
 * @author <a href="mailto:philip.a.senger@cngrgroup.com">philip.a.senger@cngrgroup.com</a>
 * @version 1.0
 * @date Nov 6, 2005 4:13:11 PM
 * @since SDK1.3
 */
public class Fan implements Switch {
    // Two positions of switch.
    public void switchOn() {
        System.out.println("FAN Switched ON");
    }

    public void switchOff() {
        System.out.println("FAN Switched OFF");
    }
}
