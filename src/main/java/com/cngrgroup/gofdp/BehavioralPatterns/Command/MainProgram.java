package com.cngrgroup.gofdp.BehavioralPatterns.Command;

/**
 * Encapsulate a request as an object, thereby letting you parameterize clients with
 * different requests, queue or log requests, and support undoable operations.
 *
 * @author Philip Senger
 * @author <a href="mailto:philip.a.senger@cngrgroup.com">philip.a.senger@cngrgroup.com</a>
 * @version 1.0
 * @date Nov 4, 2005 2:48:04 PM
 * @since SDK1.3
 */
public class MainProgram {
    public static void main(String[] args) {

        Light testLight = new Light();
        LightOnCommand testLOC = new LightOnCommand(testLight);
        LightOffCommand testLFC = new LightOffCommand(testLight);
        Switch testSwitch = new Switch(testLOC, testLFC);
        testSwitch.flipUp();
        testSwitch.flipDown();

        Fan testFan = new Fan();
        FanOnCommand foc = new FanOnCommand(testFan);
        FanOffCommand ffc = new FanOffCommand(testFan);
        Switch ts = new Switch(foc, ffc);
        ts.flipUp();
        ts.flipDown();

    }
}
