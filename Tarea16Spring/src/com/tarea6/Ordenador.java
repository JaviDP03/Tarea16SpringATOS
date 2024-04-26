package com.tarea6;

import org.springframework.beans.factory.annotation.Value;

public class Ordenador {
	@Value("${CPU}")
	private String CPU;

	@Value("${GPU}")
	private String GPU;

	@Value("${RAM}")
	private String RAM;

	@Value("${Almacenamiento}")
	private String almacenamiento;

	private SistemaOperativo so;

	public Ordenador(SistemaOperativo so) {
		this.so = so;
	}

	public SistemaOperativo getSistemaOperativo() {
		return so;
	}

	public void getCaracteristicas() {
		StringBuilder caracteristicas = new StringBuilder();

		caracteristicas.append("Características\n");
		caracteristicas.append("----------------------\n");
		caracteristicas.append("CPU: " + CPU + "\n");
		caracteristicas.append("GPU: " + GPU + "\n");
		caracteristicas.append("RAM: " + RAM + "\n");
		caracteristicas.append("Almacenamiento: " + almacenamiento + "\n");

		System.out.println(caracteristicas.toString());
	}

}
