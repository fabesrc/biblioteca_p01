package model;

import java.util.ArrayList;

public abstract class Usuario {
	private String nombre;
	private String id;
	private Tipo tipo;
	private String correo;
	private ArrayList<Prestamo> historialPrestamo;
	
	
	public Usuario() {
		this.nombre = "" ;
		this.id = "";
		this.tipo = Tipo.INDEFINIDO;
		this.correo = "" ;
	}
	
	public Usuario(String nombre, String id, Tipo tipo, String correo ) {
		this.nombre = nombre;
		this.id = id;
		this.tipo = tipo;
		this.correo = correo;
		this.historialPrestamo = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public ArrayList<Prestamo> getHistorialPrestamo() {
		return historialPrestamo;
	}

	public void setHistorialPrestamo(ArrayList<Prestamo> historialPrestamo) {
		this.historialPrestamo = historialPrestamo;
	}
	
	
	

}
