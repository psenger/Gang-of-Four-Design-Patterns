/*
 * Copyright (c) 2015. Philip A Senger
 */

package com.cngrgroup.gofdp.BehavioralPatterns.ChainOfResponsibility;

public abstract class Chain implements IChain {

    public Chain nextChain = null;

    /**
     * The addChain method adds another class to the chain of classes.
     *
     * @param c
     */
    public void addChain(Chain c) {
        nextChain = c;
    }

    /**
     * The sendToChain method forwards a message to the next object in the chain.
     *
     * @param mesg
     */
    public abstract void sendToChain(String mesg);

    /**
     * The getChain method returns the current class to which messages are being forwarded.
     *
     * @return
     */
    public Chain getChain() {
        return nextChain;
    }
}
