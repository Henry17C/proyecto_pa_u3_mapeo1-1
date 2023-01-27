package com.example.demo.empresa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.empresa.modelo.Empleado;
import com.example.demo.empresa.repo.IEmpleadoRepo;

@Service
public class EmpleadoServiceImpl implements IEmpleadoService {

	@Autowired
	private IEmpleadoRepo empleadoRepo;
	@Override
	public void insertar(Empleado empleado) {
		// TODO Auto-generated method stub
		empleadoRepo.insertar(empleado);
	}

	@Override
	public void actualizar(Empleado empleado) {
		// TODO Auto-generated method stub
		empleadoRepo.actualizar(empleado);
		
	}

	@Override
	public Empleado buscar(Integer id) {
		// TODO Auto-generated method stub
		return empleadoRepo.buscar(id);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		empleadoRepo.borrar(id);
	}

}
