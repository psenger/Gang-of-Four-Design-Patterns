/*
 * Copyright (c) 2015. Philip A Senger
 */

package com.cngrgroup.gofdp.BehavioralPatterns.Strategy.exampletwo.soups;

import java.util.ArrayList;
import java.util.ListIterator;

public abstract class Soup {
    ArrayList soupIngredients = new ArrayList();
    String soupName;

    public String getSoupName() {
        return soupName;
    }

    public String toString() {
        StringBuffer stringOfIngredients = new StringBuffer(soupName);
        stringOfIngredients.append(" Ingredients: ");
        ListIterator soupIterator = soupIngredients.listIterator();
        while (soupIterator.hasNext()) {
            stringOfIngredients.append((String) soupIterator.next());
        }
        return stringOfIngredients.toString();
    }
}
