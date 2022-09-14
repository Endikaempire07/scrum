package scrum;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;

import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JMenu;
import javax.swing.SpringLayout;
import java.awt.Font;

public class planta2_alarmas extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JMenuItem Menu,Alarmas,Alarmas1,Alarmas2;
	private JButton btn1_p2c;
	private JButton btn2_p2c;
	private JButton btn3_p2c;
	private JButton btn4_p2c;
	private JButton btn5_p2c;
	private JButton btn6_p2c;
	private JButton btn7_p2c;
	private JButton btn9_p2c;
	private JButton btn8_p2c;
	private JButton btn10_p2c;
	private JButton btn11_p2c;
	private JButton btn12_p2c;
	private JButton btn13_p2c;
	private JButton btn14_p2c;
	private JButton btn15_p2c;
	private JButton btn16_p2c;
	private JButton btn17_p2c;
	private JButton btn18_p2c;
	private JButton btn19_p2c;
	private JButton btn21_p2c;
	private JButton btn22_p2c;
	private JButton btn23_p2c;
	private JButton btn24_p2c;
	private JButton btn25_p2c;
	private JButton btn20_p2c;
	private JMenuBar menuBar;
	File logFile = new File("log_Planta2.txt");
	private ArrayList<JButton> botones;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					planta2_alarmas frame = new planta2_alarmas();
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
	public planta2_alarmas() {
		setResizable(false);
		setTitle("Planta 2 Alarmas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1134, 620);
		menuBar = new JMenuBar();
		menuBar.setForeground(Color.WHITE);
		menuBar.setBackground(Color.GRAY);
		setJMenuBar(menuBar);
		
		Menu = new JMenuItem("Menu");
		menuBar.add(Menu);
		Menu.setBackground(Color.LIGHT_GRAY);
		Menu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent me) {
				Menu.setBackground(Color.black);
				Menu.setForeground(Color.white);
			}
			@Override
			public void mouseExited(MouseEvent me){
				Menu.setBackground(Color.LIGHT_GRAY);
				Menu.setForeground(Color.black);
			}
		});
		Menu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				// Close actual frame and open another one
				menu_inicio menu = new menu_inicio();
				menu.setVisible(true);
				dispose();
			}
		});
		
		Alarmas = new JMenuItem("Planta baja");
		menuBar.add(Alarmas);
		Alarmas.setBackground(Color.black);
		Alarmas.setForeground(Color.white);
		Alarmas.setBorder(BorderFactory.createLineBorder(Color.white));
		
		Alarmas1 = new JMenuItem("Primera planta");
		menuBar.add(Alarmas1);
		Alarmas1.setBackground(Color.LIGHT_GRAY);
		Alarmas1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent me) {
				Alarmas1.setBackground(Color.black);
				Alarmas1.setForeground(Color.white);
			}
			@Override
			public void mouseExited(MouseEvent me) {
				Alarmas1.setBackground(Color.lightGray);
				Alarmas1.setForeground(Color.black);
			}
		});
		Alarmas1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				// Close actual frame and open another one
				planta1_alarmas Planta1 = new planta1_alarmas();
				Planta1.setVisible(true);
				dispose();
			}
		});

		Alarmas2 = new JMenuItem("Segunda planta");
		menuBar.add(Alarmas2);
		Alarmas2.setBackground(Color.LIGHT_GRAY);
		Alarmas2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				Alarmas2.setBackground(Color.black);
				Alarmas2.setForeground(Color.white);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				Alarmas2.setBackground(Color.lightGray);
				Alarmas2.setForeground(Color.black);
			}
		});
		Alarmas2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				// Close actual frame and open another one
				planta2_alarmas Planta2 = new planta2_alarmas();
				Planta2.setVisible(true);
				dispose();
			}
		});
	
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		Panelimagen_planta2 p = new Panelimagen_planta2();
		p.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(p);
		
		SpringLayout sl_p = new SpringLayout();
		p.setLayout(sl_p);
		
		
		
		botones = new ArrayList<JButton>();
		
		btn1_p2c = new JButton("");
		sl_p.putConstraint(SpringLayout.WEST, btn1_p2c, 49, SpringLayout.WEST, p);
		btn1_p2c.setToolTipText("apagado");
		sl_p.putConstraint(SpringLayout.NORTH, btn1_p2c, 0, SpringLayout.NORTH, p);
		sl_p.putConstraint(SpringLayout.SOUTH, btn1_p2c, -530, SpringLayout.SOUTH, p);
		btn1_p2c.setIcon(new ImageIcon(planta2_alarmas.class.getResource("/imagenes/sensor.png")));
		p.add(btn1_p2c);
		
		btn2_p2c = new JButton("");
		sl_p.putConstraint(SpringLayout.WEST, btn2_p2c, 76, SpringLayout.WEST, p);
		btn2_p2c.setToolTipText("apagado");
		sl_p.putConstraint(SpringLayout.NORTH, btn2_p2c, 82, SpringLayout.SOUTH, btn1_p2c);
		btn2_p2c.setIcon(new ImageIcon(planta2_alarmas.class.getResource("/imagenes/sensor.png")));
		p.add(btn2_p2c);
		
		btn3_p2c = new JButton("");
		sl_p.putConstraint(SpringLayout.EAST, btn2_p2c, -67, SpringLayout.WEST, btn3_p2c);
		btn3_p2c.setToolTipText("apagado");
		sl_p.putConstraint(SpringLayout.SOUTH, btn2_p2c, -8, SpringLayout.SOUTH, btn3_p2c);
		sl_p.putConstraint(SpringLayout.NORTH, btn3_p2c, 123, SpringLayout.NORTH, p);
		sl_p.putConstraint(SpringLayout.WEST, btn3_p2c, 188, SpringLayout.WEST, p);
		sl_p.putConstraint(SpringLayout.SOUTH, btn3_p2c, 157, SpringLayout.NORTH, p);
		sl_p.putConstraint(SpringLayout.EAST, btn3_p2c, 227, SpringLayout.WEST, p);
		btn3_p2c.setIcon(new ImageIcon(planta2_alarmas.class.getResource("/imagenes/sensor.png")));
		p.add(btn3_p2c);
		
		btn4_p2c = new JButton("");
		sl_p.putConstraint(SpringLayout.WEST, btn4_p2c, 324, SpringLayout.WEST, p);
		sl_p.putConstraint(SpringLayout.EAST, btn4_p2c, -754, SpringLayout.EAST, p);
		sl_p.putConstraint(SpringLayout.EAST, btn1_p2c, -236, SpringLayout.WEST, btn4_p2c);
		btn4_p2c.setToolTipText("apagado");
		sl_p.putConstraint(SpringLayout.NORTH, btn4_p2c, 15, SpringLayout.NORTH, p);
		sl_p.putConstraint(SpringLayout.SOUTH, btn4_p2c, 49, SpringLayout.NORTH, p);
		btn4_p2c.setIcon(new ImageIcon(planta2_alarmas.class.getResource("/imagenes/sensor.png")));
		p.add(btn4_p2c);
		
		btn5_p2c = new JButton("");
		btn5_p2c.setToolTipText("apagado");
		sl_p.putConstraint(SpringLayout.NORTH, btn5_p2c, 79, SpringLayout.SOUTH, btn4_p2c);
		sl_p.putConstraint(SpringLayout.WEST, btn5_p2c, 0, SpringLayout.WEST, btn4_p2c);
		sl_p.putConstraint(SpringLayout.SOUTH, btn5_p2c, 0, SpringLayout.SOUTH, btn3_p2c);
		sl_p.putConstraint(SpringLayout.EAST, btn5_p2c, 142, SpringLayout.EAST, btn3_p2c);
		btn5_p2c.setIcon(new ImageIcon(planta2_alarmas.class.getResource("/imagenes/sensor.png")));
		p.add(btn5_p2c);
		
		btn6_p2c = new JButton("");
		sl_p.putConstraint(SpringLayout.WEST, btn6_p2c, 459, SpringLayout.WEST, p);
		btn6_p2c.setToolTipText("apagado");
		sl_p.putConstraint(SpringLayout.NORTH, btn6_p2c, 15, SpringLayout.NORTH, p);
		sl_p.putConstraint(SpringLayout.SOUTH, btn6_p2c, 0, SpringLayout.SOUTH, btn4_p2c);
		sl_p.putConstraint(SpringLayout.EAST, btn6_p2c, 148, SpringLayout.EAST, btn4_p2c);
		btn6_p2c.setIcon(new ImageIcon(planta2_alarmas.class.getResource("/imagenes/sensor.png")));
		p.add(btn6_p2c);
		
		btn7_p2c = new JButton("");
		btn7_p2c.setToolTipText("apagado");
		sl_p.putConstraint(SpringLayout.NORTH, btn7_p2c, 69, SpringLayout.SOUTH, btn6_p2c);
		sl_p.putConstraint(SpringLayout.WEST, btn7_p2c, 101, SpringLayout.EAST, btn5_p2c);
		sl_p.putConstraint(SpringLayout.EAST, btn7_p2c, 5, SpringLayout.EAST, btn6_p2c);
		btn7_p2c.setIcon(new ImageIcon(planta2_alarmas.class.getResource("/imagenes/sensor.png")));
		p.add(btn7_p2c);
		
		btn9_p2c = new JButton("");
		btn9_p2c.setToolTipText("apagado");
		sl_p.putConstraint(SpringLayout.NORTH, btn9_p2c, 38, SpringLayout.NORTH, p);
		sl_p.putConstraint(SpringLayout.WEST, btn9_p2c, 200, SpringLayout.EAST, btn6_p2c);
		sl_p.putConstraint(SpringLayout.SOUTH, btn9_p2c, 10, SpringLayout.SOUTH, btn4_p2c);
		sl_p.putConstraint(SpringLayout.EAST, btn9_p2c, -388, SpringLayout.EAST, p);
		btn9_p2c.setIcon(new ImageIcon(planta2_alarmas.class.getResource("/imagenes/sensor.png")));
		p.add(btn9_p2c);
		
		btn8_p2c = new JButton("");
		sl_p.putConstraint(SpringLayout.NORTH, btn8_p2c, 29, SpringLayout.NORTH, p);
		btn8_p2c.setToolTipText("apagado");
		sl_p.putConstraint(SpringLayout.WEST, btn8_p2c, 41, SpringLayout.EAST, btn6_p2c);
		sl_p.putConstraint(SpringLayout.EAST, btn8_p2c, 54, SpringLayout.EAST, btn7_p2c);
		btn8_p2c.setIcon(new ImageIcon(planta2_alarmas.class.getResource("/imagenes/sensor.png")));
		p.add(btn8_p2c);
		
		btn10_p2c = new JButton("");
		sl_p.putConstraint(SpringLayout.WEST, btn10_p2c, 56, SpringLayout.EAST, btn9_p2c);
		sl_p.putConstraint(SpringLayout.EAST, btn10_p2c, -287, SpringLayout.EAST, p);
		btn10_p2c.setToolTipText("apagado");
		sl_p.putConstraint(SpringLayout.NORTH, btn10_p2c, 8, SpringLayout.NORTH, btn1_p2c);
		sl_p.putConstraint(SpringLayout.SOUTH, btn10_p2c, 0, SpringLayout.SOUTH, btn4_p2c);
		btn10_p2c.setIcon(new ImageIcon(planta2_alarmas.class.getResource("/imagenes/sensor.png")));
		p.add(btn10_p2c);
		
		btn11_p2c = new JButton("");
		btn11_p2c.setToolTipText("apagado");
		sl_p.putConstraint(SpringLayout.NORTH, btn11_p2c, 134, SpringLayout.NORTH, p);
		sl_p.putConstraint(SpringLayout.WEST, btn11_p2c, 228, SpringLayout.EAST, btn7_p2c);
		sl_p.putConstraint(SpringLayout.SOUTH, btn11_p2c, 45, SpringLayout.NORTH, btn3_p2c);
		sl_p.putConstraint(SpringLayout.EAST, btn11_p2c, 267, SpringLayout.EAST, btn7_p2c);
		btn11_p2c.setIcon(new ImageIcon(planta2_alarmas.class.getResource("/imagenes/sensor.png")));
		p.add(btn11_p2c);
		
		btn12_p2c = new JButton("");
		btn12_p2c.setToolTipText("apagado");
		sl_p.putConstraint(SpringLayout.NORTH, btn12_p2c, 8, SpringLayout.NORTH, btn2_p2c);
		sl_p.putConstraint(SpringLayout.WEST, btn12_p2c, 85, SpringLayout.EAST, btn11_p2c);
		sl_p.putConstraint(SpringLayout.SOUTH, btn12_p2c, 0, SpringLayout.SOUTH, btn3_p2c);
		sl_p.putConstraint(SpringLayout.EAST, btn12_p2c, 124, SpringLayout.EAST, btn11_p2c);
		btn12_p2c.setIcon(new ImageIcon(planta2_alarmas.class.getResource("/imagenes/sensor.png")));
		p.add(btn12_p2c);
		
		btn13_p2c = new JButton("");
		sl_p.putConstraint(SpringLayout.WEST, btn13_p2c, 872, SpringLayout.WEST, p);
		btn13_p2c.setToolTipText("apagado");
		sl_p.putConstraint(SpringLayout.NORTH, btn13_p2c, 0, SpringLayout.NORTH, btn1_p2c);
		sl_p.putConstraint(SpringLayout.SOUTH, btn13_p2c, -123, SpringLayout.SOUTH, btn12_p2c);
		sl_p.putConstraint(SpringLayout.EAST, btn13_p2c, 94, SpringLayout.EAST, btn10_p2c);
		btn13_p2c.setIcon(new ImageIcon(planta2_alarmas.class.getResource("/imagenes/sensor.png")));
		p.add(btn13_p2c);
		
		btn14_p2c = new JButton("");
		btn14_p2c.setToolTipText("apagado");
		sl_p.putConstraint(SpringLayout.WEST, btn14_p2c, -93, SpringLayout.EAST, p);
		sl_p.putConstraint(SpringLayout.SOUTH, btn14_p2c, 29, SpringLayout.NORTH, btn4_p2c);
		btn14_p2c.setIcon(new ImageIcon(planta2_alarmas.class.getResource("/imagenes/sensor.png")));
		sl_p.putConstraint(SpringLayout.NORTH, btn14_p2c, 0, SpringLayout.NORTH, btn4_p2c);
		sl_p.putConstraint(SpringLayout.EAST, btn14_p2c, -36, SpringLayout.EAST, p);
		p.add(btn14_p2c);
		
		btn15_p2c = new JButton("");
		btn15_p2c.setToolTipText("apagado");
		sl_p.putConstraint(SpringLayout.NORTH, btn15_p2c, 26, SpringLayout.SOUTH, btn14_p2c);
		sl_p.putConstraint(SpringLayout.WEST, btn15_p2c, 46, SpringLayout.WEST, btn14_p2c);
		sl_p.putConstraint(SpringLayout.SOUTH, btn15_p2c, -64, SpringLayout.SOUTH, btn11_p2c);
		sl_p.putConstraint(SpringLayout.EAST, btn15_p2c, -10, SpringLayout.EAST, p);
		btn15_p2c.setIcon(new ImageIcon(planta2_alarmas.class.getResource("/imagenes/sensor.png")));
		p.add(btn15_p2c);
		
		btn16_p2c = new JButton("");
		sl_p.putConstraint(SpringLayout.NORTH, btn16_p2c, 7, SpringLayout.SOUTH, btn15_p2c);
		sl_p.putConstraint(SpringLayout.WEST, btn16_p2c, 117, SpringLayout.EAST, btn12_p2c);
		sl_p.putConstraint(SpringLayout.SOUTH, btn16_p2c, -394, SpringLayout.SOUTH, p);
		sl_p.putConstraint(SpringLayout.EAST, btn16_p2c, -43, SpringLayout.EAST, p);
		btn16_p2c.setToolTipText("apagado");
		btn16_p2c.setIcon(new ImageIcon(planta2_alarmas.class.getResource("/imagenes/sensor.png")));
		p.add(btn16_p2c);
		
		btn17_p2c = new JButton("");
		sl_p.putConstraint(SpringLayout.NORTH, btn17_p2c, 277, SpringLayout.NORTH, p);
		sl_p.putConstraint(SpringLayout.SOUTH, btn8_p2c, -219, SpringLayout.NORTH, btn17_p2c);
		btn17_p2c.setToolTipText("apagado");
		sl_p.putConstraint(SpringLayout.SOUTH, btn17_p2c, -249, SpringLayout.SOUTH, p);
		sl_p.putConstraint(SpringLayout.WEST, btn17_p2c, 535, SpringLayout.WEST, p);
		sl_p.putConstraint(SpringLayout.EAST, btn17_p2c, -528, SpringLayout.EAST, p);
		btn17_p2c.setIcon(new ImageIcon(planta2_alarmas.class.getResource("/imagenes/sensor.png")));
		p.add(btn17_p2c);
		
		btn18_p2c = new JButton("");
		sl_p.putConstraint(SpringLayout.NORTH, btn18_p2c, 119, SpringLayout.SOUTH, btn9_p2c);
		btn18_p2c.setToolTipText("apagado");
		sl_p.putConstraint(SpringLayout.WEST, btn18_p2c, 660, SpringLayout.WEST, p);
		sl_p.putConstraint(SpringLayout.EAST, btn18_p2c, -405, SpringLayout.EAST, p);
		btn18_p2c.setIcon(new ImageIcon(planta2_alarmas.class.getResource("/imagenes/sensor.png")));
		p.add(btn18_p2c);
		
		btn19_p2c = new JButton("");
		sl_p.putConstraint(SpringLayout.SOUTH, btn18_p2c, -65, SpringLayout.NORTH, btn19_p2c);
		sl_p.putConstraint(SpringLayout.NORTH, btn19_p2c, 277, SpringLayout.NORTH, p);
		sl_p.putConstraint(SpringLayout.SOUTH, btn19_p2c, -249, SpringLayout.SOUTH, p);
		sl_p.putConstraint(SpringLayout.WEST, btn19_p2c, 83, SpringLayout.EAST, btn17_p2c);
		sl_p.putConstraint(SpringLayout.EAST, btn19_p2c, -388, SpringLayout.EAST, p);
		btn19_p2c.setToolTipText("apagado");
		btn19_p2c.setIcon(new ImageIcon(planta2_alarmas.class.getResource("/imagenes/sensor.png")));
		p.add(btn19_p2c);
		
		btn20_p2c = new JButton("");
		sl_p.putConstraint(SpringLayout.NORTH, btn20_p2c, 384, SpringLayout.NORTH, p);
		sl_p.putConstraint(SpringLayout.WEST, btn20_p2c, 383, SpringLayout.WEST, p);
		sl_p.putConstraint(SpringLayout.SOUTH, btn20_p2c, -133, SpringLayout.SOUTH, p);
		btn20_p2c.setToolTipText("apagado");
		btn20_p2c.setIcon(new ImageIcon(planta2_alarmas.class.getResource("/imagenes/sensor.png")));
		p.add(btn20_p2c);
		
		btn21_p2c = new JButton("");
		sl_p.putConstraint(SpringLayout.NORTH, btn21_p2c, 383, SpringLayout.NORTH, p);
		sl_p.putConstraint(SpringLayout.WEST, btn21_p2c, 61, SpringLayout.EAST, btn20_p2c);
		btn21_p2c.setToolTipText("apagado");
		sl_p.putConstraint(SpringLayout.SOUTH, btn7_p2c, -226, SpringLayout.NORTH, btn21_p2c);
		btn21_p2c.setIcon(new ImageIcon(planta2_alarmas.class.getResource("/imagenes/sensor.png")));
		p.add(btn21_p2c);
		
		btn22_p2c = new JButton("");
		sl_p.putConstraint(SpringLayout.SOUTH, btn21_p2c, -11, SpringLayout.NORTH, btn22_p2c);
		sl_p.putConstraint(SpringLayout.NORTH, btn22_p2c, 415, SpringLayout.NORTH, p);
		sl_p.putConstraint(SpringLayout.WEST, btn22_p2c, 479, SpringLayout.WEST, p);
		sl_p.putConstraint(SpringLayout.EAST, btn20_p2c, -39, SpringLayout.WEST, btn22_p2c);
		sl_p.putConstraint(SpringLayout.SOUTH, btn22_p2c, -123, SpringLayout.SOUTH, p);
		btn22_p2c.setToolTipText("apagado");
		btn22_p2c.setIcon(new ImageIcon(planta2_alarmas.class.getResource("/imagenes/sensor.png")));
		p.add(btn22_p2c);
		
		btn23_p2c = new JButton("");
		sl_p.putConstraint(SpringLayout.NORTH, btn23_p2c, -119, SpringLayout.SOUTH, p);
		sl_p.putConstraint(SpringLayout.WEST, btn23_p2c, 626, SpringLayout.WEST, p);
		sl_p.putConstraint(SpringLayout.SOUTH, btn23_p2c, -98, SpringLayout.SOUTH, p);
		sl_p.putConstraint(SpringLayout.EAST, btn23_p2c, -445, SpringLayout.EAST, p);
		btn23_p2c.setIcon(new ImageIcon(planta2_alarmas.class.getResource("/imagenes/sensor.png")));
		btn23_p2c.setToolTipText("apagado");

		p.add(btn23_p2c);
		
		btn24_p2c = new JButton("");
		sl_p.putConstraint(SpringLayout.EAST, btn22_p2c, -178, SpringLayout.WEST, btn24_p2c);
		sl_p.putConstraint(SpringLayout.WEST, btn24_p2c, 711, SpringLayout.WEST, p);
		sl_p.putConstraint(SpringLayout.NORTH, btn24_p2c, 103, SpringLayout.SOUTH, btn19_p2c);
		sl_p.putConstraint(SpringLayout.SOUTH, btn24_p2c, -133, SpringLayout.SOUTH, p);
		btn24_p2c.setIcon(new ImageIcon(planta2_alarmas.class.getResource("/imagenes/sensor.png")));
		btn24_p2c.setToolTipText("apagado");

		p.add(btn24_p2c);
		
		btn25_p2c = new JButton("");
		sl_p.putConstraint(SpringLayout.WEST, btn25_p2c, 810, SpringLayout.WEST, p);
		sl_p.putConstraint(SpringLayout.EAST, btn25_p2c, -255, SpringLayout.EAST, p);
		sl_p.putConstraint(SpringLayout.EAST, btn21_p2c, -277, SpringLayout.WEST, btn25_p2c);
		sl_p.putConstraint(SpringLayout.NORTH, btn25_p2c, 326, SpringLayout.SOUTH, btn10_p2c);
		sl_p.putConstraint(SpringLayout.SOUTH, btn25_p2c, -142, SpringLayout.SOUTH, p);
		sl_p.putConstraint(SpringLayout.EAST, btn24_p2c, -60, SpringLayout.WEST, btn25_p2c);
		btn25_p2c.setToolTipText("apagado");

		btn25_p2c.setIcon(new ImageIcon(planta2_alarmas.class.getResource("/imagenes/sensor.png")));
		p.add(btn25_p2c);
		
		btn1_p2c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiar(btn1_p2c);
				
				
			}
				
				
			
		});
		btn2_p2c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiar(btn2_p2c);
			}
				
				
			
		});
		btn3_p2c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiar(btn3_p2c);
			}
				
				
			
		});
	
		btn4_p2c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiar(btn4_p2c);
			}
				
				
			
		});
		
		btn5_p2c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiar(btn5_p2c);
			}
				
				
			
		});
		btn6_p2c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiar(btn6_p2c);
			}
				
				
			
		});
		btn7_p2c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiar(btn7_p2c);
			}
				
				
			
		});

		btn8_p2c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiar(btn8_p2c);
			}
				
				
			
		});

		btn9_p2c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiar(btn9_p2c);
			}
				
				
			
		});

		btn10_p2c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiar(btn10_p2c);
			}
				
				
			
		});

		btn11_p2c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiar(btn11_p2c);
			}
				
				
			
		});

		btn12_p2c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiar(btn12_p2c);
			}
				
				
			
		});
		
		btn13_p2c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiar(btn13_p2c);
			}
				
				
			
		});
		btn14_p2c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiar(btn14_p2c);
			}
				
				
			
		});
		btn15_p2c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiar(btn15_p2c);
			}
				
				
			
		});
		btn16_p2c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiar(btn16_p2c);
			}
				
				
			
		});
		btn17_p2c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiar(btn17_p2c);
			}
				
				
			
		});
		btn18_p2c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiar(btn18_p2c);
			}
				
				
			
		});
		btn19_p2c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiar(btn19_p2c);
			}
				
				
			
		});
		btn20_p2c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiar(btn20_p2c);
			}
				
				
			
		});
		btn21_p2c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiar(btn21_p2c);
			}
				
				
			
		});
		btn22_p2c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiar(btn22_p2c);
			}
				
				
			
		});
		btn23_p2c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiar(btn23_p2c);
			}
				
				
			
		});
		btn24_p2c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiar(btn24_p2c);
			}
				
				
			
		});
		btn25_p2c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiar(btn25_p2c);
			}
				
				
			
		});
		
		
		
		
		
		@SuppressWarnings("unused")
		SpringLayout sl_contentPane = new SpringLayout();
		
		//añadimos todos los botones al array
		botones = new ArrayList<JButton>();
		botones.add(btn1_p2c);
		botones.add(btn2_p2c);
		botones.add(btn3_p2c);
		botones.add(btn4_p2c);
		botones.add(btn5_p2c);
		botones.add(btn6_p2c);
		botones.add(btn7_p2c);
		botones.add(btn8_p2c);
		botones.add(btn9_p2c);
		botones.add(btn10_p2c);
		botones.add(btn11_p2c);
		botones.add(btn12_p2c);
		botones.add(btn13_p2c);
		botones.add(btn14_p2c);
		botones.add(btn15_p2c);
		botones.add(btn16_p2c);
		botones.add(btn17_p2c);
		botones.add(btn18_p2c);
		botones.add(btn19_p2c);
		botones.add(btn20_p2c);
		botones.add(btn21_p2c);
		botones.add(btn22_p2c);
		botones.add(btn23_p2c);
		botones.add(btn24_p2c);
		botones.add(btn25_p2c);

		
		for (JButton boton : botones) {
		boton.setBorder(BorderFactory.createLineBorder(Color.black));
		int temp = (Math.random() <= 0.5) ? 1 : 2;
		if (temp==1) {
			boton.setBackground(Color.RED);
			boton.setToolTipText("apagado");

		}else {
			boton.setBackground(Color.green);
			boton.setToolTipText("encendido");

		}
	
		
		}
	
	
		
	}

	
	
	
	//log
	
	public void cambiar(JButton btn) {
		SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
		Date date = new Date(System.currentTimeMillis());
		
		try {
			
			if (btn.getToolTipText() == "encendido") {
				
				btn.setToolTipText("apagado");
				btn.setBackground(Color.RED);
				
				BufferedWriter output = new BufferedWriter(new FileWriter(logFile, true));
				output.write("[" + formatter.format(date) + "] Apagando calefaccion ");
				output.newLine();
				output.close();

			}
			
			
		} catch (IOException e1) {
			e1.printStackTrace();
			System.out.println("error de escritura");
		}
	}
}	
