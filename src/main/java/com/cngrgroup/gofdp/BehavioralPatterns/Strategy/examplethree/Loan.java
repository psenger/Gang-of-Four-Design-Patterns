/*
 * Copyright (c) 2015. Philip A Senger
 */

package com.cngrgroup.gofdp.BehavioralPatterns.Strategy.examplethree;

// Context
public class Loan implements Iloan {
    private Double commitment;
    private Double duration;
    private Double riskFactor;
    private CapitalStrategy capitalStrategy;

    public Double capital() {
        return capitalStrategy.capital(this);
    }

    public Double getCommitment() {
        return commitment;
    }

    public void setCommitment(Double commitment) {
        this.commitment = commitment;
    }

    public Double getDuration() {
        return duration;
    }

    public void setDuration(Double duration) {
        this.duration = duration;
    }

    public void setCapitalStrategy(CapitalStrategy aCapitalStrategy) {
        this.capitalStrategy = aCapitalStrategy;
    }

    public Double getRiskFactor() {
        return riskFactor;
    }

    public void setRiskFactor(Double riskFactor) {
        this.riskFactor = riskFactor;
    }
}
