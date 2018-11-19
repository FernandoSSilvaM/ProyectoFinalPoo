package mx.itesm.poo.proyectoFinal;

public class Northstar extends OGRE{
	
	private double dano;

	public Northstar(int escudos, int tamano, int salud, int velocidad, double dano, int numUnidad, String bando) {
		super(escudos, tamano, salud, velocidad, numUnidad, bando);
		// TODO Auto-generated constructor stub
		
		this.dano = dano;
	}
	
	public void volar() {
		System.out.println("ESTAS VOLANDO");
		
	}

	public double getDano() {
		return dano;
	}

	public void setDano(double dano) {
		this.dano = dano;
	}
	
	public String toString() {
		return "La wea que vuela";
	}

}
