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
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JMenu;
import javax.swing.JScrollPane;
import javax.swing.SpringLayout;
import java.awt.Dimension;

public class planta1_alarmas extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenuItem Alarmas,Alarmas1,Alarmas2;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnMenu_p1a;
	
	private JButton btn1_pba;
	private JButton btn2_pba;
	private JButton btn3_pba;
	private JButton btn4_pba;
	private JButton btn5_pba;
	private JButton btn6_pba;
	private JButton btn7_pba;
	private JButton btn8_pba;
	private JButton btn9_pba;
	private JButton btn10_pba;
	private JButton btn11_pba;
	private JButton btn12_pba;
	private JButton btn13_pba;
	private JButton btn14_pba;
	private JButton btn15_pba;
	private JButton btn16_pba;
	private JButton btn17_pba;
	private JButton btn18_pba;
	private JButton btn19_pba;
	private JButton btn20_pba;
	private JButton btn21_pba;
	private JButton btn22_pba;
	private JButton btn23_pba;
	private ArrayList<JButton> botones = new ArrayList<JButton>();
	private JMenuItem Menu;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					planta1_alarmas frame = new planta1_alarmas();
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
	public planta1_alarmas() {
		setTitle("Planta 1 alarmas");
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
			public void mouseExited(MouseEvent me) {
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
		Alarmas.setBackground(Color.LIGHT_GRAY);
		Alarmas.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent me) {
				Alarmas.setBackground(Color.black);
				Alarmas.setForeground(Color.white);
			}

			@Override
			public void mouseExited(MouseEvent me) {
				Alarmas.setBackground(Color.lightGray);
				Alarmas.setForeground(Color.black);
			}
		});
		Alarmas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				// Close actual frame and open another one
				planta_baja_alarmas Planta0 = new planta_baja_alarmas();
				Planta0.setVisible(true);
				dispose();
			}
		});

		Alarmas1 = new JMenuItem("Primera planta");
		menuBar.add(Alarmas1);
		Alarmas1.setBackground(Color.black);
		Alarmas1.setForeground(Color.white);
		Alarmas1.setBorder(BorderFactory.createLineBorder(Color.white));

		Alarmas2 = new JMenuItem("Segunda planta");
		menuBar.add(Alarmas2);
		Alarmas2.setBackground(Color.LIGHT_GRAY);
		Alarmas2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent me) {
				Alarmas2.setBackground(Color.black);
				Alarmas2.setForeground(Color.white);
			}

			@Override
			public void mouseExited(MouseEvent me) {
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

		Panelimagen_planta1 p = new Panelimagen_planta1();
		p.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(p);

		SpringLayout sl_p = new SpringLayout();
		p.setLayout(sl_p);

		btn1_pba = new JButton("");
		sl_p.putConstraint(SpringLayout.NORTH, btn1_pba, 94, SpringLayout.NORTH, p);
		sl_p.putConstraint(SpringLayout.WEST, btn1_pba, 22, SpringLayout.WEST, p);
		btn1_pba.setIcon(new ImageIcon(planta_baja_alarmas.class.getResource("/imagenes/sensor.png")));
		p.add(btn1_pba);
		botones.add(btn1_pba);

		btn2_pba = new JButton("");
		sl_p.putConstraint(SpringLayout.NORTH, btn2_pba, 10, SpringLayout.NORTH, p);
		btn2_pba.setIcon(new ImageIcon(planta_baja_alarmas.class.getResource("/imagenes/sensor.png")));
		p.add(btn2_pba);
		botones.add(btn2_pba);

		btn3_pba = new JButton("");
		sl_p.putConstraint(SpringLayout.NORTH, btn3_pba, 64, SpringLayout.SOUTH, btn2_pba);
		sl_p.putConstraint(SpringLayout.EAST, btn3_pba, 0, SpringLayout.EAST, btn2_pba);
		btn3_pba.setIcon(new ImageIcon(planta_baja_alarmas.class.getResource("/imagenes/sensor.png")));
		p.add(btn3_pba);
		botones.add(btn3_pba);

		btn4_pba = new JButton("");
		sl_p.putConstraint(SpringLayout.WEST, btn4_pba, 283, SpringLayout.WEST, p);
		sl_p.putConstraint(SpringLayout.EAST, btn2_pba, -68, SpringLayout.WEST, btn4_pba);
		sl_p.putConstraint(SpringLayout.NORTH, btn4_pba, 0, SpringLayout.NORTH, btn2_pba);
		btn4_pba.setIcon(new ImageIcon(planta_baja_alarmas.class.getResource("/imagenes/sensor.png")));
		p.add(btn4_pba);
		botones.add(btn4_pba);

		btn5_pba = new JButton("");
		sl_p.putConstraint(SpringLayout.SOUTH, btn5_pba, 0, SpringLayout.SOUTH, btn3_pba);
		sl_p.putConstraint(SpringLayout.EAST, btn5_pba, 0, SpringLayout.EAST, btn4_pba);
		btn5_pba.setIcon(new ImageIcon(planta_baja_alarmas.class.getResource("/imagenes/sensor.png")));
		p.add(btn5_pba);
		botones.add(btn5_pba);

		btn6_pba = new JButton("");
		sl_p.putConstraint(SpringLayout.WEST, btn6_pba, 67, SpringLayout.EAST, btn5_pba);
		sl_p.putConstraint(SpringLayout.SOUTH, btn6_pba, 0, SpringLayout.SOUTH, btn3_pba);
		btn6_pba.setIcon(new ImageIcon(planta_baja_alarmas.class.getResource("/imagenes/sensor.png")));
		p.add(btn6_pba);
		botones.add(btn6_pba);

		btn7_pba = new JButton("");
		sl_p.putConstraint(SpringLayout.NORTH, btn7_pba, 189, SpringLayout.NORTH, p);
		sl_p.putConstraint(SpringLayout.WEST, btn7_pba, 517, SpringLayout.WEST, p);
		btn7_pba.setIcon(new ImageIcon(planta_baja_alarmas.class.getResource("/imagenes/sensor.png")));
		p.add(btn7_pba);
		botones.add(btn7_pba);

		btn8_pba = new JButton("");
		sl_p.putConstraint(SpringLayout.NORTH, btn8_pba, 43, SpringLayout.SOUTH, btn7_pba);
		sl_p.putConstraint(SpringLayout.EAST, btn8_pba, 0, SpringLayout.EAST, btn7_pba);
		btn8_pba.setIcon(new ImageIcon(planta_baja_alarmas.class.getResource("/imagenes/sensor.png")));
		p.add(btn8_pba);
		botones.add(btn8_pba);

		btn9_pba = new JButton("");
		sl_p.putConstraint(SpringLayout.WEST, btn9_pba, 67, SpringLayout.EAST, btn8_pba);
		sl_p.putConstraint(SpringLayout.SOUTH, btn9_pba, 0, SpringLayout.SOUTH, btn8_pba);
		btn9_pba.setIcon(new ImageIcon(planta_baja_alarmas.class.getResource("/imagenes/sensor.png")));
		p.add(btn9_pba);
		botones.add(btn9_pba);

		btn10_pba = new JButton("");
		sl_p.putConstraint(SpringLayout.SOUTH, btn10_pba, 0, SpringLayout.SOUTH, btn2_pba);
		sl_p.putConstraint(SpringLayout.EAST, btn10_pba, -299, SpringLayout.EAST, p);
		btn10_pba.setIcon(new ImageIcon(planta_baja_alarmas.class.getResource("/imagenes/sensor.png")));
		p.add(btn10_pba);
		botones.add(btn10_pba);

		btn11_pba = new JButton("");
		sl_p.putConstraint(SpringLayout.SOUTH, btn11_pba, 0, SpringLayout.SOUTH, btn3_pba);
		sl_p.putConstraint(SpringLayout.EAST, btn11_pba, 0, SpringLayout.EAST, btn10_pba);
		btn11_pba.setIcon(new ImageIcon(planta_baja_alarmas.class.getResource("/imagenes/sensor.png")));
		p.add(btn11_pba);
		botones.add(btn11_pba);

		btn12_pba = new JButton("");
		sl_p.putConstraint(SpringLayout.WEST, btn12_pba, 60, SpringLayout.EAST, btn10_pba);
		sl_p.putConstraint(SpringLayout.SOUTH, btn12_pba, 0, SpringLayout.SOUTH, btn2_pba);
		btn12_pba.setIcon(new ImageIcon(planta_baja_alarmas.class.getResource("/imagenes/sensor.png")));
		p.add(btn12_pba);
		botones.add(btn12_pba);

		btn13_pba = new JButton("");
		sl_p.putConstraint(SpringLayout.NORTH, btn13_pba, 0, SpringLayout.NORTH, btn3_pba);
		sl_p.putConstraint(SpringLayout.EAST, btn13_pba, 0, SpringLayout.EAST, btn12_pba);
		btn13_pba.setIcon(new ImageIcon(planta_baja_alarmas.class.getResource("/imagenes/sensor.png")));
		p.add(btn13_pba);
		botones.add(btn13_pba);

		btn14_pba = new JButton("");
		sl_p.putConstraint(SpringLayout.WEST, btn14_pba, 380, SpringLayout.WEST, p);
		sl_p.putConstraint(SpringLayout.SOUTH, btn14_pba, -52, SpringLayout.SOUTH, p);
		btn14_pba.setIcon(new ImageIcon(planta_baja_alarmas.class.getResource("/imagenes/sensor.png")));
		p.add(btn14_pba);
		botones.add(btn14_pba);

		btn15_pba = new JButton("");
		sl_p.putConstraint(SpringLayout.NORTH, btn15_pba, 0, SpringLayout.NORTH, btn14_pba);
		sl_p.putConstraint(SpringLayout.WEST, btn15_pba, 39, SpringLayout.EAST, btn14_pba);
		btn15_pba.setIcon(new ImageIcon(planta_baja_alarmas.class.getResource("/imagenes/sensor.png")));
		p.add(btn15_pba);
		botones.add(btn15_pba);

		btn16_pba = new JButton("");
		sl_p.putConstraint(SpringLayout.WEST, btn16_pba, 36, SpringLayout.EAST, btn15_pba);
		sl_p.putConstraint(SpringLayout.SOUTH, btn16_pba, -24, SpringLayout.SOUTH, p);
		btn16_pba.setIcon(new ImageIcon(planta_baja_alarmas.class.getResource("/imagenes/sensor.png")));
		p.add(btn16_pba);
		botones.add(btn16_pba);

		btn17_pba = new JButton("");
		sl_p.putConstraint(SpringLayout.NORTH, btn17_pba, 0, SpringLayout.NORTH, btn14_pba);
		sl_p.putConstraint(SpringLayout.WEST, btn17_pba, 83, SpringLayout.EAST, btn16_pba);
		btn17_pba.setIcon(new ImageIcon(planta_baja_alarmas.class.getResource("/imagenes/sensor.png")));
		p.add(btn17_pba);
		botones.add(btn17_pba);

		btn18_pba = new JButton("");
		sl_p.putConstraint(SpringLayout.WEST, btn18_pba, 77, SpringLayout.EAST, btn7_pba);
		sl_p.putConstraint(SpringLayout.SOUTH, btn18_pba, -56, SpringLayout.NORTH, btn9_pba);
		sl_p.putConstraint(SpringLayout.EAST, btn18_pba, 51, SpringLayout.WEST, btn9_pba);
		btn18_pba.setIcon(new ImageIcon(planta_baja_alarmas.class.getResource("/imagenes/sensor.png")));
		p.add(btn18_pba);
		botones.add(btn18_pba);

		btn19_pba = new JButton("");
		sl_p.putConstraint(SpringLayout.NORTH, btn19_pba, 31, SpringLayout.NORTH, p);
		sl_p.putConstraint(SpringLayout.WEST, btn19_pba, 519, SpringLayout.WEST, p);
		sl_p.putConstraint(SpringLayout.SOUTH, btn19_pba, -169, SpringLayout.SOUTH, btn7_pba);
		sl_p.putConstraint(SpringLayout.EAST, btn19_pba, 0, SpringLayout.EAST, btn15_pba);
		btn19_pba.setIcon(new ImageIcon(planta_baja_alarmas.class.getResource("/imagenes/sensor.png")));
		p.add(btn19_pba);
		botones.add(btn19_pba);

		btn20_pba = new JButton("");
		sl_p.putConstraint(SpringLayout.NORTH, btn20_pba, 0, SpringLayout.NORTH, btn19_pba);
		sl_p.putConstraint(SpringLayout.WEST, btn20_pba, 682, SpringLayout.WEST, p);
		sl_p.putConstraint(SpringLayout.SOUTH, btn20_pba, -74, SpringLayout.SOUTH, btn1_pba);
		sl_p.putConstraint(SpringLayout.EAST, btn20_pba, -34, SpringLayout.WEST, btn10_pba);
		btn20_pba.setIcon(new ImageIcon(planta_baja_alarmas.class.getResource("/imagenes/sensor.png")));
		p.add(btn20_pba);
		botones.add(btn20_pba);

		btn21_pba = new JButton("");
		sl_p.putConstraint(SpringLayout.NORTH, btn21_pba, 0, SpringLayout.NORTH, btn2_pba);
		sl_p.putConstraint(SpringLayout.WEST, btn21_pba, 45, SpringLayout.EAST, btn4_pba);
		btn21_pba.setIcon(new ImageIcon(planta_baja_alarmas.class.getResource("/imagenes/sensor.png")));
		p.add(btn21_pba);
		botones.add(btn21_pba);

		btn22_pba = new JButton("");
		sl_p.putConstraint(SpringLayout.EAST, btn21_pba, -28, SpringLayout.WEST, btn22_pba);
		sl_p.putConstraint(SpringLayout.WEST, btn22_pba, 114, SpringLayout.EAST, btn4_pba);
		sl_p.putConstraint(SpringLayout.SOUTH, btn22_pba, 0, SpringLayout.SOUTH, btn2_pba);
		sl_p.putConstraint(SpringLayout.EAST, btn22_pba, 58, SpringLayout.EAST, btn14_pba);
		btn22_pba.setIcon(new ImageIcon(planta_baja_alarmas.class.getResource("/imagenes/sensor.png")));
		p.add(btn22_pba);
		botones.add(btn22_pba);

		btn23_pba = new JButton("");
		sl_p.putConstraint(SpringLayout.NORTH, btn23_pba, 0, SpringLayout.NORTH, btn2_pba);
		sl_p.putConstraint(SpringLayout.WEST, btn23_pba, 0, SpringLayout.WEST, btn1_pba);
		btn23_pba.setIcon(new ImageIcon(planta_baja_alarmas.class.getResource("/imagenes/sensor.png")));
		p.add(btn23_pba);
		botones.add(btn23_pba);

		for (JButton boton : botones) {
			if (Math.random() > 0.5) {
				boton.setToolTipText("encendido");
				boton.setBackground(Color.GREEN);
			} else {
				boton.setToolTipText("apagado");
				boton.setBackground(Color.RED);
			}

		}

		for (JButton boton : botones) {
			boton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (boton.getToolTipText() == "encendido") {
						boton.setToolTipText("apagado");
						boton.setBackground(Color.RED);
					}
				}
			});
		}

		SpringLayout sl_contentPane = new SpringLayout();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
