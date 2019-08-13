import java.util.*;
import javax.swing.*;

public class BillSplitter {
  public static void main(String[] arg){
    int numOfPeopleInParty = 0;   // holds party size
    float billTotal = 0.0f;   // holds the total of the bill
    float tipPercentage = 0.0f;   // holds amount for tip
    float totalAfterTip = 0.0f;
    float amountEachOwes = 0.0f;
    
    JFrame personAmount = new JFrame();
    JFrame total = new JFrame();
    JFrame tip = new JFrame();

    // create scanner for user input
    Scanner input = new Scanner(System.in);

    // get the number of people splitting the bill
    //System.out.println("How many people are in your party?");
    //numOfPeopleInParty = input.nextInt();   // reads user input
    
    String s1 = JOptionPane.showInputDialog(personAmount,"How many people are in your party?");
    int i = Integer.parseInt(s1);
    numOfPeopleInParty = i;

    // test Scanner
    System.out.println("Party size is: "+numOfPeopleInParty);
    
    // get the total amount of the bill
    //System.out.println("What is the total of the bill?");
    //billTotal = input.nextFloat();
    
    String s2 = JOptionPane.showInputDialog(total,"What is the total of the bill?");
    float ii = Float.parseFloat(s2);
    billTotal = ii;
    
    // test scanner
    System.out.println("Bill total is: "+ii);
    
    // get amount user want to tip
    //System.out.println("How much would you like to tip?");
    //tipPercentage = input.nextFloat();
    
    
    Object[] options = {"10%","15%","20%"};
    
    int x = JOptionPane.showOptionDialog(tip,
				 "How much would you like to tip?",
				 "Tip Amount",
				 JOptionPane.YES_NO_CANCEL_OPTION,
				 JOptionPane.QUESTION_MESSAGE,
				 null,
				 options,
				 options[2]);
    
    
    if(x == 0) {
    	tipPercentage = (float) (billTotal * .10);
    }else if(x == 1) {
    	tipPercentage = (float) (billTotal * .15);
    }else {
    	tipPercentage = (float) (billTotal * .20);
    }
    
    System.out.println("The tip amount is "+tipPercentage);
    
    // add tip amount to total
    //totalAfterTip = billTotal + tipPercentage;
    
    System.out.format("The total after tip is: $%.2f%n", totalAfterTip);
    
    amountEachOwes = totalAfterTip / numOfPeopleInParty;
    
    System.out.format("This is the amount each person owes:  $%.2f%n", amountEachOwes);
  }
}
