package scrum;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenu;
import javax.swing.JScrollPane;
import javax.swing.SpringLayout;
import java.awt.Dimension;

public class planta2_calefaccion extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu Planta0, Planta1, Planta2;
	private JMenuItem Calefaccion,Calefaccion1,Calefaccion2;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnMenu_p2c;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					planta2_calefaccion frame = new planta2_calefaccion();
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
	public planta2_calefaccion() {
		setTitle("Planta 2 Calefacción");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1134, 620);
	
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		menuBar = new JMenuBar();
		menuBar.setForeground(Color.WHITE);
		menuBar.setBackground(Color.GRAY);
		setJMenuBar(menuBar);

		Planta0 = new JMenu("Planta baja");
		menuBar.add(Planta0);

		Planta1 = new JMenu("Planta 1");
		menuBar.add(Planta1);
		
		Planta2 = new JMenu("Planta 2");
		menuBar.add(Planta2);
		
		

		
		Calefaccion = new JMenuItem("Calefacción");
		Calefaccion.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
            	//Close actual frame and open another one
            	planta_baja_calefaccion Planta0 = new planta_baja_calefaccion();
            	Planta0.setVisible(true);
            	dispose();
            }
		});
		
		Planta0.add(Calefaccion);

	
		Calefaccion1 = new JMenuItem("Calefacción");
		Calefaccion1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
            	//Close actual frame and open another one
            	planta1_calefaccion Planta1 = new planta1_calefaccion();
            	Planta1.setVisible(true);
            	dispose();
            }
		});
		Planta1.add(Calefaccion1);

		Calefaccion2 = new JMenuItem("Calefacción");
		Calefaccion2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
            	//Close actual frame and open another one
            	planta2_calefaccion Planta2 = new planta2_calefaccion();
            	Planta2.setVisible(true);
            	dispose();
            }
		});
		Planta2.add(Calefaccion2);
		
	
		
	
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		Panelimagen_planta2 p = new Panelimagen_planta2();
		p.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(p);
		
		SpringLayout sl_p = new SpringLayout();
		p.setLayout(sl_p);
		
		btnNewButton = new JButton("New button");
		sl_p.putConstraint(SpringLayout.WEST, btnNewButton, 36, SpringLayout.WEST, p);
		sl_p.putConstraint(SpringLayout.SOUTH, btnNewButton, -57, SpringLayout.SOUTH, p);
		p.add(btnNewButton);
		
		btnNewButton_1 = new JButton("New button");
		sl_p.putConstraint(SpringLayout.WEST, btnNewButton_1, 0, SpringLayout.WEST, btnNewButton);
		sl_p.putConstraint(SpringLayout.SOUTH, btnNewButton_1, -6, SpringLayout.NORTH, btnNewButton);
		p.add(btnNewButton_1);
		
		btnMenu_p2c = new JButton("Men\u00FA");
		sl_p.putConstraint(SpringLayout.WEST, btnMenu_p2c, 0, SpringLayout.WEST, btnNewButton);
		sl_p.putConstraint(SpringLayout.SOUTH, btnMenu_p2c, -6, SpringLayout.NORTH, btnNewButton_1);
		p.add(btnMenu_p2c);
		btnMenu_p2c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Close actual frame and open another one
            	menu_inicio menu = new menu_inicio();
            	menu.setVisible(true);
            	dispose();
			}
		});
		
		

		SpringLayout sl_contentPane = new SpringLayout();
		
		

	
	
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
