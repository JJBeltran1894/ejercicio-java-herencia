package com.krakedev.herencia.test;

import com.krakedev.herencia.Padre;

public class TestAhorros {

	public static void main(String[] args) {
		Padre padre = new Padre();
		padre.setVirtudes(5);
		padre.setDefectos(4);
		padre.ahorrar(120.25);
		
		System.out.println(padre);
	}

}
