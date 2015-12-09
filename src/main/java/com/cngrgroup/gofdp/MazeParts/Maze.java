/*
 * Copyright (c) 2015. Philip A Senger
 */

package com.cngrgroup.gofdp.MazeParts;

import java.util.HashMap;
import java.util.Map;

/**
 * Maze - Insert comments here.
 * <p/>
 * <a href="Maze.java.html"><i>View Source</i></a>
 *
 * @author Philip Senger
 * @author <a href="mailto:philip.a.senger@cngrgroup.com">philip.a.senger@cngrgroup.com</a>
 * @version 1.0
 * @date Sep 23, 2005 11:20:08 AM
 * @since SDK1.3
 */
public class Maze {
    private Map rooms = new HashMap();

    public Maze() {
    }

    public void AddRoom(Room room) {
        rooms.put(room.getRoomNumber(), room);
    }
}
