package com.example.demo.empresa.repo;

import com.example.demo.empresa.modelo.Cubiculo;

public interface ICubiculoRepo {

	public void insertar(Cubiculo cubiculo);

	public void actualizar(Cubiculo cubiculo);

	public Cubiculo buscar(Integer id);
	
	public void borrar (Integer id);
}
