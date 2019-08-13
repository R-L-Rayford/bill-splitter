import java.util.*;

public class BillSplitter {
  public static void main(String[] arg){
    int numOfPeopleInParty = 0;   // holds party size
    float billTotal = 0.0f;   // holds the total of the bill
    float tipPercentage = 0.0f;   // holds amount for tip
    float totalAfterTip = 0.0f;
    float amountEachOwes = 0.0f;

    // create scanner for user input
    Scanner input = new Scanner(System.in);

    // get the number of people splitting the bill
    System.out.println("How many people are in your party?");
    numOfPeopleInParty = input.nextInt();   // reads user input

    // test Scanner
    System.out.println("Party size is: "+numOfPeopleInParty);
    
    // get the total amount of the bill
    System.out.println("What is the total of the bill?");
    billTotal = input.nextFloat();
    
    // test scanner
    System.out.println("Bill total is: "+billTotal);
    
    // get amount user want to tip
    System.out.println("How much would you like to tip?");
    tipPercentage = input.nextFloat();
    
    // add tip amount to total
    totalAfterTip = billTotal + tipPercentage;
    
    System.out.println("The total after tip is: "+totalAfterTip);
    
    amountEachOwes = totalAfterTip / numOfPeopleInParty;
    
    System.out.println("This is the amount each person owes: "+amountEachOwes);
  }
}
