/*----------------------------------------------------------------------------*/
/* Source File:   ROBOTPOSITION.JAVA                                          */
/* Description:   Domain object to hold robot position                        */
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
 * Domain object to hold robot position
 * 
 * @since 1.8(JDK), May.27/2015
 * @author Carlos Adolfo Ortiz Quirós (COQ)
 * @version 1.1, May.27/2015
 */
public class RobotPosition extends AbstractCommonDomain implements Serializable {

	/**
	 * Serialization Id.
	 */
	private static final long serialVersionUID = 1639509730143061532L;
	private int x;
	private int y;
	private char cardinalPos;

	/**
	 * Default constructor
	 */
	public RobotPosition() {
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
		this.cardinalPos = ' ';
	}

	/**
	 * Denotes a coordinate where a robot is located in the grid, e.g., (1, 2,
	 * N) means x=1, y=2, cardinalPos = 'N', i.e., the robot is located in
	 * coordinates (1,2) to the North.
	 * 
	 * @param x
	 *            x-axis coordinate position
	 * @param y
	 *            y-axis coordinate position
	 * @param cardinalPos
	 *            To which cardinal position it is located
	 */
	public RobotPosition(int x, int y, char cardinalPos) {
		super();
		this.x = x;
		this.y = y;
		this.cardinalPos = cardinalPos;
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
	 * @return the cardinalPos
	 */
	public char getCardinalPos() {
		return cardinalPos;
	}

	/**
	 * @param cardinalPos the cardinalPos to set
	 */
	public void setCardinalPos(char cardinalPos) {
		this.cardinalPos = cardinalPos;
	}

	/** hashCode for class
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cardinalPos;
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
		if (!(obj instanceof RobotPosition)) {
			return false;
		}
		RobotPosition other = (RobotPosition) obj;
		if (cardinalPos != other.cardinalPos) {
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
