/*
 * Copyright (c) 2015. Philip A Senger
 */

package com.cngrgroup.gofdp.BehavioralPatterns.Observer.exampleone;

public interface ISubject {
    // tell the subject you are interested in observering it.
    void registerInterest(IObserver IObserver);
}
