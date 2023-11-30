package com.example.entidades;

import java.io.Serializable;

import jakarta.persistence.*;

@Entity
@Table
public class Cliente implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	private long id;
	@Column
	private String nombre;
	@Column
	private String apellido;
	@Column
	private String dni;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="fk_Calificacion")
	private Calificacion relacional;
	
	public Cliente(String nombre, String apellido, String dni) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Calificacion getRelacional() {
		return relacional;
	}

	public void setRelacional(Calificacion relacional) {
		this.relacional = relacional;
	}
	
	
}
