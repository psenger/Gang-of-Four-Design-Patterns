/*
 * Copyright (c) 2015. Philip A Senger
 */

package com.cngrgroup.gofdp.CreationalPatterns.AbstractFactory;

import java.util.Collection;

/**
 * This is a Abstract Factory because it declares the interface within itself ( the interface could be extracted ).
 */
public abstract class DAOFactory {

    public static final DAOEnum CLOUDSCAPE = DAOEnum.CLOUDSCAPE;
    public static final DAOEnum ORACLE = DAOEnum.ORACLE;
    public static final DAOEnum SYBASE = DAOEnum.SYBASE;

    public static DAOFactory getDAOFactory(DAOEnum whichFactory) {
        if (whichFactory.equals(DAOEnum.CLOUDSCAPE)) {
            return new DAOCloudScape();
        } else if (whichFactory.equals(DAOEnum.ORACLE)) {
            return new DAOOracle();
        } else if (whichFactory.equals(DAOEnum.SYBASE)) {
            return new DAOSybase();
        } else {
            return null;
        }
    }

    public abstract Collection getDataDAO();
}