package Sierpinski;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SierpinskiTriangleFrame extends JFrame {
	static int r = 0, gr = 0, b = 255;



	private JTextField jtfOrder = new JTextField("0", 5); // Order
	
	
	 
	private SierpinskiTrianglePanel trianglePanel = new SierpinskiTrianglePanel(); // To display the pattern

	public SierpinskiTriangleFrame() {
		
		
		JPanel btnPanel = new JPanel();
		JButton minus =new JButton("-");  
		JButton plus =new JButton("+");
		
		btnPanel.add(minus);
		btnPanel.add(plus);
// Panel to hold label, text field, and a button
		JPanel panel = new JPanel(); 
		jtfOrder.setEditable(false);
		panel.add(new JLabel("Enter an order: "));
		panel.add(jtfOrder,  BorderLayout.NORTH);
		panel.add(btnPanel, BorderLayout.SOUTH);
		
		jtfOrder.setHorizontalAlignment(SwingConstants.RIGHT);
// Add a Sierpinski triangle panel to the frame
		add(trianglePanel);
		add(panel, BorderLayout.SOUTH);

		
		minus.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				if(Integer.parseInt(jtfOrder.getText())>0) {
				jtfOrder.setText(String.valueOf(Integer.parseInt(jtfOrder.getText())-1));
				
				trianglePanel.setOrder(Integer.parseInt(jtfOrder.getText()));
				}
			}		
		});
		
		plus.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				if(Integer.parseInt(jtfOrder.getText())<9) {
					jtfOrder.setText(String.valueOf(Integer.parseInt(jtfOrder.getText())+1));
				
					trianglePanel.setOrder(Integer.parseInt(jtfOrder.getText()));
				}
				
			}		
		});
		
		

	}

}