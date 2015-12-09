/*
 * Copyright (c) 2015. Philip A Senger
 */

package com.cngrgroup.gofdp.StructuralPatterns.ProxyAKASurrogate;

/**
 * Subject
 *
 * @author Philip Senger
 * @author <a href="mailto:philip.a.senger@cngrgroup.com">philip.a.senger@cngrgroup.com</a>
 * @version 1.0
 * @date Nov 6, 2005 4:46:39 PM
 * @since SDK1.3
 */
public class SubjectProxy implements ISubject {
    private RealSubject aRealSubject;

    public SubjectProxy() {
        this.aRealSubject = new RealSubject();
    }

    public void read() {
        this.aRealSubject.read();
    }
}
