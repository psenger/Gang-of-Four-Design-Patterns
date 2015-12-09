/*
 * Copyright (c) 2015. Philip A Senger
 */

package com.cngrgroup.gofdp.BehavioralPatterns.Strategy.examplefour;

import java.util.ArrayList;

// ConcreteStrategy
public class ShellSort extends SortStrategy {
    public void Sort(ArrayList list) {
        //list.ShellSort(); not-implemented
        System.out.println("ShellSorted list ");
    }
}
