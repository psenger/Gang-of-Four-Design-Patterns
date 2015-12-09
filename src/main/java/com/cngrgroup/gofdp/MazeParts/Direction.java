/*
 * Copyright (c) 2015. Philip A Senger
 */

package com.cngrgroup.gofdp.MazeParts;

import org.apache.commons.lang.enums.ValuedEnum;

import java.util.Iterator;

/**
 * Direction - Insert comments here.
 * <p/>
 * <a href="Direction.java.html"><i>View Source</i></a>
 *
 * @author Philip Senger
 * @author <a href="mailto:philip.a.senger@cngrgroup.com">philip.a.senger@cngrgroup.com</a>
 * @version 1.0
 * @date Sep 23, 2005 12:05:30 PM
 * @since SDK1.3
 */
public class Direction extends ValuedEnum {

    public static final Direction NORTH = new Direction("NORTH", 0);
    public static final Direction SOUTH = new Direction("SOUTH", 1);
    public static final Direction EAST = new Direction("EAST", 2);
    public static final Direction WEST = new Direction("WEST", 3);

    /**
     * Minimun constructor for this enum type.
     *
     * @param aName  the name of enum item
     * @param aValue the value of enum item
     * @see org.apache.commons.lang.enums.ValuedEnum
     */
    protected Direction(final String aName, final int aValue) {
        super(aName, aValue);
    }

    /**
     * Used to get a instance of the Direction.
     * <p/>
     * If the value can not be found, this return null.
     *
     * @param myValue Returns an instance based off the value.
     * @return A <code>Direction</code> or null if the name is illegal.
     * @see org.apache.commons.lang.enums.ValuedEnum
     */
    public static Direction getInstance(final int myValue) {
        return (Direction) getEnum(Direction.class, myValue);
    }

    /**
     * Used to get a instance of the Direction.
     * <p/>
     * If the name can not be found, this return null.
     *
     * @param myName Returns an instance based off the name.
     * @return A <code>Direction</code> or null if the name is illegal.
     * @see org.apache.commons.lang.enums.ValuedEnum
     */
    public static Direction getInstance(final String myName) {
        return (Direction) getEnum(Direction.class, myName);
    }

    /**
     * Gets an iterator over the Enum objects in an Enum class. The iterator is in the order that the objects were created (source code order). If the requested class has no enum objects an empty Iterator is returned
     *
     * @return An iterator over a collection of <code>Direction</code> class
     */
    public static Iterator iterator() {
        return iterator(Direction.class);
    }
}
