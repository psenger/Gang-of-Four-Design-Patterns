/*
 * Copyright (c) 2015. Philip A Senger
 */

package com.cngrgroup.gofdp.CreationalPatterns.AbstractFactory;

public final class DAOEnum {
    public static final DAOEnum CLOUDSCAPE = new DAOEnum("CLOUDSCAPE", 1);
    public static final DAOEnum ORACLE = new DAOEnum("ORACLE", 2);
    public static final DAOEnum SYBASE = new DAOEnum("SYBASE", 3);

    private final String myName;
    private final int myValue;

    private DAOEnum(String name, int val) {
        myName = name;
        myValue = val;
    }

    public String getMyName() {
        return myName;
    }

    public int getMyValue() {
        return myValue;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DAOEnum)) return false;
        final DAOEnum DAOEnum = (DAOEnum) o;
        return myName.equals(DAOEnum.myName);
    }

    public int hashCode() {
        return myName.hashCode();
    }
}
