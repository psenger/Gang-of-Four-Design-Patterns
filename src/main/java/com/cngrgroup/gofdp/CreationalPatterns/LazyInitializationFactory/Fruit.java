/*
 * Copyright (c) 2015. Philip A Senger
 */

package com.cngrgroup.gofdp.CreationalPatterns.LazyInitializationFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * In a software design pattern view, lazy initialization is often used together with a factory method pattern. This combines three ideas:
 * <ul>
 * <li>using a factory method to get instances of a class (factory method pattern)
 * <li>storing the instances in a map, so you get the same instance the next time you ask for an instance with some parameter (compare with a singleton pattern)
 * <li>using lazy initialization to instantiate the object the first time it is requested (lazy initialization pattern)
 * </ul>
 * <p/>
 * <a href="Fruit.java.html"><i>View Source</i></a>
 *
 * @author Philip Senger
 * @author <a href="mailto:philip.a.senger@cngrgroup.com">philip.a.senger@cngrgroup.com</a>
 * @version 1.0
 * @date Nov 15, 2005 1:10:38 PM
 * @since SDK1.3
 */
public class Fruit {
    public static int global;
    private static Map types = new HashMap();
    private FruitTypes type;
    private int i;

    // using a private constructor to force use of the factory method.
    private Fruit(FruitTypes type) {
        this.type = type;
        types.put(type, this);
        i++;
        global++;
    }

    /**
     * Lazy Factory method, gets the Fruit instance associated with a certain type. Instantiates new ones only as needed.
     *
     * @param type Any string that describes a fruit type, e.g. "apple"
     * @return The Fruit instance associated with that type.
     */
    public static Fruit getFruit(FruitTypes type) {
        Fruit f;
        if (types.containsKey(type)) {
            // get the instance for that type
            f = (Fruit) types.get(type);
        } else {
            // lazy initialization
            f = new Fruit(type);
        }
        return f;
    }

    public void count() {
        System.out.println("i = " + i + " global = " + global);
    }
}
