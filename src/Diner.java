import sheffield.*;

public class Diner {

    //:::::::::::::Required for Task 1

    static Diner [] allTheDiners;

    static void createPartyFor(String [] peoplesNames) {
        //This needs a body to do task 1. Use allTheDiners declared above
     }

     static EasyWriter screen = new EasyWriter();

     static void listAllTheDiners() {
         //This needs a body to do task 1. Using screen declared above
     }

     private String theDinersName;

     private Diner (String called) {
         //This needs a body to do task 1 and an addition line for task 2
     }

     //:::::::::::::Additionally required for Task 2

     static void takeEveryonesOrder()  {
        //This needs a body to do Task 2 and should make use of askForOrder
     }

     static final int MAX_NUMBER_OF_THINGS_A_DINER_CAN_ORDER=10;

     Order[] thingsOrderedByDiner;

     private void askForTheirOrder() {
       //This is also required for task 2
       screen.println("Time for "+theDinersName+" to order");
       //Fill in the rest of the method.
       //You should use thingsOrderedByDiner (declared above) and
       //Order.askForNewThingOrdered()
       //Upto here
       screen.println();
    }

    static void listEveryonesOrder() {
        //This is the second method for task 2
        screen.println("The diners' order is");
        //Fill in the rest of the method.
        //It should use printOrder() below
        //Upto here
        screen.println();
   }

   private void printOrder() {
     //This is also part of task 2.  You can use the constant spaces
     //declared below to get a nice tidy layout
     //You should use the toString method of the class order
     //without changing it to print out the details of the item ordered
     //If the diner ordered nothing print out "Nothing"
  }

  //:::::::::::::Additionally required for Task 3

  static void dealWithTheBill() {
    //Fill this in for task 3 using screen as above for output
    //and the method getShareOfBill() below which also needs to be
    //filled in
  }

  private double getShareOfBill() {
    //Fill this in for task 3 too replacing the line below
    return 0;
  }

//:::::::::::::Additionally required for Task 4

   static void getAnotherRound() {
     //Fill this in for task 4
   }

}
