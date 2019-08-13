import java.util.*;

public class BillSplitter {
  public static void main(Strings[] arg){
    int numOfPeopleInParty = 0;   // holds party size
    float billTotal = 0.0f;   // holds the total of the bill
    float tipPercentage = 0.0f;   // holds amount for tip

    // create scanner for user input
    Scanner input = new Scanner(System.in);

    System.out.println("How many people are in your party?");
    numOfPeopleInParty = input.nextInt();   // reads user input

    // test Scanner
    System.out.println("Party size is: "+numOfPeopleInParty);
  }
}
