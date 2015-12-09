/*
 * Copyright (c) 2015. Philip A Senger
 */

package com.cngrgroup.gofdp.BehavioralPatterns.Strategy.exampleone;

public class DvdNameReplaceSpacesStrategy extends DvdNameStrategy {
    public String formatDvdName(String dvdName, char charIn) {
        return dvdName.replace(' ', charIn);
    }
}
