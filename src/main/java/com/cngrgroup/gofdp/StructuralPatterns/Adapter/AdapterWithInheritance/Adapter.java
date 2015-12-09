/*
 * Copyright (c) 2015. Philip A Senger
 */

package com.cngrgroup.gofdp.StructuralPatterns.Adapter.AdapterWithInheritance;

/**
 * Adapter - Implement the target interface and inherit functionality from the adaptee.
 *
 * @author Philip Senger
 * @author <a href="mailto:philip.a.senger@cngrgroup.com">philip.a.senger@cngrgroup.com</a>
 * @version 1.0
 * @date Nov 6, 2005 3:28:52 PM
 * @since SDK1.3
 */
public class Adapter extends Adaptee implements Target {
    public void request() {
        this.specificRequestForThisClass();
    }
}
