/*
 * Copyright (c) 2015. Philip A Senger
 */

package com.cngrgroup.gofdp.StructuralPatterns.Adapter.AdapterWithInheritance;

/**
 * MainProgram
 *
 * @author Philip Senger
 * @author <a href="mailto:philip.a.senger@cngrgroup.com">philip.a.senger@cngrgroup.com</a>
 * @version 1.0
 * @date Nov 6, 2005 4:04:50 PM
 * @since SDK1.3
 */
public class MainProgram {
    public static void main(String[] args) {
        Adapter aAdapter = new Adapter();
        aAdapter.request();
    }
}
