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
	
	//Getters, Setters y toString
	

}
