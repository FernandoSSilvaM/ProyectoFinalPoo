package mx.itesm.poo.proyectoFinal;

public abstract class Titan extends UnidadDeBatalla {
	protected int escudos;
	protected int tamano;
	protected Piloto piloto;

	public Titan(int tamano , int escudos,int numUnidad, String bando ) {
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

	public int getEscudos() {
		return escudos;
	}

	public void setEscudos(int escudos) {
		this.escudos = escudos;
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
	
	@Override
	
	public String toString() {
		return "LA WEA COSMICA SEMICUANTICA";
	}
}

