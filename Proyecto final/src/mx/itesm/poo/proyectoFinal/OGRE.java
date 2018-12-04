//Oscar Zuñiga Lara A01654827
//Fernando Sebastian Silva Miramontes
package mx.itesm.poo.proyectoFinal;

public abstract class OGRE extends Titan{
	
	//Atributos
	protected int velocidad = 20;
	protected double fuerzaGolpe = 10;
	
	//Constructores
	public OGRE(int numUnidad, String bando, double salud, double escudos, 
			int tamano, Arma arma, int velocidad, double fuerzaGolpe) {
		
		super(numUnidad, bando, salud, escudos, tamano, arma);
		this.velocidad = velocidad;
		this.fuerzaGolpe = fuerzaGolpe;	
	}
	
	public OGRE( double fuerzaGolpe, int velocidad) {
		super();
		this.fuerzaGolpe = fuerzaGolpe;
		this.velocidad = velocidad;
	}
	
	
	public OGRE() {
		super();
	}
	
	
	//Metodos Generales
	
	public void golpear(UnidadDeBatalla objetivo) {
		if(objetivo instanceof Titan) {
			((Titan) objetivo).setEscudos(0);
			objetivo.setSalud(objetivo.getSalud() - this.fuerzaGolpe);
		}
		
		if(objetivo instanceof Infanteria) {
			objetivo.setSalud(0);
		}
		
	}

	//Getters, Setters y toString
	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public double getFuerzaGolpe() {
		return fuerzaGolpe;
	}

	public void setFuerzaGolpe(double fuerzaGolpe) {
		this.fuerzaGolpe = fuerzaGolpe;
	}
	
	@Override
	public String toString() {
		return "OGRE [velocidad=" + velocidad + ", fuerzaGolpe=" + fuerzaGolpe + ", escudos=" + escudos + ", tamano="
				+ tamano + ", arma=" + arma + ", numUnidad=" + numUnidad + ", bando=" + bando
				+ ", salud=" + salud + "]";
	}
	
	

}
