/*----------------------------------------------------------------------------*/
/* Source File:   PARSETHREATLINE.JAVA                                        */
/* Description:   Helper class to only parse threat lines and map to          */
/*                ParseThreatLine Object.                                     */
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
package com.csoftz.s4n.robobum.common;

import com.csoftz.s4n.robobum.domain.FieldTheatLocation;

/**
 * Helper class to only parse threat lines and map to ParseThreatLine Object.
 * 
 * @since 1.8(JDK), May.27/2015
 * @author Carlos Adolfo Ortiz Quirós (COQ)
 * @version 1.1, May.27/2015
 */
public class ParseThreatLine {
	/**
	 * Scans line to look for elements in the form '(1,2)*'
	 * 
	 * @param line
	 *            Input to scan
	 * @return An object representing the coordinates and signal found.
	 */
	public FieldTheatLocation parseLine(String line) {
		FieldTheatLocation data = new FieldTheatLocation();
		return data;
	}
}
