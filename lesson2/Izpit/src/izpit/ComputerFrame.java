package izpit;

import javax.swing.*;

public class ComputerFrame extends JFrame {
	
	private JTextField txt1 = new JTextField();
	private JTextField txt2 = new JTextField();
	
	public void myPanel(){
		setTitle("Computer Network At TU");
		setSize(300, 200);
		
		txt1.setBounds(20, 30, 300, 200);
		txt2.setBounds(25, 35, 300, 200);
		
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	
}
