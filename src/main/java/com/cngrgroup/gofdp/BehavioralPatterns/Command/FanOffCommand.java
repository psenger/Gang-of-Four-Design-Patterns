/*
 * Copyright (c) 2015. Philip A Senger
 */

/**
 *
 **/
package com.cngrgroup.gofdp.BehavioralPatterns.Command;

/**
 * FanOffCommand - CommandReceiver implements all the command-processing methods and is implemented as a Singleton pattern.
 * <p/>
 * <a href="FanOffCommand.java.html"><i>View Source</i></a>
 *
 * @author Philip Senger
 * @author <a href="mailto:philip.a.senger@cngrgroup.com">philip.a.senger@cngrgroup.com</a>
 * @version 1.0
 * @date Nov 4, 2005 2:44:13 PM
 * @since SDK1.3
 */
public class FanOffCommand implements Command {
    private Fan myFan;

    public FanOffCommand(Fan F) {
        myFan = F;
    }

    public void execute() {
        myFan.stopRotate();
    }
}
