/*----------------------------------------------------------------------------*/
/* Source File:   ROBOTBUMAPP.JAVA                                            */
/* Copyright (c), 2015, 2022 CSoftZ                                           */
/*----------------------------------------------------------------------------*/
/*-----------------------------------------------------------------------------
 History
 May.27/2015 COQ  File created.
 -----------------------------------------------------------------------------*/
package com.csoftz.s4n.robobum;

import java.util.ArrayList;
import java.util.List;

import com.csoftz.s4n.robobum.common.LoadTextLine;
import com.csoftz.s4n.robobum.common.ParseThreatLine;
import com.csoftz.s4n.robobum.domain.FieldThreatLocation;

/**
 * Main entry location for app.
 *
 * @author Carlos Adolfo Ortiz Quirós (COQ)
 * @since 17(JDK)
 */
public class RobotBumApp {
    /**
     * Main entry for app.
     *
     * @param args Application command line parameters.
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        System.out.println("RoboBum, V2022.1.0 Feb.18/2022");

        if (args.length < 2) {
            System.out.println("No parameters supplied.");
            System.out.println("First parameter is Movement file");
            System.out.println("Second parameter is Threats file");
            return;
        }
        System.out.println("Movement file: " + args[0]);
        System.out.println("Threats file: " + args[1]);

        LoadTextLine ltl = new LoadTextLine();
        List<String> mvtLines = ltl.readAll(args[0]);
        List<String> threatLines = ltl.readAll(args[1]);
        List<FieldThreatLocation> threatLocs = new ArrayList<>();
        ParseThreatLine parseThreat = new ParseThreatLine();
        threatLines.forEach((line) -> threatLocs.add(parseThreat.parseLine(line)));

        if (!mvtLines.isEmpty()) {
            List<Robot> robotList = new ArrayList<>();
            int maxX = 0;
            int maxY = 0;
            String[] items = mvtLines.get(0).split(" ");
            maxX = Integer.parseInt(items[0]);
            maxY = Integer.parseInt(items[1]);
            int j = 0;

            for (int i = 1; i < mvtLines.size(); ) {
                String initialPos = mvtLines.get(i);
                String commands = mvtLines.get(++i);
                i++;
                robotList.add(new Robot(threatLocs, "Robot" + (j++),
                    initialPos, commands, maxX, maxY));
            }
            robotList.forEach(r -> {
                r.explore();
                System.out.println("Results for ROBOT " + r.getName());
                System.out.println("Showing Results------");
                r.retrieveResultList().forEach(System.out::println);
                System.out.println("---------------------");
                System.out.println("Trace----------------");
                r.retrieveTrace().forEach(System.out::println);
                System.out.println("---------------------");
                System.out.println("Robot Positions Log--");
                r.retrieveRobotPositionsLog()
                    .forEach(pos -> {
                        System.out.println("(" + pos.getX() + ","
                            + pos.getY() + "," + pos.getCardinalPos()
                            + ")");
                    });
                System.out.println("---------------------");
                System.out.println();
            });
        }

        // Robot robobum = new Robot(threatLocs, mvtLines);
        // robobum.explore();
    }
}
