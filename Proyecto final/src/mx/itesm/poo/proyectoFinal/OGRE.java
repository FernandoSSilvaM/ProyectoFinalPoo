package mx.itesm.poo.proyectoFinal;

public abstract class OGRE extends Titan{
	//Atributos
	protected double fuerzaGolpe = 3;
	protected int velocidad = 2;
	
	//Constructores
	public OGRE(int numID, String bando, double salud, double escudos, int tamano, Piloto piloto, Arma arma, double fuerzaGolpe, int velocidad) {
		super(numID, bando, salud, escudos, tamano, piloto, arma);
		this.fuerzaGolpe = fuerzaGolpe;
		this.velocidad = velocidad;
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
		
		else {
			System.out.println("SOY UN ERROR...  NO ME VEAS!");
		}
	}

	//Getters, Setters y toString
	public double getFuerzaGolpe() {
		return fuerzaGolpe;
	}

	public void setFuerzaGolpe(double fuerzaGolpe) {
		this.fuerzaGolpe = fuerzaGolpe;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	@Override
	public String toString() {
		return "OGRE [fuerzaGolpe=" + fuerzaGolpe + ", velocidad=" + velocidad + ", escudos=" + escudos + ", tamano="
				+ tamano + ", piloto=" + piloto + ", arma=" + arma + ", numUnidad=" + numUnidad + ", bando=" + bando
				+ ", salud=" + salud + "]";
	}
	
	
}
