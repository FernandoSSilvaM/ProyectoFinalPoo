package mx.itesm.poo.proyectoFinal;

public class Ion extends ATLAS{
	private double dano;
	
	public Ion(int escudos, int tamano, int salud, int velocidad, double dano, int numUnidad, String bando) {
		super(escudos, tamano, salud, velocidad, numUnidad, bando);
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
