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

public class planta_baja_calefaccion extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	@SuppressWarnings("unused")
	private JMenuBar menuBar;
	private JMenu Planta0, Planta1, Planta2;
	private JMenuItem Calefaccion,Calefaccion1,Calefaccion2;
	private JButton btnMenu_pbc;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
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
	@SuppressWarnings("unused")
	public planta_baja_calefaccion() {
		setTitle("Planta baja Calefacción");
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
            	planta1_calefaccion Planta0 = new planta1_calefaccion();
            	Planta0.setVisible(true);
            	dispose();
            }
		});
		Planta1.add(Calefaccion1);

		Calefaccion2 = new JMenuItem("Calefacción");
		Calefaccion2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
            	//Close actual frame and open another one
            	planta2_calefaccion Planta0 = new planta2_calefaccion();
			
            	Planta0.setVisible(true);
            	dispose();
            }
		});
		Planta2.add(Calefaccion2);
		
	
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		Panelimagen_planta_baja p = new Panelimagen_planta_baja();
		p.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(p);
		
		SpringLayout sl_p = new SpringLayout();
		p.setLayout(sl_p);
		
		btnMenu_pbc = new JButton("Menú");
		p.add(btnMenu_pbc);
		btnMenu_pbc.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
            	//Close actual frame and open another one
            	menu_inicio menu = new menu_inicio();
            	menu.setVisible(true);
            	dispose();
            }
		});
		btnNewButton_1 = new JButton("New button");
		sl_p.putConstraint(SpringLayout.WEST, btnMenu_pbc, 0, SpringLayout.WEST, btnNewButton_1);
		sl_p.putConstraint(SpringLayout.SOUTH, btnMenu_pbc, -6, SpringLayout.NORTH, btnNewButton_1);
		sl_p.putConstraint(SpringLayout.WEST, btnNewButton_1, 36, SpringLayout.WEST, p);
		sl_p.putConstraint(SpringLayout.SOUTH, btnNewButton_1, -84, SpringLayout.SOUTH, p);
		p.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("New button");
		sl_p.putConstraint(SpringLayout.NORTH, btnNewButton_2, 10, SpringLayout.SOUTH, btnNewButton_1);
		sl_p.putConstraint(SpringLayout.WEST, btnNewButton_2, 0, SpringLayout.WEST, btnNewButton_1);
		p.add(btnNewButton_2);
		
		

		SpringLayout sl_contentPane = new SpringLayout();
		
		

	
	
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
