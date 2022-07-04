package code_design_patterns.java;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) {

    HelperClass helperClass = new HelperClass();
    
    // On construction we pass two methods from the Method class as arguments to constructor.
    // when object is constructed it will store these as functions in member variables.
    Taco taco = new Taco((meat) -> helperClass.functionToPass(meat),
        (cheese, shell) -> helperClass.biFunctionToPass(cheese, shell), "Hard");

    
    
    // This is where the Function is called which takes ONE argument, stored in the taco as a
    // member variable
    boolean Chicken = taco.getMeatFunction("Beef");

    System.out.println("Meat given was chicken: " + Chicken);

    Chicken = taco.getMeatFunction("Chicken");

    System.out.println("Meat given was chicken: " + Chicken);

    // This is where the cheese BiFunction is called which takes ONE argument here, BUT WHEN APPLY IS CALLED 
    // the stored function in the object will  also pass the SECOND argument of string (shell), stored in the taco as a member variable
    boolean hardShellTastyCheese = taco.getCheeseBiFunction("Cheddar");

    System.out.println("Tasty Cheese with Hard shell: " + hardShellTastyCheese);

    hardShellTastyCheese = taco.getCheeseBiFunction("Tasty");

    System.out.println("Tasty Cheese with Hard shell: " + hardShellTastyCheese);

  }

}
