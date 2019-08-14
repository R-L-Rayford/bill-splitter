import javax.swing.*;

public class InputWindows extends BillSplitter {
	static JFrame personAmount = new JFrame();
    static JFrame total = new JFrame();
    static JFrame display = new JFrame();
    
    InputWindows() {
	    personAmount.setSize(300,300);
	    personAmount.setLayout(null);
	    personAmount.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
	    personAmount.setVisible(true);
	    
	    total.setSize(300,300);
	    total.setLayout(null);
	    total.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
	    total.setVisible(true);
	 }
    
    // method to get the size of the party
    public static int partySize(int numOfPeopleInParty) {
    	String s1 = JOptionPane.showInputDialog(personAmount,"How many people are in your party?");
        int i = Integer.parseInt(s1);
        
        return numOfPeopleInParty = i;
    }
    
    // method to get the bill total
    public static float billTotal(float billTotal) {
    	String s2 = JOptionPane.showInputDialog(total,"What is the total of the bill?");
        float ii = Float.parseFloat(s2);
        
        return billTotal = ii;
    } 
    
    public static void display(int numOfPeopleInParty, float billTotal, float tipPercentage, float totalAfterTip, float amountEachOwes) {
    	
    	
    	String[] formattedStrings = {String.format("Bill total is: $%.2f",billTotal),
    								String.format("The amount for the tip is $%.2f",tipPercentage),
    								String.format("The total after tip is: $%.2f",totalAfterTip),
    								String.format("This is the amount each person owes: $%.2f",amountEachOwes)};
    	
    	JOptionPane.showMessageDialog(display,"<html>Party size is: "+numOfPeopleInParty+"<br>"+
    			formattedStrings[0]+"<br>"+formattedStrings[1]+"<br>"+formattedStrings[2]+"<br>"+formattedStrings[3]+"</html>");
    }

}
