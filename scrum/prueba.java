package scrum;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;

import java.awt.BorderLayout;
import javax.swing.SpringLayout;
import javax.swing.JButton;

public class prueba extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					prueba frame = new prueba();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public prueba() {
		setTitle("Planta 2 alarmas");
		setBounds(100, 100, 450, 300);
		((javax.swing.plaf.basic.BasicInternalFrameUI)this.getUI()).setNorthPane(null);
		
		Panelimagen_planta2 p = new Panelimagen_planta2();
		p.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(p);
		SpringLayout sl_p = new SpringLayout();
		p.setLayout(sl_p);
		
		JButton btnNewButton = new JButton("New button");
		sl_p.putConstraint(SpringLayout.WEST, btnNewButton, 36, SpringLayout.WEST, p);
		sl_p.putConstraint(SpringLayout.SOUTH, btnNewButton, -57, SpringLayout.SOUTH, p);
		p.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		sl_p.putConstraint(SpringLayout.WEST, btnNewButton_1, 0, SpringLayout.WEST, btnNewButton);
		sl_p.putConstraint(SpringLayout.SOUTH, btnNewButton_1, -6, SpringLayout.NORTH, btnNewButton);
		p.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		sl_p.putConstraint(SpringLayout.WEST, btnNewButton_2, 0, SpringLayout.WEST, btnNewButton);
		sl_p.putConstraint(SpringLayout.SOUTH, btnNewButton_2, -6, SpringLayout.NORTH, btnNewButton_1);
		p.add(btnNewButton_2);

		
		
	}
}
