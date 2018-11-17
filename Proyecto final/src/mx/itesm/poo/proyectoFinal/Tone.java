package mx.itesm.poo.proyectoFinal;

public class Tone extends OGRE{
	
	private double dano;

	public Tone(int escudos, int tamano, int salud, int velocidad, double dano) {
		super(escudos, tamano, salud, velocidad);
		// TODO Auto-generated constructor stub
		
		this.dano = dano;
	}
	
	public void misiles() {
		System.out.println("Lanzando Misiles");
	}

	public double getDano() {
		return dano;
	}

	public void setDano(double dano) {
		this.dano = dano;
	}
	
	public String toString() {
		return "La wea de misiles";
	}

}
