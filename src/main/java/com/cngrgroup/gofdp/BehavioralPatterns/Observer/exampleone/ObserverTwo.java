/*
 * Copyright (c) 2015. Philip A Senger
 */

package com.cngrgroup.gofdp.BehavioralPatterns.Observer.exampleone;

public class ObserverTwo implements IObserver {

    public ObserverTwo(ISubject s) {
        s.registerInterest(this);
    }

    // notify the observer that a change has taken place.
    public void sendNotify(String s) {
        System.out.println("Goo: Awoke on notify.S = " + s);
    }
}
