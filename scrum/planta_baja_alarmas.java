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

public class planta_baja_alarmas extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu Planta0, Planta1, Planta2;
	private JMenuItem Alarmas,Alarmas1,Alarmas2;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnMenu_pba;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					planta_baja_alarmas frame = new planta_baja_alarmas();
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
	public planta_baja_alarmas() {
		setTitle("Planta baja alarmas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1134, 620);
		
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
		
		
		Alarmas = new JMenuItem("Alarmas");
		Alarmas.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
            	//Close actual frame and open another one
            	planta_baja_alarmas Planta0 = new planta_baja_alarmas();
            	Planta0.setVisible(true);
            	dispose();
            }
		});
		
		Planta0.add(Alarmas);

	
		Alarmas1 = new JMenuItem("Alarmas");
		Alarmas1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
            	//Close actual frame and open another one
            	planta1_alarmas Planta1 = new planta1_alarmas();
            	Planta1.setVisible(true);
            	dispose();
            }
		});
		Planta1.add(Alarmas1);

		Alarmas2 = new JMenuItem("Alarmas");
		Alarmas2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
            	//Close actual frame and open another one
            	planta2_alarmas Planta2 = new planta2_alarmas();
            	Planta2.setVisible(true);
            	dispose();
            }
		});
		Planta2.add(Alarmas2);
		
	
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		Panelimagen_planta_baja p = new Panelimagen_planta_baja();
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
		
		btnMenu_pba = new JButton("Men\u00FA");
		sl_p.putConstraint(SpringLayout.WEST, btnMenu_pba, 0, SpringLayout.WEST, btnNewButton);
		sl_p.putConstraint(SpringLayout.SOUTH, btnMenu_pba, -6, SpringLayout.NORTH, btnNewButton_1);
		p.add(btnMenu_pba);
		btnMenu_pba.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
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
