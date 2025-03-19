package br.com.engsenai.projeto_formas.model;

public class Quadrado {

	public double lado;
	
	public void setLado(double lado) {
		if (lado < 0) {
			this.lado = 1;
		} else {
			this.lado = lado;
		}
	}
	
	private double calcularArea() {
		double area = lado * lado;
		return area;
	}
	
	private double calcularPerimetro() {
		double perimetro = lado * 4;
		return perimetro;
	}
	
	public void mostrarDados() {
		System.out.println("---------------------");
		System.out.println("Dados do quadrado:");
		System.out.println("---------------------");
		System.out.println("Lado:      " + lado);
		System.out.println("Área:      " + calcularArea());
		System.out.println("Perímetro: " + calcularPerimetro());
		System.out.println("----------------------");
	}
}
