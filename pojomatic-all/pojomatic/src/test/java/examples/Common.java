package examples;

import org.pojomatic.Pojomatic;
import org.pojomatic.annotations.AutoProperty;

@AutoProperty //all fields are included by default
public class Common {
  private boolean test;

  private String myString;

  private int anInt;

  @Override public int hashCode() {
    return Pojomatic.hashCode(this);
  }

  @Override public String toString() {
    return Pojomatic.toString(this);
  }

  @Override public boolean equals(Object o) {
    return Pojomatic.equals(this, o);
  }

  public boolean isTest() {
    return this.test;
  }

  public void setTest(boolean test) {
    this.test = test;
  }

  public String getMyString() {
    return this.myString;
  }

  public void setMyString(String myString) {
    this.myString = myString;
  }

  public int getAnInt() {
    return this.anInt;
  }

  public void setAnInt(int anInt) {
    this.anInt = anInt;
  }

}
