/*
 * Copyright (c) 2015. Philip A Senger
 */

package com.cngrgroup.gofdp.BehavioralPatterns.Strategy.examplethree;

public interface Iloan {
    Double getCommitment();

    void setCommitment(Double commitment);

    Double getDuration();

    void setDuration(Double duration);

    void setCapitalStrategy(CapitalStrategy aCapitalStrategy);

    Double getRiskFactor();

    void setRiskFactor(Double riskFactor);
}
