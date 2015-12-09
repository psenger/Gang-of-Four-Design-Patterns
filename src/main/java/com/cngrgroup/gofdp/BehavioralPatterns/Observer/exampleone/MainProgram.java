/*
 * Copyright (c) 2015. Philip A Senger
 */

/**
 *
 **/
package com.cngrgroup.gofdp.BehavioralPatterns.Observer.exampleone;

/**
 * Define a one-to-many dependency between objects so that when one object
 * changes state, all its dependents are notified and updated automatically.
 *
 * @author Philip Senger
 * @author <a href="mailto:philip.a.senger@cngrgroup.com">philip.a.senger@cngrgroup.com</a>
 * @version 1.0
 * @date Nov 4, 2005 2:48:04 PM
 * @since SDK1.3
 */
public class MainProgram {
    public static void main(String[] args) {
        Subject d1 = new Subject();
        Subject d2 = new Subject();

        // this is one of regiserting the Subject with the observers.
        ObserverOne observerOne = new ObserverOne(d1);
        ObserverTwo observerTwo = new ObserverTwo(d1);
        ObserverThree observerThree = new ObserverThree(d1);

        // This is another way...
        d2.registerInterest(observerOne);
        d2.registerInterest(observerTwo);
        d2.registerInterest(observerThree);

        // Running on d1... Now watch what happens...
        d1.setX("Mary");
        d1.setY("Had");
        d1.setZ("A Little Lamb");

        // Running on d2.
        d2.setX("One Potatoe");
        d2.setY("Two Potatoe");
        d2.setZ("Three");
    }
}
