/*
 * Copyright (c) 2015. Philip A Senger
 */

package com.cngrgroup.gofdp.MazeParts;

/**
 * MapSite - Insert comments here.
 * <p/>
 * <a href="MapSite.java.html"><i>View Source</i></a>
 *
 * @author Philip Senger
 * @author <a href="mailto:philip.a.senger@cngrgroup.com">philip.a.senger@cngrgroup.com</a>
 * @version 1.0
 * @date Sep 23, 2005 11:21:14 AM
 * @since SDK1.3
 */
public abstract class MapSite {
    private boolean entered;

    public boolean isEntered() {
        return entered;
    }

    public void setEntered(boolean entered) {
        this.entered = entered;
    }
}
