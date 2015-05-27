/*----------------------------------------------------------------------------*/
/* Source File:   GLOBALCONSTANTS.JAVA                                        */
/* Description:   Global Constants used                                       */
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
package com.csoftz.s4n.robobum.consts;

/**
 * Global application constants. Used as a static class access only. This way it
 * is assured that a change in the constant value is modified in one place.
 * 
 * @since 1.8(JDK), May.27/2015
 * @author Carlos Adolfo Ortiz Quirós (COQ)
 * @version 1.1, May.27/2015
 */
public final class GlobalConstants {
	/* Cardinal Direction */
	public static final char NORTH_POS = 'N';
	public static final char SOUTH_POS = 'S';
	public static final char EAST_POS = 'E';
	public static final char WEST_POS = 'W';

	/* Robot Commands */
	public static final char ROBOT_COMMAND_MOVE_lEFT = 'I';
	public static final char ROBOT_COMMAND_MOVE_RIGHT = 'D';
	public static final char ROBOT_COMMAND_MOVE_FORWARD = 'A';

	/* Threats symbols */
	public static final char THREAT_BOMB = '*';
	public static final char THREAT_NO_BOMB = '%';
	public static final char THREAT_CLEAR = ' ';
}
