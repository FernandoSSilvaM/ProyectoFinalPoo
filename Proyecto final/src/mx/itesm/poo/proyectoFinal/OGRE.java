package mx.itesm.poo.proyectoFinal;

public class OGRE extends Titan{
	protected int salud = 300;
	protected int velocidad = 2;
	
	public OGRE(String bando, int escudos, int tamano, int numUnidad, Arma arma, int salud, int velocidad) {
		super(tamano, escudos, numUnidad, bando, arma);
		this.salud = salud;
		this.velocidad = velocidad;
	}
	
	public OGRE() {
		super();
	}
	
	public int getNumUnidad() {
		return numUnidad;
	}
	
	public void setNumUnidad(int numUnidad) {
		this.numUnidad = numUnidad;
	}
	
	public String getBando() {
		return bando;
	}
	
	public void setBando(String bando) {
		this.bando = bando;
	}
	
	public int getSalud() {
		return salud;
	}

	public void setSalud(int salud) {
		this.salud = salud;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
	
	@Override
	
	public String toString() {
		return "la wea mas cosmica gorda";
	}

}
