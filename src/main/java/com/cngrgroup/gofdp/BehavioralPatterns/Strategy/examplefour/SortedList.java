/*
 * Copyright (c) 2015. Philip A Senger
 */

package com.cngrgroup.gofdp.BehavioralPatterns.Strategy.examplefour;

import java.util.ArrayList;

// Context
public class SortedList {

    private ArrayList list = new ArrayList();
    private SortStrategy sortStrategy;

    public void setSortStrategy(SortStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }

    public void add(String name) {
        list.add(name);
    }

    public void sort() {
        sortStrategy.Sort(list);
    }
}
