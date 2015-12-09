/*
 * Copyright (c) 2015. Philip A Senger
 */

package com.cngrgroup.gofdp.BehavioralPatterns.State;

public class DvdStateNameStars implements DvdStateName {
    int starCount;

    public DvdStateNameStars() {
        starCount = 0;
    }

    public void showName(DvdStateContext dvdStateContext,
                         String nameIn) {
        System.out.println(nameIn.replace(' ', '*'));
        // show stars twice, switch to exclamation point
        if (++starCount > 1) {
            dvdStateContext.setDvdStateName(
                    new DvdStateNameExclaim());
        }
    }
}


