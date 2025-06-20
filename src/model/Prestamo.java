package model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Prestamo {
	private Libro libro;
	private Usuario usuario;
	private LocalDateTime fechaPrestamo;
	private LocalDate fechaEsperadaDevolucion ; 
	private LocalDateTime fechaDevolucionReal;
	
	
	public Prestamo() {
		this.libro = new Libro();
		this.usuario = null;
		this.fechaPrestamo = LocalDateTime.now();
		this.fechaEsperadaDevolucion = null;
		this.fechaDevolucionReal = LocalDateTime.now();
	}
	
	public Prestamo(Libro libro, Usuario usuario, LocalDateTime fechaPrestamo, LocalDate fechaEsperadaDevolucion,
			LocalDateTime fechaDevolucionReal) {
		super();
		this.libro = libro;
		this.usuario = usuario;
		this.fechaPrestamo = fechaPrestamo;
		this.fechaEsperadaDevolucion = fechaEsperadaDevolucion;
		this.fechaDevolucionReal = fechaDevolucionReal;
	}

	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public LocalDateTime getFechaPrestamo() {
		return fechaPrestamo;
	}

	public void setFechaPrestamo(LocalDateTime fechaPrestamo) {
		this.fechaPrestamo = fechaPrestamo;
	}

	public LocalDate getFechaEsperadaDevolucion() {
		return fechaEsperadaDevolucion;
	}

	public void setFechaEsperadaDevolucion(LocalDate fechaEsperadaDevolucion) {
		this.fechaEsperadaDevolucion = fechaEsperadaDevolucion;
	}

	public LocalDateTime getFechaDevolucionReal() {
		return fechaDevolucionReal;
	}

	public void setFechaDevolucionReal(LocalDateTime fechaDevolucionReal) {
		this.fechaDevolucionReal = fechaDevolucionReal;
	}
	
	
	
	
}


