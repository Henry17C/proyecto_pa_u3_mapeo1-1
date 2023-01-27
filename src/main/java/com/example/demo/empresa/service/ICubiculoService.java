package com.example.demo.empresa.service;

import com.example.demo.empresa.modelo.Cubiculo;

public interface ICubiculoService {
	public void insertar(Cubiculo cubiculo);

	public void actualizar(Cubiculo cubiculo);

	public Cubiculo buscar(Integer id);
	
	public void borrar (Integer id);

}
