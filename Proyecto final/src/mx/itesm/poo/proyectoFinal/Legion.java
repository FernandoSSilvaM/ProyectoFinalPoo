package mx.itesm.poo.proyectoFinal;

public class Legion extends OGRE{
	
	private double dano = 20;
	
	public Legion(double dano, String bando, int escudos, int tamano, int numUnidad, Arma arma, int salud, int velocidad) {
		super(bando, escudos, tamano, numUnidad, arma, salud, velocidad);
		arma.setDano(dano);
	}

	public Legion() {
		super();
		arma.setDano(dano);
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
