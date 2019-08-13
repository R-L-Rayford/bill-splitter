
public class BillSplitter {
  public static void main(String[] arg){
    int numOfPeopleInParty = 0;   // holds party size
    float billTotal = 0.0f;   // holds the total of the bill
    float tipPercentage = 0.0f;   // holds amount for tip
    float totalAfterTip = 0.0f;
    float amountEachOwes = 0.0f;

    // get the size of the party
    numOfPeopleInParty = InputWindows.partySize(numOfPeopleInParty);

    // test Scanner
    //System.out.println("Party size is: "+numOfPeopleInParty);
    
    // get the bill total
    billTotal = InputWindows.billTotal(billTotal);
    
    // test scanner
    //System.out.println("Bill total is: "+billTotal);
    
    // get the tip amount
    tipPercentage = TipOptionPaneClass.addTip(tipPercentage, billTotal);
    
    //System.out.format("The amount for the tip is $%.2f%n",tipPercentage);
    
    // add tip amount to total
    totalAfterTip = billTotal + tipPercentage;
    
    //System.out.format("The total after tip is: $%.2f%n",totalAfterTip);
    
    amountEachOwes = totalAfterTip / numOfPeopleInParty;
    
    //System.out.format("This is the amount each person owes: $%.2f%n",amountEachOwes);
    
    // call method to display all information
    InputWindows.display(numOfPeopleInParty,billTotal,tipPercentage,totalAfterTip,amountEachOwes);
  }
}
