package com.krakedev.herencia.test;

import com.krakedev.herencia.Hija;
import com.krakedev.herencia.Hijo;
import com.krakedev.herencia.Padre;

public class TestAhorros {

	public static void main(String[] args) {
		Padre padre = new Padre();
		Hija hija = new Hija();
		Hijo hijo = new Hijo(5,1,5);
		
		padre.setNombre("Luis");
		padre.setVirtudes(5);
		padre.setDefectos(4);
		padre.ahorrar(120.25);
		
		System.out.println(padre);
		
		hija.setNombre("Carla");
		hija.setVirtudes(6);
		hija.setDefectos(3);
		hija.ahorrar(120.25);
		
		System.out.println(hija);
		
		hijo.setNombre("David");
		hijo.ahorrar(120.25);
		System.out.println(hijo);
		
	}

}
