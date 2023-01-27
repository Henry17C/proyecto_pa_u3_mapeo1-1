package com.example.demo.empresa.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="cubiculo")

public class Cubiculo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cubi_sec")//generarlo como secuencia
	@SequenceGenerator(name = "cubi_sec", sequenceName = "cubi_sec", allocationSize = 1)
	@Column(name = "cubi_id")
	private Integer id;
	
	@Column(name = "cubi_codigo")
	private String codigo;
	
	@Column(name = "cubi_categoria")
	private String categoria;
	
	@OneToOne
	@JoinColumn(name = "cubi_empleado")
	private Empleado empleado;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	@Override
	public String toString() {
		return "Cubiculo [id=" + id + ", codigo=" + codigo + ", categoria=" + categoria + ", empleado=" + empleado
				+ "]";
	}
	
	
	

}
