/*
 * Copyright (c) 2015. Philip A Senger
 */

package com.cngrgroup.gofdp.BehavioralPatterns.ChainOfResponsibility;

public class Goo extends Chain {
    /**
     * The sendToChain method forwards a message to the next object in the chain.
     *
     * @param mesg
     */
    public void sendToChain(String mesg) {
        // by modifing this if-than-else, you can wrap a condtion if the Chain Link is to do an action or not.
        if (mesg.equalsIgnoreCase("Goo")) {
            System.out.println("Im doing something in Goo");
        } else {
            System.out.println("Nothing for me to do here in Goo");
            if (nextChain != null) {
                nextChain.sendToChain(mesg);
            }
        }
    }
}
