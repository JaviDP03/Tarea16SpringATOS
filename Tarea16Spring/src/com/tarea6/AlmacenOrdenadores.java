package com.tarea6;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AlmacenOrdenadores {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");

		Ordenador pc1 = contexto.getBean("pcWindows", Ordenador.class);
		Ordenador pc2 = contexto.getBean("pcLinux", Ordenador.class);

		pc1.getSistemaOperativo().iniciar();
		System.out.println();
		pc1.getCaracteristicas();
		pc1.getSistemaOperativo().apagar();

		pc2.getSistemaOperativo().iniciar();
		System.out.println();
		pc2.getCaracteristicas();
		pc2.getSistemaOperativo().apagar();

		contexto.close();
	}

}
