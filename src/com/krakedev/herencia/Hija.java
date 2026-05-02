package com.krakedev.herencia;

public class Hija extends Padre{
	public void escucharBadBunny() {
		System.out.println("Escuchando esta musica horrible");
	}

	//@Override
	//public String toString() {
	//	return "Hija [getDefectos()=" + getDefectos() + ", getVirtudes()=" + getVirtudes() + ", toString()="
	//			+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	//}
	
	//@Override
	//public String toString() {
	//	return "Defectos=" + getDefectos() + ", Virtudes=" + getVirtudes();
	//}
	
	@Override
	public String toString() {
		return "Defecto: "+ super.getDefectos() +" Virtudes: "+super.getVirtudes();
	}
	
	
}
