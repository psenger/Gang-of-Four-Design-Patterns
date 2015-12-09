/*
 * Copyright (c) 2015. Philip A Senger
 */

package com.cngrgroup.gofdp.BehavioralPatterns.CommadWithTransactions;

/**
 * CommandArgument - Insert comments here.
 * <p/>
 * <a href="CommandArgument.java.html"><i>View Source</i></a>
 *
 * @author Philip Senger
 * @author <a href="mailto:philip.a.senger@cngrgroup.com">philip.a.senger@cngrgroup.com</a>
 * @version 1.0
 * @date Nov 4, 2005 3:17:17 PM
 * @since SDK1.3
 */
public class CommandArgument {
    private int[] args;

    CommandArgument() {
        args = new int[2];
    }

    public int[] getArguments() {
        return args;
    }

    public void setArgument(int i1, int i2) {
        args[0] = i1;
        args[1] = i2;
    }
}
