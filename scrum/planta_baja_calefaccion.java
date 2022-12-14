package scrum;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
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
import javax.swing.JMenu;
import javax.swing.JScrollPane;
import javax.swing.SpringLayout;
import java.awt.Dimension;
import java.awt.Font;

public class planta_baja_calefaccion extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JMenuItem Menu, Calefaccion, Calefaccion1, Calefaccion2;
	ArrayList<JButton> botones = new ArrayList<JButton>();
	private JButton btnET;
	private JButton btnAT;
	private JLabel lbl1;
	private JButton btnC2;
	private JLabel lbl2;
	private JButton btnC3;
	private JLabel lbl3;
	private JMenuBar menuBar_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					planta_baja_calefaccion frame = new planta_baja_calefaccion();
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
	public planta_baja_calefaccion() {
		setTitle("Planta baja Calefacción");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1134, 620);
		setResizable(false);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		menuBar_1 = new JMenuBar();
		menuBar_1.setForeground(Color.WHITE);
		menuBar_1.setBackground(Color.GRAY);
		setJMenuBar(menuBar_1);

		Menu = new JMenuItem("Menu");
		menuBar_1.add(Menu);
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
		menuBar_1.add(Calefaccion);
		Calefaccion.setBackground(Color.black);
		Calefaccion.setForeground(Color.white);
		Calefaccion.setBorder(BorderFactory.createLineBorder(Color.white));

		Calefaccion1 = new JMenuItem("Primera planta");
		menuBar_1.add(Calefaccion1);
		Calefaccion1.setBackground(Color.LIGHT_GRAY);
		Calefaccion1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent me) {
				Calefaccion1.setBackground(Color.black);
				Calefaccion1.setForeground(Color.white);
			}
			@Override
			public void mouseExited(MouseEvent me) {
				Calefaccion1.setBackground(Color.lightGray);
				Calefaccion1.setForeground(Color.black);
			}
		});
		Calefaccion1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				// Close actual frame and open another one
				Point pos = posicion();
				planta1_calefaccion Planta0 = new planta1_calefaccion();
				Planta0.setVisible(true);
				Planta0.setLocation(pos);
				dispose();
			}
		});

		Calefaccion2 = new JMenuItem("Segunda planta");
		menuBar_1.add(Calefaccion2);
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
				planta2_calefaccion Planta0 = new planta2_calefaccion();
				Planta0.setVisible(true);
				Planta0.setLocation(pos);
				dispose();
			}
		});

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		Panelimagen_planta_baja p = new Panelimagen_planta_baja();
		p.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(p);

		SpringLayout sl_p = new SpringLayout();
		p.setLayout(sl_p);
		btnET = new JButton("Encender todo");
		sl_p.putConstraint(SpringLayout.WEST, btnET, 41, SpringLayout.WEST, p);
		sl_p.putConstraint(SpringLayout.SOUTH, btnET, -10, SpringLayout.SOUTH, p);
		p.add(btnET);

		btnAT = new JButton("Apagar todo");
		sl_p.putConstraint(SpringLayout.NORTH, btnAT, 0, SpringLayout.NORTH, btnET);
		p.add(btnAT);

		JButton btnC1 = new JButton("");
		sl_p.putConstraint(SpringLayout.NORTH, btnC1, 58, SpringLayout.NORTH, p);
		sl_p.putConstraint(SpringLayout.WEST, btnC1, 10, SpringLayout.WEST, p);
		btnC1.setIcon(new ImageIcon(planta1_calefaccion.class.getResource("/imagenes/calefaccion.png")));
		btnC1.setToolTipText("Apagado");
		btnC1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiar(btnC1, lbl1, 1);
			}
		});
		p.add(btnC1);

		lbl1 = new JLabel("1: Apagado");
		sl_p.putConstraint(SpringLayout.EAST, lbl1, 0, SpringLayout.EAST, btnC1);
		lbl1.setForeground(Color.RED);
		p.add(lbl1);

