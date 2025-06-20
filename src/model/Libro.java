package model;

import java.time.LocalDate;

public class Libro {
	private String isbn;
	private String titulo;
	private String autor;
	private Genero genero;
	private int anoPubliacion;
	private int cantidadDisponible;
	
	public Libro() {
		this.isbn = "";
		this.autor = "";
		this.genero = Genero.INDEFINIDO;
		this.anoPubliacion = 0;
		this.cantidadDisponible = 0;
		
	}

	public Libro(String isbn, String titulo, String autor, Genero genero, int anoPubliacion, int cantidadDisponible) {
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.genero = genero;
		this.anoPubliacion = anoPubliacion;
		this.cantidadDisponible = cantidadDisponible;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public int getAnoPubliacion() {
		return anoPubliacion;
	}

	public void setAnoPubliacion(int anoPubliacion) {
		this.anoPubliacion = anoPubliacion;
	}

	public int getCantidadDisponible() {
		return cantidadDisponible;
	}

	public void setCantidadDisponible(int cantidadDisponible) {
		this.cantidadDisponible = cantidadDisponible;
	}

	
	

}
