/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.ecurve.core.exception;

/**
 * @author ecrv-opensource
 * @date Sep 22, 2019 4:02:40 PM
 *
 */
public abstract class BaseException extends Exception {
  // --------------------------------------------------------------- Constants
  private static final long serialVersionUID = -3732019724128352605L;

  // --------------------------------------------------------- Class Variables
  // ----------------------------------------------------- Static Initializers
  // ------------------------------------------------------ Instance Variables
  // ------------------------------------------------------------ Constructors
  /**
   * Create a new <code>BaseException</code>
   */
  public BaseException() {
    super();
  }

  /**
   * Create a new <code>BaseException</code>
   * 
   * @param message
   */
  public BaseException(String message) {
    super(message);
  }

  /**
   * Create a new <code>BaseException</code>
   * 
   * @param cause
   */
  public BaseException(Throwable cause) {
    super(cause);
  }

  /**
   * Create a new <code>BaseException</code>
   * 
   * @param message
   * @param cause
   */
  public BaseException(String message, Throwable cause) {
    super(message, cause);
  }
  // ---------------------------------------------------------- Public Methods
  // ------------------------------------------------------- Protected Methods
  // --------------------------------------------------------- Default Methods
  // --------------------------------------------------------- Private Methods
  // ---------------------------------------------------------- Static Methods
  // ----------------------------------------------------------- Inner Classes

}
