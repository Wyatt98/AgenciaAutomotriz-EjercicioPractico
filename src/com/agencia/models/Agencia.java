package com.agencia.models;

import java.util.ArrayList;
import java.util.List;

import com.agencia.enums.Combustible;

public class Agencia {

	private List<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
	private static int totalVehiculos = 0;
	
	public void agregarVehiculo(Vehiculo vehiculo) {
		vehiculos.add(vehiculo);
		totalVehiculos++;
	}
	
	public void mostrarTodosLosVehiculos() {
		for(Vehiculo vehiculo : vehiculos) {
			vehiculo.mostrarDetalles();
		}
	}
	
	public void mostrarVehiculosPorAnio(int anio) {
		for (Vehiculo vehiculo : vehiculos) {
			if(vehiculo.getAnio() == anio) {
				vehiculo.mostrarDetalles();
			}
		}
	}
	
	public void mostrarVehiculosPorCombustible(Combustible combustible) {
		for (Vehiculo vehiculo : vehiculos) {
			if(vehiculo.getCombustible() == combustible) {
				vehiculo.mostrarDetalles();
			}
		}
	}
	
	public static int getTotalVehiculos() {
		return totalVehiculos;
	}
	
	public List<Vehiculo> getVehiculos() {
		return vehiculos;
	}
	
}
