package com.agencia.models;

import com.agencia.enums.Combustible;
import com.agencia.enums.Transmision;
import com.agencia.registros.Propietario;

public class Moto extends Vehiculo {

	public Moto(String marca, String modelo, int anio, Combustible combustible, Transmision transmision,
			Propietario propietario) {
		super(marca, modelo, anio, combustible, transmision, propietario);
	}

	@Override
	public void mostrarDetalles() {
		StringBuilder detalles = new StringBuilder();
		detalles.append("Moto: " + getMarca() + " " + getModelo() + "(" + getAnio() + "), ");
		detalles.append(getCombustible() + ", " + getTransmision() + ", Propietario: ");
		detalles.append(getPropietario().nombre());
		
		System.out.println(detalles.toString());
	}
	
	
}
