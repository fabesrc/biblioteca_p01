package service;

import model.Libro;
import model.Usuario;
import model.Prestamo;
import model.Membresia;

import java.util.ArrayList;

public class Biblioteca {
	private ArrayList<Usuario> usuarios;
	private ArrayList<Libro> libros;
	private ArrayList<Prestamo> prestamos;
	private ArrayList<Membresia> membresias;
	
	
	
	public Biblioteca() {
		this.usuarios = new ArrayList<>();
		this.libros = new ArrayList<>();
		this.prestamos = new ArrayList<>();
		this.membresias = new ArrayList<>() ;
	}
	
	
	public ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}
	public void setUsuarios(ArrayList<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	public ArrayList<Libro> getLibros() {
		return libros;
	}
	public void setLibros(ArrayList<Libro> libros) {
		this.libros = libros;
	}
	public ArrayList<Prestamo> getPrestamos() {
		return prestamos;
	}
	public void setPrestamos(ArrayList<Prestamo> prestamos) {
		this.prestamos = prestamos;
	}
	public ArrayList<Membresia> getMembresias() {
		return membresias;
	}
	public void setMembresias(ArrayList<Membresia> membresias) {
		this.membresias = membresias;
	}

	
	
}
