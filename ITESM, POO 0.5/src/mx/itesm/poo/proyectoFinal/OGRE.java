package mx.itesm.poo.proyectoFinal;

public class OGRE extends Titan{
	
	protected int velocidad;
	protected double fuerzaGolpe;
	
	public OGRE(int numUnidad, String bando, double salud, double escudos, 
			int tamano, Piloto piloto, Arma arma, int velocidad, double fuerzaGolpe) {
		
		super(numUnidad, bando, salud, escudos, tamano, piloto, arma,velocidad);
		this.velocidad = velocidad;
		this.fuerzaGolpe = fuerzaGolpe;

		
		
	}
	
	
	public OGRE() {
	
		
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
	
	public double getSalud() {
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

	@Override
	public void correr() {
		// TODO Auto-generated method stub
		this.velocidad = this.velocidad + 10;
	}

	@Override
	public void especial() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void autodestruirse() {
		// TODO Auto-generated method stub
		this.salud = 0;
	}

}
