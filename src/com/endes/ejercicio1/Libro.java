
package com.endes.ejercicio1;

/**
 * Class Libro
 */
public class Libro {

	private String titulo;
	private String autor;
	private String isbn;

	public Libro() {
	};

	public void setTitulo(String newVar) {
		this.titulo = newVar;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setAutor(String newVar) {
		this.autor = newVar;
	}

	public String getAutor() {
		return autor;
	}

	public void setIsbn(String newVar) {
		this.isbn = newVar;
	}

	public String getIsbn() {
		return isbn;
	}

	public String prestar() {
		return "";
	}

	public String devolver() {
		return "";
	}

}
