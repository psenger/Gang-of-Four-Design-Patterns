/*
 * Copyright (c) 2015. Philip A Senger
 */

package com.cngrgroup.gofdp.BehavioralPatterns.ChainOfResponsibility;

public interface IChain {
    void addChain(Chain c);

    void sendToChain(String mesg);

    Chain getChain();
}
