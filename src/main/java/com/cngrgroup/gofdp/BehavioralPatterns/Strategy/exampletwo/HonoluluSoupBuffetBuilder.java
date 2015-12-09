/*
 * Copyright (c) 2015. Philip A Senger
 */

package com.cngrgroup.gofdp.BehavioralPatterns.Strategy.exampletwo;

import com.cngrgroup.gofdp.BehavioralPatterns.Strategy.exampletwo.soups.HonoluluClamChowder;
import com.cngrgroup.gofdp.BehavioralPatterns.Strategy.exampletwo.soups.HonoluluFishChowder;

public class HonoluluSoupBuffetBuilder extends SoupBuffetBuilder {
    public void buildClamChowder() {
        soupBuffet.clamChowder = new HonoluluClamChowder();
    }

    public void buildFishChowder() {
        soupBuffet.fishChowder = new HonoluluFishChowder();
    }

    public void setSoupBuffetName() {
        soupBuffet.soupBuffetName = "Honolulu Soup Buffet";
    }
}

