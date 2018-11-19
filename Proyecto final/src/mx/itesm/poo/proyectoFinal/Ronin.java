package mx.itesm.poo.proyectoFinal;

public class Ronin extends STRYDER{
	private double dano;
	
	public Ronin(int tamano, int escudos, int velocidad, int salud,  double danos, int numUnidad, String bando) {
		super(escudos, tamano, salud, velocidad, numUnidad, bando);
		this.dano = dano;
	}
	
	public void espadazo (double dano) {
		System.out.println("Dando espadazo");
	}

	public double getDano() {
		return dano;
	}

	public void setDano(double dano) { 
		this.dano = dano;
	}
	
	@Override
	public String toString() {
		return "la wea rara con espada";
	}
}
