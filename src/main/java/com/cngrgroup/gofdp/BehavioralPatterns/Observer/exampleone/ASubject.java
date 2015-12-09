/*
 * Copyright (c) 2015. Philip A Senger
 */

package com.cngrgroup.gofdp.BehavioralPatterns.Observer.exampleone;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class ASubject implements ISubject {
    String message;
    private List observers = new ArrayList();

    // tell the subject you are interested in observering it.
    public void registerInterest(IObserver IObserver) {
        observers.add(IObserver);
    }

    protected void notifyObservers() {
        for (Iterator iterator = observers.iterator(); iterator.hasNext(); ) {
            IObserver IObserver = (IObserver) iterator.next();
            IObserver.sendNotify(message);
        }
    }
}
