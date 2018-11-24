package mx.itesm.poo.proyectoFinal;

public class Legion extends OGRE implements Volador{
	//Atributos
	private double escudoExtra = 150;
	
	//Constructores
	public Legion(int numID, String bando, double salud, double escudos, int tamano, Piloto piloto, Arma arma,
			double fuerzaGolpe, int velocidad, double escudoExtra) {
		super(numID, bando, salud, escudos, tamano, piloto, arma, fuerzaGolpe, velocidad);
		this.escudoExtra = escudoExtra;
	}
	
	public Legion(double escudoExtra) {
		super();
		this.escudoExtra = escudoExtra;
	}
	
	public Legion() {
		super();
	}

	//Metodos Heredados
	@Override
	public void correr(int velocidad) {
		double vel = this.velocidad * 1.3;
		System.out.println("Se esca corriendo a una velocidad: " + vel);
	}

	@Override
	public void especial() {
		setEscudos(getEscudos() + this.escudoExtra);
		System.out.println("Activando habilidad especial: SUPER ARMOR \n Los escudos incrementan a:" + this.getEscudos());
	}

	@Override
	public void autodestruirse() {
		System.out.println("AutoDestruccion Legion: Creando barrera de fuego");
	}
	
	//Metodos Interfase
	@Override
	public void volar() {
		System.out.println("Elevandose a una velocidad: " + this.velocidad);
	}

	@Override
	public void pisoton() {
		System.out.println("Se raliza daño en radio de 10m");
	}

	@Override
	public boolean apagarCoohete() {
		System.out.println("Apagando cohete");
		return true;
	}

	//Getters, Setters y toString
	public double getEscudoExtra() {
		return escudoExtra;
	}

	public void setEscudoExtra(double escudoExtra) {
		this.escudoExtra = escudoExtra;
	}

	@Override
	public String toString() {
		return "Legion [escudoExtra=" + escudoExtra + ", fuerzaGolpe=" + fuerzaGolpe + ", velocidad=" + velocidad
				+ ", escudos=" + escudos + ", tamano=" + tamano + ", piloto=" + piloto + ", arma=" + arma
				+ ", numUnidad=" + numUnidad + ", bando=" + bando + ", salud=" + salud + "]";
	}
	
	
	
	
	
	
	
}