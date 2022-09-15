package scrum;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.ImageIcon;

public class Panelimagen_planta_baja extends javax.swing.JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */

	public Panelimagen_planta_baja() {
		this.setSize(400, 200);
		
	}
	
	public void paintComponent(Graphics g) {
		Dimension tamano = getSize();
		ImageIcon ImagenFondo = new ImageIcon(getClass().getResource("/imagenes/Planta.png"));
		g.drawImage(ImagenFondo.getImage(), 0, 0, tamano.width, tamano.height, null);
		setOpaque(false);
		super.paintComponent(g);
	}
}
