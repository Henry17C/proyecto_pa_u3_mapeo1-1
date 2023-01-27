package com.example.demo.empresa.repo;

import com.example.demo.empresa.modelo.Empleado;

public interface IEmpleadoRepo {
	public void insertar(Empleado empleado);

	public void actualizar(Empleado empleado);

	public Empleado buscar(Integer id);
	
	public void borrar (Integer id);

}
