package scrum;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Component;
import javax.swing.Box;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class menu_inicio extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menu_inicio frame = new menu_inicio();
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
	public menu_inicio() {
		setTitle("Inicio");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 585, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		//Creation of the variables
		JPanel panelSeleccion = new JPanel();
		JPanel panelPlanos = new JPanel();
		JPanel panelCalefacciones = new JPanel();
		JPanel panelAlarmas = new JPanel();
		
<<<<<<< HEAD
		JLabel lblSeleccion = new JLabel("Selección de planos");
		JLabel lblCalefaccion = new JLabel("Calefacciónes");
=======
		JLabel lblSeleccion = new JLabel("SelecciÃ³n de planos");
		JLabel lblCalefaccion = new JLabel("CalefacciÃ³nes");
>>>>>>> 0b8e42d53f36ddfaae4d5e8863838d20e8479e35
		JLabel lblAlarmas = new JLabel("Alarmas de incendios");
		
		JButton btnCalefaccion = new JButton("Visualizar");
		btnCalefaccion.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
            	//Close actual frame and open another one
            	planta_baja_alarmas menuAlarmas = new planta_baja_alarmas();
            	menuAlarmas.setVisible(true);
            	menuAlarmas.setBounds(rootPane.getBounds());
            	menuAlarmas.setLocationRelativeTo(rootPane);
            	dispose();
            }
		});
		
		JButton btnAlarmas = new JButton("Visualizar");
		btnAlarmas.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
            	//Close actual frame and open another one
            	planta_baja_calefaccion menuCalefaccion = new planta_baja_calefaccion();
            	menuCalefaccion.setVisible(true);
            	menuCalefaccion.setBounds(rootPane.getBounds());
            	menuCalefaccion.setLocationRelativeTo(rootPane);
            	dispose();
            }
		});
		
		
		FlowLayout flowLayout = (FlowLayout) panelSeleccion.getLayout();
		flowLayout.setVgap(25);
		contentPane.add(panelSeleccion, BorderLayout.NORTH);
		
		lblSeleccion.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panelSeleccion.add(lblSeleccion);
		
		FlowLayout flowLayout_1 = (FlowLayout) panelPlanos.getLayout();
		flowLayout_1.setVgap(25);
		contentPane.add(panelPlanos, BorderLayout.CENTER);
		
		panelPlanos.add(panelCalefacciones);
		panelCalefacciones.setLayout(new GridLayout(2, 1, 0, 20));
		
		lblCalefaccion.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panelCalefacciones.add(lblCalefaccion);
		
		panelCalefacciones.add(btnCalefaccion);
		
		Component separador = Box.createHorizontalStrut(40);
		panelPlanos.add(separador);
		
		panelPlanos.add(panelAlarmas);
		panelAlarmas.setLayout(new GridLayout(2, 1, 0, 20));
		
		lblAlarmas.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panelAlarmas.add(lblAlarmas);
		
		panelAlarmas.add(btnAlarmas);
	}

}
