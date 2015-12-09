/*
 * Copyright (c) 2015. Philip A Senger
 */

package com.cngrgroup.gofdp.StructuralPatterns.Bridge.exampleone;

/**
 * Switch - The Bridge Pattern is used to separate out the interface from its implementation.
 * Doing this gives the flexibility so that both can vary independently.
 *
 * @author Philip Senger
 * @author <a href="mailto:philip.a.senger@cngrgroup.com">philip.a.senger@cngrgroup.com</a>
 * @version 1.0
 * @date Nov 6, 2005 4:12:38 PM
 * @since SDK1.3
 */
public interface Switch {
    void switchOn();

    void switchOff();
}
