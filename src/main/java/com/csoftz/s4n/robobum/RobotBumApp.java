/*----------------------------------------------------------------------------*/
/* Source File:   ROBOTBUMAPP.JAVA                                            */
/* Description:   Main entry location for app.                                */
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

import java.util.List;

import com.csoftz.s4n.robobum.common.LoadTextLine;
import com.csoftz.s4n.robobum.consts.GlobalConstants;
import com.csoftz.s4n.robobum.domain.RobotPosition;

/**
 * Main entry location for app.
 * 
 * @since 1.8(JDK), May.27/2015
 * @author Carlos Adolfo Ortiz Quirós (COQ)
 * @version 1.1, May.27/2015
 */
public class RobotBumApp {
	/**
	 * Main entry for app.
	 * 
	 * @param args
	 *            Application commoand line parameters.
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception  {
		System.out.println("RoboBum, V1.0.0.10-Mar.27/2015");
		System.out.println("Movement file: " + args[0]);
		System.out.println("Threats file: " + args[1]);
		
		
		RobotPosition rp = new RobotPosition(0, 0, GlobalConstants.NORTH_POS);
		System.out.println(rp);
		LoadTextLine ltl = new LoadTextLine();
		List<String> mvtLines = ltl.readAll(args[0]);
		List<String> threatLines = ltl.readAll(args[1]);
		threatLines.forEach((line) -> System.out.println(line));		
	}
}
