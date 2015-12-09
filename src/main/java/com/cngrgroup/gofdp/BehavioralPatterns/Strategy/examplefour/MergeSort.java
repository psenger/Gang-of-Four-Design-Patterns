/*
 * Copyright (c) 2015. Philip A Senger
 */

package com.cngrgroup.gofdp.BehavioralPatterns.Strategy.examplefour;

import java.util.ArrayList;

// ConcreteStrategy
public class MergeSort extends SortStrategy {
    public void Sort(ArrayList list) {
        // list.MergeSort(); not-implemented
        System.out.println("MergeSorted list ");
    }
}