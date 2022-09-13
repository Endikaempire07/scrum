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
	private JMenuBar menuBar;
	private JMenu Planta0, Planta1, Planta2;
	private JMenuItem Calefaccion,Calefaccion1,Calefaccion2;
	private JButton btnCalefaccionT;
	private JButton btnMenu_p2c;
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
	private JLabel lbl16_6;
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
	private JLabel lblestado_1;
	private JLabel lblestado_2;
	private JLabel lblestado_3;
	private JLabel lblestado_4;
	private JLabel lblestado_5;
	private JLabel lblestado_6;
	private JLabel lblestado_7;
	private JLabel lblestado_8;
	private JLabel lblestado_10;
	private JLabel lblestado_11;
	private JLabel lblestado_12;
	private JLabel lblestado_13;
	private JLabel lblestado_14;
	private JLabel lblestado_15;
	private JLabel lblestado_16;
	private JLabel lblestado_17;
	private JLabel lblestado_18;
	private JLabel lblestado_19;
	private JLabel lblestado_9;
	private JLabel lblestado_20;
	private JLabel lblestado_21;
	private JLabel lblestado_22;
	private JLabel lblestado_23;
	private JLabel lblestado_24;
	private JLabel lblestado_25;
	private JLabel lblestado_26;
	private JLabel lblestado_28;
	private JLabel lblestado_29;
	private JLabel lblestado_30;
	private JLabel lblestado_31;
	private JLabel lblestado_32;
	private JLabel lblestado_33;
	private JLabel lblestado_27;
	private JLabel lblestado_34;
	private JLabel lblestado_35;
	private JLabel lblestado_36;
	private JLabel lblestado_37;
	private JLabel lblestado_38;
	private JLabel lblestado_39;
	private JLabel lblestado_40;
	private JLabel lblestado_41;
	private JLabel lblestado_42;
	private JLabel lblestado_43;
	private JLabel lblestado_44;
	private JLabel lblestado_45;
	private JLabel lblestado_46;
	private JLabel lblestado_47;
	private JLabel lblestado_48;
	private JLabel lblestado_49;
	private JLabel lblestado_50;
	private JLabel lblestado_51;
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
		
		btnCalefaccionT = new JButton("Apagar/Encender");
		p.add(btnCalefaccionT);
		
		btnMenu_p2c = new JButton("Men\u00FA");
		sl_p.putConstraint(SpringLayout.WEST, btnMenu_p2c, 49, SpringLayout.WEST, p);
		sl_p.putConstraint(SpringLayout.SOUTH, btnMenu_p2c, -66, SpringLayout.SOUTH, p);
		sl_p.putConstraint(SpringLayout.NORTH, btnCalefaccionT, 0, SpringLayout.NORTH, btnMenu_p2c);
		sl_p.putConstraint(SpringLayout.WEST, btnCalefaccionT, 49, SpringLayout.EAST, btnMenu_p2c);
		p.add(btnMenu_p2c);
		
		JLabel lblestado = new JLabel("Estado");
		lblestado.setFont(new Font("Tahoma", Font.PLAIN, 34));
		p.add(lblestado);
		
		JButton btn1_p2c = new JButton("");
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
		
		lbl16_6 = new JLabel("23");
		sl_p.putConstraint(SpringLayout.SOUTH, lbl16_6, -88, SpringLayout.SOUTH, p);
		sl_p.putConstraint(SpringLayout.EAST, lbl16_6, -512, SpringLayout.EAST, p);
		p.add(lbl16_6);
		
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
		sl_p.putConstraint(SpringLayout.WEST, btn23_p2c, 28, SpringLayout.EAST, lbl16_6);
		sl_p.putConstraint(SpringLayout.SOUTH, btn23_p2c, -98, SpringLayout.SOUTH, p);
		sl_p.putConstraint(SpringLayout.EAST, btn23_p2c, 67, SpringLayout.EAST, lbl16_6);
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
		
		lblestado_1 = new JLabel("1");
		sl_p.putConstraint(SpringLayout.WEST, lblestado_1, 29, SpringLayout.WEST, p);
		p.add(lblestado_1);
		
		lblestado_2 = new JLabel("2");
		sl_p.putConstraint(SpringLayout.WEST, lblestado_2, 29, SpringLayout.WEST, p);
		sl_p.putConstraint(SpringLayout.SOUTH, lblestado_1, -6, SpringLayout.NORTH, lblestado_2);
		p.add(lblestado_2);
		
		lblestado_3 = new JLabel("4");
		sl_p.putConstraint(SpringLayout.WEST, lblestado_3, 29, SpringLayout.WEST, p);
		sl_p.putConstraint(SpringLayout.SOUTH, lblestado_3, 0, SpringLayout.SOUTH, btn17_p2c);
		p.add(lblestado_3);
		
		lblestado_4 = new JLabel("5");
		sl_p.putConstraint(SpringLayout.NORTH, lblestado_4, 0, SpringLayout.NORTH, lbl19);
		sl_p.putConstraint(SpringLayout.WEST, lblestado_4, 29, SpringLayout.WEST, p);
		p.add(lblestado_4);
		
		lblestado_5 = new JLabel("6");
		sl_p.putConstraint(SpringLayout.NORTH, lblestado_5, 6, SpringLayout.SOUTH, lblestado_4);
		sl_p.putConstraint(SpringLayout.WEST, lblestado_5, 29, SpringLayout.WEST, p);
		p.add(lblestado_5);
		
		lblestado_6 = new JLabel("3");
		sl_p.putConstraint(SpringLayout.WEST, lblestado_6, 29, SpringLayout.WEST, p);
		sl_p.putConstraint(SpringLayout.SOUTH, lblestado_2, -6, SpringLayout.NORTH, lblestado_6);
		sl_p.putConstraint(SpringLayout.SOUTH, lblestado_6, -6, SpringLayout.NORTH, lblestado_3);
		p.add(lblestado_6);
		
		lblestado_7 = new JLabel("7");
		sl_p.putConstraint(SpringLayout.NORTH, lblestado_7, 6, SpringLayout.SOUTH, lblestado_5);
		sl_p.putConstraint(SpringLayout.WEST, lblestado_7, 29, SpringLayout.WEST, p);
		p.add(lblestado_7);
		
		lblestado_8 = new JLabel("8");
		sl_p.putConstraint(SpringLayout.NORTH, lblestado_8, 6, SpringLayout.SOUTH, lblestado_7);
		sl_p.putConstraint(SpringLayout.WEST, lblestado_8, 29, SpringLayout.WEST, p);
		p.add(lblestado_8);
		
		lblestado_10 = new JLabel("Apagado");
		sl_p.putConstraint(SpringLayout.WEST, lblestado_10, 14, SpringLayout.EAST, lblestado_1);
		lblestado_10.setForeground(Color.RED);
		sl_p.putConstraint(SpringLayout.SOUTH, lblestado_10, 0, SpringLayout.SOUTH, lblestado_1);
		p.add(lblestado_10);
		
		lblestado_11 = new JLabel("Apagado");
		sl_p.putConstraint(SpringLayout.WEST, lblestado_11, 14, SpringLayout.EAST, lblestado_2);
		lblestado_11.setForeground(Color.RED);
		sl_p.putConstraint(SpringLayout.NORTH, lblestado_11, 0, SpringLayout.NORTH, lblestado_2);
		p.add(lblestado_11);
		
		lblestado_12 = new JLabel("Apagado");
		sl_p.putConstraint(SpringLayout.WEST, lblestado_12, 14, SpringLayout.EAST, lblestado_6);
		lblestado_12.setForeground(Color.RED);
		sl_p.putConstraint(SpringLayout.SOUTH, lblestado_12, 0, SpringLayout.SOUTH, lblestado_6);
		p.add(lblestado_12);
		
		lblestado_13 = new JLabel("Apagado");
		sl_p.putConstraint(SpringLayout.WEST, lblestado_13, 14, SpringLayout.EAST, lblestado_3);
		lblestado_13.setForeground(Color.RED);
		sl_p.putConstraint(SpringLayout.NORTH, lblestado_13, 0, SpringLayout.NORTH, lblestado_3);
		p.add(lblestado_13);
		
		lblestado_14 = new JLabel("Apagado");
		sl_p.putConstraint(SpringLayout.WEST, lblestado_14, 14, SpringLayout.EAST, lblestado_4);
		lblestado_14.setForeground(Color.RED);
		sl_p.putConstraint(SpringLayout.NORTH, lblestado_14, 0, SpringLayout.NORTH, lbl19);
		p.add(lblestado_14);
		
		lblestado_15 = new JLabel("Apagado");
		sl_p.putConstraint(SpringLayout.WEST, lblestado_15, 14, SpringLayout.EAST, lblestado_5);
		lblestado_15.setForeground(Color.RED);
		sl_p.putConstraint(SpringLayout.NORTH, lblestado_15, 0, SpringLayout.NORTH, lblestado_5);
		p.add(lblestado_15);
		
		lblestado_16 = new JLabel("Apagado");
		sl_p.putConstraint(SpringLayout.WEST, lblestado_16, 14, SpringLayout.EAST, lblestado_7);
		lblestado_16.setForeground(Color.RED);
		sl_p.putConstraint(SpringLayout.NORTH, lblestado_16, 0, SpringLayout.NORTH, lblestado_7);
		p.add(lblestado_16);
		
		lblestado_17 = new JLabel("Apagado");
		sl_p.putConstraint(SpringLayout.WEST, lblestado_17, 14, SpringLayout.EAST, lblestado_8);
		lblestado_17.setForeground(Color.RED);
		sl_p.putConstraint(SpringLayout.NORTH, lblestado_17, 0, SpringLayout.NORTH, lblestado_8);
		p.add(lblestado_17);
		
		lblestado_18 = new JLabel("1");
		p.add(lblestado_18);
		
		lblestado_19 = new JLabel("Apagado");
		lblestado_19.setForeground(Color.RED);
		sl_p.putConstraint(SpringLayout.NORTH, lblestado_19, 0, SpringLayout.NORTH, lblestado_1);
		p.add(lblestado_19);
		
		lblestado_9 = new JLabel("9");
		sl_p.putConstraint(SpringLayout.WEST, lblestado_9, 112, SpringLayout.WEST, p);
		sl_p.putConstraint(SpringLayout.EAST, lblestado_10, -6, SpringLayout.WEST, lblestado_9);
		sl_p.putConstraint(SpringLayout.NORTH, lblestado_9, 0, SpringLayout.NORTH, lblestado_1);
		p.add(lblestado_9);
		
		lblestado_20 = new JLabel("10");
		sl_p.putConstraint(SpringLayout.WEST, lblestado_20, 112, SpringLayout.WEST, p);
		sl_p.putConstraint(SpringLayout.EAST, lblestado_11, -6, SpringLayout.WEST, lblestado_20);
		sl_p.putConstraint(SpringLayout.SOUTH, lblestado_20, 0, SpringLayout.SOUTH, lblestado_2);
		p.add(lblestado_20);
		
		lblestado_21 = new JLabel("11");
		sl_p.putConstraint(SpringLayout.WEST, lblestado_21, 112, SpringLayout.WEST, p);
		sl_p.putConstraint(SpringLayout.EAST, lblestado_12, -6, SpringLayout.WEST, lblestado_21);
		sl_p.putConstraint(SpringLayout.NORTH, lblestado_21, 0, SpringLayout.NORTH, lblestado_6);
		p.add(lblestado_21);
		
		lblestado_22 = new JLabel("12");
		sl_p.putConstraint(SpringLayout.NORTH, lblestado_22, 0, SpringLayout.NORTH, lblestado_3);
		sl_p.putConstraint(SpringLayout.WEST, lblestado_22, 0, SpringLayout.WEST, lblestado_9);
		p.add(lblestado_22);
		
		lblestado_23 = new JLabel("13");
		sl_p.putConstraint(SpringLayout.NORTH, lblestado_23, 0, SpringLayout.NORTH, lbl19);
		sl_p.putConstraint(SpringLayout.WEST, lblestado_23, 0, SpringLayout.WEST, lblestado_9);
		p.add(lblestado_23);
		
		lblestado_24 = new JLabel("14");
		sl_p.putConstraint(SpringLayout.NORTH, lblestado_24, 0, SpringLayout.NORTH, lblestado_5);
		sl_p.putConstraint(SpringLayout.WEST, lblestado_24, 0, SpringLayout.WEST, lblestado_9);
		p.add(lblestado_24);
		
		lblestado_25 = new JLabel("15");
		sl_p.putConstraint(SpringLayout.NORTH, lblestado_25, 0, SpringLayout.NORTH, lblestado_7);
		sl_p.putConstraint(SpringLayout.WEST, lblestado_25, 0, SpringLayout.WEST, lblestado_9);
		p.add(lblestado_25);
		
		lblestado_26 = new JLabel("16");
		sl_p.putConstraint(SpringLayout.WEST, lblestado_26, 0, SpringLayout.WEST, lblestado_9);
		sl_p.putConstraint(SpringLayout.SOUTH, lblestado_26, 0, SpringLayout.SOUTH, lblestado_8);
		p.add(lblestado_26);
		
		lblestado_28 = new JLabel("Apagado");
		lblestado_28.setForeground(Color.RED);
		sl_p.putConstraint(SpringLayout.EAST, lblestado_19, 0, SpringLayout.EAST, lblestado_28);
		sl_p.putConstraint(SpringLayout.NORTH, lblestado_28, 0, SpringLayout.NORTH, lblestado_6);
		sl_p.putConstraint(SpringLayout.WEST, lblestado_28, 6, SpringLayout.EAST, lblestado_21);
		p.add(lblestado_28);
		
		lblestado_29 = new JLabel("Apagado");
		lblestado_29.setForeground(Color.RED);
		sl_p.putConstraint(SpringLayout.NORTH, lblestado_29, 0, SpringLayout.NORTH, lblestado_3);
		sl_p.putConstraint(SpringLayout.WEST, lblestado_29, 6, SpringLayout.EAST, lblestado_22);
		p.add(lblestado_29);
		
		lblestado_30 = new JLabel("Apagado");
		lblestado_30.setForeground(Color.RED);
		sl_p.putConstraint(SpringLayout.NORTH, lblestado_30, 0, SpringLayout.NORTH, lbl19);
		sl_p.putConstraint(SpringLayout.WEST, lblestado_30, 6, SpringLayout.EAST, lblestado_23);
		p.add(lblestado_30);
		
		lblestado_31 = new JLabel("Apagado");
		lblestado_31.setForeground(Color.RED);
		sl_p.putConstraint(SpringLayout.NORTH, lblestado_31, 0, SpringLayout.NORTH, lblestado_5);
		sl_p.putConstraint(SpringLayout.WEST, lblestado_31, 6, SpringLayout.EAST, lblestado_24);
		p.add(lblestado_31);
		
		lblestado_32 = new JLabel("Apagado");
		lblestado_32.setForeground(Color.RED);
		sl_p.putConstraint(SpringLayout.NORTH, lblestado_32, 0, SpringLayout.NORTH, lblestado_7);
		sl_p.putConstraint(SpringLayout.WEST, lblestado_32, 6, SpringLayout.EAST, lblestado_25);
		p.add(lblestado_32);
		
		lblestado_33 = new JLabel("Apagado");
		lblestado_33.setForeground(Color.RED);
		sl_p.putConstraint(SpringLayout.NORTH, lblestado_33, 0, SpringLayout.NORTH, lblestado_8);
		sl_p.putConstraint(SpringLayout.WEST, lblestado_33, 6, SpringLayout.EAST, lblestado_26);
		p.add(lblestado_33);
		
		lblestado_27 = new JLabel("Apagado");
		lblestado_27.setForeground(Color.RED);
		sl_p.putConstraint(SpringLayout.NORTH, lblestado_27, 0, SpringLayout.NORTH, lblestado_2);
		sl_p.putConstraint(SpringLayout.WEST, lblestado_27, 0, SpringLayout.WEST, lblestado_19);
		sl_p.putConstraint(SpringLayout.EAST, lblestado_27, -919, SpringLayout.EAST, p);
		p.add(lblestado_27);
		
		lblestado_34 = new JLabel("17");
		sl_p.putConstraint(SpringLayout.NORTH, lblestado_34, 0, SpringLayout.NORTH, lblestado_1);
		sl_p.putConstraint(SpringLayout.WEST, lblestado_34, 55, SpringLayout.EAST, lblestado_19);
		p.add(lblestado_34);
		
		lblestado_35 = new JLabel("18");
		sl_p.putConstraint(SpringLayout.NORTH, lblestado_35, 0, SpringLayout.NORTH, lblestado_2);
		sl_p.putConstraint(SpringLayout.WEST, lblestado_35, 33, SpringLayout.EAST, lblestado_27);
		p.add(lblestado_35);
		
		lblestado_36 = new JLabel("19");
		sl_p.putConstraint(SpringLayout.WEST, lblestado_36, 55, SpringLayout.EAST, lblestado_28);
		sl_p.putConstraint(SpringLayout.SOUTH, lblestado_36, 0, SpringLayout.SOUTH, lblestado_6);
		p.add(lblestado_36);
		
		lblestado_37 = new JLabel("20");
		sl_p.putConstraint(SpringLayout.NORTH, lblestado_37, 0, SpringLayout.NORTH, lblestado_3);
		sl_p.putConstraint(SpringLayout.WEST, lblestado_37, 55, SpringLayout.EAST, lblestado_29);
		p.add(lblestado_37);
		
		lblestado_38 = new JLabel("21");
		sl_p.putConstraint(SpringLayout.NORTH, lblestado_38, 0, SpringLayout.NORTH, lbl19);
		sl_p.putConstraint(SpringLayout.WEST, lblestado_38, 55, SpringLayout.EAST, lblestado_30);
		p.add(lblestado_38);
		
		lblestado_39 = new JLabel("22");
		sl_p.putConstraint(SpringLayout.NORTH, lblestado_39, 0, SpringLayout.NORTH, lblestado_5);
		sl_p.putConstraint(SpringLayout.WEST, lblestado_39, 55, SpringLayout.EAST, lblestado_31);
		p.add(lblestado_39);
		
		lblestado_40 = new JLabel("23");
		sl_p.putConstraint(SpringLayout.NORTH, lblestado_40, 0, SpringLayout.NORTH, lblestado_7);
		sl_p.putConstraint(SpringLayout.WEST, lblestado_40, 55, SpringLayout.EAST, lblestado_32);
		p.add(lblestado_40);
		
		lblestado_41 = new JLabel("24");
		sl_p.putConstraint(SpringLayout.NORTH, lblestado_41, 0, SpringLayout.NORTH, lblestado_8);
		sl_p.putConstraint(SpringLayout.WEST, lblestado_41, 55, SpringLayout.EAST, lblestado_33);
		p.add(lblestado_41);
		
		lblestado_42 = new JLabel("Apagado");
		lblestado_42.setForeground(Color.RED);
		sl_p.putConstraint(SpringLayout.NORTH, lblestado_42, 0, SpringLayout.NORTH, lblestado_1);
		sl_p.putConstraint(SpringLayout.WEST, lblestado_42, 6, SpringLayout.EAST, lblestado_34);
		p.add(lblestado_42);
		
		lblestado_43 = new JLabel("Apagado");
		lblestado_43.setForeground(Color.RED);
		sl_p.putConstraint(SpringLayout.NORTH, lblestado_43, 0, SpringLayout.NORTH, lblestado_2);
		sl_p.putConstraint(SpringLayout.WEST, lblestado_43, 6, SpringLayout.EAST, lblestado_35);
		p.add(lblestado_43);
		
		lblestado_44 = new JLabel("Apagado");
		lblestado_44.setForeground(Color.RED);
		sl_p.putConstraint(SpringLayout.NORTH, lblestado_44, 0, SpringLayout.NORTH, lblestado_6);
		sl_p.putConstraint(SpringLayout.WEST, lblestado_44, 6, SpringLayout.EAST, lblestado_36);
		p.add(lblestado_44);
		
		lblestado_45 = new JLabel("Apagado");
		lblestado_45.setForeground(Color.RED);
		sl_p.putConstraint(SpringLayout.WEST, lblestado_45, 6, SpringLayout.EAST, lblestado_37);
		sl_p.putConstraint(SpringLayout.SOUTH, lblestado_45, 0, SpringLayout.SOUTH, btn17_p2c);
		p.add(lblestado_45);
		
		lblestado_46 = new JLabel("Apagado");
		lblestado_46.setForeground(Color.RED);
		sl_p.putConstraint(SpringLayout.NORTH, lblestado_46, 0, SpringLayout.NORTH, lbl19);
		sl_p.putConstraint(SpringLayout.WEST, lblestado_46, 6, SpringLayout.EAST, lblestado_38);
		p.add(lblestado_46);
		
		lblestado_47 = new JLabel("Apagado");
		lblestado_47.setForeground(Color.RED);
		sl_p.putConstraint(SpringLayout.NORTH, lblestado_47, 0, SpringLayout.NORTH, lblestado_5);
		sl_p.putConstraint(SpringLayout.WEST, lblestado_47, 6, SpringLayout.EAST, lblestado_39);
		p.add(lblestado_47);
		
		lblestado_48 = new JLabel("Apagado");
		lblestado_48.setForeground(Color.RED);
		sl_p.putConstraint(SpringLayout.NORTH, lblestado_48, 0, SpringLayout.NORTH, lblestado_7);
		sl_p.putConstraint(SpringLayout.WEST, lblestado_48, 6, SpringLayout.EAST, lblestado_40);
		p.add(lblestado_48);
		
		lblestado_49 = new JLabel("Apagado");
		lblestado_49.setForeground(Color.RED);
		sl_p.putConstraint(SpringLayout.NORTH, lblestado_49, 0, SpringLayout.NORTH, lblestado_8);
		sl_p.putConstraint(SpringLayout.WEST, lblestado_49, 6, SpringLayout.EAST, lblestado_41);
		p.add(lblestado_49);
		
		lblestado_50 = new JLabel("25");
		sl_p.putConstraint(SpringLayout.NORTH, lblestado_50, 0, SpringLayout.NORTH, lblestado_1);
		sl_p.putConstraint(SpringLayout.WEST, lblestado_50, 18, SpringLayout.EAST, lblestado_42);
		p.add(lblestado_50);
		
		lblestado_51 = new JLabel("Apagado");
		lblestado_51.setForeground(Color.RED);
		sl_p.putConstraint(SpringLayout.WEST, lblestado_51, 6, SpringLayout.EAST, lblestado_50);
		sl_p.putConstraint(SpringLayout.SOUTH, lblestado_51, 0, SpringLayout.SOUTH, lblestado_1);
		p.add(lblestado_51);
		

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
