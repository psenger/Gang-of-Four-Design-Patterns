/*
 * Copyright (c) 2015. Philip A Senger
 */

package com.cngrgroup.gofdp.BehavioralPatterns.CommadWithTransactions;

import java.util.Vector;

/**
 * TransactionCommand - Insert comments here.
 * <p/>
 * <a href="TransactionCommand.java.html"><i>View Source</i></a>
 *
 * @author Philip Senger
 * @author <a href="mailto:philip.a.senger@cngrgroup.com">philip.a.senger@cngrgroup.com</a>
 * @version 1.0
 * @date Nov 4, 2005 3:15:37 PM
 * @since SDK1.3
 */
public class TransactionCommand implements Command {
    private CommandReceiver commandreceiver;
    private Vector commandNameList, commandargumentlist;
    private String commandName;
    private CommandArgument commandArgument;
    private Command command;

    public TransactionCommand() {
        this(null, null);
    }

    public TransactionCommand(Vector commandNameList, Vector commandargumentlist) {
        this.commandNameList = commandNameList;
        this.commandargumentlist = commandargumentlist;
        commandreceiver = CommandReceiver.getHandle();
    }

    public void execute() {
        for (int i = 0; i < commandNameList.size(); i++) {
            commandName = (String) (commandNameList.get(i));
            commandArgument = (CommandArgument) ((commandargumentlist.get(i)));
            commandreceiver.setCommandArgument(commandArgument);
            String classname = commandName + "Command";
            try {
                Class cls = Class.forName(classname);
                command = (Command) cls.newInstance();
            } catch (Throwable e) {
                System.err.println(e);
            }
            command.execute();
        }
    }
}
