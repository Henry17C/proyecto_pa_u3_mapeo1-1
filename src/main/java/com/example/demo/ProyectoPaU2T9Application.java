package com.example.demo;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.empresa.modelo.Cubiculo;
import com.example.demo.empresa.modelo.Empleado;
import com.example.demo.empresa.service.IEmpleadoService;

@SpringBootApplication
public class ProyectoPaU2T9Application implements CommandLineRunner {

	@Autowired
	private IEmpleadoService empleadoService;
	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU2T9Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Empleado empleado= new Empleado();
		
		empleado.setNombre("Pedro Perez");
		empleado.setSalario(new BigDecimal(2000));
		
		
		Cubiculo cubiculo= new Cubiculo();
		cubiculo.setCategoria("Atencion al cliente");
		cubiculo.setCodigo("2A");
		cubiculo.setEmpleado(empleado);
		empleado.setCubiculo(cubiculo);
		
		empleadoService.insertar(empleado);
		Empleado e=empleadoService.buscar(1);
		e.setNombre("Pepe Perez");
		empleadoService.actualizar(e);
		empleadoService.borrar(1);
		
	}

}
