package com.example.demo.empresa.repo;

import org.springframework.stereotype.Repository;

import com.example.demo.empresa.modelo.Cubiculo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CubiculoRepoImpl implements ICubiculoRepo {

	@PersistenceContext
	private EntityManager entityManager;
	@Override
	public void insertar(Cubiculo cubiculo) {
		// TODO Auto-generated method stub
		entityManager.persist(cubiculo);
	}

	@Override
	public void actualizar(Cubiculo cubiculo) {
		// TODO Auto-generated method stub
		entityManager.merge(cubiculo);
	}

	@Override
	public Cubiculo buscar(Integer id) {
		// TODO Auto-generated method stub
		return entityManager.find(Cubiculo.class, id);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		Cubiculo cubiculo= this.buscar(id);
		entityManager.remove(cubiculo);
	}

}
