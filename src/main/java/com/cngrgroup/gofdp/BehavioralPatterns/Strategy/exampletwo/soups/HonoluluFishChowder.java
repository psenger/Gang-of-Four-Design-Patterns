/*
 * Copyright (c) 2015. Philip A Senger
 */

package com.cngrgroup.gofdp.BehavioralPatterns.Strategy.exampletwo.soups;

/**
 * HonoluluFishChowder - Insert comments here
 * <p/>
 * <a href="HonoluluFishChowder.java.html"><i>View Source</i></a>
 *
 * @author Philip Senger
 * @author <a href="mailto:philip.a.senger@cngrgroup.com">philip.a.senger@cngrgroup.com</a>
 * @version 1.0
 * @date Jan 18, 2006 8:06:38 PM
 * @since SDK1.3
 */
public class HonoluluFishChowder extends FishChowder {
    public HonoluluFishChowder() {
        soupName = "OpakapakaFishChowder";
        soupIngredients.clear();
        soupIngredients.add("1 Pound Fresh Opakapaka Fish");
        soupIngredients.add("1 cup pineapple chunks");
        soupIngredients.add("1/2 cup coconut milk");
        soupIngredients.add("1/4 cup SPAM");
        soupIngredients.add("1/4 cup taro chips");
    }
}
