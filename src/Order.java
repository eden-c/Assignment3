import sheffield.*;

public class Order {

  //:::::::::::::Required for Task 2

  static EasyReader keyboard = new EasyReader();

  static Order askForANewThingOrdered() {
      //Fill in the body for Task2 using the keyboard declared above
      return null; //replacing this
  }

  private MenuItem menuItem;
  private int itemsPriceInPence;
  public int getPriceInPence() {  return itemsPriceInPence;  }

  private Order (MenuItem i, double p) {
     //Fill in this for task 2 to initialize the instance variables above
  }

  public String toString() {
     //I haven't taught you this and you don't need to understand it
     //to use the method.  Don't change it
     return String.format("%-10s%6.2f",menuItem,itemsPriceInPence/100.0);
  }

  //:::::::::::::Required for Task 4

  static Order askForANewThingOrdered(String diner) {
      //Fill in the body for Task4 using the keyboard declared above
      return null; //replacing this
  }


}
