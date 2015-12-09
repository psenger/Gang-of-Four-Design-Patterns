/*
 * Copyright (c) 2015. Philip A Senger
 */

package com.cngrgroup.gofdp.BehavioralPatterns.Strategy.examplefour;

import java.util.ArrayList;

// ConcreteStrategy
public class QuickSort extends SortStrategy {
    public void Sort(ArrayList list) {
        // list.Quick(); // Default is Quicksort
        System.out.println("QuickSorted list ");
    }
}