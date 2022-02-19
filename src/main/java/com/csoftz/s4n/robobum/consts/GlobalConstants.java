/*----------------------------------------------------------------------------*/
/* Source File:   GLOBALCONSTANTS.JAVA                                        */
/* Copyright (c), 2015, 2022 CSoftZ                                           */
/*----------------------------------------------------------------------------*/
/*-----------------------------------------------------------------------------
 History
 May.27/2015 COQ  File created.
 Feb.22/2022 COQ  Upgraded code style conventions.
 -----------------------------------------------------------------------------*/
package com.csoftz.s4n.robobum.consts;

/**
 * Global application constants. Used as a static class access only. This way it
 * is assured that a change in the constant value is modified in one place.
 *
 * @author Carlos Adolfo Ortiz Quirós (COQ)
 * @since 17(JDK)
 */
public final class GlobalConstants {
    /* Cardinal Direction */
    public static final char NORTH_POS = 'N';
    public static final char SOUTH_POS = 'S';
    public static final char EAST_POS = 'E';
    public static final char WEST_POS = 'W';

    /* Robot Commands */
    public static final char ROBOT_COMMAND_MOVE_LEFT = 'I';
    public static final char ROBOT_COMMAND_MOVE_RIGHT = 'D';
    public static final char ROBOT_COMMAND_MOVE_FORWARD = 'A';

    /* Threats symbols */
    public static final char THREAT_BOMB = '*';
    public static final char THREAT_NO_BOMB = '%';
    public static final char THREAT_CLEAR = ' ';

    /* Scanner */
    public static final char LEFT_PARENTHESIS = '(';
    public static final char RIGHT_PARENTHESIS = ')';
    public static final char COMMA = ',';
    public static final char SPACE = ' ';

    /**
     * Avoid instantiation of class as this is an utility helper.
     */
    private GlobalConstants() {
    }
}
