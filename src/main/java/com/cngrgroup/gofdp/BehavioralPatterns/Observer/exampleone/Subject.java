/*
 * Copyright (c) 2015. Philip A Senger
 */

package com.cngrgroup.gofdp.BehavioralPatterns.Observer.exampleone;

public class Subject extends ASubject {
    String x;
    String y;
    String z;

    public Subject() {
    }

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
        message = "X changed to :" + this.x;
        this.notifyObservers();
    }

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y;
        message = "Y changed to :" + this.y;
        this.notifyObservers();
    }

    public String getZ() {
        return z;
    }

    public void setZ(String z) {
        this.z = z;
        message = "Z changed to :" + this.z;
        this.notifyObservers();
    }
}
