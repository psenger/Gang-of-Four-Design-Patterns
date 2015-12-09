/*
 * Copyright (c) 2015. Philip A Senger
 */

/**
 *
 **/
package com.cngrgroup.gofdp.BehavioralPatterns.Command;

/**
 * FanOnCommand - CommandReceiver implements all the command-processing methods and is implemented as a Singleton pattern.
 * <p/>
 * <a href="FanOnCommand.java.html"><i>View Source</i></a>
 *
 * @author Philip Senger
 * @author <a href="mailto:philip.a.senger@cngrgroup.com">philip.a.senger@cngrgroup.com</a>
 * @version 1.0
 * @date Nov 4, 2005 2:44:43 PM
 * @since SDK1.3
 */
public class FanOnCommand implements Command {
    private Fan myFan;

    public FanOnCommand(Fan F) {
        myFan = F;
    }

    public void execute() {
        myFan.startRotate();
    }
}
