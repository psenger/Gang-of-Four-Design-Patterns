/*
 * Copyright (c) 2015. Philip A Senger
 */

package com.cngrgroup.gofdp.MazeParts;

/**
 * MazeGame - Insert comments here.
 * <p/>
 * <a href="MazeGame.java.html"><i>View Source</i></a>
 *
 * @author Philip Senger
 * @author <a href="mailto:philip.a.senger@cngrgroup.com">philip.a.senger@cngrgroup.com</a>
 * @version 1.0
 * @date Nov 4, 2005 4:29:34 PM
 * @since SDK1.3
 */
public class MazeGame {
    public static Maze CreateMaze(MazeBuilder builder) {
        builder.BuildMaze();
        builder.BuildRoom(new Integer(1));
        builder.BuildRoom(new Integer(2));
        builder.BuildDoor(new Integer(1), new Integer(2));
        return builder.GetMaze();
    }
}
