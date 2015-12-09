/*
 * Copyright (c) 2015. Philip A Senger
 */

package com.cngrgroup.gofdp.BehavioralPatterns.CommadWithTransactions;

/**
 * CommandReceiver - Insert comments here.
 * <p/>
 * <a href="CommandReceiver.java.html"><i>View Source</i></a>
 *
 * @author Philip Senger
 * @author <a href="mailto:philip.a.senger@cngrgroup.com">philip.a.senger@cngrgroup.com</a>
 * @version 1.0
 * @date Nov 4, 2005 3:14:51 PM
 * @since SDK1.3
 */
public class CommandReceiver {
    private static CommandReceiver cr = new CommandReceiver();
    private int[] c;
    private CommandArgument a;

    private CommandReceiver() {
        c = new int[2];
    }

    public static CommandReceiver getHandle() {
        return cr;
    }

    public void setCommandArgument(CommandArgument a) {
        this.a = a;
    }

    public void methAdd() {
        c = a.getArguments();
        System.out.println("The result is " + (c[0] + c[1]));
    }

    public void methSubtract() {
        c = a.getArguments();
        System.out.println("The result is " + (c[0] - c[1]));
    }
}
