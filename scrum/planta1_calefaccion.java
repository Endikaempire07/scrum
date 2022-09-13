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
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.JMenu;
import javax.swing.JScrollPane;
import javax.swing.SpringLayout;
import java.awt.Dimension;
import javax.swing.BoxLayout;
import java.awt.Component;
import java.awt.CardLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.FlowLayout;
import javax.swing.JTextArea;

public class planta1_calefaccion extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu Planta0, Planta1, Planta2;
	private JMenuItem Calefaccion,Calefaccion1,Calefaccion2;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					planta1_calefaccion frame = new planta1_calefaccion();
					frame.setVisible(true);
					frame.setResizable(false);
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
		setTitle("Planta 1 Calefacci�n");
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
		
		
		
		Calefaccion = new JMenuItem("Calefacci�n");
		Calefaccion.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
            	//Close actual frame and open another one
            	planta_baja_calefaccion Planta0 = new planta_baja_calefaccion();
            	Planta0.setVisible(true);
            	dispose();
            }
		});
		
		Planta0.add(Calefaccion);

	
		Calefaccion1 = new JMenuItem("Calefacci�n");
		Calefaccion1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
            	//Close actual frame and open another one
            	planta1_calefaccion Planta1 = new planta1_calefaccion();
            	Planta1.setVisible(true);
            	dispose();
            }
		});
		Planta1.add(Calefaccion1);

		Calefaccion2 = new JMenuItem("Calefacci�n");
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
		
		Panelimagen_planta1 p = new Panelimagen_planta1();
		p.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(p);
		p.setLayout(null);
		
		JLabel lbl_c_1 = new JLabel("New label");
		lbl_c_1.setForeground(Color.GREEN);
		lbl_c_1.setBounds(32, 245, 112, 13);
		p.add(lbl_c_1);
		
		JButton btn_c_1 = new JButton("ON");
		btn_c_1.setBackground(Color.GREEN);
		btn_c_1.setToolTipText("encendido");
		btn_c_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiar(btn_c_1,lbl_c_1,1);
			}
		});
		btn_c_1.setAlignmentY(0.0f);
		btn_c_1.setBounds(32, 132, 47, 21);
		p.add(btn_c_1);	
		
		JLabel lbl_c_2 = new JLabel("New label");
		lbl_c_2.setForeground(Color.GREEN);
		lbl_c_2.setBounds(32, 268, 112, 13);
		p.add(lbl_c_2);
		
		JButton btn_c_2 = new JButton("ON");
		btn_c_2.setToolTipText("encendido");
		btn_c_2.setBackground(Color.GREEN);
		btn_c_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiar(btn_c_2,lbl_c_2,2);
			}
		});
		btn_c_2.setAlignmentY(0.0f);
		btn_c_2.setBounds(159, 132, 47, 21);
		p.add(btn_c_2);
		
		
		

		SpringLayout sl_contentPane = new SpringLayout();
		
		

	
	
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public void cambiar(JButton btn, JLabel lbl, int num) {
		File logFile = new File("log.txt");
		
		SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
		Date date = new Date(System.currentTimeMillis());
		
		try {
			
			if (btn.getToolTipText() == "encendido") {
				
				btn.setToolTipText("apagado");
				btn.setBackground(Color.RED);
				lbl.setForeground(Color.RED);
				lbl.setText(num + ": Apagado");
				
				BufferedWriter output = new BufferedWriter(new FileWriter(logFile, true));
				output.write("[" + formatter.format(date) + "] Apagando calefaccion " + num);
				output.newLine();
				output.close();

			}
			else {
				
				btn.setToolTipText("encendido");
				btn.setBackground(Color.GREEN);
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
}
