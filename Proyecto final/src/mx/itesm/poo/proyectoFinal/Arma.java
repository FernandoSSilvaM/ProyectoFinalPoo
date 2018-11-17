package mx.itesm.poo.proyectoFinal;

public class Arma {
	//Atributos
	private double daño =  1;
	private boolean boolTitan = true;
	private int cargadorAhora = this.getCargadorMax();
	private int cargadorMax = 10;
	private Mira mira = new Mira();
	
	//Constructores ¿
	public Arma() {
		// TODO Auto-generated constructor stub
	}

	public Arma(double daño, boolean boolTitan, int cargadorMax, Mira mira) {
		this.daño = daño;
		this.boolTitan = boolTitan;
		this.cargadorMax = cargadorMax;
		this.mira = mira;
	}
	
	//Metodos Generales
	public boolean disparar() {
		
		if(this.cargadorAhora > 0) {
			this.cargadorAhora -= 1;
			System.out.println("BANG!");
			return true;
		
		} else {
			System.out.println("Sin balas!");
			return false;
		}
		 
	}
	
	public boolean recargar() {
		
		if(this.cargadorAhora == this.cargadorMax) {
			System.out.println("Cargaador lleno");
			return false;
		
		} else {
			this.setCargadorAhora(this.cargadorMax);
			return true;
		}
	}

	//Getters, Setters y toString
	public double getDaño() {
		return daño;
	}

	public void setDaño(double daño) {
		this.daño = daño;
	}

	public boolean isBoolTitan() {
		return boolTitan;
	}

	public void setBoolTitan(boolean boolTitan) {
		this.boolTitan = boolTitan;
	}
	
	public int getCargadorAhora() {
		return cargadorAhora;
	}

	public void setCargadorAhora(int cargadorAhora) {
		this.cargadorAhora = cargadorAhora;
	}
	

	public int getCargadorMax() {
		return cargadorMax;
	}

	public void setCargadorMax(int cargadorMax) {
		this.cargadorMax = cargadorMax;
	}

	public Mira getMira() {
		return mira;
	}

	public void setMira(Mira mira) {
		this.mira = mira;
	}

	@Override
	public String toString() {
		return "Arma [daño=" + daño + ", boolTitan=" + boolTitan + ", cargadorAhora=" + cargadorAhora + ", cargadorMax="
				+ cargadorMax + ", mira=" + mira + "]";
	}
	
	



}
