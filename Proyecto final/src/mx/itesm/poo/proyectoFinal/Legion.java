package mx.itesm.poo.proyectoFinal;

public class Legion extends OGRE  implements Volador{
	
	//Atributos
	private double escudoExtra = 50;

	//Constructores
	public Legion (int numUnidad, String bando, double salud, double escudos, 
			int tamano, Piloto piloto, Arma arma, int velocidad, double fuerzaGolpe, double escudoExtra ) {	
		
		super(numUnidad, bando, salud, escudos, tamano, piloto, arma,velocidad, fuerzaGolpe);
		this.escudoExtra = escudoExtra;
	}
	
	
	public Legion (int numUnidad, String bando) {
		super(numUnidad, bando, 150, 150, 1000, null, new Arma(), 100, 25);
	}
	
	
	public Legion(double escudoExt) {
		super( 00, "Milicia", 150, 150, 1000, null, new Arma(), 100, 25);
		this.escudoExtra = escudoExt;
	}
	
	public Legion() {
		super( 00, "Milicia", 150, 150, 1000, null, new Arma(), 100, 25);
	}
	
	//Metodos Generales
	
	//Metodos Heredados
	@Override
	public void especial() {
		setEscudos(getEscudos() + this.escudoExtra);
		System.out.println("Activando habilidad especial: SUPER ARMOR \n Los escudos incrementan a:" + this.getEscudos());
	}
	
	@Override
	public void correr() {
		System.out.println("Corriendo a velocidad: " + this.velocidad);
		
	}

	@Override
	public void autodestruirse() {
		System.out.println("Autodestruccion Legion: Crando pared de humo.");
		this.setSalud(0);
		this.setEscudos(0);
		
	}
	
	//Metodos de Interface
	@Override
	public void volar() {
		System.out.println("Volando a valocidad: " + this.velocidad);
	}

	@Override
	public void pisoton() {
		System.out.println("Impactando al suelo. Dañando area de: " + (this.tamano + this.fuerzaGolpe)/10 );
		
	}
	
	//Getters, Setters y toString
	public double getEscudoExtra() {
		return escudoExtra;
	}

	public void setEscudoExtra(double escudoExtra) {
		this.escudoExtra = escudoExtra;
	}

	@Override
	public boolean apagarCoohete() {
		System.out.println("Apagando cohete");
		return true;
	}
	
	@Override
	public String toString() {
		return " | Legion [escudoExtra = " + escudoExtra + ", velocidad= " + velocidad + ", fuerzaGolpe= " + fuerzaGolpe
				+ ", escudos= " + escudos + ", tamano= " + tamano + ", numUnidad= " + numUnidad + ", bando= " + bando + 
				", salud= " + salud + ",\n    ARMAtitan= " + arma + "]";
	}

}