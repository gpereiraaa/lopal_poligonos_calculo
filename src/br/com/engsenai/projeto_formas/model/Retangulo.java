package br.com.engsenai.projeto_formas.model;

public class Retangulo {
	
	private double base;
	private double altura;
	
	
	public void setBase(double base) {
		this.base = base;
	}
	
	public double getBase() {
		return base;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getAltura() {
		return altura;
	}
	
	private double calcularArea() {
		double area = base * altura ;
		return area;
	}
	private double calcularPerimetro() {
		double perimetro = base + base + altura + altura;
		return perimetro;
	}
	
	public void mostrarDados() {
		System.out.println("-----------------------");
		System.out.println(" R E T Â N G U L O:");
		System.out.println("-----------------------");
		System.out.println("Base: " + base);
		System.out.println("Altura: " + altura);
		System.out.println("Área: " + calcularArea());
		System.out.println("Perímetro: " + calcularPerimetro());
		System.out.println("------------------------");
	}
	
}
