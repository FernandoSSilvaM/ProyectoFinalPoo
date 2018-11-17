package mx.itesm.poo.proyectoFinal;

public class OGRE extends Titan{
	protected int salud;
	protected int velocidad;
	
	public OGRE(int escudos, int tamano, int salud, int velocidad) {
		super(tamano, escudos);
		this.salud = salud;
		this.velocidad = velocidad;
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
