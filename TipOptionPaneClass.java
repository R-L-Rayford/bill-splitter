import java.awt.event.WindowListener;
import javax.swing.*;

public class TipOptionPaneClass extends BillSplitter{
	 JFrame tip = new JFrame();
	 TipOptionPaneClass() { 
	 	tip.addWindowListener((WindowListener) this);
	    tip.setSize(300,300);
	    tip.setLayout(null);
	    tip.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
	    tip.setVisible(true);
	 }
}
