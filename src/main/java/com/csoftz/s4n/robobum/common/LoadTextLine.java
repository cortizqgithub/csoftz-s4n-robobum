/*----------------------------------------------------------------------------*/
/* Source File:   LOADTEXTLINE.JAVA                                           */
/* Copyright (c), 2015, 2022 CSoftZ                                           */
/*----------------------------------------------------------------------------*/
/*-----------------------------------------------------------------------------
 History
 May.27/2015 COQ  File created.
 Feb.22/2022 COQ  Upgraded code style conventions.
 -----------------------------------------------------------------------------*/
package com.csoftz.s4n.robobum.common;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 * Helper Class to load string lines from a given file.
 *
 * @author Carlos Adolfo Ortiz Quirós (COQ)
 * @since 17(JDK)
 */
public class LoadTextLine {
    final static Charset ENCODING = StandardCharsets.UTF_8;

    /**
     * Load all the contents in a filename and returns in a string list for further processing.
     *
     * @return List of lines as string.
     */
    public List<String> readAll(String fileName) throws IOException {
        return Files.readAllLines(Paths.get(fileName), ENCODING);
    }
}
