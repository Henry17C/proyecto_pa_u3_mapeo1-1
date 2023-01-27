package com.example.demo.empresa.modelo;

import java.math.BigDecimal;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "empleado")
public class Empleado {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "person_empl")//generarlo como secuencia
	@SequenceGenerator(name = "person_empl", sequenceName = "person_empl", allocationSize = 1)
	@Column(name = "empl_id")
	private Integer id;
	
	@Column(name = "empl_nombre")
	private String nombre;
	
	@Column(name = "empl_salario")
	private BigDecimal salario;
	
	@OneToOne(mappedBy = "empleado",cascade = CascadeType.ALL )
	private Cubiculo cubiculo;

	public Cubiculo getCubiculo() {
		return cubiculo;
	}

	public void setCubiculo(Cubiculo cubiculo) {
		this.cubiculo = cubiculo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Empleado [id=" + id + ", nombre=" + nombre + ", salario=" + salario + "]";
	}
	
	
	

	
	
}
