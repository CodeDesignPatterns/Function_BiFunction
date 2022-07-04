package code_design_patterns.java;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Taco {

 private String shell;
  // This Function takes one parameter and returns R, gets set by the builder
  private Function<String, Boolean> meatFunctionCallback;

  // This BiFunction takes two parameters and returns R, gets set by the Builder
  private BiFunction<String, String, Boolean> cheeseBiFunctionCallback;

  // constructor for the taco, takes in the meatFunction and cheeseBiFunction
  public Taco(Function<String, Boolean> meatFunction, BiFunction<String, String, Boolean> cheeseBiFunction, String shell) {
    this.meatFunctionCallback = meatFunction;
    this.cheeseBiFunctionCallback = cheeseBiFunction;
    this.shell = shell;
  }

  public Boolean getMeatFunction(String meat) {
    return this.meatFunctionCallback.apply(meat);
  }

  public Boolean getCheeseBiFunction(String cheese) {
    return this.cheeseBiFunctionCallback.apply(cheese,shell);
  };

  

  @Override
  public String toString() {
    return "Taco{" +
        "meat='" + meat + '\'' +
        ", cheese='" + cheese + '\'' +
        ", shell='" + shell + '\'' +
        ", vegan=" + vegan +
        ", salad=" + salad +
        '}';
  }

}
