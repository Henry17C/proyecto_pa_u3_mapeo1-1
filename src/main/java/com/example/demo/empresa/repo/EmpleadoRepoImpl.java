package com.example.demo.empresa.repo;

import org.springframework.stereotype.Repository;

import com.example.demo.empresa.modelo.Empleado;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class EmpleadoRepoImpl implements  IEmpleadoRepo{

	@PersistenceContext
	private EntityManager entityManager;
	@Override
	public void insertar(Empleado empleado) {
		// TODO Auto-generated method stub
		entityManager.persist(empleado);
		
	}

	@Override
	public void actualizar(Empleado empleado) {
		// TODO Auto-generated method stub
		entityManager.merge(empleado);
	}

	@Override
	public Empleado buscar(Integer id) {
		// TODO Auto-generated method stub
		return entityManager.find(Empleado.class, id);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		Empleado e= this.buscar(id);
		entityManager.remove(e);
		
	}

}
