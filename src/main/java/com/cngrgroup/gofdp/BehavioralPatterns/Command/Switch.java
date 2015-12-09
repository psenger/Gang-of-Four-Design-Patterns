
package com.cngrgroup.gofdp.BehavioralPatterns.Command;

/**
 * Switch - This class is the  <i>CommandManager</i> and is essentially an invoker.
 * It stores the generic <i>TransactionCommand</i> object in its private <i>myCommand</i> variable.
 * When <i>runCommands( )</i> is invoked, it calls the <i>execute( )</i> of the appropriate
 * <i>TransactionCommand</i> object.
 * <p/>
 * <a href="Switch.java.html"><i>View Source</i></a>
 *
 * @author Philip Senger
 * @author <a href="mailto:philip.a.senger@cngrgroup.com">philip.a.senger@cngrgroup.com</a>
 * @version 1.0
 * @date Nov 4, 2005 2:45:23 PM
 * @since SDK1.3
 */
public class Switch {
    private Command UpCommand, DownCommand;

    /**
     * a concrete Command registers itself with the invoker.
     *
     * @param Up   A registered Command for up.
     * @param Down A registered Command for down.
     */
    public Switch(Command Up, Command Down) {
        UpCommand = Up;
        DownCommand = Down;
    }

    /**
     * The invoker calls back to the concrete Command, which executes the Command on the receiver.
     */
    void flipUp() {
        UpCommand.execute();
    }

    /**
     * The invoker calls back to the concrete Command, which executes the Command on the receiver.
     */
    void flipDown() {
        DownCommand.execute();
    }
}
