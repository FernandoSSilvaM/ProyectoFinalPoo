package mx.itesm.poo.proyectoFinal;

public class ATLAS extends Titan{
	protected int salud;
	protected int velocidad;
	
	public ATLAS(int escudos, int tamano, int salud, int velocidad, int numUnidad, String bando, Arma arma) {
		super(tamano, escudos, numUnidad, bando, arma);
		this.salud = salud;
		this.velocidad = velocidad;
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
		return "la wea mas cosmica mediana";
	}
}
