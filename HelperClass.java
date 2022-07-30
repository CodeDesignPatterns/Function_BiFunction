package code_design_patterns.java;

public class HelperClass {
 

// The implementation of the Function and BiFunction below, these get passed as parameters to the constructor when making the taco.
  public boolean functionToPass(String meat) {
    if ("Chicken".equals(meat)) {
      return true;
    }
    return false;
  }


public boolean biFunctionToPass(String cheese, String shell) {
    if ("Tasty".equals(cheese) && "Hard".equals(shell)) {
      return true;
    }
    return false;
  }
}