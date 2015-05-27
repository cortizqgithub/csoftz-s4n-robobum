/*----------------------------------------------------------------------------*/
/* Source File:   ABSTRACTCOMMONDOMAIN.JAVA                                   */
/* Description:   Base class with common methods for subclasses to use.       */
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

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Base class with common methods for subclasses to use.
 * 
 * @since 1.8(JDK), May.27/2015
 * @author Carlos Adolfo Ortiz Quirós (COQ)
 * @version 1.1, May.27/2015
 */
public abstract class AbstractCommonDomain {
	/**
	 * Default Constructor.
	 */
	public AbstractCommonDomain() {
		super();
	}

	/**
	 * To clear current content status for object.
	 */
	public abstract void clear();

	/**
	 * Override parent method in order to give this object an String
	 * representation of itself.
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
