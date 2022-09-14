package scrum;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenu;
import javax.swing.SpringLayout;

public class planta1_alarmas extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	@SuppressWarnings("unused")
	private JMenuBar menuBar;
	private JMenu Planta0, Planta1, Planta2;
	private JMenuItem Alarmas,Alarmas1,Alarmas2;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnMenu_p1a;
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
	@SuppressWarnings("unused")
	public planta1_alarmas() {
		setTitle("Planta 1 alarmas");
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
		
		Panelimagen_planta1 p = new Panelimagen_planta1();
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
		
		btnMenu_p1a = new JButton("Men\u00FA");
		sl_p.putConstraint(SpringLayout.WEST, btnMenu_p1a, 0, SpringLayout.WEST, btnNewButton);
		sl_p.putConstraint(SpringLayout.SOUTH, btnMenu_p1a, -6, SpringLayout.NORTH, btnNewButton_1);
		btnMenu_p1a.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Close actual frame and open another one
            	menu_inicio menu = new menu_inicio();
            	menu.setVisible(true);
            	dispose();
			}
		});
		p.add(btnMenu_p1a);
		
		

		SpringLayout sl_contentPane = new SpringLayout();
		
		

	
	
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
