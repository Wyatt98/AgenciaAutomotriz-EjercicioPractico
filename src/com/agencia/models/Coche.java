package com.agencia.models;

import com.agencia.enums.Combustible;
import com.agencia.enums.Transmision;
import com.agencia.registros.Propietario;

public class Coche extends Vehiculo {

	private int numeroPuertas;
	
	public Coche(String marca, String modelo, int anio, Combustible combustible, Transmision transmision,
			Propietario propietario, int numeroPuertas) {
		super(marca, modelo, anio, combustible, transmision, propietario);
		this.numeroPuertas = numeroPuertas;
	}
	
	public int getNumeroPuertas() {
		return numeroPuertas;
	}

	@Override
	public void mostrarDetalles() {	
		StringBuilder detalles = new StringBuilder();
		detalles.append("Coche: " + getMarca() + " " + getModelo() + "(" + getAnio() + "), ");
		detalles.append(getCombustible() + ", " + getTransmision() + ", Puertas: " + getNumeroPuertas());
		detalles.append(", Propietario: " + getPropietario().nombre());
		
		System.out.println(detalles.toString());
	}
	
	
}
