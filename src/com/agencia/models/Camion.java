package com.agencia.models;

import com.agencia.enums.Combustible;
import com.agencia.enums.Transmision;
import com.agencia.registros.Propietario;

public class Camion extends Vehiculo {
	
	private int capacidadCarga;

	public Camion(String marca, String modelo, int anio, Combustible combustible, Transmision transmision,
			Propietario propietario, int capacidadCarga) {
		super(marca, modelo, anio, combustible, transmision, propietario);
	}
	
	public int getCapacidadCarga() {
		return capacidadCarga;
	}

	@Override
	public void mostrarDetalles() {
		StringBuilder detalles = new StringBuilder();
		detalles.append("Camión: " + getMarca() + " " + getModelo() + "(" + getAnio() + "), ");
		detalles.append(getCombustible() + ", " + getTransmision() + ", Capacidad de carga: ");
		detalles.append(getCapacidadCarga() + ", Propietario: " + getPropietario().nombre());
		
		System.out.println(detalles.toString());
	}
	
	

}
