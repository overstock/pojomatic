package org.pojomatic;

/**
 * An exception thrown when asked to create a {@link Pojomator} for a class which has no properties
 * annotated for use with Pojomatic.
 */
public class NoPojomaticPropertiesException extends IllegalArgumentException {
  private static final long serialVersionUID = 1L;

  public NoPojomaticPropertiesException(Class<?> pojoClass) {
    super("Class " + pojoClass.getName() + " has no Pojomatic properties");
  }
}
