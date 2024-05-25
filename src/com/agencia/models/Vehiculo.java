package com.agencia.models;

import com.agencia.anotaciones.Revisar;
import com.agencia.enums.Combustible;
import com.agencia.enums.Transmision;
import com.agencia.registros.Propietario;

public abstract class Vehiculo {

	private String marca;
	private String modelo;
	private int anio;
	private Combustible combustible;
	private Transmision transmision;
	private Propietario propietario;
	
	public Vehiculo(String marca, String modelo, int anio, Combustible combustible, Transmision transmision,
			Propietario propietario) {
		this.marca = marca;
		this.modelo = modelo;
		this.anio = anio;
		this.combustible = combustible;
		this.transmision = transmision;
		this.propietario = propietario;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public int getAnio() {
		return anio;
	}

	public Combustible getCombustible() {
		return combustible;
	}

	public Transmision getTransmision() {
		return transmision;
	}

	public Propietario getPropietario() {
		return propietario;
	}
	
	public abstract void mostrarDetalles();

	@Revisar("Revisión de seguridad")
	public void revisarVehiculo() {
		System.out.println("Revisando el vehiculo " + marca + " " + modelo);
	}
	
}
