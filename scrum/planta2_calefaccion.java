package scrum;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.Image;
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
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import javax.swing.JMenu;
import javax.swing.JScrollPane;
import javax.swing.SpringLayout;
import java.awt.Dimension;
import java.awt.Font;

public class planta2_calefaccion extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JMenu Planta0, Planta1, Planta2;
	private JMenuItem Calefaccion,Calefaccion1,Calefaccion2;
	private JButton btnCalefaccionA;
	private JButton btnMenu_p2c;
	private JButton btn1_p2c;
	private JLabel lblestado;
	private JLabel lbl1;
	private JButton btn2_p2c;
	private JLabel lbl2;
	private JButton btn3_p2c;
	private JLabel lbl3;
	private JButton btn4_p2c;
	private JLabel lbl4;
	private JButton btn5_p2c;
	private JLabel lbl5;
	private JButton btn6_p2c;
	private JLabel lbl6;
	private JButton btn7_p2c;
	private JLabel lbl7;
	private JButton btn9_p2c;
	private JButton btn8_p2c;
	private JLabel lbl8;
	private JLabel lbl9;
	private JButton btn10_p2c;
	private JButton btn11_p2c;
	private JLabel lbl10;
	private JLabel lbl11;
	private JButton btn12_p2c;
	private JLabel lbl12;
	private JButton btn13_p2c;
	private JLabel lbl13;
	private JButton btn14_p2c;
	private JLabel lbl14;
	private JButton btn15_p2c;
	private JLabel lbl15;
	private JButton btn16_p2c;
	private JLabel lbl16;
	private JLabel lbl18;
	private JLabel lbl19;
	private JLabel lbl17;
	private JLabel lbl20;
	private JLabel lbl21;
	private JLabel lbl23;
	private JLabel lbl25;
	private JLabel lbl24;
	private JLabel lbl22;
	private JButton btn17_p2c;
	private JButton btn18_p2c;
	private JButton btn19_p2c;
	private JButton btn21_p2c;
	private JButton btn22_p2c;
	private JButton btn23_p2c;
	private JButton btn24_p2c;
	private JButton btn25_p2c;
	private JButton btn20_p2c;
	private JLabel estado1;
	private JLabel estado2;
	private JLabel estado4;
	private JLabel estado5;
	private JLabel estado6;
	private JLabel estado3;
	private JLabel estado7;
	private JLabel estado8;
	private JLabel E1;
	private JLabel E2;
	private JLabel E3;
	private JLabel E4;
	private JLabel E5;
	private JLabel E6;
	private JLabel E7;
	private JLabel E8;
	private JLabel E9;
	private JLabel estado10;
	private JLabel estado11;
	private JLabel estado12;
	private JLabel estado13;
	private JLabel estado_14;
	private JLabel estado15;
	private JLabel estado16;
	private JLabel E11;
	private JLabel E12;
	private JLabel E13;
	private JLabel E14;
	private JLabel E15;
	private JLabel E16;
	private JLabel E10;
	private JLabel estado17;
	private JLabel estado18;
	private JLabel estado19;
	private JLabel estado20;
	private JLabel estado21;
	private JLabel estado22;
	private JLabel estado23;
	private JLabel estado24;
	private JLabel E17;
	private JLabel E18;
	private JLabel E19;
	private JLabel E20;
	private JLabel E21;
	private JLabel E22;
	private JLabel E23;
	private JLabel E24;
	private JLabel estado25;
	private JLabel E25;
	private JLabel estado9;
	private JMenuBar menuBar;
	File logFile = new File("log_Planta2.txt");
	private JButton btnCalefaccioneE;
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
		setResizable(false);
		setTitle("Planta 2 Calefaccion");
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
		
		

		
		Calefaccion = new JMenuItem("Calefaccion");
		Calefaccion.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
            	//Close actual frame and open another one
            	planta_baja_calefaccion Planta0 = new planta_baja_calefaccion();
            	Planta0.setVisible(true);
            	dispose();
            }
		});
		
		Planta0.add(Calefaccion);

	
		Calefaccion1 = new JMenuItem("Calefaccion");
		Calefaccion1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
            	//Close actual frame and open another one
            	planta1_calefaccion Planta1 = new planta1_calefaccion();
            	Planta1.setVisible(true);
            	dispose();
            }
		});
		Planta1.add(Calefaccion1);

		Calefaccion2 = new JMenuItem("Calefaccion");
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
		
		btnCalefaccionA = new JButton("Apagar Todo");
		btnCalefaccionA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		p.add(btnCalefaccionA);
		
		btnMenu_p2c = new JButton("Men\u00FA");
		sl_p.putConstraint(SpringLayout.NORTH, btnCalefaccionA, 0, SpringLayout.NORTH, btnMenu_p2c);
		sl_p.putConstraint(SpringLayout.WEST, btnMenu_p2c, 49, SpringLayout.WEST, p);
		sl_p.putConstraint(SpringLayout.SOUTH, btnMenu_p2c, -66, SpringLayout.SOUTH, p);
		p.add(btnMenu_p2c);
		btnMenu_p2c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Close actual frame and open another one
            	menu_inicio menu = new menu_inicio();
            	menu.setVisible(true);
            	dispose();
			}
		});
		
		lblestado = new JLabel("Estado");
		lblestado.setFont(new Font("Tahoma", Font.PLAIN, 34));
		p.add(lblestado);
		
		btn1_p2c = new JButton("");
		
		sl_p.putConstraint(SpringLayout.EAST, lblestado, 62, SpringLayout.EAST, btn1_p2c);
		sl_p.putConstraint(SpringLayout.NORTH, btn1_p2c, 0, SpringLayout.NORTH, p);
		sl_p.putConstraint(SpringLayout.SOUTH, btn1_p2c, -530, SpringLayout.SOUTH, p);
		btn1_p2c.setIcon(new ImageIcon(planta2_calefaccion.class.getResource("/imagenes/calefaccion.png")));
		p.add(btn1_p2c);
		
		lbl1 = new JLabel("1");
		sl_p.putConstraint(SpringLayout.WEST, btn1_p2c, 2, SpringLayout.EAST, lbl1);
		sl_p.putConstraint(SpringLayout.WEST, lblestado, 0, SpringLayout.WEST, lbl1);
		sl_p.putConstraint(SpringLayout.NORTH, lbl1, 0, SpringLayout.NORTH, p);
		sl_p.putConstraint(SpringLayout.WEST, lbl1, 29, SpringLayout.WEST, p);
		sl_p.putConstraint(SpringLayout.EAST, lbl1, -1063, SpringLayout.EAST, p);
		p.add(lbl1);
		
		btn2_p2c = new JButton("");
		sl_p.putConstraint(SpringLayout.NORTH, btn2_p2c, 82, SpringLayout.SOUTH, btn1_p2c);
		sl_p.putConstraint(SpringLayout.EAST, btn2_p2c, -989, SpringLayout.EAST, p);
		btn2_p2c.setIcon(new ImageIcon(planta2_calefaccion.class.getResource("/imagenes/calefaccion.png")));
		p.add(btn2_p2c);
		
		lbl2 = new JLabel("2");
		sl_p.putConstraint(SpringLayout.WEST, btn2_p2c, 21, SpringLayout.EAST, lbl2);
		sl_p.putConstraint(SpringLayout.NORTH, lbl2, 103, SpringLayout.NORTH, p);
		sl_p.putConstraint(SpringLayout.EAST, lbl2, -1055, SpringLayout.EAST, p);
		p.add(lbl2);
		
		btn3_p2c = new JButton("");
		sl_p.putConstraint(SpringLayout.SOUTH, btn2_p2c, -8, SpringLayout.SOUTH, btn3_p2c);
		sl_p.putConstraint(SpringLayout.NORTH, btn3_p2c, 123, SpringLayout.NORTH, p);
		sl_p.putConstraint(SpringLayout.WEST, btn3_p2c, 188, SpringLayout.WEST, p);
		sl_p.putConstraint(SpringLayout.SOUTH, btn3_p2c, 157, SpringLayout.NORTH, p);
		sl_p.putConstraint(SpringLayout.EAST, btn3_p2c, 227, SpringLayout.WEST, p);
		btn3_p2c.setIcon(new ImageIcon(planta2_calefaccion.class.getResource("/imagenes/calefaccion.png")));
		p.add(btn3_p2c);
		
		lbl3 = new JLabel("3");
		sl_p.putConstraint(SpringLayout.NORTH, lbl3, 133, SpringLayout.NORTH, p);
		sl_p.putConstraint(SpringLayout.EAST, lbl3, -6, SpringLayout.WEST, btn3_p2c);
		p.add(lbl3);
		
		btn4_p2c = new JButton("");
		sl_p.putConstraint(SpringLayout.EAST, btn1_p2c, -236, SpringLayout.WEST, btn4_p2c);
		sl_p.putConstraint(SpringLayout.NORTH, btn4_p2c, 15, SpringLayout.NORTH, p);
		sl_p.putConstraint(SpringLayout.SOUTH, btn4_p2c, 49, SpringLayout.NORTH, p);
		sl_p.putConstraint(SpringLayout.EAST, btn4_p2c, -754, SpringLayout.EAST, p);
		btn4_p2c.setIcon(new ImageIcon(planta2_calefaccion.class.getResource("/imagenes/calefaccion.png")));
		p.add(btn4_p2c);
		
		lbl4 = new JLabel("4");
		sl_p.putConstraint(SpringLayout.EAST, lbl4, -795, SpringLayout.EAST, p);
		sl_p.putConstraint(SpringLayout.WEST, btn4_p2c, 9, SpringLayout.EAST, lbl4);
		sl_p.putConstraint(SpringLayout.NORTH, lbl4, 29, SpringLayout.NORTH, p);
		p.add(lbl4);
		
		btn5_p2c = new JButton("");
		sl_p.putConstraint(SpringLayout.NORTH, btn5_p2c, 79, SpringLayout.SOUTH, btn4_p2c);
		sl_p.putConstraint(SpringLayout.WEST, btn5_p2c, 0, SpringLayout.WEST, btn4_p2c);
		sl_p.putConstraint(SpringLayout.SOUTH, btn5_p2c, 0, SpringLayout.SOUTH, btn3_p2c);
		sl_p.putConstraint(SpringLayout.EAST, btn5_p2c, 142, SpringLayout.EAST, btn3_p2c);
		btn5_p2c.setIcon(new ImageIcon(planta2_calefaccion.class.getResource("/imagenes/calefaccion.png")));
		p.add(btn5_p2c);
		
		lbl5 = new JLabel("5");
		sl_p.putConstraint(SpringLayout.NORTH, lbl5, 0, SpringLayout.NORTH, lbl3);
		sl_p.putConstraint(SpringLayout.EAST, lbl5, -3, SpringLayout.WEST, btn5_p2c);
		p.add(lbl5);
		
		btn6_p2c = new JButton("");
		sl_p.putConstraint(SpringLayout.NORTH, btn6_p2c, 15, SpringLayout.NORTH, p);
		sl_p.putConstraint(SpringLayout.WEST, btn6_p2c, 103, SpringLayout.EAST, btn4_p2c);
		sl_p.putConstraint(SpringLayout.SOUTH, btn6_p2c, 0, SpringLayout.SOUTH, btn4_p2c);
		sl_p.putConstraint(SpringLayout.EAST, btn6_p2c, 148, SpringLayout.EAST, btn4_p2c);
		btn6_p2c.setIcon(new ImageIcon(planta2_calefaccion.class.getResource("/imagenes/calefaccion.png")));
		p.add(btn6_p2c);
		
		lbl6 = new JLabel("6");
		sl_p.putConstraint(SpringLayout.NORTH, lbl6, 0, SpringLayout.NORTH, lbl4);
		sl_p.putConstraint(SpringLayout.EAST, lbl6, -2, SpringLayout.WEST, btn6_p2c);
		p.add(lbl6);
		
		btn7_p2c = new JButton("");
		sl_p.putConstraint(SpringLayout.NORTH, btn7_p2c, 69, SpringLayout.SOUTH, btn6_p2c);
		sl_p.putConstraint(SpringLayout.WEST, btn7_p2c, 101, SpringLayout.EAST, btn5_p2c);
		sl_p.putConstraint(SpringLayout.EAST, btn7_p2c, 5, SpringLayout.EAST, btn6_p2c);
		btn7_p2c.setIcon(new ImageIcon(planta2_calefaccion.class.getResource("/imagenes/calefaccion.png")));
		p.add(btn7_p2c);
		
		lbl7 = new JLabel("7");
		sl_p.putConstraint(SpringLayout.SOUTH, lbl7, 0, SpringLayout.SOUTH, btn2_p2c);
		sl_p.putConstraint(SpringLayout.EAST, lbl7, 0, SpringLayout.EAST, lbl6);
		p.add(lbl7);
		
		btn9_p2c = new JButton("");
		sl_p.putConstraint(SpringLayout.NORTH, btn9_p2c, 38, SpringLayout.NORTH, p);
		sl_p.putConstraint(SpringLayout.WEST, btn9_p2c, 200, SpringLayout.EAST, btn6_p2c);
		sl_p.putConstraint(SpringLayout.SOUTH, btn9_p2c, 10, SpringLayout.SOUTH, btn4_p2c);
		sl_p.putConstraint(SpringLayout.EAST, btn9_p2c, -388, SpringLayout.EAST, p);
		btn9_p2c.setIcon(new ImageIcon(planta2_calefaccion.class.getResource("/imagenes/calefaccion.png")));
		p.add(btn9_p2c);
		
		btn8_p2c = new JButton("");
		sl_p.putConstraint(SpringLayout.NORTH, btn8_p2c, 0, SpringLayout.NORTH, lbl4);
		sl_p.putConstraint(SpringLayout.WEST, btn8_p2c, 41, SpringLayout.EAST, btn6_p2c);
		sl_p.putConstraint(SpringLayout.SOUTH, btn8_p2c, 58, SpringLayout.NORTH, p);
		sl_p.putConstraint(SpringLayout.EAST, btn8_p2c, 54, SpringLayout.EAST, btn7_p2c);
		btn8_p2c.setIcon(new ImageIcon(planta2_calefaccion.class.getResource("/imagenes/calefaccion.png")));
		p.add(btn8_p2c);
		
		lbl8 = new JLabel("8");
		sl_p.putConstraint(SpringLayout.SOUTH, lbl8, 0, SpringLayout.SOUTH, btn4_p2c);
		sl_p.putConstraint(SpringLayout.EAST, lbl8, -12, SpringLayout.WEST, btn8_p2c);
		p.add(lbl8);
		
		lbl9 = new JLabel("9");
		sl_p.putConstraint(SpringLayout.NORTH, lbl9, 0, SpringLayout.NORTH, btn9_p2c);
		sl_p.putConstraint(SpringLayout.EAST, lbl9, -11, SpringLayout.WEST, btn9_p2c);
		p.add(lbl9);
		
		btn10_p2c = new JButton("");
		sl_p.putConstraint(SpringLayout.NORTH, btn10_p2c, 8, SpringLayout.NORTH, btn1_p2c);
		sl_p.putConstraint(SpringLayout.SOUTH, btn10_p2c, 0, SpringLayout.SOUTH, btn4_p2c);
		sl_p.putConstraint(SpringLayout.EAST, btn10_p2c, 101, SpringLayout.EAST, btn9_p2c);
		btn10_p2c.setIcon(new ImageIcon(planta2_calefaccion.class.getResource("/imagenes/calefaccion.png")));
		p.add(btn10_p2c);
		
		btn11_p2c = new JButton("");
		sl_p.putConstraint(SpringLayout.NORTH, btn11_p2c, 134, SpringLayout.NORTH, p);
		sl_p.putConstraint(SpringLayout.WEST, btn11_p2c, 228, SpringLayout.EAST, btn7_p2c);
		sl_p.putConstraint(SpringLayout.SOUTH, btn11_p2c, 45, SpringLayout.NORTH, btn3_p2c);
		sl_p.putConstraint(SpringLayout.EAST, btn11_p2c, 267, SpringLayout.EAST, btn7_p2c);
		btn11_p2c.setIcon(new ImageIcon(planta2_calefaccion.class.getResource("/imagenes/calefaccion.png")));
		p.add(btn11_p2c);
		
		lbl10 = new JLabel("10");
		sl_p.putConstraint(SpringLayout.EAST, lbl10, -338, SpringLayout.EAST, p);
		sl_p.putConstraint(SpringLayout.WEST, btn10_p2c, 6, SpringLayout.EAST, lbl10);
		sl_p.putConstraint(SpringLayout.NORTH, lbl10, 0, SpringLayout.NORTH, lbl4);
		p.add(lbl10);
		
		lbl11 = new JLabel("11");
		sl_p.putConstraint(SpringLayout.WEST, lbl11, 245, SpringLayout.EAST, btn7_p2c);
		sl_p.putConstraint(SpringLayout.SOUTH, lbl11, -6, SpringLayout.NORTH, btn11_p2c);
		p.add(lbl11);
		
		btn12_p2c = new JButton("");
		sl_p.putConstraint(SpringLayout.NORTH, btn12_p2c, 8, SpringLayout.NORTH, btn2_p2c);
		sl_p.putConstraint(SpringLayout.WEST, btn12_p2c, 85, SpringLayout.EAST, btn11_p2c);
		sl_p.putConstraint(SpringLayout.SOUTH, btn12_p2c, 0, SpringLayout.SOUTH, btn3_p2c);
		sl_p.putConstraint(SpringLayout.EAST, btn12_p2c, 124, SpringLayout.EAST, btn11_p2c);
		btn12_p2c.setIcon(new ImageIcon(planta2_calefaccion.class.getResource("/imagenes/calefaccion.png")));
		p.add(btn12_p2c);
		
		lbl12 = new JLabel("12");
		sl_p.putConstraint(SpringLayout.SOUTH, lbl12, 0, SpringLayout.SOUTH, lbl11);
		sl_p.putConstraint(SpringLayout.EAST, lbl12, -28, SpringLayout.WEST, btn12_p2c);
		p.add(lbl12);
		
		btn13_p2c = new JButton("");
		sl_p.putConstraint(SpringLayout.NORTH, btn13_p2c, 0, SpringLayout.NORTH, btn1_p2c);
		sl_p.putConstraint(SpringLayout.WEST, btn13_p2c, 49, SpringLayout.EAST, btn10_p2c);
		sl_p.putConstraint(SpringLayout.SOUTH, btn13_p2c, -123, SpringLayout.SOUTH, btn12_p2c);
		sl_p.putConstraint(SpringLayout.EAST, btn13_p2c, 94, SpringLayout.EAST, btn10_p2c);
		btn13_p2c.setIcon(new ImageIcon(planta2_calefaccion.class.getResource("/imagenes/calefaccion.png")));
		p.add(btn13_p2c);
		
		lbl13 = new JLabel("13");
		sl_p.putConstraint(SpringLayout.SOUTH, lbl13, 0, SpringLayout.SOUTH, btn4_p2c);
		sl_p.putConstraint(SpringLayout.EAST, lbl13, 0, SpringLayout.EAST, btn12_p2c);
		p.add(lbl13);
		
		btn14_p2c = new JButton("");
		sl_p.putConstraint(SpringLayout.WEST, btn14_p2c, -93, SpringLayout.EAST, p);
		sl_p.putConstraint(SpringLayout.SOUTH, btn14_p2c, 29, SpringLayout.NORTH, btn4_p2c);
		btn14_p2c.setIcon(new ImageIcon(planta2_calefaccion.class.getResource("/imagenes/calefaccion.png")));
		sl_p.putConstraint(SpringLayout.NORTH, btn14_p2c, 0, SpringLayout.NORTH, btn4_p2c);
		sl_p.putConstraint(SpringLayout.EAST, btn14_p2c, -36, SpringLayout.EAST, p);
		p.add(btn14_p2c);
		
		lbl14 = new JLabel("14");
		sl_p.putConstraint(SpringLayout.NORTH, lbl14, 0, SpringLayout.NORTH, lbl4);
		sl_p.putConstraint(SpringLayout.EAST, lbl14, -6, SpringLayout.WEST, btn14_p2c);
		p.add(lbl14);
		
		btn15_p2c = new JButton("");
		sl_p.putConstraint(SpringLayout.NORTH, btn15_p2c, 26, SpringLayout.SOUTH, btn14_p2c);
		sl_p.putConstraint(SpringLayout.WEST, btn15_p2c, 46, SpringLayout.WEST, btn14_p2c);
		sl_p.putConstraint(SpringLayout.SOUTH, btn15_p2c, -64, SpringLayout.SOUTH, btn11_p2c);
		sl_p.putConstraint(SpringLayout.EAST, btn15_p2c, -10, SpringLayout.EAST, p);
		btn15_p2c.setIcon(new ImageIcon(planta2_calefaccion.class.getResource("/imagenes/calefaccion.png")));
		p.add(btn15_p2c);
		
		lbl15 = new JLabel("15");
		sl_p.putConstraint(SpringLayout.NORTH, lbl15, 33, SpringLayout.SOUTH, btn14_p2c);
		sl_p.putConstraint(SpringLayout.WEST, lbl15, 0, SpringLayout.WEST, btn14_p2c);
		p.add(lbl15);
		
		btn16_p2c = new JButton("");
		sl_p.putConstraint(SpringLayout.NORTH, btn16_p2c, 21, SpringLayout.SOUTH, lbl15);
		sl_p.putConstraint(SpringLayout.WEST, btn16_p2c, 0, SpringLayout.WEST, btn14_p2c);
		sl_p.putConstraint(SpringLayout.SOUTH, btn16_p2c, 0, SpringLayout.SOUTH, btn3_p2c);
		sl_p.putConstraint(SpringLayout.EAST, btn16_p2c, 39, SpringLayout.EAST, lbl15);
		btn16_p2c.setIcon(new ImageIcon(planta2_calefaccion.class.getResource("/imagenes/calefaccion.png")));
		p.add(btn16_p2c);
		
		lbl16 = new JLabel("16");
		sl_p.putConstraint(SpringLayout.NORTH, lbl16, 0, SpringLayout.NORTH, lbl3);
		sl_p.putConstraint(SpringLayout.EAST, lbl16, -18, SpringLayout.WEST, btn16_p2c);
		p.add(lbl16);
		
		lbl18 = new JLabel("18");
		sl_p.putConstraint(SpringLayout.NORTH, lbl18, 149, SpringLayout.SOUTH, btn9_p2c);
		sl_p.putConstraint(SpringLayout.EAST, lbl18, 0, SpringLayout.EAST, btn9_p2c);
		p.add(lbl18);
		
		lbl19 = new JLabel("19");
		sl_p.putConstraint(SpringLayout.WEST, lbl19, 0, SpringLayout.WEST, btn9_p2c);
		p.add(lbl19);
		
		lbl17 = new JLabel("17");
		sl_p.putConstraint(SpringLayout.NORTH, lbl19, 0, SpringLayout.NORTH, lbl17);
		sl_p.putConstraint(SpringLayout.WEST, lbl17, 0, SpringLayout.WEST, btn8_p2c);
		p.add(lbl17);
		
		lbl20 = new JLabel("20");
		sl_p.putConstraint(SpringLayout.SOUTH, lbl20, -163, SpringLayout.SOUTH, p);
		sl_p.putConstraint(SpringLayout.EAST, lbl20, 0, SpringLayout.EAST, lbl6);
		p.add(lbl20);
		
		lbl21 = new JLabel("21");
		sl_p.putConstraint(SpringLayout.NORTH, lbl21, 0, SpringLayout.NORTH, lbl20);
		sl_p.putConstraint(SpringLayout.EAST, lbl21, 0, SpringLayout.EAST, btn8_p2c);
		p.add(lbl21);
		
		lbl23 = new JLabel("23");
		sl_p.putConstraint(SpringLayout.SOUTH, lbl23, -88, SpringLayout.SOUTH, p);
		sl_p.putConstraint(SpringLayout.EAST, lbl23, -512, SpringLayout.EAST, p);
		p.add(lbl23);
		
		lbl25 = new JLabel("25");
		sl_p.putConstraint(SpringLayout.SOUTH, lbl25, -133, SpringLayout.SOUTH, p);
		sl_p.putConstraint(SpringLayout.EAST, lbl25, -238, SpringLayout.EAST, p);
		p.add(lbl25);
		
		lbl24 = new JLabel("24");
		sl_p.putConstraint(SpringLayout.NORTH, lbl24, 0, SpringLayout.NORTH, lbl25);
		sl_p.putConstraint(SpringLayout.EAST, lbl24, -153, SpringLayout.WEST, lbl25);
		p.add(lbl24);
		
		lbl22 = new JLabel("22");
		sl_p.putConstraint(SpringLayout.NORTH, lbl22, 27, SpringLayout.SOUTH, lbl21);
		sl_p.putConstraint(SpringLayout.WEST, lbl22, 0, SpringLayout.WEST, btn8_p2c);
		p.add(lbl22);
		
		btn17_p2c = new JButton("");
		sl_p.putConstraint(SpringLayout.NORTH, btn17_p2c, 219, SpringLayout.SOUTH, btn8_p2c);
		sl_p.putConstraint(SpringLayout.SOUTH, btn17_p2c, -249, SpringLayout.SOUTH, p);
		sl_p.putConstraint(SpringLayout.NORTH, lbl17, 6, SpringLayout.SOUTH, btn17_p2c);
		sl_p.putConstraint(SpringLayout.WEST, btn17_p2c, 535, SpringLayout.WEST, p);
		sl_p.putConstraint(SpringLayout.EAST, btn17_p2c, -528, SpringLayout.EAST, p);
		btn17_p2c.setIcon(new ImageIcon(planta2_calefaccion.class.getResource("/imagenes/calefaccion.png")));
		p.add(btn17_p2c);
		
		btn18_p2c = new JButton("");
		sl_p.putConstraint(SpringLayout.SOUTH, lblestado, 0, SpringLayout.SOUTH, btn18_p2c);
		sl_p.putConstraint(SpringLayout.NORTH, btn18_p2c, 119, SpringLayout.SOUTH, btn9_p2c);
		sl_p.putConstraint(SpringLayout.WEST, btn18_p2c, 660, SpringLayout.WEST, p);
		sl_p.putConstraint(SpringLayout.SOUTH, btn18_p2c, -193, SpringLayout.NORTH, lbl24);
		sl_p.putConstraint(SpringLayout.EAST, btn18_p2c, -405, SpringLayout.EAST, p);
		btn18_p2c.setIcon(new ImageIcon(planta2_calefaccion.class.getResource("/imagenes/calefaccion.png")));
		p.add(btn18_p2c);
		
		btn19_p2c = new JButton("");
		sl_p.putConstraint(SpringLayout.NORTH, btn19_p2c, 0, SpringLayout.NORTH, btn17_p2c);
		sl_p.putConstraint(SpringLayout.WEST, btn19_p2c, -28, SpringLayout.EAST, lbl9);
		sl_p.putConstraint(SpringLayout.SOUTH, btn19_p2c, -6, SpringLayout.NORTH, lbl19);
		sl_p.putConstraint(SpringLayout.EAST, btn19_p2c, 0, SpringLayout.EAST, btn9_p2c);
		btn19_p2c.setIcon(new ImageIcon(planta2_calefaccion.class.getResource("/imagenes/calefaccion.png")));
		p.add(btn19_p2c);
		
		btn20_p2c = new JButton("");
		sl_p.putConstraint(SpringLayout.NORTH, btn20_p2c, -167, SpringLayout.SOUTH, p);
		sl_p.putConstraint(SpringLayout.WEST, btn20_p2c, -63, SpringLayout.WEST, lbl20);
		sl_p.putConstraint(SpringLayout.SOUTH, btn20_p2c, 0, SpringLayout.SOUTH, lbl25);
		sl_p.putConstraint(SpringLayout.EAST, btn20_p2c, -6, SpringLayout.WEST, lbl20);
		btn20_p2c.setIcon(new ImageIcon(planta2_calefaccion.class.getResource("/imagenes/calefaccion.png")));
		p.add(btn20_p2c);
		
		btn21_p2c = new JButton("");
		sl_p.putConstraint(SpringLayout.SOUTH, btn7_p2c, -226, SpringLayout.NORTH, btn21_p2c);
		sl_p.putConstraint(SpringLayout.NORTH, btn21_p2c, 8, SpringLayout.NORTH, lbl20);
		sl_p.putConstraint(SpringLayout.WEST, btn21_p2c, -34, SpringLayout.WEST, btn17_p2c);
		sl_p.putConstraint(SpringLayout.SOUTH, btn21_p2c, 102, SpringLayout.SOUTH, btn17_p2c);
		sl_p.putConstraint(SpringLayout.EAST, btn21_p2c, -19, SpringLayout.WEST, lbl21);
		btn21_p2c.setIcon(new ImageIcon(planta2_calefaccion.class.getResource("/imagenes/calefaccion.png")));
		p.add(btn21_p2c);
		
		btn22_p2c = new JButton("");
		sl_p.putConstraint(SpringLayout.NORTH, btn22_p2c, 10, SpringLayout.NORTH, lbl25);
		sl_p.putConstraint(SpringLayout.WEST, btn22_p2c, 39, SpringLayout.EAST, btn20_p2c);
		sl_p.putConstraint(SpringLayout.SOUTH, btn22_p2c, 0, SpringLayout.SOUTH, lbl22);
		sl_p.putConstraint(SpringLayout.EAST, btn22_p2c, -12, SpringLayout.WEST, lbl22);
		btn22_p2c.setIcon(new ImageIcon(planta2_calefaccion.class.getResource("/imagenes/calefaccion.png")));
		p.add(btn22_p2c);
		
		btn23_p2c = new JButton("");
		sl_p.putConstraint(SpringLayout.NORTH, btn23_p2c, -119, SpringLayout.SOUTH, p);
		sl_p.putConstraint(SpringLayout.WEST, btn23_p2c, 28, SpringLayout.EAST, lbl23);
		sl_p.putConstraint(SpringLayout.SOUTH, btn23_p2c, -98, SpringLayout.SOUTH, p);
		sl_p.putConstraint(SpringLayout.EAST, btn23_p2c, 67, SpringLayout.EAST, lbl23);
		btn23_p2c.setIcon(new ImageIcon(planta2_calefaccion.class.getResource("/imagenes/calefaccion.png")));
		p.add(btn23_p2c);
		
		btn24_p2c = new JButton("");
		sl_p.putConstraint(SpringLayout.NORTH, btn24_p2c, 0, SpringLayout.NORTH, lbl25);
		sl_p.putConstraint(SpringLayout.WEST, btn24_p2c, 0, SpringLayout.WEST, lbl18);
		sl_p.putConstraint(SpringLayout.SOUTH, btn24_p2c, -10, SpringLayout.SOUTH, lbl22);
		sl_p.putConstraint(SpringLayout.EAST, btn24_p2c, -15, SpringLayout.EAST, lbl11);
		btn24_p2c.setIcon(new ImageIcon(planta2_calefaccion.class.getResource("/imagenes/calefaccion.png")));
		p.add(btn24_p2c);
		
		btn25_p2c = new JButton("");
		sl_p.putConstraint(SpringLayout.NORTH, btn25_p2c, 0, SpringLayout.NORTH, lbl20);
		sl_p.putConstraint(SpringLayout.WEST, btn25_p2c, -62, SpringLayout.EAST, lbl25);
		sl_p.putConstraint(SpringLayout.SOUTH, btn25_p2c, 201, SpringLayout.NORTH, lbl18);
		sl_p.putConstraint(SpringLayout.EAST, btn25_p2c, -6, SpringLayout.WEST, lbl25);
		btn25_p2c.setIcon(new ImageIcon(planta2_calefaccion.class.getResource("/imagenes/calefaccion.png")));
		p.add(btn25_p2c);
		
		estado1 = new JLabel("1");
		sl_p.putConstraint(SpringLayout.WEST, estado1, 29, SpringLayout.WEST, p);
		p.add(estado1);
		
		estado2 = new JLabel("2");
		sl_p.putConstraint(SpringLayout.WEST, estado2, 29, SpringLayout.WEST, p);
		sl_p.putConstraint(SpringLayout.SOUTH, estado1, -6, SpringLayout.NORTH, estado2);
		p.add(estado2);
		
		estado4 = new JLabel("4");
		sl_p.putConstraint(SpringLayout.WEST, estado4, 29, SpringLayout.WEST, p);
		sl_p.putConstraint(SpringLayout.SOUTH, estado4, 0, SpringLayout.SOUTH, btn17_p2c);
		p.add(estado4);
		
		estado5 = new JLabel("5");
		sl_p.putConstraint(SpringLayout.NORTH, estado5, 0, SpringLayout.NORTH, lbl19);
		sl_p.putConstraint(SpringLayout.WEST, estado5, 29, SpringLayout.WEST, p);
		p.add(estado5);
		
		estado6 = new JLabel("6");
		sl_p.putConstraint(SpringLayout.NORTH, estado6, 6, SpringLayout.SOUTH, estado5);
		sl_p.putConstraint(SpringLayout.WEST, estado6, 29, SpringLayout.WEST, p);
		p.add(estado6);
		
		estado3 = new JLabel("3");
		sl_p.putConstraint(SpringLayout.WEST, estado3, 29, SpringLayout.WEST, p);
		sl_p.putConstraint(SpringLayout.SOUTH, estado2, -6, SpringLayout.NORTH, estado3);
		sl_p.putConstraint(SpringLayout.SOUTH, estado3, -6, SpringLayout.NORTH, estado4);
		p.add(estado3);
		
		estado7 = new JLabel("7");
		sl_p.putConstraint(SpringLayout.NORTH, estado7, 6, SpringLayout.SOUTH, estado6);
		sl_p.putConstraint(SpringLayout.WEST, estado7, 29, SpringLayout.WEST, p);
		p.add(estado7);
		
		estado8 = new JLabel("8");
		sl_p.putConstraint(SpringLayout.NORTH, estado8, 6, SpringLayout.SOUTH, estado7);
		sl_p.putConstraint(SpringLayout.WEST, estado8, 29, SpringLayout.WEST, p);
		p.add(estado8);
		
		E1 = new JLabel("Apagado");
		sl_p.putConstraint(SpringLayout.WEST, E1, 14, SpringLayout.EAST, estado1);
		sl_p.putConstraint(SpringLayout.EAST, E1, 0, SpringLayout.EAST, btn2_p2c);
		E1.setForeground(Color.RED);
		sl_p.putConstraint(SpringLayout.SOUTH, E1, 0, SpringLayout.SOUTH, estado1);
		p.add(E1);
		
		E2 = new JLabel("Apagado");
		sl_p.putConstraint(SpringLayout.WEST, E2, 14, SpringLayout.EAST, estado2);
		sl_p.putConstraint(SpringLayout.EAST, E2, 0, SpringLayout.EAST, btn2_p2c);
		E2.setForeground(Color.RED);
		sl_p.putConstraint(SpringLayout.NORTH, E2, 0, SpringLayout.NORTH, estado2);
		p.add(E2);
		
		E3 = new JLabel("Apagado");
		sl_p.putConstraint(SpringLayout.WEST, E3, 14, SpringLayout.EAST, estado3);
		E3.setForeground(Color.RED);
		sl_p.putConstraint(SpringLayout.SOUTH, E3, 0, SpringLayout.SOUTH, estado3);
		p.add(E3);
		
		E4 = new JLabel("Apagado");
		sl_p.putConstraint(SpringLayout.WEST, E4, 14, SpringLayout.EAST, estado4);
		E4.setForeground(Color.RED);
		sl_p.putConstraint(SpringLayout.NORTH, E4, 0, SpringLayout.NORTH, estado4);
		p.add(E4);
		
		E5 = new JLabel("Apagado");
		sl_p.putConstraint(SpringLayout.WEST, E5, 14, SpringLayout.EAST, estado5);
		E5.setForeground(Color.RED);
		sl_p.putConstraint(SpringLayout.NORTH, E5, 0, SpringLayout.NORTH, lbl19);
		p.add(E5);
		
		E6 = new JLabel("Apagado");
		sl_p.putConstraint(SpringLayout.WEST, E6, 14, SpringLayout.EAST, estado6);
		E6.setForeground(Color.RED);
		sl_p.putConstraint(SpringLayout.NORTH, E6, 0, SpringLayout.NORTH, estado6);
		p.add(E6);
		
		E7 = new JLabel("Apagado");
		sl_p.putConstraint(SpringLayout.WEST, E7, 14, SpringLayout.EAST, estado7);
		E7.setForeground(Color.RED);
		sl_p.putConstraint(SpringLayout.NORTH, E7, 0, SpringLayout.NORTH, estado7);
		p.add(E7);
		
		E8 = new JLabel("Apagado");
		sl_p.putConstraint(SpringLayout.WEST, E8, 14, SpringLayout.EAST, estado8);
		E8.setForeground(Color.RED);
		sl_p.putConstraint(SpringLayout.NORTH, E8, 0, SpringLayout.NORTH, estado8);
		p.add(E8);
		
		E9 = new JLabel("Apagado");
		sl_p.putConstraint(SpringLayout.NORTH, E9, 0, SpringLayout.NORTH, estado1);
		E9.setForeground(Color.RED);
		p.add(E9);
		
		estado10 = new JLabel("10");
		sl_p.putConstraint(SpringLayout.WEST, estado10, 2, SpringLayout.EAST, E2);
		sl_p.putConstraint(SpringLayout.WEST, btnCalefaccionA, 0, SpringLayout.WEST, estado10);
		sl_p.putConstraint(SpringLayout.NORTH, estado10, 0, SpringLayout.NORTH, estado2);
		p.add(estado10);
		
		estado11 = new JLabel("11");
		sl_p.putConstraint(SpringLayout.EAST, E3, -17, SpringLayout.WEST, estado11);
		sl_p.putConstraint(SpringLayout.NORTH, estado11, 0, SpringLayout.NORTH, estado3);
		sl_p.putConstraint(SpringLayout.EAST, estado11, 0, SpringLayout.EAST, estado10);
		p.add(estado11);
		
		estado12 = new JLabel("12");
		sl_p.putConstraint(SpringLayout.SOUTH, estado12, 0, SpringLayout.SOUTH, btn17_p2c);
		sl_p.putConstraint(SpringLayout.EAST, estado12, 0, SpringLayout.EAST, estado10);
		p.add(estado12);
		
		estado13 = new JLabel("13");
		sl_p.putConstraint(SpringLayout.NORTH, estado13, 0, SpringLayout.NORTH, lbl19);
		sl_p.putConstraint(SpringLayout.EAST, estado13, 0, SpringLayout.EAST, estado10);
		p.add(estado13);
		
		estado_14 = new JLabel("14");
		sl_p.putConstraint(SpringLayout.NORTH, estado_14, 0, SpringLayout.NORTH, estado6);
		sl_p.putConstraint(SpringLayout.EAST, estado_14, 0, SpringLayout.EAST, estado10);
		p.add(estado_14);
		
		estado15 = new JLabel("15");
		sl_p.putConstraint(SpringLayout.NORTH, estado15, 0, SpringLayout.NORTH, estado7);
		sl_p.putConstraint(SpringLayout.EAST, estado15, 0, SpringLayout.EAST, estado10);
		p.add(estado15);
		
		estado16 = new JLabel("16");
		sl_p.putConstraint(SpringLayout.NORTH, estado16, 0, SpringLayout.NORTH, estado8);
		sl_p.putConstraint(SpringLayout.WEST, estado16, 0, SpringLayout.WEST, estado10);
		p.add(estado16);
		
		E11 = new JLabel("Apagado");
		sl_p.putConstraint(SpringLayout.NORTH, E11, 0, SpringLayout.NORTH, estado3);
		sl_p.putConstraint(SpringLayout.WEST, E11, 21, SpringLayout.EAST, estado11);
		E11.setForeground(Color.RED);
		p.add(E11);
		
		E12 = new JLabel("Apagado");
		sl_p.putConstraint(SpringLayout.WEST, E12, 21, SpringLayout.EAST, estado12);
		sl_p.putConstraint(SpringLayout.SOUTH, E12, 0, SpringLayout.SOUTH, btn17_p2c);
		E12.setForeground(Color.RED);
		p.add(E12);
		
		E13 = new JLabel("Apagado");
		sl_p.putConstraint(SpringLayout.NORTH, E13, 0, SpringLayout.NORTH, lbl19);
		sl_p.putConstraint(SpringLayout.WEST, E13, 21, SpringLayout.EAST, estado13);
		E13.setForeground(Color.RED);
		p.add(E13);
		
		E14 = new JLabel("Apagado");
		sl_p.putConstraint(SpringLayout.NORTH, E14, 0, SpringLayout.NORTH, estado6);
		sl_p.putConstraint(SpringLayout.WEST, E14, 21, SpringLayout.EAST, estado_14);
		E14.setForeground(Color.RED);
		p.add(E14);
		
		E15 = new JLabel("Apagado");
		sl_p.putConstraint(SpringLayout.NORTH, E15, 0, SpringLayout.NORTH, estado7);
		sl_p.putConstraint(SpringLayout.WEST, E15, 21, SpringLayout.EAST, estado15);
		E15.setForeground(Color.RED);
		p.add(E15);
		
		E16 = new JLabel("Apagado");
		sl_p.putConstraint(SpringLayout.NORTH, E16, 0, SpringLayout.NORTH, estado8);
		sl_p.putConstraint(SpringLayout.WEST, E16, 21, SpringLayout.EAST, estado16);
		E16.setForeground(Color.RED);
		p.add(E16);
		
		E10 = new JLabel("Apagado");
		sl_p.putConstraint(SpringLayout.NORTH, E10, 0, SpringLayout.NORTH, estado2);
		sl_p.putConstraint(SpringLayout.WEST, E10, 21, SpringLayout.EAST, estado10);
		E10.setForeground(Color.RED);
		p.add(E10);
		
		estado17 = new JLabel("17");
		sl_p.putConstraint(SpringLayout.EAST, E9, -26, SpringLayout.WEST, estado17);
		sl_p.putConstraint(SpringLayout.NORTH, estado17, 0, SpringLayout.NORTH, estado1);
		p.add(estado17);
		
		estado18 = new JLabel("18");
		sl_p.putConstraint(SpringLayout.EAST, E10, -13, SpringLayout.WEST, estado18);
		sl_p.putConstraint(SpringLayout.NORTH, estado18, 0, SpringLayout.NORTH, estado2);
		p.add(estado18);
		
		estado19 = new JLabel("19");
		sl_p.putConstraint(SpringLayout.NORTH, estado19, 0, SpringLayout.NORTH, estado3);
		p.add(estado19);
		
		estado20 = new JLabel("20");
		sl_p.putConstraint(SpringLayout.SOUTH, estado20, 0, SpringLayout.SOUTH, btn17_p2c);
		p.add(estado20);
		
		estado21 = new JLabel("21");
		sl_p.putConstraint(SpringLayout.NORTH, estado21, 0, SpringLayout.NORTH, lbl19);
		p.add(estado21);
		
		estado22 = new JLabel("22");
		sl_p.putConstraint(SpringLayout.NORTH, estado22, 0, SpringLayout.NORTH, estado6);
		p.add(estado22);
		
		estado23 = new JLabel("23");
		sl_p.putConstraint(SpringLayout.NORTH, estado23, 0, SpringLayout.NORTH, estado7);
		p.add(estado23);
		
		estado24 = new JLabel("24");
		sl_p.putConstraint(SpringLayout.NORTH, estado24, 0, SpringLayout.NORTH, estado1);
		p.add(estado24);
		
		E17 = new JLabel("Apagado");
		sl_p.putConstraint(SpringLayout.WEST, E17, 282, SpringLayout.WEST, p);
		sl_p.putConstraint(SpringLayout.EAST, estado17, -16, SpringLayout.WEST, E17);
		sl_p.putConstraint(SpringLayout.NORTH, E17, 0, SpringLayout.NORTH, estado1);
		sl_p.putConstraint(SpringLayout.EAST, E17, -6, SpringLayout.WEST, estado24);
		E17.setForeground(Color.RED);
		p.add(E17);
		
		E18 = new JLabel("Apagado");
		sl_p.putConstraint(SpringLayout.WEST, E18, 282, SpringLayout.WEST, p);
		sl_p.putConstraint(SpringLayout.EAST, estado18, -16, SpringLayout.WEST, E18);
		sl_p.putConstraint(SpringLayout.EAST, E18, 0, SpringLayout.EAST, E17);
		sl_p.putConstraint(SpringLayout.NORTH, E18, 0, SpringLayout.NORTH, estado2);
		E18.setForeground(Color.RED);
		p.add(E18);
		
		E19 = new JLabel("Apagado");
		sl_p.putConstraint(SpringLayout.WEST, E19, 282, SpringLayout.WEST, p);
		sl_p.putConstraint(SpringLayout.EAST, estado19, -16, SpringLayout.WEST, E19);
		sl_p.putConstraint(SpringLayout.NORTH, E19, 0, SpringLayout.NORTH, estado3);
		sl_p.putConstraint(SpringLayout.EAST, E19, 0, SpringLayout.EAST, E17);
		E19.setForeground(Color.RED);
		p.add(E19);
		
		E20 = new JLabel("Apagado");
		sl_p.putConstraint(SpringLayout.WEST, E20, 282, SpringLayout.WEST, p);
		sl_p.putConstraint(SpringLayout.EAST, estado20, -16, SpringLayout.WEST, E20);
		sl_p.putConstraint(SpringLayout.SOUTH, E20, 0, SpringLayout.SOUTH, btn17_p2c);
		sl_p.putConstraint(SpringLayout.EAST, E20, 0, SpringLayout.EAST, E17);
		E20.setForeground(Color.RED);
		p.add(E20);
		
		E21 = new JLabel("Apagado");
		sl_p.putConstraint(SpringLayout.WEST, E21, 282, SpringLayout.WEST, p);
		sl_p.putConstraint(SpringLayout.EAST, estado21, -16, SpringLayout.WEST, E21);
		sl_p.putConstraint(SpringLayout.NORTH, E21, 0, SpringLayout.NORTH, lbl19);
		sl_p.putConstraint(SpringLayout.EAST, E21, 0, SpringLayout.EAST, E17);
		E21.setForeground(Color.RED);
		p.add(E21);
		
		E22 = new JLabel("Apagado");
		sl_p.putConstraint(SpringLayout.WEST, E22, 282, SpringLayout.WEST, p);
		sl_p.putConstraint(SpringLayout.EAST, estado22, -16, SpringLayout.WEST, E22);
		sl_p.putConstraint(SpringLayout.NORTH, E22, 0, SpringLayout.NORTH, estado6);
		sl_p.putConstraint(SpringLayout.EAST, E22, 0, SpringLayout.EAST, E17);
		E22.setForeground(Color.RED);
		p.add(E22);
		
		E23 = new JLabel("Apagado");
		sl_p.putConstraint(SpringLayout.WEST, E23, 282, SpringLayout.WEST, p);
		sl_p.putConstraint(SpringLayout.EAST, estado23, -16, SpringLayout.WEST, E23);
		sl_p.putConstraint(SpringLayout.NORTH, E23, 0, SpringLayout.NORTH, estado7);
		sl_p.putConstraint(SpringLayout.EAST, E23, 0, SpringLayout.EAST, E17);
		E23.setForeground(Color.RED);
		p.add(E23);
		
		E24 = new JLabel("Apagado");
		sl_p.putConstraint(SpringLayout.NORTH, E24, 0, SpringLayout.NORTH, estado1);
		sl_p.putConstraint(SpringLayout.WEST, E24, 16, SpringLayout.EAST, estado24);
		sl_p.putConstraint(SpringLayout.EAST, E24, -606, SpringLayout.EAST, p);
		E24.setForeground(Color.RED);
		p.add(E24);
		
		estado25 = new JLabel("25");
		sl_p.putConstraint(SpringLayout.WEST, estado24, 0, SpringLayout.WEST, estado25);
		sl_p.putConstraint(SpringLayout.NORTH, estado25, 0, SpringLayout.NORTH, estado2);
		p.add(estado25);
		
		E25 = new JLabel("Apagado");
		sl_p.putConstraint(SpringLayout.EAST, estado25, -16, SpringLayout.WEST, E25);
		sl_p.putConstraint(SpringLayout.NORTH, E25, 0, SpringLayout.NORTH, estado2);
		sl_p.putConstraint(SpringLayout.WEST, E25, -40, SpringLayout.EAST, lbl6);
		sl_p.putConstraint(SpringLayout.EAST, E25, 0, SpringLayout.EAST, btn6_p2c);
		E25.setForeground(Color.RED);
		p.add(E25);
		
		estado9 = new JLabel("9");
		sl_p.putConstraint(SpringLayout.WEST, E9, 5, SpringLayout.EAST, estado9);
		sl_p.putConstraint(SpringLayout.WEST, estado9, 8, SpringLayout.EAST, E1);
		sl_p.putConstraint(SpringLayout.EAST, estado9, -960, SpringLayout.EAST, p);
		sl_p.putConstraint(SpringLayout.NORTH, estado9, 0, SpringLayout.NORTH, estado1);
		p.add(estado9);
		
		btnCalefaccioneE = new JButton("Encender Todo");
		sl_p.putConstraint(SpringLayout.NORTH, btnCalefaccioneE, 0, SpringLayout.NORTH, btnCalefaccionA);
		sl_p.putConstraint(SpringLayout.WEST, btnCalefaccioneE, 23, SpringLayout.EAST, btnCalefaccionA);
		p.add(btnCalefaccioneE);
		
		btn1_p2c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiar(btn1_p2c, E1,lbl1);
			}
				
				
			
		});
		btn2_p2c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiar(btn2_p2c, E2,lbl2);
			}
				
				
			
		});
		btn3_p2c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiar(btn3_p2c, E3,lbl3);
			}
				
				
			
		});
	
		btn4_p2c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiar(btn4_p2c, E4,lbl4);
			}
				
				
			
		});
		
		btn5_p2c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiar(btn5_p2c, E5,lbl5);
			}
				
				
			
		});
		btn6_p2c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiar(btn6_p2c, E6,lbl6);
			}
				
				
			
		});
		btn7_p2c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiar(btn7_p2c, E7,lbl7);
			}
				
				
			
		});

		btn8_p2c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiar(btn8_p2c, E8,lbl8);
			}
				
				
			
		});

		btn9_p2c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiar(btn9_p2c, E9,lbl9);
			}
				
				
			
		});

		btn10_p2c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiar(btn10_p2c, E10,lbl10);
			}
				
				
			
		});

		btn11_p2c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiar(btn11_p2c, E11,lbl11);
			}
				
				
			
		});

		btn12_p2c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiar(btn12_p2c, E12,lbl12);
			}
				
				
			
		});
		
		btn13_p2c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiar(btn13_p2c, E13,lbl13);
			}
				
				
			
		});
		btn14_p2c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiar(btn14_p2c, E14,lbl14);
			}
				
				
			
		});
		btn15_p2c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiar(btn15_p2c, E15,lbl15);
			}
				
				
			
		});
		btn16_p2c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiar(btn16_p2c, E16,lbl16);
			}
				
				
			
		});
		btn17_p2c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiar(btn17_p2c, E17,lbl17);
			}
				
				
			
		});
		btn18_p2c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiar(btn18_p2c, E18,lbl18);
			}
				
				
			
		});
		btn19_p2c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiar(btn19_p2c, E19,lbl19);
			}
				
				
			
		});
		btn20_p2c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiar(btn20_p2c, E20,lbl20);
			}
				
				
			
		});
		btn21_p2c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiar(btn21_p2c, E21,lbl21);
			}
				
				
			
		});
		btn22_p2c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiar(btn22_p2c, E22,lbl22);
			}
				
				
			
		});
		btn23_p2c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiar(btn23_p2c, E23,lbl23);
			}
				
				
			
		});
		btn24_p2c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiar(btn24_p2c, E24,lbl24);
			}
				
				
			
		});
		btn25_p2c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiar(btn25_p2c, E25,lbl25);
			}
				
				
			
		});
		
		
		
		
		
		SpringLayout sl_contentPane = new SpringLayout();
		
		

	
	
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	//log
	
	public void cambiar(JButton btn, JLabel lbl, JLabel lbl1) {
		SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
		Date date = new Date(System.currentTimeMillis());
		
		try {
			
			if (btn.getToolTipText() == "encendido") {
				
				btn.setToolTipText("apagado");
				int n = Integer.parseInt(lbl1.getText());
				lbl.setForeground(Color.RED);
				lbl.setText("Apagado");
				
				BufferedWriter output = new BufferedWriter(new FileWriter(logFile, true));
				output.write("[" + formatter.format(date) + "] Apagando calefaccion " + n);
				output.newLine();
				output.close();

			}
			else {
				
				btn.setToolTipText("encendido");
				int n = Integer.parseInt(lbl1.getText());

				lbl.setForeground(Color.GREEN);
				lbl.setText("Encendido");
	
				BufferedWriter output = new BufferedWriter(new FileWriter(logFile, true));
				output.write("[" + formatter.format(date) + "] Encendiendo calefaccion " + n);
				output.newLine();
				output.close();
				
			}
			
		} catch (IOException e1) {
			e1.printStackTrace();
			System.out.println("error de escritura");
		}
	}
}
