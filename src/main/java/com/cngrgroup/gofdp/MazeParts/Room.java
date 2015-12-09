/*
 * Copyright (c) 2015. Philip A Senger
 */

package com.cngrgroup.gofdp.MazeParts;

import java.util.HashMap;
import java.util.Map;

/**
 * Room - Insert comments here.
 * <p/>
 * <a href="Room.java.html"><i>View Source</i></a>
 *
 * @author Philip Senger
 * @author <a href="mailto:philip.a.senger@cngrgroup.com">philip.a.senger@cngrgroup.com</a>
 * @version 1.0
 * @date Sep 23, 2005 12:03:05 PM
 * @since SDK1.3
 */
public class Room extends MapSite {
    private Integer roomNumber;
    private Map sides = new HashMap();

    public Room(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public MapSite getSide(Direction direction) {
        return (MapSite) sides.get(direction);
    }

    public void setSide(Direction direction, MapSite mapSite) {
        sides.put(direction, mapSite);
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }
}
