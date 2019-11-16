/**
 * eCurve Solutions. All Rights Reserved. Private and Confidential. May not be disclosed without
 * permission.
 */
package com.ecurve.core.exception;

/**
 * @author ecrv-opensource
 * @date Dec 7, 2019 2:13:01 PM
 *
 */
public class WebException extends BaseException {
  // --------------------------------------------------------------- Constants
  private static final long serialVersionUID = -1611580948362488845L;
  // --------------------------------------------------------- Class Variables
  // ----------------------------------------------------- Static Initializers
  // ------------------------------------------------------ Instance Variables
  // ------------------------------------------------------------ Constructors

  /**
   * Create a new <code>WebException</code>
   * 
   * @param errorCode
   * @param message
   * @param cause
   */
  public WebException(String errorCode, String message, Throwable cause) {
    super(errorCode, message, cause);
    // TODO Auto-generated constructor stub
  }

  /**
   * Create a new <code>WebException</code>
   * 
   * @param errorCode
   * @param message
   */
  public WebException(String errorCode, String message) {
    super(errorCode, message);
    // TODO Auto-generated constructor stub
  }

  // ---------------------------------------------------------- Public Methods
  // ------------------------------------------------------- Protected Methods
  // --------------------------------------------------------- Default Methods
  // --------------------------------------------------------- Private Methods
  // ---------------------------------------------------------- Static Methods
  // ----------------------------------------------------------- Inner Classes
}
