/*
 * Copyright (c) 2015. Philip A Senger
 */

package com.cngrgroup.gofdp.BehavioralPatterns.ChainOfResponsibility;

/**
 * Avoid coupling the sender of a request to its receiver by giving more than one object
 * a chance to handle the request. Chain the receiving objects and pass the request along
 * the chain until an object handles it.
 *
 * @author Philip Senger
 * @author <a href="mailto:philip.a.senger@cngrgroup.com">philip.a.senger@cngrgroup.com</a>
 * @version 1.0
 * @date Sep 27, 2005 11:24:47 AM
 * @since SDK1.3
 */
public class MainProgram {
    public static void main(String[] args) {
        Foo foo = new Foo();
        Goo goo = new Goo();
        Too too = new Too();

        foo.addChain(goo);
        goo.addChain(too);
        too.addChain(null);

        System.out.println("Given goo..");
        foo.sendToChain("goo");
        System.out.println("Given foo..");
        foo.sendToChain("foo");
        System.out.println("Given too..");
        foo.sendToChain("too");
    }
}
