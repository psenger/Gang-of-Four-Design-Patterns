/*
 * Copyright (c) 2015. Philip A Senger
 */

package com.cngrgroup.gofdp.BehavioralPatterns.Observer.exampleone;

public class ObserverThree implements IObserver {

    public ObserverThree(ISubject s) {
        s.registerInterest(this);
    }

    // notify the observer that a change has taken place.
    public void sendNotify(String s) {
        System.out.println("Too: Awoke on notify.S = " + s);
    }
}
