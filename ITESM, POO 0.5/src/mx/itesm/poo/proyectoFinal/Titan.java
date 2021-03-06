
package mx.itesm.poo.proyectoFinal;

import javax.swing.JOptionPane;

public abstract class Titan extends UnidadDeBatalla {
	//Atributos
	protected double escudos;
	protected int tamano;
	protected Piloto piloto;
	protected Arma arma = new Arma();
	protected int velocidad;
	
	//Constructores
	public Titan(int numID, String bando, double salud, double escudos, int tamano, Piloto piloto, Arma arma, int velocidad) {
	super(numID, bando, salud);
	this.escudos = escudos;
	this.tamano = tamano;
	this.piloto = piloto;
	this.arma = arma;
	this.velocidad = velocidad;
	}
	
	public Titan(double escudos, int tamano, Piloto piloto, Arma arma) {
		super();
		this.escudos = escudos;
		this.tamano = tamano;
		this.piloto = piloto;
		this.arma = arma;
	}
	
	public Titan() {
		super();
		this.escudos= 100;
		this.tamano = 10;
	}

	//Metodos Generales
	
	public void aparecer() {
			JOptionPane.showMessageDialog(null,"DESPLEGANDO");
		}
	
	public abstract void correr();
	
	public abstract void especial();
	
	
	public boolean tomarArma(Arma arma) {
		if(arma.isBoolTitan()) { //Es un arma de Titan?
			System.out.println("Se cambio la arma: " + this.arma.toString() + "\n por: " + arma.toString());			
			this.setArma(arma);
			return true;
			
		} else {
			System.out.println("No puedes tomar esa arma!");
			return false;
		}
	}
	public boolean desruirse() {
		if(this.salud <= 0) {
			System.out.println("Has sido destruido!");
			return true;
		
		} else {
			System.out.println("Puede seguir peleando.");
			return false;
		}
	}
	
	public abstract void autodestruirse();
	
	//Getters, Setters y toString
	public double getEscudos() {
		return escudos;
	}

	public void setEscudos(double d) {
		this.escudos = d;
	}

	public int getTamano() {
		return tamano;
	}

	public void setTamano(int tamano) {
		this.tamano = tamano;
	}
	
	public Piloto getPiloto() {
		return piloto;
	}

	public void setPiloto(Piloto piloto) {
		this.piloto = piloto;
	}
	
	public Arma getArma() {
		return arma;
	}

	public void setArma(Arma arma) {
		this.arma = arma;
	}

	@Override
	public String toString() {
		return "Titan [escudos=" + escudos + ", tamano=" + tamano + ", piloto=" + piloto + ", arma=" + arma
				+ ", numUnidad=" + numUnidad + ", bando=" + bando + ", salud=" + salud + "]";
	}
	
	
}

