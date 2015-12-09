/*
 * Copyright (c) 2015. Philip A Senger
 */

package com.cngrgroup.gofdp.BehavioralPatterns.Strategy.examplethree;

// This is a Concrete Strategy
public class CapitalStrategyTermLoan implements CapitalStrategy {
    public Double capital(Iloan loan) {
        Double rtVal = new Double(loan.getCommitment().doubleValue() * loan.getDuration().doubleValue() * loan.getRiskFactor().doubleValue());
        return rtVal;
    }
}
