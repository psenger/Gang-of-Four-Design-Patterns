/*
 * Copyright (c) 2015. Philip A Senger
 */

package com.cngrgroup.gofdp.DesignPatterns.Visitor;

/**
 * Visitable
 *
 * @author Philip Senger
 * @author <a href="mailto:philip.a.senger@cngrgroup.com">philip.a.senger@cngrgroup.com</a>
 * @version 1.0
 * @date Apr 26, 2006 10:40:48 AM
 * @since SDK1.4
 */
public interface Visitable {
    void accept(Visitor visitor);
}
