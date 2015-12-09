/*
 * Copyright (c) 2015. Philip A Senger
 */

package com.cngrgroup.gofdp.BehavioralPatterns.Observer.exampleone;

public interface IObserver {
    // notify the observer that a change has taken place.
    void sendNotify(String s);
}
