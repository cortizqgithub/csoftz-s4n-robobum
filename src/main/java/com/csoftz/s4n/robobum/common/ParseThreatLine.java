/*----------------------------------------------------------------------------*/
/* Source File:   PARSETHREATLINE.JAVA                                        */
/* Copyright (c), 2015, 2022 CSoftZ                                           */
/*----------------------------------------------------------------------------*/
/*-----------------------------------------------------------------------------
 History
 May.27/2015 COQ  File created.
 Feb.22/2022 COQ  Upgraded code style conventions.
 -----------------------------------------------------------------------------*/
package com.csoftz.s4n.robobum.common;

import com.csoftz.s4n.robobum.consts.GlobalConstants;
import com.csoftz.s4n.robobum.domain.FieldThreatLocation;

/**
 * Helper class to only parse threat lines and map to ParseThreatLine Object.
 *
 * @author Carlos Adolfo Ortiz Quirós (COQ)
 * @since 17(JDK)
 */
public class ParseThreatLine {
    /**
     * Scans line to look for elements in the form '(1,2)*'
     *
     * @param line Input to scan
     * @return An object representing the coordinates and signal found.
     */
    public FieldThreatLocation parseLine(String line) {
        FieldThreatLocation data = new FieldThreatLocation();
        boolean start = false;
        boolean getKind = false;
        String tempStr = "";

        for (int i = 0; i < line.length(); ) {
            char ch = line.charAt(i);
            if (getKind) {
                data.setKind(ch);
                i++;
                continue;
            }
            if (ch == GlobalConstants.SPACE) {
                i++;
                continue;
            }
            if (ch == GlobalConstants.LEFT_PARENTHESIS) {
                start = true;
                i++;
                continue;
            }
            if (ch == GlobalConstants.RIGHT_PARENTHESIS) {
                start = false;
                data.setY(Integer.parseInt(tempStr));
                getKind = true;
                i++;
                continue;
            }
            if (ch == GlobalConstants.COMMA) {
                data.setX(Integer.parseInt(tempStr));
                tempStr = "";
                i++;
                continue;
            }
            if (start) {
                tempStr += ch;
            }
            i++;
        }
        return data;
    }
}
