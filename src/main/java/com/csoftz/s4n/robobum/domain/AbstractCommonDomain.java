/*----------------------------------------------------------------------------*/
/* Source File:   ABSTRACTCOMMONDOMAIN.JAVA                                   */
/* Copyright (c), 2015, 2022 CSoftZ                                           */
/*----------------------------------------------------------------------------*/
/*-----------------------------------------------------------------------------
 History
 May.27/2015 COQ  File created.
 Feb.22/2022 COQ  Upgraded code style conventions.
 -----------------------------------------------------------------------------*/
package com.csoftz.s4n.robobum.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Base class with common methods for subclasses to use.
 *
 * @author Carlos Adolfo Ortiz Quirós (COQ)
 * @since 17(JDK)
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
