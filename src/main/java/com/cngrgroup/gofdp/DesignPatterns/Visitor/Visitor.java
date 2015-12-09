/*
 * Copyright (c) 2015. Philip A Senger
 */

package com.cngrgroup.gofdp.DesignPatterns.Visitor;

/**
 * Visitor.
 *
 * @author Philip Senger
 * @author <a href="mailto:philip.a.senger@cngrgroup.com">philip.a.senger@cngrgroup.com</a>
 * @version 1.0
 * @date Apr 26, 2006 10:40:26 AM
 * @since SDK1.4
 */
public interface Visitor {
    void visit(Wheel wheel);

    void visit(Engine engine);

    void visit(Body body);

    void visit(Car car);
}
