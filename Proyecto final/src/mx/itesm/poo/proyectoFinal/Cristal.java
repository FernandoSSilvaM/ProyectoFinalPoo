//Oscar Zuñiga Lara A01654827
//Fernando Sebastian Silva Miramontes
package mx.itesm.poo.proyectoFinal;

public class Cristal {
	//Atributos
	private String color = "transparente";
	private int grosor = 1;
	
	//Constructores
	public Cristal() {
	}
	
	public Cristal(String color, int grosor) {
		this.color = color;
		this.grosor = grosor;
	}

	//Getters, Setters y toString
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getGrosor() {
		return grosor;
	}

	public void setGrosor(int grosor) {
		this.grosor = grosor;
	}

	@Override
	public String toString() {
		return " | Cristal [color= " + color + ", grosor= " + grosor + "] ";
	}
	
	
	

}
