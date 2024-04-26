package com.tarea6;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.tarea6")
@PropertySource("classpath:datosPC.propiedades")
public class OrdenadorConfig {
	@Bean
	public SistemaOperativo windows() {
		return new Windows();
	}

	@Bean
	public SistemaOperativo linux() {
		return new Linux();
	}

	@Bean
	public Ordenador pcWindows() {
		return new Ordenador(windows());
	}

	@Bean
	public Ordenador pcLinux() {
		return new Ordenador(linux());
	}

}
