/*
 * Copyright (c) 2015. Philip A Senger
 */

package com.cngrgroup.gofdp.BehavioralPatterns.Strategy.examplefour;

public class test {
    public static void main(String[] args) {
        SortedList students = new SortedList();
        students.add("Phil");
        students.add("Bill");
        students.add("Ted");
        students.add("Bob");
        students.add("Kim");
        students.add("Ned");
        students.add("Sue");
        students.add("Gigi");

        students.setSortStrategy(new MergeSort());
        students.sort();
        students.setSortStrategy(new QuickSort());
        students.sort();
        students.setSortStrategy(new ShellSort());
        students.sort();
    }
}
