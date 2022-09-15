package scrum.Boton;

import java.awt.Color;
import java.io.Serializable;
import java.util.Objects;

import javax.swing.JLabel;


public class botonconlabel implements Comparable<botonconlabel>,Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	// defino la clase racional
	// propiedades
	private JLabel label;
	private String nombre;
	private Color color;
	// Constructor por defecto

	public botonconlabel() {
		
		
		this.nombre = "";
		this.color = Color.red;
		
	}
	// Fin Constructor por defecto

	// Constructor copia
	public botonconlabel(botonconlabel c) {
		
		this.label = c.label;
		this.nombre = c.nombre;
		this.color = c.color;
	}
	// Fin Constructor copia

	// Constructor personalizado
	public botonconlabel(JLabel label,String nombre, Color color) {
		
		this.label = label;
		this.nombre = nombre;
		this.color = color;
	}

	public JLabel getLabel() {
		return label;
	}

	public void setLabel(JLabel label) {
		this.label = label;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	@Override
	public int hashCode() {
		return Objects.hash(color, label, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		botonconlabel other = (botonconlabel) obj;
		return Objects.equals(color, other.color) && Objects.equals(label, other.label)
				&& Objects.equals(nombre, other.nombre);
	}

	@Override
	public String toString() {
		return "botonconlabel [label=" + label + ", nombre=" + nombre + ", color=" + color + "]";
	}
	@Override
	public int compareTo(botonconlabel o) {
		// TODO Auto-generated method stub
		return 0;
	}

	



}
