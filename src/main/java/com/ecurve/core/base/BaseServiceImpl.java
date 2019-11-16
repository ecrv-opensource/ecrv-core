/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.ecurve.core.base;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author ecrv-opensource
 * @date Oct 26, 2019 11:41:57 PM
 *
 */
public abstract class BaseServiceImpl implements BaseService {
  // --------------------------------------------------------------- Constants
  // --------------------------------------------------------- Class Variables
  // ----------------------------------------------------- Static Initializers
  // ------------------------------------------------------ Instance Variables
  @Autowired
  protected Mapper mapper;

  // ------------------------------------------------------------ Constructors
  /**
   * Create a new <code>BaseServiceImpl</code>
   */
  public BaseServiceImpl() {
    super();
  }
  // ---------------------------------------------------------- Public Methods

  /**
   * @return Returns the mapper.
   */
  public Mapper getMapper() {
    return mapper;
  }

  /**
   * @param mapper The mapper to set.
   */
  public void setMapper(Mapper mapper) {
    this.mapper = mapper;
  }
  // ------------------------------------------------------- Protected Methods
  // --------------------------------------------------------- Default Methods
  // --------------------------------------------------------- Private Methods
  // ---------------------------------------------------------- Static Methods
  // ----------------------------------------------------------- Inner Classes
}
