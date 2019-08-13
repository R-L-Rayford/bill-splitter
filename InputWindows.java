import java.awt.event.WindowListener;
import javax.swing.*;

public class InputWindows extends BillSplitter {
	static JFrame personAmount = new JFrame();
    static JFrame total = new JFrame();
    
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

}
