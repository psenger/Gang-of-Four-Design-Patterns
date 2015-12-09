/*
 * Copyright (c) 2015. Philip A Senger
 */

package com.cngrgroup.gofdp.BehavioralPatterns.CommadWithTransactions;

/**
 * CommandManager - Insert comments here.
 * <p/>
 * <a href="CommandManager.java.html"><i>View Source</i></a>
 *
 * @author Philip Senger
 * @author <a href="mailto:philip.a.senger@cngrgroup.com">philip.a.senger@cngrgroup.com</a>
 * @version 1.0
 * @date Nov 4, 2005 3:15:12 PM
 * @since SDK1.3
 */
public class CommandManager {
    private Command myCommand;

    public CommandManager(Command myCommand) {
        this.myCommand = myCommand;
    }

    public void runCommands() {
        myCommand.execute();
    }
}
