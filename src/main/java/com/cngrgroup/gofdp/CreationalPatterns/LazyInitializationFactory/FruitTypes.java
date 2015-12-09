/*
 * Copyright (c) 2015. Philip A Senger
 */

package com.cngrgroup.gofdp.CreationalPatterns.LazyInitializationFactory;

import org.apache.commons.lang.enums.Enum;

import java.util.Iterator;

/**
 * FruitTypes.
 * <p/>
 * <a href="FruitTypes.java.html"><i>View Source</i></a>
 *
 * @author Philip Senger
 * @author <a href="mailto:philip.a.senger@cngrgroup.com">philip.a.senger@cngrgroup.com</a>
 * @version 1.0
 * @date Nov 15, 2005 1:13:01 PM
 * @since SDK1.3
 */
public class FruitTypes extends Enum {
    public static final FruitTypes APPLE = new FruitTypes("APPLE");
    public static final FruitTypes PEAR = new FruitTypes("PEAR");
    public static final FruitTypes GRAPE = new FruitTypes("GRAPE");
    public static final FruitTypes ORANGE = new FruitTypes("ORANGE");

    /**
     * Constructor for enum item.
     *
     * @param s
     */
    protected FruitTypes(String s) {
        super(s);
    }

    /**
     * Gets an iterator over the Enum objects in an Enum class. The iterator is in the order that the objects were created (source code order). If the requested class has no enum objects an empty Iterator is returned
     *
     * @return An iterator over a collection of <code>FruitTypes</code> class
     */
    public static Iterator iterator() {
        return iterator(FruitTypes.class);
    }
}
