/*
 * Copyright (c) 2015. Philip A Senger
 */

package com.cngrgroup.gofdp.CreationalPatterns.Builder;

/**
 * Builders construct their products in step-by-step fashion. Therefore the Builder class interface must be general
 * enough to allow the construction of products for all kinds of concrete builders.
 * </p>
 * <p/>
 * <a href="Builder.java.html"><i>View Source</i></a>
 * </p>
 *
 * @author Philip Senger
 * @author <a href="mailto:philip.a.senger@cngrgroup.com">philip.a.senger@cngrgroup.com</a>
 * @version 1.0
 * @date Sep 27, 2005 11:25:34 AM
 * @since SDK1.4
 */
public interface IBuilder {
    void buildA();

    void buildB();

    void buildC();

    void buildD();

    void buildE();

    void buildF();

    void buildG();
}
