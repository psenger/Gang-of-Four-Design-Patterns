/*
 * Copyright (c) 2015. Philip A Senger
 */

package com.cngrgroup.gofdp.MazeParts;

/**
 * MazeBuilde
 *
 * @author Philip Senger
 * @author <a href="mailto:philip.a.senger@cngrgroup.com">philip.a.senger@cngrgroup.com</a>
 * @version 1.0
 * @date Sep 23, 2005 11:16:50 AM
 * @since SDK1.4
 */
public abstract class MazeBuilder {
    protected MazeBuilder() {

    }

    public void BuildMaze() {
    }

    public void BuildRoom(Integer room) {
    }

    public void BuildDoor(Integer roomFrom, Integer roomTo) {
    }

    public Maze GetMaze() {
        return null;
    }
}
