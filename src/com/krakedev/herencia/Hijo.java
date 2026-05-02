package com.krakedev.herencia;

public class Hijo extends Padre {
	
	private int juguetes;
	
	public Hijo(int virtudes, int defectos, int juguetes) {
		super();
		super.setVirtudes(virtudes);
		super.setDefectos(defectos);
		this.juguetes=juguetes;
		
	}

	@Override
	public String toString() {
		return "Hijo [Nombre= "+ getNombre() +", Juguetes=" + juguetes + ", Defectos=" + getDefectos() + ", Virtudes=" + getVirtudes()
		+" , Total Ahorrado=" + getTotalAhorrado() + "]";
	}
	
	@Override
	public void ahorrar(double monto) {
		setTotalAhorrado((monto*.5)+getTotalAhorrado());
	}
	
	
	
	
	
}
