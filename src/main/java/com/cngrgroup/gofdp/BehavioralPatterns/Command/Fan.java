/*
 * Copyright (c) 2015. Philip A Senger
 */

/**
 *
 **/
package com.cngrgroup.gofdp.BehavioralPatterns.Command;

/**
 * Fan - Insert comments here.
 * <p/>
 * <a href="Fan.java.html"><i>View Source</i></a>
 *
 * @author Philip Senger
 * @author <a href="mailto:philip.a.senger@cngrgroup.com">philip.a.senger@cngrgroup.com</a>
 * @version 1.0
 * @date Nov 4, 2005 2:45:53 PM
 * @since SDK1.3
 */
public class Fan {
    public void startRotate() {
        System.out.println("Fan is rotating");
    }

    public void stopRotate() {
        System.out.println("Fan is not rotating");
    }
}
