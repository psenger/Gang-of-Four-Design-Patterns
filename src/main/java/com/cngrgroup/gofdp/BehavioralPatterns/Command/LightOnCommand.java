/*
 * Copyright (c) 2015. Philip A Senger
 */
package com.cngrgroup.gofdp.BehavioralPatterns.Command;

/**
 * LightOnCommand - CommandReceiver implements all the command-processing methods and is implemented as a Singleton pattern.
 * <p/>
 * <a href="LightOnCommand.java.html"><i>View Source</i></a>
 *
 * @author Philip Senger
 * @author <a href="mailto:philip.a.senger@cngrgroup.com">philip.a.senger@cngrgroup.com</a>
 * @version 1.0
 * @date Nov 4, 2005 2:45:10 PM
 * @since SDK1.3
 */
public class LightOnCommand implements Command {
    private Light myLight;

    public LightOnCommand(Light L) {
        myLight = L;
    }

    public void execute() {
        myLight.turnOn();
    }
}
