/*----------------------------------------------------------------------------*/
/* Source File:   FIELDTHEATLOCATION.JAVA                                     */
/* Description:   Domain object to hold field threat locations                */
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
package com.csoftz.s4n.robobum.domain;

import java.io.Serializable;

/**
 * Domain object to hold field threat locations
 * 
 * @since 1.8(JDK), May.27/2015
 * @author Carlos Adolfo Ortiz Quirós (COQ)
 * @version 1.1, May.27/2015
 */
public class FieldTheatLocation extends AbstractCommonDomain implements
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
	public FieldTheatLocation() {
		this.clear();
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
	 * Constructor with params.
	 * 
	 * @param x
	 *            x-axis where threat is located
	 * @param y
	 *            y-axis where threat is located
	 * @param kind
	 *            There exists a threat signed
	 */
	public FieldTheatLocation(int x, int y, char kind) {
		super();
		this.x = x;
		this.y = y;
		this.kind = kind;
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

	/** hashCode for class
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

	/** equals for class
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
		if (!(obj instanceof FieldTheatLocation)) {
			return false;
		}
		FieldTheatLocation other = (FieldTheatLocation) obj;
		if (kind != other.kind) {
			return false;
		}
		if (x != other.x) {
			return false;
		}
		if (y != other.y) {
			return false;
		}
		return true;
	}

}
