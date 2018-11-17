package mx.itesm.poo.proyectoFinal;

public class Legion extends OGRE{
	
	private double dano;

	public Legion(int escudos, int tamano, int salud, int velocidad, double dano) {
		super(escudos, tamano, salud, velocidad);
		// TODO Auto-generated constructor stub
		
		this.dano = dano;
	}
	
	public void escudoDeTorreta() {
		System.out.println("Tienes Escudo de Torreta");
	}

	public double getDano() {
		return dano;
	}

	public void setDano(double dano) {
		this.dano = dano;
	}
	
	public String toString() {
		return "La wea del gatling";
	}

}
