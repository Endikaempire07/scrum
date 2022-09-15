package scrum;

import java.awt.EventQueue;
import java.awt.Point;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SpringLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class planta_baja_alarmas extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenuItem Menu, Alarmas, Alarmas1, Alarmas2;
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
	private JButton btn21_pba;
	private JButton btn13_pba;
	private JButton btn14_pba;
	private JButton btn15_pba;
	private JButton btn16_pba;
	private JButton btn17_pba;
	private JButton btn18_pba;
	private JButton btn19_pba;
	private JButton btn20_pba;
	private ArrayList<JButton> botones;

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
				Point pos = posicion();
				planta1_alarmas Planta1 = new planta1_alarmas();
				Planta1.setVisible(true);
				Planta1.setLocation(pos);
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
				Point pos = posicion();
				planta2_alarmas Planta2 = new planta2_alarmas();
				Planta2.setVisible(true);
				Planta2.setLocation(pos);
				dispose();
			}
		});

		botones = new ArrayList<JButton>();
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		Panelimagen_planta_baja p = new Panelimagen_planta_baja();
		p.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(p);

		SpringLayout sl_p = new SpringLayout();
		p.setLayout(sl_p);
				
		btn1_pba = new JButton("");
		sl_p.putConstraint(SpringLayout.NORTH, btn1_pba, 10, SpringLayout.NORTH, p);
		sl_p.putConstraint(SpringLayout.WEST, btn1_pba, 10, SpringLayout.WEST, p);
		sl_p.putConstraint(SpringLayout.SOUTH, btn1_pba, -505, SpringLayout.SOUTH, p);
		btn1_pba.setIcon(new ImageIcon(planta_baja_alarmas.class.getResource("/imagenes/sensor.png")));
		p.add(btn1_pba);
		botones.add(btn1_pba);
		
		btn2_pba = new JButton("");
		sl_p.putConstraint(SpringLayout.NORTH, btn2_pba, 192, SpringLayout.NORTH, p);
		sl_p.putConstraint(SpringLayout.WEST, btn2_pba, 0, SpringLayout.WEST, btn1_pba);
		sl_p.putConstraint(SpringLayout.SOUTH, btn2_pba, 205, SpringLayout.NORTH, btn1_pba);
		sl_p.putConstraint(SpringLayout.EAST, btn2_pba, 0, SpringLayout.EAST, btn1_pba);
		btn2_pba.setIcon(new ImageIcon(planta_baja_alarmas.class.getResource("/imagenes/sensor.png")));
		p.add(btn2_pba);
		botones.add(btn2_pba);
		
		btn3_pba = new JButton("");
		sl_p.putConstraint(SpringLayout.NORTH, btn3_pba, 177, SpringLayout.NORTH, p);
		sl_p.putConstraint(SpringLayout.WEST, btn3_pba, 86, SpringLayout.WEST, p);
		sl_p.putConstraint(SpringLayout.SOUTH, btn3_pba, -343, SpringLayout.SOUTH, p);
		sl_p.putConstraint(SpringLayout.EAST, btn3_pba, -984, SpringLayout.EAST, p);
		btn3_pba.setIcon(new ImageIcon(planta_baja_alarmas.class.getResource("/imagenes/sensor.png")));
		p.add(btn3_pba);
		botones.add(btn3_pba);
		
		btn4_pba = new JButton("");
		sl_p.putConstraint(SpringLayout.WEST, btn4_pba, 170, SpringLayout.WEST, p);
		sl_p.putConstraint(SpringLayout.EAST, btn4_pba, -905, SpringLayout.EAST, p);
		sl_p.putConstraint(SpringLayout.EAST, btn1_pba, -132, SpringLayout.WEST, btn4_pba);
		sl_p.putConstraint(SpringLayout.NORTH, btn4_pba, 31, SpringLayout.NORTH, p);
		sl_p.putConstraint(SpringLayout.SOUTH, btn4_pba, 44, SpringLayout.NORTH, btn1_pba);
		btn4_pba.setIcon(new ImageIcon(planta_baja_alarmas.class.getResource("/imagenes/sensor.png")));
		p.add(btn4_pba);
		botones.add(btn4_pba);
		
		btn5_pba = new JButton("");
		sl_p.putConstraint(SpringLayout.WEST, btn5_pba, 233, SpringLayout.WEST, p);
		sl_p.putConstraint(SpringLayout.NORTH, btn5_pba, 0, SpringLayout.NORTH, btn4_pba);
		sl_p.putConstraint(SpringLayout.SOUTH, btn5_pba, 0, SpringLayout.SOUTH, btn4_pba);
		sl_p.putConstraint(SpringLayout.EAST, btn5_pba, 68, SpringLayout.EAST, btn4_pba);
		btn5_pba.setIcon(new ImageIcon(planta_baja_alarmas.class.getResource("/imagenes/sensor.png")));
		p.add(btn5_pba);
		botones.add(btn5_pba);
		
		btn6_pba = new JButton("");
		sl_p.putConstraint(SpringLayout.NORTH, btn6_pba, 172, SpringLayout.NORTH, p);
		sl_p.putConstraint(SpringLayout.WEST, btn6_pba, -5, SpringLayout.WEST, btn4_pba);
		sl_p.putConstraint(SpringLayout.SOUTH, btn6_pba, 0, SpringLayout.SOUTH, btn3_pba);
		sl_p.putConstraint(SpringLayout.EAST, btn6_pba, 0, SpringLayout.EAST, btn4_pba);
		btn6_pba.setIcon(new ImageIcon(planta_baja_alarmas.class.getResource("/imagenes/sensor.png")));
		p.add(btn6_pba);
		botones.add(btn6_pba);
		
		btn7_pba = new JButton("");
		sl_p.putConstraint(SpringLayout.NORTH, btn7_pba, 0, SpringLayout.NORTH, btn6_pba);
		sl_p.putConstraint(SpringLayout.WEST, btn7_pba, 0, SpringLayout.WEST, btn5_pba);
		sl_p.putConstraint(SpringLayout.SOUTH, btn7_pba, 0, SpringLayout.SOUTH, btn3_pba);
		sl_p.putConstraint(SpringLayout.EAST, btn7_pba, 0, SpringLayout.EAST, btn5_pba);
		btn7_pba.setIcon(new ImageIcon(planta_baja_alarmas.class.getResource("/imagenes/sensor.png")));
		p.add(btn7_pba);
		botones.add(btn7_pba);
		
		btn8_pba = new JButton("");
		sl_p.putConstraint(SpringLayout.NORTH, btn8_pba, 26, SpringLayout.NORTH, p);
		sl_p.putConstraint(SpringLayout.WEST, btn8_pba, 28, SpringLayout.EAST, btn5_pba);
		sl_p.putConstraint(SpringLayout.SOUTH, btn8_pba, 0, SpringLayout.SOUTH, btn4_pba);
		sl_p.putConstraint(SpringLayout.EAST, btn8_pba, 66, SpringLayout.EAST, btn5_pba);
		btn8_pba.setIcon(new ImageIcon(planta_baja_alarmas.class.getResource("/imagenes/sensor.png")));
		p.add(btn8_pba);
		botones.add(btn8_pba);
		
		btn9_pba = new JButton("");
		sl_p.putConstraint(SpringLayout.NORTH, btn9_pba, 161, SpringLayout.NORTH, p);
		sl_p.putConstraint(SpringLayout.WEST, btn9_pba, 123, SpringLayout.EAST, btn7_pba);
		sl_p.putConstraint(SpringLayout.SOUTH, btn9_pba, 174, SpringLayout.NORTH, btn1_pba);
		sl_p.putConstraint(SpringLayout.EAST, btn9_pba, -665, SpringLayout.EAST, p);
		btn9_pba.setIcon(new ImageIcon(planta_baja_alarmas.class.getResource("/imagenes/sensor.png")));
		p.add(btn9_pba);
		botones.add(btn9_pba);
		
		btn10_pba = new JButton("");
		sl_p.putConstraint(SpringLayout.NORTH, btn10_pba, 16, SpringLayout.NORTH, btn1_pba);
		sl_p.putConstraint(SpringLayout.WEST, btn10_pba, 27, SpringLayout.EAST, btn8_pba);
		sl_p.putConstraint(SpringLayout.SOUTH, btn10_pba, 0, SpringLayout.SOUTH, btn4_pba);
		btn10_pba.setIcon(new ImageIcon(planta_baja_alarmas.class.getResource("/imagenes/sensor.png")));
		p.add(btn10_pba);
		botones.add(btn10_pba);
		
		btn11_pba = new JButton("");
		sl_p.putConstraint(SpringLayout.WEST, btn11_pba, 431, SpringLayout.WEST, p);
		sl_p.putConstraint(SpringLayout.EAST, btn10_pba, -29, SpringLayout.WEST, btn11_pba);
		sl_p.putConstraint(SpringLayout.NORTH, btn11_pba, 0, SpringLayout.NORTH, btn4_pba);
		sl_p.putConstraint(SpringLayout.SOUTH, btn11_pba, 5, SpringLayout.SOUTH, btn4_pba);
		sl_p.putConstraint(SpringLayout.EAST, btn11_pba, -634, SpringLayout.EAST, p);
		btn11_pba.setIcon(new ImageIcon(planta_baja_alarmas.class.getResource("/imagenes/sensor.png")));
		p.add(btn11_pba);
		botones.add(btn11_pba);
		
		btn12_pba = new JButton("");
		sl_p.putConstraint(SpringLayout.NORTH, btn12_pba, 139, SpringLayout.NORTH, p);
		sl_p.putConstraint(SpringLayout.WEST, btn12_pba, 116, SpringLayout.EAST, btn9_pba);
		sl_p.putConstraint(SpringLayout.EAST, btn12_pba, -511, SpringLayout.EAST, p);
		btn12_pba.setIcon(new ImageIcon(planta_baja_alarmas.class.getResource("/imagenes/sensor.png")));
		p.add(btn12_pba);
		botones.add(btn12_pba);
		
		btn13_pba = new JButton("");
		sl_p.putConstraint(SpringLayout.NORTH, btn13_pba, 31, SpringLayout.NORTH, p);
		sl_p.putConstraint(SpringLayout.WEST, btn13_pba, 275, SpringLayout.EAST, btn11_pba);
		sl_p.putConstraint(SpringLayout.EAST, btn13_pba, -321, SpringLayout.EAST, p);
		btn13_pba.setIcon(new ImageIcon(planta_baja_alarmas.class.getResource("/imagenes/sensor.png")));
		p.add(btn13_pba);
		botones.add(btn13_pba);
		
		btn14_pba = new JButton("");
		sl_p.putConstraint(SpringLayout.NORTH, btn14_pba, -185, SpringLayout.SOUTH, btn6_pba);
		sl_p.putConstraint(SpringLayout.WEST, btn14_pba, 134, SpringLayout.EAST, btn13_pba);
		sl_p.putConstraint(SpringLayout.SOUTH, btn14_pba, 0, SpringLayout.SOUTH, btn1_pba);
		sl_p.putConstraint(SpringLayout.EAST, btn14_pba, -149, SpringLayout.EAST, p);
		btn14_pba.setIcon(new ImageIcon(planta_baja_alarmas.class.getResource("/imagenes/sensor.png")));
		p.add(btn14_pba);
		botones.add(btn14_pba);
		
		btn15_pba = new JButton("");
		sl_p.putConstraint(SpringLayout.NORTH, btn15_pba, 93, SpringLayout.NORTH, p);
		sl_p.putConstraint(SpringLayout.WEST, btn15_pba, 1036, SpringLayout.WEST, p);
		sl_p.putConstraint(SpringLayout.SOUTH, btn15_pba, -422, SpringLayout.SOUTH, p);
		sl_p.putConstraint(SpringLayout.EAST, btn15_pba, -34, SpringLayout.EAST, p);
		btn15_pba.setIcon(new ImageIcon(planta_baja_alarmas.class.getResource("/imagenes/sensor.png")));
		p.add(btn15_pba);
		botones.add(btn15_pba);
		
		btn16_pba = new JButton("");
		sl_p.putConstraint(SpringLayout.NORTH, btn16_pba, 134, SpringLayout.SOUTH, btn14_pba);
		sl_p.putConstraint(SpringLayout.WEST, btn16_pba, 950, SpringLayout.WEST, p);
		sl_p.putConstraint(SpringLayout.SOUTH, btn16_pba, -343, SpringLayout.SOUTH, p);
		sl_p.putConstraint(SpringLayout.EAST, btn16_pba, -120, SpringLayout.EAST, p);
		btn16_pba.setIcon(new ImageIcon(planta_baja_alarmas.class.getResource("/imagenes/sensor.png")));
		p.add(btn16_pba);
		botones.add(btn16_pba);
		
		btn17_pba = new JButton("");
		sl_p.putConstraint(SpringLayout.NORTH, btn17_pba, 177, SpringLayout.NORTH, p);
		sl_p.putConstraint(SpringLayout.WEST, btn17_pba, 865, SpringLayout.WEST, p);
		sl_p.putConstraint(SpringLayout.SOUTH, btn17_pba, -343, SpringLayout.SOUTH, p);
		sl_p.putConstraint(SpringLayout.EAST, btn17_pba, -47, SpringLayout.WEST, btn16_pba);
		btn17_pba.setIcon(new ImageIcon(planta_baja_alarmas.class.getResource("/imagenes/sensor.png")));
		p.add(btn17_pba);
		botones.add(btn17_pba);
		
		btn18_pba = new JButton("");
		sl_p.putConstraint(SpringLayout.NORTH, btn18_pba, 172, SpringLayout.NORTH, p);
		sl_p.putConstraint(SpringLayout.SOUTH, btn18_pba, -343, SpringLayout.SOUTH, p);
		sl_p.putConstraint(SpringLayout.SOUTH, btn13_pba, -113, SpringLayout.NORTH, btn18_pba);
		sl_p.putConstraint(SpringLayout.WEST, btn18_pba, 776, SpringLayout.WEST, p);
		sl_p.putConstraint(SpringLayout.EAST, btn18_pba, -51, SpringLayout.WEST, btn17_pba);
		btn18_pba.setIcon(new ImageIcon(planta_baja_alarmas.class.getResource("/imagenes/sensor.png")));
		p.add(btn18_pba);
		botones.add(btn18_pba);
		
		btn19_pba = new JButton("");
		sl_p.putConstraint(SpringLayout.NORTH, btn19_pba, 172, SpringLayout.NORTH, p);
		sl_p.putConstraint(SpringLayout.WEST, btn19_pba, -430, SpringLayout.EAST, p);
		sl_p.putConstraint(SpringLayout.SOUTH, btn19_pba, -343, SpringLayout.SOUTH, p);
		sl_p.putConstraint(SpringLayout.EAST, btn19_pba, -60, SpringLayout.WEST, btn18_pba);
		btn19_pba.setIcon(new ImageIcon(planta_baja_alarmas.class.getResource("/imagenes/sensor.png")));
		p.add(btn19_pba);
		botones.add(btn19_pba);
		
		btn20_pba = new JButton("");
		sl_p.putConstraint(SpringLayout.NORTH, btn20_pba, 242, SpringLayout.NORTH, p);
		sl_p.putConstraint(SpringLayout.SOUTH, btn12_pba, -80, SpringLayout.NORTH, btn20_pba);
		sl_p.putConstraint(SpringLayout.WEST, btn20_pba, 570, SpringLayout.WEST, p);
		sl_p.putConstraint(SpringLayout.SOUTH, btn20_pba, 232, SpringLayout.SOUTH, btn1_pba);
		sl_p.putConstraint(SpringLayout.EAST, btn20_pba, -500, SpringLayout.EAST, p);
		btn20_pba.setIcon(new ImageIcon(planta_baja_alarmas.class.getResource("/imagenes/sensor.png")));
		p.add(btn20_pba);
		botones.add(btn20_pba);
		
		btn21_pba = new JButton("");
		sl_p.putConstraint(SpringLayout.NORTH, btn21_pba, 150, SpringLayout.SOUTH, btn6_pba);
		sl_p.putConstraint(SpringLayout.WEST, btn21_pba, 497, SpringLayout.WEST, p);
		sl_p.putConstraint(SpringLayout.SOUTH, btn21_pba, -165, SpringLayout.SOUTH, p);
		sl_p.putConstraint(SpringLayout.EAST, btn21_pba, -568, SpringLayout.EAST, p);
		btn21_pba.setIcon(new ImageIcon(planta_baja_alarmas.class.getResource("/imagenes/sensor.png")));
		p.add(btn21_pba);
		botones.add(btn21_pba);
		
		for (JButton boton : botones) {
			boton.setBorder(BorderFactory.createLineBorder(Color.black));
			boton.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					cambiar(boton);
				}
				
			});
			
			int temp = (Math.random() <= 0.5) ? 1 : 2;
			if (temp==1) {
				boton.setBackground(Color.RED);
				boton.setToolTipText("apagado");
			}else {
				boton.setBackground(Color.green);
				boton.setToolTipText("encendido");
			}
		}
		SpringLayout sl_contentPane = new SpringLayout();

		leer();
		escribir();
	}
	
	public void cambiar(JButton btn) {
		if (btn.getToolTipText().equals("encendido")) {
			btn.setToolTipText("apagado");
			btn.setBackground(Color.RED);
			escribir();
		} else {
			btn.setToolTipText("encendido");
			btn.setBackground(Color.GREEN);
			escribir();
		}
	}
	
	public void escribir() {	
		FileOutputStream  fos;
		ObjectOutputStream oos;
		try {
			fos = new FileOutputStream("planta0_alarmas.dat");
			oos = new ObjectOutputStream(fos);
			for (JButton jButton : botones) {
				oos.writeObject(jButton);
			}

			oos.close();
			fos.close();
			
		}catch(FileNotFoundException e){
			e.printStackTrace();
			
		}catch(IOException e){
			e.printStackTrace();
			
		}
	}
	
	@SuppressWarnings("unchecked")
	public void leer() {

		FileInputStream  fis ;
		ObjectInputStream ois;
		ArrayList<JButton> temporal = new ArrayList<JButton>();
		int num = 0;
		
		try {

			fis = new FileInputStream("planta0_alarmas.dat");
			ois = new ObjectInputStream(fis);
			while (fis.available() > 0) {
				temporal.add((JButton) ois.readObject());
            }
			
			for (JButton jButton : temporal) {
				botones.get(num).setBackground(jButton.getBackground());
				botones.get(num).setToolTipText(jButton.getToolTipText());
				num++;
			}
			
			ois.close();
			fis.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        
        } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Point posicion() {
		Point frame = this.rootPane.getLocationOnScreen();
		return frame;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
