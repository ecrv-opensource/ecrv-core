/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.ecurve.core.entity;

import java.io.Serializable;
import javax.persistence.MappedSuperclass;

/**
 * @author ecrv-opensource
 * @date Sep 21, 2019 11:37:37 PM
 *
 */
@MappedSuperclass
public abstract class BaseEntity implements Serializable {
  // --------------------------------------------------------------- Constants
  private static final long serialVersionUID = 2579531599791730292L;
  // --------------------------------------------------------- Class Variables
  // ----------------------------------------------------- Static Initializers
  // ------------------------------------------------------ Instance Variables
  // ------------------------------------------------------------ Constructors
  /**
   * Create a new <code>BaseEntity</code>
   */
  public BaseEntity() {
    super();
  }
  // ---------------------------------------------------------- Public Methods
  // ------------------------------------------------------- Protected Methods
  // --------------------------------------------------------- Default Methods
  // --------------------------------------------------------- Private Methods
  // ---------------------------------------------------------- Static Methods
  // ----------------------------------------------------------- Inner Classes
}
