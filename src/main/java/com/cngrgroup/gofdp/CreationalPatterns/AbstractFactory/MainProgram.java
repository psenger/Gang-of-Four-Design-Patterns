/*
 * Copyright (c) 2015. Philip A Senger
 */

package com.cngrgroup.gofdp.CreationalPatterns.AbstractFactory;

import java.util.Collection;

/**
 * Provide an interface for creating families of related
 * or dependent objects without specifying their concrete classes.
 *
 * @author Philip Senger
 * @version 1.0
 * @date Jan 12, 2005 1:30:21 PM
 * @since SDK1.3
 */
public class MainProgram {
    public static void main(String[] args) {
        DAOFactory dao = DAOFactory.getDAOFactory(DAOEnum.CLOUDSCAPE);
        Collection co = dao.getDataDAO();
    }
}
