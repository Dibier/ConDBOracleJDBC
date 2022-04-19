package com.example.demo.model;

public class Cliente {
	
	String documento;
	String nombre;
	String email;
	String telefono;
	int idCliente;
	
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	@Override
	public String toString() {
		return "Cliente [documento=" + documento + ", nombre=" + nombre + ", email=" + email + ", telefono=" + telefono
				+ ", idCliente=" + idCliente + "]";
	}
	
	
	

}
