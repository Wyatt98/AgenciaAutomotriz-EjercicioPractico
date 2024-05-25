package com.agencia.principal;

import com.agencia.anotaciones.Revisar;
import com.agencia.enums.Combustible;
import com.agencia.enums.Transmision;
import com.agencia.models.Agencia;
import com.agencia.models.Camion;
import com.agencia.models.Coche;
import com.agencia.models.Moto;
import com.agencia.models.Vehiculo;
import com.agencia.registros.Propietario;

public class Principal {

	public static void main(String[] args) {
		Propietario propietario1 = new Propietario("Juan Pérez", "Calle ficticia 123", "55-1122-3344");
		Propietario propietario2 = new Propietario("Ana Gómez", "Calle ficticia 321", "55-4433-1122");

		Coche coche = new Coche("Toyota", "Corolla", 2021, Combustible.GASOLINA, Transmision.AUTOMATICA, 
				propietario1, 4);
		
		Moto moto = new Moto("Yamaha", "MT-07", 2019, Combustible.GASOLINA, Transmision.MANUAL, propietario2);
		
		Camion camion = new Camion("Mercedes Benz", "Actros", 2019, Combustible.DIESEL, Transmision.MANUAL, 
				propietario1, 20000);
		
		
		Agencia agencia = new Agencia();
		agencia.agregarVehiculo(coche);
		agencia.agregarVehiculo(moto);;
		agencia.agregarVehiculo(camion);
		
		System.out.println("Mostrando todos los vehiculos");
		agencia.mostrarTodosLosVehiculos();
		
		System.out.print("\n\n");
		
		System.out.println("Mostrando todos los vehiculos del año 2019");
		agencia.mostrarVehiculosPorAnio(2019);
		
		System.out.print("\n\n");
		
		System.out.println("Mostrando todos los vehiculos de gasolina");
		agencia.mostrarVehiculosPorCombustible(Combustible.GASOLINA);
		
		System.out.print("\n\n");
		System.out.println("Total de vehiculos en la agencia: " + Agencia.getTotalVehiculos());
		
		/*
		 * Procesar anotaciones
		 * */
		for(var metodo : Vehiculo.class.getDeclaredMethods()) {
			if(metodo.isAnnotationPresent(Revisar.class)) {
				Revisar revisar = metodo.getAnnotation(Revisar.class);
				System.out.println("Método: " + metodo.getName() + ", Anotación: " + revisar.value());
			}
		}
		
	}

}
