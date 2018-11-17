package mx.itesm.poo.proyectoFinal;

public class Arma {
	//Atributos
	private double da�o =  1;
	private boolean boolTitan = true;
	private int cargadorAhora = this.getCargadorMax();
	private int cargadorMax = 10;
	private Mira mira = new Mira();
	
	//Constructores �
	public Arma() {
		// TODO Auto-generated constructor stub
	}

	public Arma(double da�o, boolean boolTitan, int cargadorMax, Mira mira) {
		this.da�o = da�o;
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
	public double getDa�o() {
		return da�o;
	}

	public void setDa�o(double da�o) {
		this.da�o = da�o;
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
		return "Arma [da�o=" + da�o + ", boolTitan=" + boolTitan + ", cargadorAhora=" + cargadorAhora + ", cargadorMax="
				+ cargadorMax + ", mira=" + mira + "]";
	}
	
	



}
