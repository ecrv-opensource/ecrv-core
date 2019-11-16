/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.ecurve.core.exception;

/**
 * @author ecrv-opensource
 * @date Sep 22, 2019 10:14:26 PM
 *
 */
public class ParameterException extends BaseException {
  // --------------------------------------------------------------- Constants
  private static final long serialVersionUID = -6877293955093752027L;
  // --------------------------------------------------------- Class Variables
  // ----------------------------------------------------- Static Initializers
  // ------------------------------------------------------ Instance Variables
  // ------------------------------------------------------------ Constructors
  /**
   * Create a new <code>ParameterException</code>
   */
  public ParameterException() {
    super();
  }

  /**
   * Create a new <code>ParameterException</code>
   * 
   * @param message
   */
  public ParameterException(String message) {
    super(message);
  }

  /**
   * Create a new <code>ParameterException</code>
   * 
   * @param cause
   */
  public ParameterException(Throwable cause) {
    super(cause);
  }

  /**
   * Create a new <code>ParameterException</code>
   * 
   * @param message
   * @param cause
   */
  public ParameterException(String message, Throwable cause) {
    super(message, cause);
  }
  // ---------------------------------------------------------- Public Methods
  // ------------------------------------------------------- Protected Methods
  // --------------------------------------------------------- Default Methods
  // --------------------------------------------------------- Private Methods
  // ---------------------------------------------------------- Static Methods
  // ----------------------------------------------------------- Inner Classes
}
