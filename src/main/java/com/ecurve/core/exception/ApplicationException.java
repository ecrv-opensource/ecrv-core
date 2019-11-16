/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.ecurve.core.exception;

/**
 * @author ecrv-opensource
 * @date Oct 26, 2019 11:33:49 PM
 *
 */
public class ApplicationException extends BaseException {
  // --------------------------------------------------------------- Constants
  private static final long serialVersionUID = 9166074186538470013L;

  // --------------------------------------------------------- Class Variables
  // ----------------------------------------------------- Static Initializers
  // ------------------------------------------------------ Instance Variables
  // ------------------------------------------------------------ Constructors
  /**
   * Create a new <code>ApplicationException</code>
   */
  public ApplicationException() {
    super();
  }

  /**
   * Create a new <code>ApplicationException</code>
   * 
   * @param message
   */
  public ApplicationException(String message) {
    super(message);
  }

  /**
   * Create a new <code>ApplicationException</code>
   * 
   * @param cause
   */
  public ApplicationException(Throwable cause) {
    super(cause);
  }

  /**
   * Create a new <code>ApplicationException</code>
   * 
   * @param message
   * @param cause
   */
  public ApplicationException(String message, Throwable cause) {
    super(message, cause);
  }
  // ---------------------------------------------------------- Public Methods
  // ------------------------------------------------------- Protected Methods
  // --------------------------------------------------------- Default Methods
  // --------------------------------------------------------- Private Methods
  // ---------------------------------------------------------- Static Methods
  // ----------------------------------------------------------- Inner Classes
}
