/*
 * Copyright (c) 2015. Philip A Senger
 */

package com.cngrgroup.gofdp.DesignPatterns.Visitor;

/**
 * Wheel
 *
 * @author Philip Senger
 * @author <a href="mailto:philip.a.senger@cngrgroup.com">philip.a.senger@cngrgroup.com</a>
 * @version 1.0
 * @date Apr 26, 2006 10:41:05 AM
 * @since SDK1.3
 */
public class Wheel implements Visitable {
    private String name;

    Wheel(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}