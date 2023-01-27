package com.example.demo.empresa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.empresa.modelo.Cubiculo;
import com.example.demo.empresa.repo.ICubiculoRepo;
@Service
public class CubiculoServiceImpl implements ICubiculoService {

	@Autowired
	private ICubiculoRepo cubiculoRepo;
	
	
	@Override
	public void insertar(Cubiculo cubiculo) {
		// TODO Auto-generated method stub
		cubiculoRepo.insertar(cubiculo);
		
	}

	@Override
	public void actualizar(Cubiculo cubiculo) {
		// TODO Auto-generated method stub
		cubiculoRepo.actualizar(cubiculo);
	}

	@Override
	public Cubiculo buscar(Integer id) {
		// TODO Auto-generated method stub
		return cubiculoRepo.buscar(id);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		cubiculoRepo.borrar(id);
	}

}
