/*
 * Copyright (c) 2015. Philip A Senger
 */

package com.cngrgroup.gofdp.BehavioralPatterns.Strategy.exampleone;

public class DvdNameAllCapStrategy extends DvdNameStrategy {
    public String formatDvdName(String dvdName, char charIn) {
        return dvdName.toUpperCase();
    }
}
