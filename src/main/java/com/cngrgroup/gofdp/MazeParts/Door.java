/*
 * Copyright (c) 2015. Philip A Senger
 */

package com.cngrgroup.gofdp.MazeParts;

/**
 * Door - Insert comments here.
 * <p/>
 * <a href="Door.java.html"><i>View Source</i></a>
 *
 * @author Philip Senger
 * @author <a href="mailto:philip.a.senger@cngrgroup.com">philip.a.senger@cngrgroup.com</a>
 * @version 1.0
 * @date Sep 23, 2005 12:20:33 PM
 * @since SDK1.3
 */
public class Door extends MapSite {
    private Room room1;
    private Room room2;
    private boolean open;

    public Door(Room aRoom1, Room aRoom2) {
        this.room1 = aRoom1;
        this.room2 = aRoom2;
    }

    public Room OtherSideFrom(Room room) {
        if (room1.equals(room)) {
            return room2;
        }
        if (room2.equals(room)) {
            return room1;
        } else
            return null;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }
}