//		JLabel lbl2 = new JLabel("Apagado");
//		sl_p.putConstraint(SpringLayout.WEST, lbl2, 0, SpringLayout.WEST, btnMenu_pbc);
//		sl_p.putConstraint(SpringLayout.SOUTH, lbl2, -130, SpringLayout.NORTH, btnMenu_pbc);
//		lbl2.setForeground(Color.RED);
//		lbl2.setBounds(32, 245, 112, 13);
//		p.add(lbl2);

		JLabel lbl3 = new JLabel("2: Apagado");
		sl_p.putConstraint(SpringLayout.SOUTH, lbl1, -8, SpringLayout.NORTH, lbl3);
		sl_p.putConstraint(SpringLayout.NORTH, lbl3, 325, SpringLayout.NORTH, p);
		sl_p.putConstraint(SpringLayout.EAST, lbl3, 0, SpringLayout.EAST, btnC1);
		lbl3.setForeground(Color.RED);
		lbl3.setBounds(32, 245, 112, 13);
		p.add(lbl3);

		JButton btnC2 = new JButton("");
		sl_p.putConstraint(SpringLayout.NORTH, btnC2, 90, SpringLayout.SOUTH, btnC1);
		btnC2.setIcon(new ImageIcon(planta1_calefaccion.class.getResource("/imagenes/calefaccion.png")));
		btnC2.setToolTipText("Apagado");
		btnC2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiar(btnC2, lbl3, 2);
			}
		});
		p.add(btnC2);

		JLabel lbl4 = new JLabel("3: Apagado");
		sl_p.putConstraint(SpringLayout.NORTH, lbl4, 6, SpringLayout.SOUTH, lbl3);
		sl_p.putConstraint(SpringLayout.EAST, lbl4, 0, SpringLayout.EAST, btnC1);
		lbl4.setForeground(Color.RED);
		lbl4.setBounds(32, 245, 112, 13);
		p.add(lbl4);

		JButton btnC3 = new JButton("");
		sl_p.putConstraint(SpringLayout.NORTH, btnC3, 29, SpringLayout.NORTH, p);
		btnC3.setIcon(new ImageIcon(planta1_calefaccion.class.getResource("/imagenes/calefaccion.png")));
		btnC3.setToolTipText("Apagado");
		btnC3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiar(btnC3, lbl4, 3);
			}
		});
		p.add(btnC3);

		JLabel lbl5 = new JLabel("4: Apagado");
		sl_p.putConstraint(SpringLayout.NORTH, lbl5, 6, SpringLayout.SOUTH, lbl4);
		sl_p.putConstraint(SpringLayout.EAST, lbl5, 0, SpringLayout.EAST, btnC1);
		lbl5.setForeground(Color.RED);
		lbl5.setBounds(32, 245, 112, 13);
		p.add(lbl5);

		JButton btnC4 = new JButton("");
		sl_p.putConstraint(SpringLayout.EAST, btnAT, 0, SpringLayout.EAST, btnC4);
		sl_p.putConstraint(SpringLayout.WEST, btnC4, 232, SpringLayout.WEST, p);
		sl_p.putConstraint(SpringLayout.NORTH, btnC4, 29, SpringLayout.NORTH, p);
		btnC4.setIcon(new ImageIcon(planta1_calefaccion.class.getResource("/imagenes/calefaccion.png")));
		btnC4.setToolTipText("Apagado");
		btnC4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiar(btnC4, lbl5, 4);
			}
		});
		p.add(btnC4);

		JLabel lbl6 = new JLabel("5: Apagado");
		sl_p.putConstraint(SpringLayout.NORTH, lbl6, 6, SpringLayout.SOUTH, lbl5);
		sl_p.putConstraint(SpringLayout.EAST, lbl6, 0, SpringLayout.EAST, btnC1);
		lbl6.setForeground(Color.RED);
		lbl6.setBounds(32, 245, 112, 13);
		p.add(lbl6);

		JButton btnC5 = new JButton("");
		sl_p.putConstraint(SpringLayout.EAST, btnC4, -21, SpringLayout.WEST, btnC5);
		sl_p.putConstraint(SpringLayout.NORTH, btnC5, 29, SpringLayout.NORTH, p);
		sl_p.putConstraint(SpringLayout.WEST, btnC5, 295, SpringLayout.WEST, p);
		sl_p.putConstraint(SpringLayout.SOUTH, btnC5, -490, SpringLayout.SOUTH, p);
		sl_p.putConstraint(SpringLayout.EAST, btnC5, -768, SpringLayout.EAST, p);
		btnC5.setIcon(new ImageIcon(planta1_calefaccion.class.getResource("/imagenes/calefaccion.png")));
		btnC5.setToolTipText("Apagado");
		btnC5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiar(btnC5, lbl6, 5);
			}
		});
		p.add(btnC5);

		JLabel lbl7 = new JLabel("6: Apagado");
		sl_p.putConstraint(SpringLayout.NORTH, lbl7, 6, SpringLayout.SOUTH, lbl6);
		sl_p.putConstraint(SpringLayout.EAST, lbl7, 0, SpringLayout.EAST, btnC1);
		lbl7.setForeground(Color.RED);
		lbl7.setBounds(32, 245, 112, 13);
		p.add(lbl7);

		JButton btnC6 = new JButton("");
		sl_p.putConstraint(SpringLayout.WEST, btnC6, 14, SpringLayout.EAST, btnC5);
		sl_p.putConstraint(SpringLayout.NORTH, btnC6, 29, SpringLayout.NORTH, p);
		btnC6.setIcon(new ImageIcon(planta1_calefaccion.class.getResource("/imagenes/calefaccion.png")));
		btnC6.setToolTipText("Apagado");
		btnC6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiar(btnC6, lbl7, 6);
			}
		});
		p.add(btnC6);

		JLabel lbl8 = new JLabel("7: Apagado");
		sl_p.putConstraint(SpringLayout.NORTH, lbl8, 6, SpringLayout.SOUTH, lbl7);
		sl_p.putConstraint(SpringLayout.EAST, lbl8, 0, SpringLayout.EAST, btnC1);
		lbl8.setForeground(Color.RED);
		lbl8.setBounds(32, 245, 112, 13);
		p.add(lbl8);

		JButton btnC7 = new JButton("");
		sl_p.putConstraint(SpringLayout.WEST, btnC7, 422, SpringLayout.WEST, p);
		sl_p.putConstraint(SpringLayout.EAST, btnC6, -13, SpringLayout.WEST, btnC7);
		sl_p.putConstraint(SpringLayout.SOUTH, btnC4, -9, SpringLayout.SOUTH, btnC7);
		sl_p.putConstraint(SpringLayout.NORTH, btnC7, 29, SpringLayout.NORTH, p);
		sl_p.putConstraint(SpringLayout.EAST, btnC7, 474, SpringLayout.WEST, p);
		btnC7.setIcon(new ImageIcon(planta1_calefaccion.class.getResource("/imagenes/calefaccion.png")));
		btnC7.setToolTipText("Apagado");
		btnC7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiar(btnC7, lbl8, 7);
			}
		});
		p.add(btnC7);

		JLabel lbl9 = new JLabel("8: Apagado");
		sl_p.putConstraint(SpringLayout.NORTH, lbl9, 6, SpringLayout.SOUTH, lbl8);
		sl_p.putConstraint(SpringLayout.EAST, lbl9, 0, SpringLayout.EAST, btnC1);
		lbl9.setForeground(Color.RED);
		lbl9.setBounds(32, 245, 112, 13);
		p.add(lbl9);

		JButton btnC8 = new JButton("");
		sl_p.putConstraint(SpringLayout.NORTH, btnC8, 29, SpringLayout.NORTH, p);
		sl_p.putConstraint(SpringLayout.EAST, btnC8, -307, SpringLayout.EAST, p);
		btnC8.setIcon(new ImageIcon(planta1_calefaccion.class.getResource("/imagenes/calefaccion.png")));
		btnC8.setToolTipText("Apagado");
		btnC8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiar(btnC8, lbl9, 8);
			}
		});
		p.add(btnC8);

		JLabel lbl10 = new JLabel("9: Apagado");
		sl_p.putConstraint(SpringLayout.NORTH, lbl1, 0, SpringLayout.NORTH, lbl10);
		lbl10.setForeground(Color.RED);
		lbl10.setBounds(32, 245, 112, 13);
		p.add(lbl10);

		JButton btnC9 = new JButton("");
		sl_p.putConstraint(SpringLayout.WEST, btnC9, 121, SpringLayout.EAST, btnC8);
		btnC9.setIcon(new ImageIcon(planta1_calefaccion.class.getResource("/imagenes/calefaccion.png")));
		btnC9.setToolTipText("Apagado");
		btnC9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiar(btnC9, lbl10, 9);
			}
		});
		p.add(btnC9);

		JLabel lbl11 = new JLabel("10: Apagado");
		sl_p.putConstraint(SpringLayout.NORTH, lbl11, 0, SpringLayout.NORTH, lbl3);
		sl_p.putConstraint(SpringLayout.EAST, lbl11, 0, SpringLayout.EAST, lbl10);
		lbl11.setForeground(Color.RED);
		lbl11.setBounds(32, 245, 112, 13);
		p.add(lbl11);

		JButton btnC10 = new JButton("");
		sl_p.putConstraint(SpringLayout.NORTH, btnC10, 75, SpringLayout.NORTH, p);
		sl_p.putConstraint(SpringLayout.EAST, btnC10, -23, SpringLayout.EAST, p);
		btnC10.setIcon(new ImageIcon(planta1_calefaccion.class.getResource("/imagenes/calefaccion.png")));
		btnC10.setToolTipText("Apagado");
		btnC10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiar(btnC10, lbl11, 10);
			}
		});
		p.add(btnC10);

		JLabel lbl12 = new JLabel("11: Apagado");
		sl_p.putConstraint(SpringLayout.NORTH, lbl12, 0, SpringLayout.NORTH, lbl4);
		sl_p.putConstraint(SpringLayout.EAST, lbl12, 0, SpringLayout.EAST, lbl10);
		lbl12.setForeground(Color.RED);
		lbl12.setBounds(32, 245, 112, 13);
		p.add(lbl12);

		JButton btnC11 = new JButton("");
		btnC11.setIcon(new ImageIcon(planta1_calefaccion.class.getResource("/imagenes/calefaccion.png")));
		btnC11.setToolTipText("Apagado");
		btnC11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiar(btnC11, lbl12, 11);
			}
		});
		p.add(btnC11);

		JLabel lbl13 = new JLabel("12: Apagado");
		sl_p.putConstraint(SpringLayout.NORTH, lbl13, 6, SpringLayout.SOUTH, lbl12);
		sl_p.putConstraint(SpringLayout.EAST, lbl13, 0, SpringLayout.EAST, lbl10);
		lbl13.setForeground(Color.RED);
		lbl13.setBounds(32, 245, 112, 13);
		p.add(lbl13);

		JButton btnC12 = new JButton("");
		sl_p.putConstraint(SpringLayout.WEST, btnC3, -53, SpringLayout.EAST, btnC12);
		sl_p.putConstraint(SpringLayout.NORTH, btnC11, 0, SpringLayout.NORTH, btnC12);
		sl_p.putConstraint(SpringLayout.EAST, btnC11, -19, SpringLayout.WEST, btnC12);
		sl_p.putConstraint(SpringLayout.SOUTH, btnC3, -111, SpringLayout.NORTH, btnC12);
		sl_p.putConstraint(SpringLayout.EAST, btnC3, 0, SpringLayout.EAST, btnC12);
		sl_p.putConstraint(SpringLayout.WEST, btnC12, 159, SpringLayout.WEST, p);
		sl_p.putConstraint(SpringLayout.EAST, btnC12, 212, SpringLayout.WEST, p);
		btnC12.setIcon(new ImageIcon(planta1_calefaccion.class.getResource("/imagenes/calefaccion.png")));
		btnC12.setToolTipText("Apagado");
		btnC12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiar(btnC12, lbl13, 12);
			}
		});
		p.add(btnC12);

		JLabel lbl14 = new JLabel("13: Apagado");
		sl_p.putConstraint(SpringLayout.NORTH, lbl14, 6, SpringLayout.SOUTH, lbl13);
		sl_p.putConstraint(SpringLayout.EAST, lbl14, 0, SpringLayout.EAST, lbl10);
		lbl14.setForeground(Color.RED);
		lbl14.setBounds(32, 245, 112, 13);
		p.add(lbl14);

		JButton btnC13 = new JButton("");
		sl_p.putConstraint(SpringLayout.WEST, btnC13, 15, SpringLayout.EAST, btnC12);
		btnC13.setIcon(new ImageIcon(planta1_calefaccion.class.getResource("/imagenes/calefaccion.png")));
		btnC13.setToolTipText("Apagado");
		btnC13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiar(btnC13, lbl14, 13);
			}
		});
		p.add(btnC13);

		JLabel lbl15 = new JLabel("14: Apagado");
		sl_p.putConstraint(SpringLayout.NORTH, lbl15, 0, SpringLayout.NORTH, lbl7);
		sl_p.putConstraint(SpringLayout.EAST, lbl15, 0, SpringLayout.EAST, lbl10);
		lbl15.setForeground(Color.RED);
		lbl15.setBounds(32, 245, 112, 13);
		p.add(lbl15);

		JButton btnC14 = new JButton("");
		sl_p.putConstraint(SpringLayout.WEST, btnC14, 375, SpringLayout.WEST, p);
		sl_p.putConstraint(SpringLayout.EAST, btnC13, -96, SpringLayout.WEST, btnC14);
		sl_p.putConstraint(SpringLayout.NORTH, btnC14, 172, SpringLayout.NORTH, p);
		sl_p.putConstraint(SpringLayout.SOUTH, btnC7, -102, SpringLayout.NORTH, btnC14);
		sl_p.putConstraint(SpringLayout.SOUTH, btnC6, -111, SpringLayout.NORTH, btnC14);
		btnC14.setIcon(new ImageIcon(planta1_calefaccion.class.getResource("/imagenes/calefaccion.png")));
		btnC14.setToolTipText("Apagado");
		btnC14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiar(btnC14, lbl15, 14);
			}
		});
		p.add(btnC14);

		JLabel lbl16 = new JLabel("15: Apagado");
		sl_p.putConstraint(SpringLayout.NORTH, lbl16, 0, SpringLayout.NORTH, lbl8);
		sl_p.putConstraint(SpringLayout.EAST, lbl16, 0, SpringLayout.EAST, lbl10);
		lbl16.setForeground(Color.RED);
		lbl16.setBounds(32, 245, 112, 13);
		p.add(lbl16);

		JButton btnC15 = new JButton("");
		sl_p.putConstraint(SpringLayout.SOUTH, btnC15, -338, SpringLayout.SOUTH, p);
		btnC15.setIcon(new ImageIcon(planta1_calefaccion.class.getResource("/imagenes/calefaccion.png")));
		btnC15.setToolTipText("Apagado");
		btnC15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiar(btnC15, lbl16, 15);
			}
		});
		p.add(btnC15);

		JLabel lbl17 = new JLabel("16: Apagado");
		sl_p.putConstraint(SpringLayout.WEST, lbl17, 199, SpringLayout.WEST, p);
		sl_p.putConstraint(SpringLayout.EAST, lbl10, -23, SpringLayout.WEST, lbl17);
		sl_p.putConstraint(SpringLayout.NORTH, lbl17, 0, SpringLayout.NORTH, lbl1);
		lbl17.setForeground(Color.RED);
		lbl17.setBounds(32, 245, 112, 13);
		p.add(lbl17);

		JButton btnC16 = new JButton("");
		sl_p.putConstraint(SpringLayout.WEST, btnC16, 764, SpringLayout.WEST, p);
		sl_p.putConstraint(SpringLayout.EAST, btnC15, -26, SpringLayout.WEST, btnC16);
		btnC16.setIcon(new ImageIcon(planta1_calefaccion.class.getResource("/imagenes/calefaccion.png")));
		btnC16.setToolTipText("Apagado");
		btnC16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiar(btnC16, lbl17, 16);
			}
		});
		p.add(btnC16);

		JLabel lbl18 = new JLabel("17: Apagado");
		sl_p.putConstraint(SpringLayout.NORTH, lbl18, 0, SpringLayout.NORTH, lbl3);
		sl_p.putConstraint(SpringLayout.EAST, lbl18, 0, SpringLayout.EAST, lbl17);
		lbl18.setForeground(Color.RED);
		lbl18.setBounds(32, 245, 112, 13);
		p.add(lbl18);

		JButton btnC17 = new JButton("");
		sl_p.putConstraint(SpringLayout.WEST, btnC17, 23, SpringLayout.EAST, btnC16);
		sl_p.putConstraint(SpringLayout.NORTH, btnC16, 0, SpringLayout.NORTH, btnC17);
		btnC17.setIcon(new ImageIcon(planta1_calefaccion.class.getResource("/imagenes/calefaccion.png")));
		btnC17.setToolTipText("Apagado");
		btnC17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiar(btnC17, lbl18, 17);
			}
		});
		p.add(btnC17);

		JLabel lbl19 = new JLabel("18: Apagado");
		sl_p.putConstraint(SpringLayout.NORTH, lbl19, 0, SpringLayout.NORTH, lbl4);
		sl_p.putConstraint(SpringLayout.EAST, lbl19, 0, SpringLayout.EAST, lbl17);
		lbl19.setForeground(Color.RED);
		lbl19.setBounds(32, 245, 112, 13);
		p.add(lbl19);

		JButton btnC18 = new JButton("");
		sl_p.putConstraint(SpringLayout.NORTH, btnC18, 111, SpringLayout.SOUTH, btnC9);
		sl_p.putConstraint(SpringLayout.NORTH, btnC17, 0, SpringLayout.NORTH, btnC18);
		sl_p.putConstraint(SpringLayout.WEST, btnC18, 939, SpringLayout.WEST, p);
		btnC18.setIcon(new ImageIcon(planta1_calefaccion.class.getResource("/imagenes/calefaccion.png")));
		btnC18.setToolTipText("Apagado");
		btnC18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiar(btnC18, lbl19, 18);
			}
		});
		p.add(btnC18);

		JLabel lbl20 = new JLabel("19: Apagado");
		sl_p.putConstraint(SpringLayout.NORTH, lbl20, 0, SpringLayout.NORTH, lbl5);
		sl_p.putConstraint(SpringLayout.EAST, lbl20, 0, SpringLayout.EAST, lbl17);
		lbl20.setForeground(Color.RED);
		lbl20.setBounds(32, 245, 112, 13);
		p.add(lbl20);

		JButton btnC19 = new JButton("");
		sl_p.putConstraint(SpringLayout.NORTH, btnC19, 189, SpringLayout.SOUTH, btnC7);
		btnC19.setIcon(new ImageIcon(planta1_calefaccion.class.getResource("/imagenes/calefaccion.png")));
		btnC19.setToolTipText("Apagado");
		btnC19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiar(btnC19, lbl20, 19);
			}
		});
		p.add(btnC19);

		JLabel lbl21 = new JLabel("20: Apagado");
		sl_p.putConstraint(SpringLayout.NORTH, lbl21, 0, SpringLayout.NORTH, lbl6);
		sl_p.putConstraint(SpringLayout.EAST, lbl21, 0, SpringLayout.EAST, lbl17);
		lbl21.setForeground(Color.RED);
		lbl21.setBounds(32, 245, 112, 13);
		p.add(lbl21);

		JButton btnC20 = new JButton("");
		sl_p.putConstraint(SpringLayout.WEST, btnC20, 215, SpringLayout.EAST, lbl19);
		sl_p.putConstraint(SpringLayout.SOUTH, btnC20, -158, SpringLayout.SOUTH, p);
		sl_p.putConstraint(SpringLayout.EAST, btnC19, 0, SpringLayout.EAST, btnC20);
		btnC20.setIcon(new ImageIcon(planta1_calefaccion.class.getResource("/imagenes/calefaccion.png")));
		btnC20.setToolTipText("Apagado");
		btnC20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiar(btnC20, lbl21, 20);
			}
		});
		p.add(btnC20);

		JLabel lbl22 = new JLabel("21: Apagado");
		sl_p.putConstraint(SpringLayout.NORTH, lbl22, 0, SpringLayout.NORTH, lbl7);
		sl_p.putConstraint(SpringLayout.EAST, lbl22, 0, SpringLayout.EAST, lbl17);
		lbl22.setForeground(Color.RED);
		lbl22.setBounds(32, 245, 112, 13);
		p.add(lbl22);

		JButton btnC21 = new JButton("");
		btnC21.setIcon(new ImageIcon(planta1_calefaccion.class.getResource("/imagenes/calefaccion.png")));
		btnC21.setToolTipText("Apagado");
		btnC21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiar(btnC21, lbl22, 21);
			}
		});
		p.add(btnC21);

		JLabel lbl23 = new JLabel("22: Apagado");
		sl_p.putConstraint(SpringLayout.NORTH, lbl23, 0, SpringLayout.NORTH, lbl8);
		sl_p.putConstraint(SpringLayout.EAST, lbl23, 0, SpringLayout.EAST, lbl17);
		lbl23.setForeground(Color.RED);
		lbl23.setBounds(32, 245, 112, 13);
		p.add(lbl23);

		JButton btnC22 = new JButton("");
		sl_p.putConstraint(SpringLayout.WEST, btnC22, 595, SpringLayout.WEST, p);
		sl_p.putConstraint(SpringLayout.SOUTH, btnC22, -64, SpringLayout.SOUTH, p);
		sl_p.putConstraint(SpringLayout.EAST, btnC22, -456, SpringLayout.EAST, p);
		sl_p.putConstraint(SpringLayout.WEST, btnC21, 0, SpringLayout.WEST, btnC22);
		btnC22.setIcon(new ImageIcon(planta1_calefaccion.class.getResource("/imagenes/calefaccion.png")));
		btnC22.setToolTipText("Apagado");
		btnC22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiar(btnC22, lbl23, 22);
			}
		});
		p.add(btnC22);

		btnET.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				encenderTodo();
			}
		});

		btnAT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				apagarTodo();
			}
		});

		SpringLayout sl_contentPane = new SpringLayout();

		botones.add(btnC1);
		botones.add(btnC2);
		botones.add(btnC3);
		botones.add(btnC4);
		botones.add(btnC5);
		botones.add(btnC6);
		botones.add(btnC7);
		botones.add(btnC8);
		botones.add(btnC9);
		botones.add(btnC10);
		botones.add(btnC11);
		botones.add(btnC12);
		botones.add(btnC13);
		botones.add(btnC14);
		botones.add(btnC15);
		botones.add(btnC16);
		botones.add(btnC17);
		botones.add(btnC18);
		botones.add(btnC19);
		botones.add(btnC20);
		botones.add(btnC21);
		botones.add(btnC22);

		JLabel lblB1 = new JLabel("1");
		sl_p.putConstraint(SpringLayout.EAST, btnC2, 0, SpringLayout.EAST, lblB1);
		sl_p.putConstraint(SpringLayout.SOUTH, lblB1, -6, SpringLayout.NORTH, btnC1);
		sl_p.putConstraint(SpringLayout.EAST, lblB1, -107, SpringLayout.WEST, btnC3);
		p.add(lblB1);

		JLabel lblB2 = new JLabel("2");
		sl_p.putConstraint(SpringLayout.WEST, btnC2, 6, SpringLayout.EAST, lblB2);
		sl_p.putConstraint(SpringLayout.SOUTH, lblB2, -350, SpringLayout.SOUTH, p);
		sl_p.putConstraint(SpringLayout.WEST, lblB2, 10, SpringLayout.WEST, p);
		p.add(lblB2);

		JLabel lblB3 = new JLabel("3");
		sl_p.putConstraint(SpringLayout.NORTH, lblB3, 10, SpringLayout.NORTH, p);
		sl_p.putConstraint(SpringLayout.NORTH, btnC9, 0, SpringLayout.NORTH, lblB3);
		sl_p.putConstraint(SpringLayout.WEST, lblB3, 0, SpringLayout.WEST, btnC3);
		p.add(lblB3);

		JLabel lblB4 = new JLabel("4");
		sl_p.putConstraint(SpringLayout.NORTH, lblB4, 10, SpringLayout.NORTH, p);
		sl_p.putConstraint(SpringLayout.WEST, lblB4, 0, SpringLayout.WEST, btnC4);
		p.add(lblB4);

		JLabel lblB5 = new JLabel("5");
		sl_p.putConstraint(SpringLayout.NORTH, lblB5, 10, SpringLayout.NORTH, p);
		sl_p.putConstraint(SpringLayout.WEST, lblB5, 0, SpringLayout.WEST, btnC5);
		p.add(lblB5);

		JLabel lblB6 = new JLabel("6");
		sl_p.putConstraint(SpringLayout.NORTH, lblB6, 10, SpringLayout.NORTH, p);
		sl_p.putConstraint(SpringLayout.WEST, lblB6, 0, SpringLayout.WEST, btnC6);
		p.add(lblB6);

		JLabel lblB7 = new JLabel("7");
		sl_p.putConstraint(SpringLayout.NORTH, lblB7, 10, SpringLayout.NORTH, p);
		sl_p.putConstraint(SpringLayout.WEST, lblB7, 0, SpringLayout.WEST, btnC7);
		p.add(lblB7);

		JLabel lblB8 = new JLabel("8");
		sl_p.putConstraint(SpringLayout.NORTH, lblB8, 10, SpringLayout.NORTH, p);
		sl_p.putConstraint(SpringLayout.WEST, lblB8, 0, SpringLayout.WEST, btnC16);
		p.add(lblB8);

		JLabel lblB9 = new JLabel("9");
		sl_p.putConstraint(SpringLayout.NORTH, lblB9, 0, SpringLayout.NORTH, btnC3);
		sl_p.putConstraint(SpringLayout.EAST, lblB9, -6, SpringLayout.WEST, btnC9);
		p.add(lblB9);

		JLabel lblB10 = new JLabel("10");
		sl_p.putConstraint(SpringLayout.NORTH, lblB10, 0, SpringLayout.NORTH, btnC1);
		sl_p.putConstraint(SpringLayout.EAST, lblB10, -42, SpringLayout.EAST, p);
		p.add(lblB10);

		JLabel lblB11 = new JLabel("11");
		sl_p.putConstraint(SpringLayout.WEST, lblB11, 0, SpringLayout.WEST, btnC11);
		sl_p.putConstraint(SpringLayout.SOUTH, lblB11, -6, SpringLayout.NORTH, btnC11);
		p.add(lblB11);

		JLabel lblB12 = new JLabel("12");
		sl_p.putConstraint(SpringLayout.NORTH, btnC12, 6, SpringLayout.SOUTH, lblB12);
		sl_p.putConstraint(SpringLayout.SOUTH, lblB12, -381, SpringLayout.SOUTH, p);
		sl_p.putConstraint(SpringLayout.WEST, lblB12, 0, SpringLayout.WEST, btnC3);
		p.add(lblB12);

		JLabel lblB13 = new JLabel("13");
		sl_p.putConstraint(SpringLayout.NORTH, btnC13, 6, SpringLayout.SOUTH, lblB13);
		sl_p.putConstraint(SpringLayout.SOUTH, lblB13, -381, SpringLayout.SOUTH, p);
		sl_p.putConstraint(SpringLayout.EAST, lblB13, 0, SpringLayout.EAST, btnC4);
		p.add(lblB13);

		JLabel lblB14 = new JLabel("14");
		sl_p.putConstraint(SpringLayout.NORTH, lblB14, 0, SpringLayout.NORTH, lblB11);
		sl_p.putConstraint(SpringLayout.EAST, lblB14, 0, SpringLayout.EAST, lblB7);
		p.add(lblB14);

		JLabel lblB15 = new JLabel("15");
		sl_p.putConstraint(SpringLayout.SOUTH, lblB15, -6, SpringLayout.NORTH, btnC15);
		sl_p.putConstraint(SpringLayout.EAST, lblB15, -75, SpringLayout.WEST, btnC16);
		p.add(lblB15);

		JLabel lblB16 = new JLabel("16");
		sl_p.putConstraint(SpringLayout.WEST, lblB16, 352, SpringLayout.EAST, lblB14);
		sl_p.putConstraint(SpringLayout.SOUTH, lblB16, -6, SpringLayout.NORTH, btnC16);
		p.add(lblB16);

		JLabel lblB17 = new JLabel("17");
		sl_p.putConstraint(SpringLayout.WEST, lblB17, 72, SpringLayout.EAST, lblB16);
		sl_p.putConstraint(SpringLayout.SOUTH, lblB17, -6, SpringLayout.NORTH, btnC17);
		p.add(lblB17);

		JLabel lblB18 = new JLabel("18");
		sl_p.putConstraint(SpringLayout.NORTH, lblB18, 0, SpringLayout.NORTH, lblB16);
		sl_p.putConstraint(SpringLayout.WEST, lblB18, 0, SpringLayout.WEST, btnC18);
		p.add(lblB18);

		JLabel lblB19 = new JLabel("19");
		sl_p.putConstraint(SpringLayout.SOUTH, btnC2, -19, SpringLayout.SOUTH, lblB19);
		sl_p.putConstraint(SpringLayout.WEST, lblB19, 497, SpringLayout.WEST, p);
		sl_p.putConstraint(SpringLayout.SOUTH, lblB19, -10, SpringLayout.NORTH, btnC19);
		p.add(lblB19);

		JLabel lblB20 = new JLabel("20");
		sl_p.putConstraint(SpringLayout.SOUTH, btnC19, -29, SpringLayout.NORTH, lblB20);
		sl_p.putConstraint(SpringLayout.SOUTH, lblB20, -15, SpringLayout.NORTH, btnC20);
		sl_p.putConstraint(SpringLayout.EAST, lblB20, -60, SpringLayout.WEST, btnC21);
		p.add(lblB20);

		JLabel lblB21 = new JLabel("21");
		sl_p.putConstraint(SpringLayout.WEST, lblB21, 45, SpringLayout.EAST, btnC19);
		sl_p.putConstraint(SpringLayout.SOUTH, lblB21, -256, SpringLayout.SOUTH, p);
		p.add(lblB21);

		JLabel lblB22 = new JLabel("22");
		sl_p.putConstraint(SpringLayout.SOUTH, btnC21, -83, SpringLayout.NORTH, lblB22);
		sl_p.putConstraint(SpringLayout.SOUTH, lblB22, -118, SpringLayout.SOUTH, p);
		sl_p.putConstraint(SpringLayout.NORTH, btnC22, 20, SpringLayout.SOUTH, lblB22);
		sl_p.putConstraint(SpringLayout.EAST, lblB22, -483, SpringLayout.EAST, p);
		p.add(lblB22);
		
		JLabel lblestado = new JLabel("Estado");
		sl_p.putConstraint(SpringLayout.NORTH, lbl10, 22, SpringLayout.SOUTH, lblestado);
		sl_p.putConstraint(SpringLayout.WEST, lblestado, 74, SpringLayout.WEST, p);
		sl_p.putConstraint(SpringLayout.EAST, lblestado, -193, SpringLayout.WEST, btnC19);
		sl_p.putConstraint(SpringLayout.SOUTH, btnC13, -36, SpringLayout.NORTH, lblestado);
		sl_p.putConstraint(SpringLayout.SOUTH, btnC12, -36, SpringLayout.NORTH, lblestado);
		sl_p.putConstraint(SpringLayout.NORTH, lblestado, -41, SpringLayout.SOUTH, btnC19);
		sl_p.putConstraint(SpringLayout.SOUTH, lblestado, -9, SpringLayout.SOUTH, btnC19);
		lblestado.setFont(new Font("Tahoma", Font.PLAIN, 34));
		p.add(lblestado);

		for (JButton jButton : botones) {
			jButton.setToolTipText("apagado");
		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

	public void cambiar(JButton btnC, JLabel lbl, int num) {
		File logFile = new File("planta0_calefaccion.txt");

		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
		Date date = new Date(System.currentTimeMillis());

		try {

			if (btnC.getToolTipText() == "encendido") {

				btnC.setToolTipText("apagado");
				btnC.setBackground(null);
				lbl.setForeground(Color.RED);
				lbl.setText(num + ": Apagado");

				BufferedWriter output = new BufferedWriter(new FileWriter(logFile, true));
				output.write("[" + formatter.format(date) + "] Apagando calefaccion " + num);
				output.newLine();
				output.close();

			} else {

				btnC.setToolTipText("encendido");
				btnC.setBackground(null);
				lbl.setForeground(Color.GREEN);
				lbl.setText(num + ": Encendido");

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
