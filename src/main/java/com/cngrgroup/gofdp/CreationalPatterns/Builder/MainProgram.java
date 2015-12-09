/*
 * Copyright (c) 2015. Philip A Senger
 */

package com.cngrgroup.gofdp.CreationalPatterns.Builder;

/**
 * Builders construct their products in step-by-step fashion. Therefore the Builder class interface must be
 * general enough to allow the construction of products for all kinds of concrete builders.
 *
 * @author Philip Senger
 * @author <a href="mailto:philip.a.senger@cngrgroup.com">philip.a.senger@cngrgroup.com</a>
 * @version 1.0
 * @date Sep 27, 2005 11:24:47 AM
 * @since SDK1.3
 */
public class MainProgram {
    public static void main(String[] args) {
        /**
         * 1.) The client creates the Director object and configures it with the desired Builder object.
         * 2.) Director notifies the builder whenever a part of the product should be built.
         * 3.) Builder handles requests from the director and adds parts to the product.
         * 4.) The client retrieves the product from the builder.
         */
        Director dir = new Director(new SomeTypeOfObjectA());
        dir.Construct();
        IBuilder iBuilder = dir.getResult();
    }
}
