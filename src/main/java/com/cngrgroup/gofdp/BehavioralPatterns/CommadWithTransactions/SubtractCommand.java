/*
 * Copyright (c) 2015. Philip A Senger
 */

package com.cngrgroup.gofdp.BehavioralPatterns.CommadWithTransactions;

/**
 * SubtractCommand - Insert comments here.
 * <p/>
 * <a href="SubtractCommand.java.html"><i>View Source</i></a>
 *
 * @author Philip Senger
 * @author <a href="mailto:philip.a.senger@cngrgroup.com">philip.a.senger@cngrgroup.com</a>
 * @version 1.0
 * @date Nov 4, 2005 3:16:54 PM
 * @since SDK1.3
 */
public class SubtractCommand extends TransactionCommand {
    private CommandReceiver cr;

    public SubtractCommand() {
        cr = CommandReceiver.getHandle();
    }

    public void execute() {
        cr.methSubtract();
    }
}
