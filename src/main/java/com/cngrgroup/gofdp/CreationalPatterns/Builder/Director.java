/*
 * Copyright (c) 2015. Philip A Senger
 */

package com.cngrgroup.gofdp.CreationalPatterns.Builder;

/**
 * Director - Insert comments here.
 * <p/>
 * <a href="Director.java.html"><i>View Source</i></a>
 *
 * @author Philip Senger
 * @author <a href="mailto:philip.a.senger@cngrgroup.com">philip.a.senger@cngrgroup.com</a>
 * @version 1.0
 * @date Sep 27, 2005 11:25:17 AM
 * @since SDK1.3
 */
public class Director {
    IBuilder iBuilder;

    public Director(IBuilder iBuilder) {
        this.iBuilder = iBuilder;
    }

    public void Construct() {
        this.iBuilder.buildA();
        this.iBuilder.buildB();
        this.iBuilder.buildC();
        this.iBuilder.buildD();
        this.iBuilder.buildE();
        this.iBuilder.buildF();
        this.iBuilder.buildG();
    }

    public IBuilder getResult() {
        return this.iBuilder;
    }
}
