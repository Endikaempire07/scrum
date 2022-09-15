package scrum;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Point;
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
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.SpringLayout;
import javax.swing.BorderFactory;
import java.awt.Font;

public class planta1_calefaccion extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenuItem Menu,Calefaccion,Calefaccion1,Calefaccion2;
	ArrayList<JButton> botones = new ArrayList<JButton>();
	
	private JButton btnEncender;
	private JButton btn1_p1c;
	private JLabel lbl1;
	private JButton btn2_p1c;
	private JLabel lbl2;
	private JButton btn3_p1c;
	private JLabel lbl3;
	private JButton btn4_p1c;
	private JLabel lbl4;
	private JButton btn5_p1c;
	private JLabel lbl5;
	private JButton btn6_p1c;
	private JLabel lbl6;
	private JButton btn7_p1c;
	private JLabel lbl7;
	private JButton btn8_p1c;
	private JLabel lbl8;
	private JButton btn9_p1c;
	private JLabel lbl9;
	private JButton btn10_p1c;
	private JLabel lbl10;
	private JButton btn11_p1c;
	private JLabel lbl11;
	private JButton btn12_p1c;
	private JLabel lbl12;
	private JButton btn13_p1c;
	private JLabel lbl13;
	private JButton btn14_p1c;
	private JLabel lbl14;
	private JButton btn15_p1c;
	private JLabel lbl15;
	private JButton btn16_p1c;
	private JLabel lbl16;
	private JButton btn17_p1c;
	private JLabel lbl17;
	private JButton btn18_p1c;
	private JLabel lbl18;
	private JButton btn19_p1c;
	private JLabel lbl19;
	private JButton btn20_p1c;
	private JLabel lbl20;
	private JButton btn21_p1c;
	private JLabel lbl21;
	private JButton btn22_p1c;
	private JLabel lbl22;
	private JButton btn23_p1c;
	private JLabel lbl23;
	
	private JLabel lblestado_1;
	private JLabel lblestado_2;
	private JLabel lblestado_4;
	private JLabel lblestado_5;
	private JLabel lblestado_6;
	private JLabel lblestado_3;
	private JLabel lblestado_7;
	private JLabel lblestado_8;
	private JLabel lblestado_9;
	private JLabel lbl_10;
	private JLabel lbl_7;
	private JLabel lbl_8;
	private JLabel lbl_14;
	private JLabel lbl_13;
	private JLabel lbl_6;
	private JLabel lbl_12;
	private JLabel lbl_5;
	private JLabel lblestado_10;
	private JLabel lblestado_11;
	private JLabel lblestado_12;
	private JLabel lblestado_13;
	private JLabel lblestado_14;
	private JLabel lblestado_15;
	private JLabel lblestado_16;
	private JLabel lbl_15;
	private JLabel lbl_4;
	private JLabel lbl_9;
	private JLabel lbl_17;
	private JLabel lbl_19;
	private JLabel lbl_20;
	private JLabel lbl_23;
	private JLabel lblestado_17;
	private JLabel lblestado_18;
	private JLabel lblestado_19;
	private JLabel lblestado_20;
	private JLabel lblestado_21;
	private JLabel lblestado_22;
	private JLabel lblestado_23;
	private JLabel lbl_22;
	private JLabel lbl_11;
	private JLabel lbl_18;
	private JLabel lbl_3;
	private JLabel lbl_1;
	private JLabel lbl_2;
	private JLabel lbl_21;
	private JLabel lbl_16;
	private JButton btnApagar;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					planta1_calefaccion frame = new planta1_calefaccion();
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
	public planta1_calefaccion() {
		setTitle("Planta 1 Calefacción");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1134, 620);
		setResizable(false);

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
				Point pos = posicion();
				menu_inicio menu = new menu_inicio();
				menu.setVisible(true);
				menu.setLocation(pos);
				dispose();
			}
		});

		Calefaccion = new JMenuItem("Planta baja");
		menuBar.add(Calefaccion);
		Calefaccion.setBackground(Color.LIGHT_GRAY);
		Calefaccion.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				Calefaccion.setBackground(Color.black);
				Calefaccion.setForeground(Color.white);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				Calefaccion.setBackground(Color.lightGray);
				Calefaccion.setForeground(Color.black);
			}
		});
		Calefaccion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				// Close actual frame and open another one
				Point pos = posicion();
				planta_baja_calefaccion Planta0 = new planta_baja_calefaccion();
				Planta0.setVisible(true);
				Planta0.setLocation(pos);
				dispose();
			}
		});

		Calefaccion1 = new JMenuItem("Primera planta");
		menuBar.add(Calefaccion1);
		Calefaccion1.setBackground(Color.black);
		Calefaccion1.setForeground(Color.white);
		Calefaccion1.setBorder(BorderFactory.createLineBorder(Color.white));

		Calefaccion2 = new JMenuItem("Segunda planta");
		menuBar.add(Calefaccion2);
		Calefaccion2.setBackground(Color.LIGHT_GRAY);
		Calefaccion2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent me) {
				Calefaccion2.setBackground(Color.black);
				Calefaccion2.setForeground(Color.white);
			}

			@Override
			public void mouseExited(MouseEvent me) {
				Calefaccion2.setBackground(Color.lightGray);
				Calefaccion2.setForeground(Color.black);
			}
		});
		Calefaccion2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				// Close actual frame and open another one
				Point pos = posicion();
				planta2_calefaccion Planta2 = new planta2_calefaccion();
				Planta2.setVisible(true);
				Planta2.setLocation(pos);
				dispose();
			}
		});

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		Panelimagen_planta1 pa = new Panelimagen_planta1();
		pa.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(pa);
		pa.setLayout(null);

		SpringLayout sl_pa = new SpringLayout();
		pa.setLayout(sl_pa);

		btnEncender = new JButton("Encender todo");
		pa.add(btnEncender);

		JLabel lblestado = new JLabel("Estado");
		sl_pa.putConstraint(SpringLayout.WEST, btnEncender, 0, SpringLayout.WEST, lblestado);
		sl_pa.putConstraint(SpringLayout.WEST, lblestado, 10, SpringLayout.WEST, pa);
		lblestado.setFont(new Font("Tahoma", Font.PLAIN, 34));
		pa.add(lblestado);

		// calefacción 1
		btn1_p1c = new JButton("");
		sl_pa.putConstraint(SpringLayout.WEST, btn1_p1c, 41, SpringLayout.WEST, pa);
		btn1_p1c.setIcon(new ImageIcon(planta1_calefaccion.class.getResource("/imagenes/calefaccion.png")));
		pa.add(btn1_p1c);

		lbl1 = new JLabel("1");
		sl_pa.putConstraint(SpringLayout.NORTH, lbl1, 29, SpringLayout.NORTH, pa);
		sl_pa.putConstraint(SpringLayout.EAST, lbl1, -1075, SpringLayout.EAST, pa);
		pa.add(lbl1);

		// calefacción 2
		btn2_p1c = new JButton("");
		sl_pa.putConstraint(SpringLayout.NORTH, btn2_p1c, 44, SpringLayout.SOUTH, btn1_p1c);
		sl_pa.putConstraint(SpringLayout.WEST, btn2_p1c, 41, SpringLayout.WEST, pa);
		sl_pa.putConstraint(SpringLayout.NORTH, lblestado, 77, SpringLayout.SOUTH, btn2_p1c);
		btn2_p1c.setIcon(new ImageIcon(planta1_calefaccion.class.getResource("/imagenes/calefaccion.png")));
		pa.add(btn2_p1c);

		lbl2 = new JLabel("2");
		sl_pa.putConstraint(SpringLayout.EAST, lbl2, -1075, SpringLayout.EAST, pa);
		sl_pa.putConstraint(SpringLayout.NORTH, lbl2, 67, SpringLayout.SOUTH, lbl1);
		pa.add(lbl2);

		// calefacción 3
		btn3_p1c = new JButton("");
		sl_pa.putConstraint(SpringLayout.NORTH, btn1_p1c, 0, SpringLayout.NORTH, btn3_p1c);
		sl_pa.putConstraint(SpringLayout.NORTH, btn3_p1c, 10, SpringLayout.NORTH, pa);
		btn3_p1c.setIcon(new ImageIcon(planta1_calefaccion.class.getResource("/imagenes/calefaccion.png")));
		pa.add(btn3_p1c);

		lbl3 = new JLabel("3");
		sl_pa.putConstraint(SpringLayout.EAST, lbl3, -961, SpringLayout.EAST, pa);
		sl_pa.putConstraint(SpringLayout.WEST, btn3_p1c, 6, SpringLayout.EAST, lbl3);
		sl_pa.putConstraint(SpringLayout.NORTH, lbl3, 0, SpringLayout.NORTH, lbl1);
		pa.add(lbl3);

		// calefacción 4
		btn4_p1c = new JButton("");
		sl_pa.putConstraint(SpringLayout.NORTH, btn4_p1c, 61, SpringLayout.SOUTH, btn3_p1c);
		sl_pa.putConstraint(SpringLayout.EAST, btn4_p1c, 0, SpringLayout.EAST, btn3_p1c);
		btn4_p1c.setIcon(new ImageIcon(planta1_calefaccion.class.getResource("/imagenes/calefaccion.png")));
		pa.add(btn4_p1c);

		lbl4 = new JLabel("4");
		sl_pa.putConstraint(SpringLayout.SOUTH, lbl4, 0, SpringLayout.SOUTH, btn2_p1c);
		sl_pa.putConstraint(SpringLayout.EAST, lbl4, 0, SpringLayout.EAST, lbl3);
		pa.add(lbl4);

		// calefacción 5
		btn5_p1c = new JButton("");
		sl_pa.putConstraint(SpringLayout.NORTH, btn5_p1c, 0, SpringLayout.NORTH, btn3_p1c);
		sl_pa.putConstraint(SpringLayout.WEST, btn5_p1c, 71, SpringLayout.EAST, btn3_p1c);
		btn5_p1c.setIcon(new ImageIcon(planta1_calefaccion.class.getResource("/imagenes/calefaccion.png")));
		pa.add(btn5_p1c);

		lbl5 = new JLabel("5");
		sl_pa.putConstraint(SpringLayout.NORTH, lbl5, 0, SpringLayout.NORTH, lbl1);
		sl_pa.putConstraint(SpringLayout.EAST, lbl5, -7, SpringLayout.WEST, btn5_p1c);
		pa.add(lbl5);

		// calefacción 6
		btn6_p1c = new JButton("");
		sl_pa.putConstraint(SpringLayout.WEST, btn6_p1c, 0, SpringLayout.WEST, btn5_p1c);
		sl_pa.putConstraint(SpringLayout.SOUTH, btn6_p1c, 0, SpringLayout.SOUTH, btn4_p1c);
		btn6_p1c.setIcon(new ImageIcon(planta1_calefaccion.class.getResource("/imagenes/calefaccion.png")));
		pa.add(btn6_p1c);

		lbl6 = new JLabel("6");
		sl_pa.putConstraint(SpringLayout.NORTH, lbl6, 0, SpringLayout.NORTH, lbl4);
		sl_pa.putConstraint(SpringLayout.EAST, lbl6, 0, SpringLayout.EAST, lbl5);
		pa.add(lbl6);

		// calefacción 7
		btn7_p1c = new JButton("");
		sl_pa.putConstraint(SpringLayout.WEST, btn7_p1c, 64, SpringLayout.EAST, btn6_p1c);
		sl_pa.putConstraint(SpringLayout.SOUTH, btn7_p1c, 0, SpringLayout.SOUTH, btn4_p1c);
		btn7_p1c.setIcon(new ImageIcon(planta1_calefaccion.class.getResource("/imagenes/calefaccion.png")));
		pa.add(btn7_p1c);

		lbl7 = new JLabel("7");
		sl_pa.putConstraint(SpringLayout.SOUTH, lbl7, 0, SpringLayout.SOUTH, btn2_p1c);
		sl_pa.putConstraint(SpringLayout.EAST, lbl7, -6, SpringLayout.WEST, btn7_p1c);
		pa.add(lbl7);

		// calefacción 8
		btn8_p1c = new JButton("");
		sl_pa.putConstraint(SpringLayout.NORTH, btn8_p1c, 0, SpringLayout.NORTH, btn1_p1c);
		btn8_p1c.setIcon(new ImageIcon(planta1_calefaccion.class.getResource("/imagenes/calefaccion.png")));
		pa.add(btn8_p1c);

		lbl8 = new JLabel("8");
		sl_pa.putConstraint(SpringLayout.WEST, btn8_p1c, 4, SpringLayout.EAST, lbl8);
		sl_pa.putConstraint(SpringLayout.NORTH, lbl8, 0, SpringLayout.NORTH, lbl1);
		pa.add(lbl8);

		// calefacción 9
		btn9_p1c = new JButton("");
		sl_pa.putConstraint(SpringLayout.SOUTH, btn9_p1c, 0, SpringLayout.SOUTH, btn1_p1c);
		btn9_p1c.setIcon(new ImageIcon(planta1_calefaccion.class.getResource("/imagenes/calefaccion.png")));
		pa.add(btn9_p1c);

		lbl9 = new JLabel("9");
		sl_pa.putConstraint(SpringLayout.EAST, lbl9, -648, SpringLayout.EAST, pa);
		sl_pa.putConstraint(SpringLayout.WEST, btn9_p1c, 6, SpringLayout.EAST, lbl9);
		sl_pa.putConstraint(SpringLayout.EAST, btn8_p1c, -17, SpringLayout.WEST, lbl9);
		sl_pa.putConstraint(SpringLayout.NORTH, lbl9, 0, SpringLayout.NORTH, lbl1);
		pa.add(lbl9);

		// calefacción 10
		btn10_p1c = new JButton("");
		sl_pa.putConstraint(SpringLayout.NORTH, btn10_p1c, 0, SpringLayout.NORTH, lbl1);
		btn10_p1c.setIcon(new ImageIcon(planta1_calefaccion.class.getResource("/imagenes/calefaccion.png")));
		pa.add(btn10_p1c);

		lbl10 = new JLabel("10");
		sl_pa.putConstraint(SpringLayout.WEST, btn10_p1c, 6, SpringLayout.EAST, lbl10);
		sl_pa.putConstraint(SpringLayout.EAST, btn9_p1c, -6, SpringLayout.WEST, lbl10);
		sl_pa.putConstraint(SpringLayout.EAST, lbl10, -583, SpringLayout.EAST, pa);
		sl_pa.putConstraint(SpringLayout.NORTH, lbl10, 40, SpringLayout.NORTH, pa);
		pa.add(lbl10);

		// calefacción 11
		btn11_p1c = new JButton("");
		sl_pa.putConstraint(SpringLayout.NORTH, btn11_p1c, 29, SpringLayout.NORTH, pa);
		sl_pa.putConstraint(SpringLayout.WEST, btn11_p1c, 696, SpringLayout.WEST, pa);
		sl_pa.putConstraint(SpringLayout.EAST, btn11_p1c, -390, SpringLayout.EAST, pa);
		btn11_p1c.setIcon(new ImageIcon(planta1_calefaccion.class.getResource("/imagenes/calefaccion.png")));
		pa.add(btn11_p1c);

		lbl11 = new JLabel("11");
		sl_pa.putConstraint(SpringLayout.EAST, lbl11, -420, SpringLayout.EAST, pa);
		sl_pa.putConstraint(SpringLayout.NORTH, lbl11, 0, SpringLayout.NORTH, lbl10);
		pa.add(lbl11);

		// calefacción 12
		btn12_p1c = new JButton("");
		sl_pa.putConstraint(SpringLayout.SOUTH, btn12_p1c, 0, SpringLayout.SOUTH, btn3_p1c);
		btn12_p1c.setIcon(new ImageIcon(planta1_calefaccion.class.getResource("/imagenes/calefaccion.png")));
		pa.add(btn12_p1c);

		lbl12 = new JLabel("12");
		sl_pa.putConstraint(SpringLayout.EAST, lbl12, -351, SpringLayout.EAST, pa);
		sl_pa.putConstraint(SpringLayout.WEST, btn12_p1c, 6, SpringLayout.EAST, lbl12);
		sl_pa.putConstraint(SpringLayout.NORTH, lbl12, 0, SpringLayout.NORTH, lbl1);
		pa.add(lbl12);

		// calefacción 13
		btn13_p1c = new JButton("");
		sl_pa.putConstraint(SpringLayout.SOUTH, btn13_p1c, 0, SpringLayout.SOUTH, btn4_p1c);
		sl_pa.putConstraint(SpringLayout.EAST, btn13_p1c, 0, SpringLayout.EAST, btn12_p1c);
		btn13_p1c.setIcon(new ImageIcon(planta1_calefaccion.class.getResource("/imagenes/calefaccion.png")));
		pa.add(btn13_p1c);

		lbl13 = new JLabel("13");
		sl_pa.putConstraint(SpringLayout.WEST, lbl13, 0, SpringLayout.WEST, lbl12);
		sl_pa.putConstraint(SpringLayout.SOUTH, lbl13, 0, SpringLayout.SOUTH, btn2_p1c);
		pa.add(lbl13);

		// calefacción 14
		btn14_p1c = new JButton("");
		sl_pa.putConstraint(SpringLayout.WEST, btn14_p1c, 58, SpringLayout.EAST, btn12_p1c);
		sl_pa.putConstraint(SpringLayout.SOUTH, btn14_p1c, 0, SpringLayout.SOUTH, btn3_p1c);
		btn14_p1c.setIcon(new ImageIcon(planta1_calefaccion.class.getResource("/imagenes/calefaccion.png")));
		pa.add(btn14_p1c);

		lbl14 = new JLabel("14");
		sl_pa.putConstraint(SpringLayout.NORTH, lbl14, 0, SpringLayout.NORTH, lbl1);
		sl_pa.putConstraint(SpringLayout.EAST, lbl14, -6, SpringLayout.WEST, btn14_p1c);
		pa.add(lbl14);

		// calefacción 15
		btn15_p1c = new JButton("");
		sl_pa.putConstraint(SpringLayout.SOUTH, btn15_p1c, 0, SpringLayout.SOUTH, btn4_p1c);
		sl_pa.putConstraint(SpringLayout.EAST, btn15_p1c, 0, SpringLayout.EAST, btn14_p1c);
		btn15_p1c.setIcon(new ImageIcon(planta1_calefaccion.class.getResource("/imagenes/calefaccion.png")));
		pa.add(btn15_p1c);

		lbl15 = new JLabel("15");
		sl_pa.putConstraint(SpringLayout.WEST, lbl15, 0, SpringLayout.WEST, lbl14);
		sl_pa.putConstraint(SpringLayout.SOUTH, lbl15, 0, SpringLayout.SOUTH, btn2_p1c);
		pa.add(lbl15);

		// calefacción 16
		btn16_p1c = new JButton("");
		sl_pa.putConstraint(SpringLayout.SOUTH, btn10_p1c, -132, SpringLayout.NORTH, btn16_p1c);
		sl_pa.putConstraint(SpringLayout.NORTH, btn16_p1c, 191, SpringLayout.NORTH, pa);
		sl_pa.putConstraint(SpringLayout.WEST, btn16_p1c, 430, SpringLayout.EAST, lblestado);
		sl_pa.putConstraint(SpringLayout.EAST, btn16_p1c, 470, SpringLayout.EAST, lblestado);
		btn16_p1c.setIcon(new ImageIcon(planta1_calefaccion.class.getResource("/imagenes/calefaccion.png")));
		pa.add(btn16_p1c);

		lbl16 = new JLabel("16");
		sl_pa.putConstraint(SpringLayout.EAST, lbl16, -6, SpringLayout.WEST, btn16_p1c);
		pa.add(lbl16);

		// calefacción 17
		btn17_p1c = new JButton("");
		sl_pa.putConstraint(SpringLayout.EAST, btn17_p1c, -397, SpringLayout.EAST, pa);
		sl_pa.putConstraint(SpringLayout.SOUTH, lbl16, 0, SpringLayout.SOUTH, btn17_p1c);
		sl_pa.putConstraint(SpringLayout.NORTH, btn17_p1c, 177, SpringLayout.NORTH, pa);
		sl_pa.putConstraint(SpringLayout.SOUTH, btn11_p1c, -118, SpringLayout.NORTH, btn17_p1c);
		btn17_p1c.setIcon(new ImageIcon(planta1_calefaccion.class.getResource("/imagenes/calefaccion.png")));
		pa.add(btn17_p1c);

		lbl17 = new JLabel("17");
		sl_pa.putConstraint(SpringLayout.EAST, lbl17, -443, SpringLayout.EAST, pa);
		sl_pa.putConstraint(SpringLayout.WEST, btn17_p1c, 6, SpringLayout.EAST, lbl17);
		sl_pa.putConstraint(SpringLayout.NORTH, lbl17, 0, SpringLayout.NORTH, btn16_p1c);
		pa.add(lbl17);

		// calefacción 18
		btn18_p1c = new JButton("");
		sl_pa.putConstraint(SpringLayout.NORTH, btn18_p1c, 45, SpringLayout.SOUTH, btn16_p1c);
		sl_pa.putConstraint(SpringLayout.WEST, btn18_p1c, 543, SpringLayout.WEST, pa);
		sl_pa.putConstraint(SpringLayout.EAST, btn18_p1c, 583, SpringLayout.WEST, pa);
		btn18_p1c.setIcon(new ImageIcon(planta1_calefaccion.class.getResource("/imagenes/calefaccion.png")));
		pa.add(btn18_p1c);

		lbl18 = new JLabel("18");
		sl_pa.putConstraint(SpringLayout.NORTH, lbl18, 73, SpringLayout.SOUTH, lbl16);
		sl_pa.putConstraint(SpringLayout.EAST, lbl18, 0, SpringLayout.EAST, lbl16);
		pa.add(lbl18);

		// calefacción 19
		btn19_p1c = new JButton("");
		sl_pa.putConstraint(SpringLayout.NORTH, btn19_p1c, 0, SpringLayout.NORTH, btn18_p1c);
		sl_pa.putConstraint(SpringLayout.WEST, btn19_p1c, -40, SpringLayout.EAST, btn17_p1c);
		sl_pa.putConstraint(SpringLayout.EAST, btn19_p1c, 0, SpringLayout.EAST, btn17_p1c);
		btn19_p1c.setIcon(new ImageIcon(planta1_calefaccion.class.getResource("/imagenes/calefaccion.png")));
		pa.add(btn19_p1c);

		lbl19 = new JLabel("19");
		sl_pa.putConstraint(SpringLayout.NORTH, lbl19, 0, SpringLayout.NORTH, lbl18);
		sl_pa.putConstraint(SpringLayout.EAST, lbl19, 0, SpringLayout.EAST, lbl17);
		pa.add(lbl19);

		// calefacción 20
		btn20_p1c = new JButton("");
		sl_pa.putConstraint(SpringLayout.NORTH, btn20_p1c, 311, SpringLayout.SOUTH, btn7_p1c);
		sl_pa.putConstraint(SpringLayout.WEST, lbl8, 0, SpringLayout.WEST, btn20_p1c);
		btn20_p1c.setIcon(new ImageIcon(planta1_calefaccion.class.getResource("/imagenes/calefaccion.png")));
		pa.add(btn20_p1c);

		lbl20 = new JLabel("20");
		sl_pa.putConstraint(SpringLayout.EAST, lbl20, -724, SpringLayout.EAST, pa);
		sl_pa.putConstraint(SpringLayout.WEST, btn20_p1c, 6, SpringLayout.EAST, lbl20);
		pa.add(lbl20);

		// calefacción 21
		btn21_p1c = new JButton("");
		sl_pa.putConstraint(SpringLayout.NORTH, btn21_p1c, 146, SpringLayout.SOUTH, btn18_p1c);
		sl_pa.putConstraint(SpringLayout.EAST, btn10_p1c, 0, SpringLayout.EAST, btn21_p1c);
		sl_pa.putConstraint(SpringLayout.EAST, btn21_p1c, -553, SpringLayout.EAST, pa);
		btn21_p1c.setIcon(new ImageIcon(planta1_calefaccion.class.getResource("/imagenes/calefaccion.png")));
		pa.add(btn21_p1c);

		lbl21 = new JLabel("21");
		sl_pa.putConstraint(SpringLayout.NORTH, lbl21, 0, SpringLayout.NORTH, lbl20);
		sl_pa.putConstraint(SpringLayout.WEST, lbl21, 20, SpringLayout.EAST, btn20_p1c);
		pa.add(lbl21);

		// calefacción 22
		btn22_p1c = new JButton("");
		sl_pa.putConstraint(SpringLayout.WEST, btn22_p1c, 596, SpringLayout.WEST, pa);
		sl_pa.putConstraint(SpringLayout.NORTH, lbl20, 0, SpringLayout.NORTH, btn22_p1c);
		sl_pa.putConstraint(SpringLayout.SOUTH, btn22_p1c, -24, SpringLayout.SOUTH, pa);
		btn22_p1c.setIcon(new ImageIcon(planta1_calefaccion.class.getResource("/imagenes/calefaccion.png")));
		pa.add(btn22_p1c);

		lbl22 = new JLabel("22");
		sl_pa.putConstraint(SpringLayout.EAST, lbl22, -520, SpringLayout.EAST, pa);
		sl_pa.putConstraint(SpringLayout.SOUTH, lbl22, -36, SpringLayout.SOUTH, pa);
		pa.add(lbl22);

		// calefacción 23
		btn23_p1c = new JButton("");
		sl_pa.putConstraint(SpringLayout.NORTH, btn23_p1c, 311, SpringLayout.SOUTH, btn13_p1c);
		sl_pa.putConstraint(SpringLayout.WEST, btn23_p1c, 0, SpringLayout.WEST, btn12_p1c);
		btn23_p1c.setIcon(new ImageIcon(planta1_calefaccion.class.getResource("/imagenes/calefaccion.png")));
		pa.add(btn23_p1c);

		lbl23 = new JLabel("23");
		sl_pa.putConstraint(SpringLayout.NORTH, lbl23, 0, SpringLayout.NORTH, lbl20);
		sl_pa.putConstraint(SpringLayout.WEST, lbl23, 0, SpringLayout.WEST, lbl12);
		pa.add(lbl23);

		lblestado_1 = new JLabel("1");
		sl_pa.putConstraint(SpringLayout.NORTH, lblestado_1, 6, SpringLayout.SOUTH, lblestado);
		sl_pa.putConstraint(SpringLayout.WEST, lblestado_1, 0, SpringLayout.WEST, lblestado);
		pa.add(lblestado_1);

		lblestado_2 = new JLabel("2");
		sl_pa.putConstraint(SpringLayout.NORTH, lblestado_2, 15, SpringLayout.NORTH, lblestado_1);
		sl_pa.putConstraint(SpringLayout.WEST, lblestado_2, 0, SpringLayout.WEST, lblestado);
		pa.add(lblestado_2);

		lblestado_3 = new JLabel("3");
		sl_pa.putConstraint(SpringLayout.NORTH, lblestado_3, 15, SpringLayout.NORTH, lblestado_2);
		sl_pa.putConstraint(SpringLayout.WEST, lblestado_3, 0, SpringLayout.WEST, lblestado);
		pa.add(lblestado_3);

		lblestado_4 = new JLabel("4");
		sl_pa.putConstraint(SpringLayout.NORTH, lblestado_4, 15, SpringLayout.NORTH, lblestado_3);
		sl_pa.putConstraint(SpringLayout.WEST, lblestado_4, 0, SpringLayout.WEST, lblestado);
		sl_pa.putConstraint(SpringLayout.SOUTH, lblestado_4, 0, SpringLayout.SOUTH, btn18_p1c);
		pa.add(lblestado_4);

		lblestado_5 = new JLabel("5");
		sl_pa.putConstraint(SpringLayout.NORTH, lblestado_5, 15, SpringLayout.NORTH, lblestado_4);
		sl_pa.putConstraint(SpringLayout.WEST, lblestado_5, 0, SpringLayout.WEST, lblestado);
		pa.add(lblestado_5);

		lblestado_6 = new JLabel("6");
		sl_pa.putConstraint(SpringLayout.NORTH, lblestado_6, 15, SpringLayout.NORTH, lblestado_5);
		sl_pa.putConstraint(SpringLayout.EAST, lblestado_6, 0, SpringLayout.EAST, lblestado_1);
		pa.add(lblestado_6);

		lblestado_7 = new JLabel("7");
		sl_pa.putConstraint(SpringLayout.NORTH, lblestado_7, 15, SpringLayout.NORTH, lblestado_6);
		sl_pa.putConstraint(SpringLayout.WEST, lblestado_7, 0, SpringLayout.WEST, lblestado);
		pa.add(lblestado_7);

		lblestado_8 = new JLabel("8");
		sl_pa.putConstraint(SpringLayout.NORTH, lblestado_8, 15, SpringLayout.NORTH, lblestado_7);
		sl_pa.putConstraint(SpringLayout.WEST, lblestado_8, 0, SpringLayout.WEST, lblestado);
		pa.add(lblestado_8);

		lbl_10 = new JLabel("Apagado");
		lbl_10.setForeground(Color.RED);
		pa.add(lbl_10);

		lbl_7 = new JLabel("Apagado");
		sl_pa.putConstraint(SpringLayout.NORTH, lbl_7, 0, SpringLayout.NORTH, lblestado_7);
		sl_pa.putConstraint(SpringLayout.WEST, lbl_7, 20, SpringLayout.WEST, lblestado_7);
		lbl_7.setForeground(Color.RED);
		pa.add(lbl_7);

		lbl_8 = new JLabel("Apagado");
		sl_pa.putConstraint(SpringLayout.WEST, lbl_8, 20, SpringLayout.WEST, lblestado_8);
		sl_pa.putConstraint(SpringLayout.NORTH, lbl_8, 0, SpringLayout.NORTH, lblestado_8);
		lbl_8.setForeground(Color.RED);
		pa.add(lbl_8);

		lbl_14 = new JLabel("Apagado");
		lbl_14.setForeground(Color.RED);
		pa.add(lbl_14);

		lbl_13 = new JLabel("Apagado");
		lbl_13.setForeground(Color.RED);
		pa.add(lbl_13);

		lbl_6 = new JLabel("Apagado");
		sl_pa.putConstraint(SpringLayout.NORTH, lbl_6, 0, SpringLayout.NORTH, lblestado_6);
		sl_pa.putConstraint(SpringLayout.WEST, lbl_6, 20, SpringLayout.WEST, lblestado_6);
		lbl_6.setForeground(Color.RED);
		pa.add(lbl_6);

		lbl_12 = new JLabel("Apagado");
		lbl_12.setForeground(Color.RED);
		pa.add(lbl_12);

		lbl_5 = new JLabel("Apagado");
		sl_pa.putConstraint(SpringLayout.NORTH, lbl_5, 0, SpringLayout.NORTH, lblestado_5);
		sl_pa.putConstraint(SpringLayout.WEST, lbl_5, 20, SpringLayout.WEST, lblestado_5);
		lbl_5.setForeground(Color.RED);
		pa.add(lbl_5);

		lblestado_9 = new JLabel("9");
		sl_pa.putConstraint(SpringLayout.NORTH, lblestado_9, 15, SpringLayout.NORTH, lblestado_8);
		sl_pa.putConstraint(SpringLayout.WEST, lblestado_9, 0, SpringLayout.WEST, lblestado);
		pa.add(lblestado_9);

		lblestado_10 = new JLabel("10");
		sl_pa.putConstraint(SpringLayout.WEST, lbl_10, 27, SpringLayout.WEST, lblestado_10);
		sl_pa.putConstraint(SpringLayout.EAST, lbl_10, 74, SpringLayout.WEST, lblestado_10);
		sl_pa.putConstraint(SpringLayout.NORTH, lblestado_10, 15, SpringLayout.NORTH, lblestado_9);
		sl_pa.putConstraint(SpringLayout.EAST, lblestado_10, 0, SpringLayout.EAST, lblestado_9);
		sl_pa.putConstraint(SpringLayout.NORTH, lbl_10, 0, SpringLayout.NORTH, lblestado_10);
		pa.add(lblestado_10);

		lblestado_11 = new JLabel("11");
		sl_pa.putConstraint(SpringLayout.NORTH, lblestado_11, 0, SpringLayout.NORTH, lblestado_1);
		sl_pa.putConstraint(SpringLayout.WEST, lblestado_11, 100, SpringLayout.WEST, lblestado_1);
		pa.add(lblestado_11);

		lblestado_12 = new JLabel("12");
		sl_pa.putConstraint(SpringLayout.NORTH, lblestado_12, 15, SpringLayout.NORTH, lblestado_11);
		sl_pa.putConstraint(SpringLayout.NORTH, lbl_12, 0, SpringLayout.NORTH, lblestado_12);
		sl_pa.putConstraint(SpringLayout.WEST, lbl_12, 25, SpringLayout.WEST, lblestado_12);
		sl_pa.putConstraint(SpringLayout.WEST, lblestado_12, 0, SpringLayout.WEST, lblestado_11);
		pa.add(lblestado_12);

		lblestado_13 = new JLabel("13");
		sl_pa.putConstraint(SpringLayout.NORTH, lblestado_13, 15, SpringLayout.NORTH, lblestado_12);
		sl_pa.putConstraint(SpringLayout.WEST, lblestado_13, 0, SpringLayout.WEST, lblestado_12);
		sl_pa.putConstraint(SpringLayout.NORTH, lbl_13, 0, SpringLayout.NORTH, lblestado_13);
		sl_pa.putConstraint(SpringLayout.WEST, lbl_13, 25, SpringLayout.WEST, lblestado_13);
		pa.add(lblestado_13);

		lblestado_14 = new JLabel("14");
		sl_pa.putConstraint(SpringLayout.NORTH, lblestado_14, 15, SpringLayout.NORTH, lblestado_13);
		sl_pa.putConstraint(SpringLayout.WEST, lblestado_14, 0, SpringLayout.WEST, lblestado_13);
		sl_pa.putConstraint(SpringLayout.NORTH, lbl_14, 0, SpringLayout.NORTH, lblestado_14);
		sl_pa.putConstraint(SpringLayout.WEST, lbl_14, 25, SpringLayout.WEST, lblestado_14);
		sl_pa.putConstraint(SpringLayout.SOUTH, lblestado_14, 0, SpringLayout.SOUTH, btn18_p1c);
		pa.add(lblestado_14);

		lblestado_15 = new JLabel("15");
		sl_pa.putConstraint(SpringLayout.NORTH, lblestado_15, 15, SpringLayout.NORTH, lblestado_14);
		sl_pa.putConstraint(SpringLayout.WEST, lblestado_15, 0, SpringLayout.WEST, lblestado_14);
		pa.add(lblestado_15);

		lblestado_16 = new JLabel("16");
		sl_pa.putConstraint(SpringLayout.NORTH, lblestado_16, 15, SpringLayout.NORTH, lblestado_15);
		sl_pa.putConstraint(SpringLayout.WEST, lblestado_16, 0, SpringLayout.WEST, lblestado_15);
		pa.add(lblestado_16);

		lbl_15 = new JLabel("Apagado");
		sl_pa.putConstraint(SpringLayout.NORTH, lbl_15, 0, SpringLayout.NORTH, lblestado_15);
		sl_pa.putConstraint(SpringLayout.WEST, lbl_15, 25, SpringLayout.WEST, lblestado_15);
		lbl_15.setForeground(Color.RED);
		pa.add(lbl_15);

		lbl_4 = new JLabel("Apagado");
		sl_pa.putConstraint(SpringLayout.NORTH, lbl_4, 0, SpringLayout.NORTH, lblestado_4);
		sl_pa.putConstraint(SpringLayout.WEST, lbl_4, 20, SpringLayout.WEST, lblestado_4);
		lbl_4.setForeground(Color.RED);
		pa.add(lbl_4);

		lbl_9 = new JLabel("Apagado");
		sl_pa.putConstraint(SpringLayout.NORTH, lbl_9, 0, SpringLayout.NORTH, lblestado_9);
		sl_pa.putConstraint(SpringLayout.WEST, lbl_9, 20, SpringLayout.WEST, lblestado_9);
		lbl_9.setForeground(Color.RED);
		pa.add(lbl_9);

		lbl_17 = new JLabel("Apagado");
		lbl_17.setForeground(Color.RED);
		pa.add(lbl_17);

		lbl_19 = new JLabel("Apagado");
		lbl_19.setForeground(Color.RED);
		pa.add(lbl_19);

		lbl_20 = new JLabel("Apagado");
		lbl_20.setForeground(Color.RED);
		pa.add(lbl_20);

		lbl_23 = new JLabel("Apagado");
		lbl_23.setForeground(Color.RED);
		pa.add(lbl_23);

		lblestado_17 = new JLabel("17");
		sl_pa.putConstraint(SpringLayout.NORTH, lblestado_17, 15, SpringLayout.NORTH, lblestado_16);
		sl_pa.putConstraint(SpringLayout.WEST, lblestado_17, 0, SpringLayout.WEST, lblestado_16);
		sl_pa.putConstraint(SpringLayout.NORTH, lbl_17, 0, SpringLayout.NORTH, lblestado_17);
		sl_pa.putConstraint(SpringLayout.WEST, lbl_17, 25, SpringLayout.WEST, lblestado_17);
		pa.add(lblestado_17);

		lblestado_18 = new JLabel("18");
		sl_pa.putConstraint(SpringLayout.NORTH, lblestado_18, 15, SpringLayout.NORTH, lblestado_17);
		sl_pa.putConstraint(SpringLayout.WEST, lblestado_18, 0, SpringLayout.WEST, lblestado_17);
		pa.add(lblestado_18);

		lblestado_19 = new JLabel("19");
		sl_pa.putConstraint(SpringLayout.NORTH, lblestado_19, 15, SpringLayout.NORTH, lblestado_18);
		sl_pa.putConstraint(SpringLayout.WEST, lblestado_19, 0, SpringLayout.WEST, lblestado_18);
		sl_pa.putConstraint(SpringLayout.NORTH, lbl_19, 0, SpringLayout.NORTH, lblestado_19);
		sl_pa.putConstraint(SpringLayout.WEST, lbl_19, 25, SpringLayout.WEST, lblestado_19);
		pa.add(lblestado_19);

		lblestado_20 = new JLabel("20");
		sl_pa.putConstraint(SpringLayout.WEST, lblestado_20, 0, SpringLayout.WEST, lblestado_19);
		sl_pa.putConstraint(SpringLayout.NORTH, lbl_20, 0, SpringLayout.NORTH, lblestado_20);
		sl_pa.putConstraint(SpringLayout.WEST, lbl_20, 25, SpringLayout.WEST, lblestado_20);
		sl_pa.putConstraint(SpringLayout.NORTH, lblestado_20, 15, SpringLayout.NORTH, lblestado_19);
		sl_pa.putConstraint(SpringLayout.EAST, lblestado_20, 0, SpringLayout.EAST, lblestado_19);
		pa.add(lblestado_20);

		lblestado_21 = new JLabel("21");
		sl_pa.putConstraint(SpringLayout.NORTH, lblestado_21, 0, SpringLayout.NORTH, lblestado_11);
		sl_pa.putConstraint(SpringLayout.WEST, lblestado_21, 100, SpringLayout.WEST, lblestado_11);
		pa.add(lblestado_21);

		lblestado_22 = new JLabel("22");
		sl_pa.putConstraint(SpringLayout.NORTH, lblestado_22, 15, SpringLayout.NORTH, lblestado_21);
		sl_pa.putConstraint(SpringLayout.WEST, lblestado_22, 0, SpringLayout.WEST, lblestado_21);
		pa.add(lblestado_22);

		lblestado_23 = new JLabel("23");
		sl_pa.putConstraint(SpringLayout.NORTH, lbl_23, 0, SpringLayout.NORTH, lblestado_23);
		sl_pa.putConstraint(SpringLayout.WEST, lbl_23, 25, SpringLayout.WEST, lblestado_23);
		sl_pa.putConstraint(SpringLayout.NORTH, lblestado_23, 15, SpringLayout.NORTH, lblestado_22);
		sl_pa.putConstraint(SpringLayout.WEST, lblestado_23, 0, SpringLayout.WEST, lblestado_22);
		pa.add(lblestado_23);

		lbl_22 = new JLabel("Apagado");
		sl_pa.putConstraint(SpringLayout.NORTH, lbl_22, 0, SpringLayout.NORTH, lblestado_22);
		sl_pa.putConstraint(SpringLayout.WEST, lbl_22, 25, SpringLayout.WEST, lblestado_22);
		lbl_22.setForeground(Color.RED);
		pa.add(lbl_22);

		lbl_11 = new JLabel("Apagado");
		sl_pa.putConstraint(SpringLayout.NORTH, lbl_11, 0, SpringLayout.NORTH, lblestado_11);
		sl_pa.putConstraint(SpringLayout.WEST, lbl_11, 25, SpringLayout.WEST, lblestado_11);
		lbl_11.setForeground(Color.RED);
		pa.add(lbl_11);

		lbl_18 = new JLabel("Apagado");
		sl_pa.putConstraint(SpringLayout.NORTH, lbl_18, 0, SpringLayout.NORTH, lblestado_18);
		sl_pa.putConstraint(SpringLayout.WEST, lbl_18, 25, SpringLayout.WEST, lblestado_18);
		lbl_18.setForeground(Color.RED);
		pa.add(lbl_18);

		lbl_3 = new JLabel("Apagado");
		sl_pa.putConstraint(SpringLayout.NORTH, lbl_3, 0, SpringLayout.NORTH, lblestado_3);
		sl_pa.putConstraint(SpringLayout.WEST, lbl_3, 20, SpringLayout.WEST, lblestado_3);
		lbl_3.setForeground(Color.RED);
		pa.add(lbl_3);

		lbl_1 = new JLabel("Apagado");
		sl_pa.putConstraint(SpringLayout.NORTH, lbl_1, 0, SpringLayout.NORTH, lblestado_1);
		sl_pa.putConstraint(SpringLayout.WEST, lbl_1, 20, SpringLayout.WEST, lblestado_1);
		lbl_1.setForeground(Color.RED);
		pa.add(lbl_1);

		lbl_2 = new JLabel("Apagado");
		sl_pa.putConstraint(SpringLayout.NORTH, lbl_2, 0, SpringLayout.NORTH, lblestado_2);
		sl_pa.putConstraint(SpringLayout.WEST, lbl_2, 20, SpringLayout.WEST, lblestado_2);
		lbl_2.setForeground(Color.RED);
		pa.add(lbl_2);

		lbl_21 = new JLabel("Apagado");
		sl_pa.putConstraint(SpringLayout.NORTH, lbl_21, 0, SpringLayout.NORTH, lblestado_21);
		sl_pa.putConstraint(SpringLayout.WEST, lbl_21, 235, SpringLayout.WEST, pa);
		sl_pa.putConstraint(SpringLayout.EAST, lblestado_21, -6, SpringLayout.WEST, lbl_21);
		lbl_21.setForeground(Color.RED);
		pa.add(lbl_21);

		lbl_16 = new JLabel("Apagado");
		sl_pa.putConstraint(SpringLayout.NORTH, lbl_16, 0, SpringLayout.NORTH, lblestado_16);
		sl_pa.putConstraint(SpringLayout.WEST, lbl_16, 25, SpringLayout.WEST, lblestado_16);
		lbl_16.setForeground(Color.RED);
		pa.add(lbl_16);

		btnApagar = new JButton("Apagar todo");
		sl_pa.putConstraint(SpringLayout.NORTH, btnEncender, 0, SpringLayout.NORTH, btnApagar);
		sl_pa.putConstraint(SpringLayout.NORTH, btnApagar, 44, SpringLayout.SOUTH, lbl_20);
		sl_pa.putConstraint(SpringLayout.WEST, btnApagar, 120, SpringLayout.WEST, pa);
		pa.add(btnApagar);

		SpringLayout sl_contentPane = new SpringLayout();

		btn1_p1c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiar(btn1_p1c, lbl_1, lbl1);
			}
		});
		btn2_p1c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiar(btn2_p1c, lbl_2, lbl2);
			}
		});
		btn3_p1c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiar(btn3_p1c, lbl_3, lbl3);
			}
		});
		btn4_p1c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiar(btn4_p1c, lbl_4, lbl4);
			}
		});
		btn5_p1c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiar(btn5_p1c, lbl_5, lbl5);
			}
		});
		btn6_p1c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiar(btn6_p1c, lbl_6, lbl6);
			}
		});
		btn7_p1c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiar(btn7_p1c, lbl_7, lbl7);
			}
		});
		btn8_p1c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiar(btn8_p1c, lbl_8, lbl8);
			}
		});
		btn9_p1c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiar(btn9_p1c, lbl_9, lbl9);
			}
		});
		btn10_p1c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiar(btn10_p1c, lbl_10, lbl10);
			}
		});
		btn11_p1c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiar(btn11_p1c, lbl_11, lbl11);
			}
		});
		btn12_p1c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiar(btn12_p1c, lbl_12, lbl12);
			}
		});
		btn13_p1c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiar(btn13_p1c, lbl_13, lbl13);
			}
		});
		btn14_p1c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiar(btn14_p1c, lbl_14, lbl14);
			}
		});
		btn15_p1c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiar(btn15_p1c, lbl_15, lbl15);
			}
		});
		btn16_p1c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiar(btn16_p1c, lbl_16, lbl16);
			}
		});
		btn17_p1c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiar(btn17_p1c, lbl_17, lbl17);
			}
		});
		btn18_p1c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiar(btn18_p1c, lbl_18, lbl18);
			}
		});
		btn19_p1c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiar(btn19_p1c, lbl_19, lbl19);
			}
		});
		btn20_p1c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiar(btn20_p1c, lbl_20, lbl20);
			}
		});
		btn21_p1c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiar(btn21_p1c, lbl_21, lbl21);
			}
		});
		btn22_p1c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiar(btn22_p1c, lbl_22, lbl22);
			}
		});
		btn23_p1c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiar(btn23_p1c, lbl_23, lbl23);
			}
		});

		btnEncender.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				encenderTodo();
			}
		});

		btnApagar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				apagarTodo();
			}
		});

		botones.add(btn1_p1c);
		botones.add(btn2_p1c);
		botones.add(btn3_p1c);
		botones.add(btn4_p1c);
		botones.add(btn5_p1c);
		botones.add(btn6_p1c);
		botones.add(btn7_p1c);
		botones.add(btn8_p1c);
		botones.add(btn9_p1c);
		botones.add(btn10_p1c);
		botones.add(btn11_p1c);
		botones.add(btn12_p1c);
		botones.add(btn13_p1c);
		botones.add(btn14_p1c);
		botones.add(btn15_p1c);
		botones.add(btn16_p1c);
		botones.add(btn17_p1c);
		botones.add(btn18_p1c);
		botones.add(btn19_p1c);
		botones.add(btn20_p1c);
		botones.add(btn21_p1c);
		botones.add(btn22_p1c);
		botones.add(btn23_p1c);

		for (JButton jButton : botones) {
			jButton.setToolTipText("apagado");
		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public void cambiar(JButton btn, JLabel lbl, JLabel lblNum) {
		int num = Integer.parseInt(lblNum.getText());
		File logFile = new File("planta1_calefaccion.txt");
		
		SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
		Date date = new Date(System.currentTimeMillis());
		
		try {
			
			if (btn.getToolTipText() == "encendido") {
				
				btn.setToolTipText("apagado");
				lbl.setForeground(Color.RED);
				lbl.setText("Apagado");
				
				BufferedWriter output = new BufferedWriter(new FileWriter(logFile, true));
				output.write("[" + formatter.format(date) + "] Apagando calefaccion " + num);
				output.newLine();
				output.close();

			}
			else {
				
				btn.setToolTipText("encendido");
				lbl.setForeground(Color.GREEN);
				lbl.setText("Encendido");
	
				BufferedWriter output = new BufferedWriter(new FileWriter(logFile, true));
				output.write("[" + formatter.format(date) + "] Encendiendo calefaccion " + num);
				output.newLine();
				output.close();
				
			}
			
		} catch (IOException e1) {
			e1.printStackTrace();
			System.out.println("error de escritura");
		}
	}
	
	public void encenderTodo() {
		for (JButton jButton : botones) {
			if (jButton.getToolTipText() == "apagado") {
				jButton.doClick();
			}
		}
	}
	
	public Point posicion() {
		Point frame = this.rootPane.getLocationOnScreen();
		return frame;
	}
	
	public void apagarTodo() {
		for (JButton jButton : botones) {
			if (jButton.getToolTipText() == "encendido") {
				jButton.doClick();
			}
		}
	}
}
