package mx.itesm.poo.proyectoFinal;

public class Ion extends ATLAS{
	private double dano;
	
	public Ion(int escudos, int tamano, int salud, int velocidad, double dano) {
		super(escudos, tamano, salud, velocidad);
		// TODO Auto-generated constructor st
		this.dano= dano;
	}
	
	public void escudoVortice() {
		System.out.println("Estas Protegido");
	}

	public double getDano() {
		return dano;
	}

	public void setDano(double dano) {
		this.dano = dano;
	}

	public String toString() {
		return "la wea laser";
	}
}
