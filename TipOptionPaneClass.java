import java.awt.event.WindowListener;
import javax.swing.*;

public class TipOptionPaneClass extends BillSplitter{
	static JFrame tip = new JFrame();
	 
	TipOptionPaneClass() { 
	 	tip.addWindowListener((WindowListener) this);
	    tip.setSize(300,300);
	    tip.setLayout(null);
	    tip.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
	    tip.setVisible(true);
	 }
	
	public static float addTip(float tipPercentage, float billTotal)
	{
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
	    
	    return tipPercentage;
	}
}
