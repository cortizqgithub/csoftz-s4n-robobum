/*----------------------------------------------------------------------------*/
/* Source File:   LOADTEXTLINE.JAVA                                           */
/* Description:   Helper Class to load string lines from a given file.        */
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

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * Helper Class to load string lines from a given file.
 * 
 * @since 1.8(JDK), May.27/2015
 * @author Carlos Adolfo Ortiz Quirós (COQ)
 * @version 1.1, May.27/2015
 */
public class LoadTextLine {
	final static Charset ENCODING = StandardCharsets.UTF_8;
	private String fileName;

	/**
	 * Load all the contents in a filename and returns in a string list for further processing.
	 * @return List of lines as string.
	 */
	public List<String> readAll(String fileName)  throws IOException {		
		Path path = Paths.get(fileName);
		return Files.readAllLines(path, ENCODING);
	}
}
