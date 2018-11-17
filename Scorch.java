package mx.itesm.poo.proyectoFinal;

public class Scorch extends OGRE{
	
	private double dano;

	public Scorch(int escudos, int tamano, int salud, int velocidad, double dano) {
		super(escudos, tamano, salud, velocidad);
		// TODO Auto-generated constructor stub
		
		this.dano = dano;
	}
	
	public void muroDeFuego() {
		System.out.println("Te protege el muro de fugo");
	}

	public double getDano() {
		return dano;
	}

	public void setDano(double dano) {
		this.dano = dano;
	}
	
	public String toString() {
		return "La wea de fuego";
	}

}
