package mx.itesm.poo.proyectoFinal;

public abstract class STRYDER extends Titan{
	protected int salud;
	protected int velocidad;
	
	public STRYDER (int tamano, int escudos,int salud , int velocidad) {
		super(tamano, escudos);
		this.salud = salud; 
		this.escudos = escudos;
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
		return "la wea mas cosmica delgada";
	}
}
