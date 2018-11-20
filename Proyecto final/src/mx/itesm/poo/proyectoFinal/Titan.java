package mx.itesm.poo.proyectoFinal;

public abstract class Titan extends UnidadDeBatalla {
	protected double escudos;
	protected int tamano;
	protected Piloto piloto;
	protected Arma arma = new Arma();

	public Titan(int tamano , int escudos,int numUnidad, String bando, Arma arma ) {
	super(numUnidad, bando);
	this.tamano = tamano;
	this.escudos = escudos;
	}
	
	public Titan() {
		super();
		this.escudos= 100;
		this.tamano = 10;
	}
	
	public boolean aparecer(boolean solicitar) {
		if (solicitar == true) {
			return true;
		}
			else {
				return false;
			}
		}
	public void caminar() {
		
	}
	
	public void tomarArma() {
		
	}
	
	public void desruirse() {
		
	}
	
	public void autodestruirse() {
		
	}
	
	public void usarArma() {
		
	}

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
		return "LA WEA COSMICA SEMICUANTICA";
	}
}

