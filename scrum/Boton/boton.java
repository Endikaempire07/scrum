package scrum.Boton;

import java.awt.Color;
import java.io.Serializable;
import java.util.Objects;


public class boton implements Comparable<boton>,Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	// defino la clase racional
	// propiedades
	
	private String nombre;
	private Color color;
	// Constructor por defecto

	public boton() {

		this.nombre = nombre;
		this.color = Color.red;
	}
	// Fin Constructor por defecto

	// Constructor copia
	public boton(boton c) {
		this.nombre = c.nombre;
		this.color = c.color;
	}
	// Fin Constructor copia

	// Constructor personalizado
	public boton(String nombre, Color color) {
		this.nombre = nombre;
		this.color = color;
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
		return Objects.hash(color, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		boton other = (boton) obj;
		return Objects.equals(color, other.color) && Objects.equals(nombre, other.nombre);
	}

	@Override
	public String toString() {
		return "(nombre=" + this.nombre + ", color=" + this.color+ ") ";
	}

	@Override
	public int compareTo(boton o) {
		// TODO Auto-generated method stub
		return 0;
	}



}
