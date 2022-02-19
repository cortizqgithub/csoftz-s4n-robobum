/*----------------------------------------------------------------------------*/
/* Source File:   FIELDTHEATLOCATION.JAVA                                     */
/* Copyright (c), 2015, 2022 CSoftZ                                           */
/*----------------------------------------------------------------------------*/
/*-----------------------------------------------------------------------------
 History
 May.27/2015 COQ  File created.
 Feb.22/2022 COQ  Upgraded code style conventions.
 -----------------------------------------------------------------------------*/
package com.csoftz.s4n.robobum.domain;

import java.io.Serializable;

/**
 * Domain object to hold field threat locations
 *
 * @author Carlos Adolfo Ortiz Quirós (COQ)
 * @since 17(JDK)
 */
public class FieldThreatLocation extends AbstractCommonDomain implements
    Serializable {

    /**
     * Serialization Id.
     */
    private static final long serialVersionUID = -7005560116567683388L;

    private int x;
    private int y;
    private char kind;

    /**
     * Default Constructor
     */
    public FieldThreatLocation() {
        this.clear();
    }

    /**
     * Constructor with params.
     *
     * @param x    x-axis where threat is located
     * @param y    y-axis where threat is located
     * @param kind There exists a threat signed
     */
    public FieldThreatLocation(int x, int y, char kind) {
        super();
        this.x = x;
        this.y = y;
        this.kind = kind;
    }

    /**
     * To clear current content status for object.
     *
     * @see com.csoftz.s4n.robobum.domain.AbstractCommonDomain#clear()
     */
    @Override
    public void clear() {
        this.x = 0;
        this.y = 0;
        this.kind = ' ';
    }

    /**
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * @return the kind
     */
    public char getKind() {
        return kind;
    }

    /**
     * @param kind the kind to set
     */
    public void setKind(char kind) {
        this.kind = kind;
    }

    /**
     * hashCode for class
     *
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + kind;
        result = prime * result + x;
        result = prime * result + y;
        return result;
    }

    /**
     * equals for class
     *
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof FieldThreatLocation)) {
            return false;
        }
        FieldThreatLocation other = (FieldThreatLocation) obj;
        if (kind != other.kind) {
            return false;
        }
        if (x != other.x) {
            return false;
        }
        return y == other.y;
    }

}
