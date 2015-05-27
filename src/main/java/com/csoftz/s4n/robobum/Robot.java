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

import java.util.List;

import com.csoftz.s4n.robobum.domain.FieldTheatLocation;

/**
 * Class to define what a robot is exploring
 * 
 * @since 1.8(JDK), May.27/2015
 * @author Carlos Adolfo Ortiz Quirós (COQ)
 * @version 1.1, May.27/2015
 */
public class Robot {
	private List<FieldTheatLocation> threatLocs;
	private List<String> mvts;
	private int maxXAxis; 
	private int maxYAxis;

	/**
	 * Constructor with params
	 * @param threatLocs A list of field locations.
	 * @param mvts
	 */
	public Robot(List<FieldTheatLocation> threatLocs, List<String> mvts) {
		this.threatLocs = threatLocs;
		this.mvts = mvts;
		this.maxXAxis = 0;
		this.maxYAxis = 0;
	}
	
	/**
	 * Analyze all mvts to locate bombs.
	 */
	public void explore() {
		
	}
}
