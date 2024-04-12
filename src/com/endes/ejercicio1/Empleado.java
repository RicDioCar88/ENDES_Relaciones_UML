package com.endes.ejercicio1;

/**
 * 
 */
public class Empleado {

	private String nombre;
	private String idempleado;

	public Empleado() {
	};

	public void setNombre(String newVar) {
		nombre = newVar;
	}

	public String getNombre() {
		return nombre;
	}

	public void setIdempleado(String newVar) {
		idempleado = newVar;
	}

	public String getIdempleado() {
		return idempleado;
	}

	public void procesarDevolucion(Libro libro, MIembro miembro) {
	}

	public void procesarPrestamo(Libro libro, MIembro miembro) {
	}

}
