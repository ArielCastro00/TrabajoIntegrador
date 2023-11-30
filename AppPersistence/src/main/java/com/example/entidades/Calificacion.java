package com.example.entidades;

import java.io.Serializable;

import jakarta.persistence.*;

@Entity
@Table

public class Calificacion implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	@Column
	private String horario;
	@Column
	private String zona_de_cobertura;
	
	@OneToOne(mappedBy="relacional")
	private Cliente cliente;
	
	public Calificacion(String horario, String zona_de_cobertura) {
		super();
		this.horario = horario;
		this.zona_de_cobertura = zona_de_cobertura;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public String getZona_de_cobertura() {
		return zona_de_cobertura;
	}
	public void setZona_de_cobertura(String zona_de_cobertura) {
		this.zona_de_cobertura = zona_de_cobertura;
	}
	
	
}
