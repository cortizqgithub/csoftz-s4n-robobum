/*----------------------------------------------------------------------------*/
/* Source File:   ROBOTBUMAPP.JAVA                                            */
/* Description:   Class to define what a robot is exploring                   */
/* Author:        Carlos Adolfo Ortiz Quirós (COQ)                            */
/* Date:          May.27/2015                                                 */
/* Last Modified: May.27/2015                                                 */
/* Version:       1.1                                                         */
/* Copyright (c), 2015 CSoftZ                                                 */
/*----------------------------------------------------------------------------*/
/*-----------------------------------------------------------------------------
 History
 May.27/2015 COQ  File created.
 -----------------------------------------------------------------------------*/
package com.csoftz.s4n.robobum;

import java.util.ArrayList;
import java.util.List;

import com.csoftz.s4n.robobum.consts.GlobalConstants;
import com.csoftz.s4n.robobum.domain.FieldTheatLocation;
import com.csoftz.s4n.robobum.domain.RobotPosition;

/**
 * Class to define what a robot is exploring
 * 
 * @since 1.8(JDK), May.27/2015
 * @author Carlos Adolfo Ortiz Quirós (COQ)
 * @version 1.1, May.27/2015
 */
public class Robot {
	private String name;
	private String commands;
	private String initialPosition;
	private int maxXAxis;
	private int maxYAxis;
	private List<FieldTheatLocation> threatLocs;
	private List<String> traceList = new ArrayList<String>();
	private List<String> resultList = new ArrayList<String>();
	private List<RobotPosition> robotPosList = new ArrayList<RobotPosition>();

	/**
	 * Constructor with params
	 * 
	 * @param threatLocs
	 *            A list of field locations.
	 * @param mvts
	 */
	public Robot(List<FieldTheatLocation> threatLocs, String name,
			String initialPosition, String commands, int maxXAxis, int maxYAxis) {
		this.threatLocs = threatLocs;
		this.name = name;
		this.commands = commands;
		this.maxXAxis = maxXAxis;
		this.maxYAxis = maxYAxis;
		this.initialPosition = initialPosition;
	}

	/**
	 * Analyze commands to locate bombs.
	 */
	public void explore() {
		String[] pos = initialPosition.split(" ");
		int currXPos = Integer.parseInt(pos[0]);
		int currYPos = Integer.parseInt(pos[1]);
		char currCardinalPos = pos[2].charAt(0);
		RobotPosition rpos = new RobotPosition(currXPos, currYPos,
				currCardinalPos);
		robotPosList.add(rpos);

		traceList.add("Robot name: " + name);
		traceList.add("Exploring grid for bomb presence");
		traceList.add("Robot initial position " + "(" + rpos.getX() + ","
				+ rpos.getY() + "," + rpos.getCardinalPos() + ")");
		for (int i = 0; i < commands.length(); i++) {
			locateBombAt(rpos);
			char ch = commands.charAt(i);
			switch (ch) {
			case GlobalConstants.ROBOT_COMMAND_MOVE_LEFT:
				currCardinalPos = rotateLeft(currCardinalPos);
				rpos = new RobotPosition(currXPos, currYPos, currCardinalPos);
				break;
			case GlobalConstants.ROBOT_COMMAND_MOVE_RIGHT:
				currCardinalPos = rotateRight(currCardinalPos);
				rpos = new RobotPosition(currXPos, currYPos, currCardinalPos);
				break;
			case GlobalConstants.ROBOT_COMMAND_MOVE_FORWARD:
				rpos = moveForward(rpos);
				break;
			default:
				break;
			}
			robotPosList.add(rpos);
			traceList.add("Robot position " + "(" + rpos.getX() + ","
					+ rpos.getY() + "," + rpos.getCardinalPos() + ")");
		}
		traceList.add("Finished exploration");
	}

	/**
	 * Depending on the given position, it moves one location in the cardinal
	 * direction. If robot is to move past its border, then 
	 * 
	 * @param rpos
	 *            new position.
	 */
	private RobotPosition moveForward(RobotPosition rpos) {
		RobotPosition newpos = new RobotPosition(rpos.getX(), rpos.getY(), rpos.getCardinalPos());
		
		return newpos;
	}

	/**
	 * Given current position examines if there is a bomb there.
	 * 
	 * @param rpos
	 */
	private void locateBombAt(RobotPosition rpos) {
		// TODO Auto-generated method stub

	}

	/**
	 * Given cardinal position rotates 90º to the left.
	 * 
	 * @param currCardinalPos
	 *            Current cardinal position
	 * @return new cardinal position
	 */
	private char rotateLeft(char currCardinalPos) {
		char rslt = currCardinalPos;
		switch (currCardinalPos) {
		case GlobalConstants.NORTH_POS:
			rslt = GlobalConstants.WEST_POS;
			break;
		case GlobalConstants.WEST_POS:
			rslt = GlobalConstants.SOUTH_POS;
			break;
		case GlobalConstants.SOUTH_POS:
			rslt = GlobalConstants.EAST_POS;
		default:
			break;
		}
		return rslt;
	}

	/**
	 * Given cardinal position rotates 90º to the right.
	 * 
	 * @param currCardinalPos
	 *            Current cardinal position
	 * @return new cardinal position
	 */
	private char rotateRight(char currCardinalPos) {
		char rslt = currCardinalPos;
		switch (currCardinalPos) {
		case GlobalConstants.NORTH_POS:
			rslt = GlobalConstants.EAST_POS;
			break;
		case GlobalConstants.EAST_POS:
			rslt = GlobalConstants.SOUTH_POS;
			break;
		case GlobalConstants.SOUTH_POS:
			rslt = GlobalConstants.WEST_POS;
		default:
			break;
		}
		return rslt;
	}

	/**
	 * get name
	 * 
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Retrieve the log trace for application
	 * 
	 * @return List of strings
	 */
	public List<String> retrieveTrace() {
		return traceList;
	}

	/**
	 * Retrieve the log of robot positions used.
	 * 
	 * @return List of RobotPosition
	 */
	public List<RobotPosition> retrieveRobotPositionsLog() {
		return robotPosList;
	}

	/**
	 * Log of actions performed.
	 * 
	 * @return List of String result
	 */
	public List<String> retrieveResultList() {
		return resultList;
	}
}
