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
import java.awt.event.MouseEvent;
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
		setBounds(100, 100, 784, 432);
		contentPane = new JPanel();
		setResizable(false);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		//Creation of the variables
		JPanel panelSeleccion = new JPanel();
		JPanel panelPlanos = new JPanel();
		JPanel panelCalefacciones = new JPanel();
		JPanel panelAlarmas = new JPanel();
		
		JLabel lblSeleccion = new JLabel("Selección de planos");
		JLabel lblCalefaccion = new JLabel("Calefacciónes");
;
		JLabel lblAlarmas = new JLabel("Alarmas de incendios");
		
		JButton btnCalefaccion = new JButton("Visualizar");
		btnCalefaccion.setFont(new Font("Ravie", Font.PLAIN, 15));
		btnCalefaccion.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(MouseEvent evt) {
		    	btnCalefaccion.setFont(btnCalefaccion.getFont().deriveFont(20.0f));
		    }

		    public void mouseExited(MouseEvent evt) {
		    	btnCalefaccion.setFont(btnCalefaccion.getFont().deriveFont(15.0f));
		    }
		});
		btnCalefaccion.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
            	//Close actual frame and open another one
            	planta_baja_calefaccion menuCalefaccion = new planta_baja_calefaccion();
            	menuCalefaccion.setVisible(true);
            	menuCalefaccion.setLocationRelativeTo(rootPane);
            	dispose();
            }
		});
		
		JButton btnAlarmas = new JButton("Visualizar");
		btnAlarmas.setFont(new Font("Ravie", Font.PLAIN, 15));
		btnAlarmas.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(MouseEvent evt) {
		    	btnAlarmas.setFont(btnAlarmas.getFont().deriveFont(20.0f));
		    }

		    public void mouseExited(MouseEvent evt) {
		    	btnAlarmas.setFont(btnAlarmas.getFont().deriveFont(15.0f));
		    }
		});
		btnAlarmas.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
            	//Close actual frame and open another one
            	planta_baja_alarmas menuAlarma = new planta_baja_alarmas();
            	menuAlarma.setVisible(true);
            	menuAlarma.setLocationRelativeTo(rootPane);
            	dispose();
            }
		});
		
		
		FlowLayout flowLayout = (FlowLayout) panelSeleccion.getLayout();
		flowLayout.setVgap(50);
		contentPane.add(panelSeleccion, BorderLayout.NORTH);
		
		lblSeleccion.setFont(new Font("Ravie", Font.PLAIN, 45));
		panelSeleccion.add(lblSeleccion);
		
		FlowLayout flowLayout_1 = (FlowLayout) panelPlanos.getLayout();
		flowLayout_1.setVgap(40);
		contentPane.add(panelPlanos, BorderLayout.CENTER);
		
		panelPlanos.add(panelCalefacciones);
		panelCalefacciones.setLayout(new GridLayout(2, 1, 0, 40));
		
		lblCalefaccion.setFont(new Font("Ravie", Font.PLAIN, 25));
		panelCalefacciones.add(lblCalefaccion);
		
		panelCalefacciones.add(btnCalefaccion);
		
		Component separador = Box.createHorizontalStrut(60);
		panelPlanos.add(separador);
		
		panelPlanos.add(panelAlarmas);
		panelAlarmas.setLayout(new GridLayout(2, 1, 0, 40));
		
		lblAlarmas.setFont(new Font("Ravie", Font.PLAIN, 25));
		panelAlarmas.add(lblAlarmas);
		
		panelAlarmas.add(btnAlarmas);
	}

}