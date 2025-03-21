package br.com.engsenai.projeto_formas.model;

public class Triangulo {
	
	private double altura;
	private double base;

	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getAltura() {
		return altura;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getBase() {
		return base;
	}
	
	private double calcularArea() {
		double area = base * altura / 2;
		return area;
	}
	public void mostrarDados() {
		System.out.println("---------------------");
		System.out.println("Dados do Triângulo:");
		System.out.println("---------------------");
		System.out.println("Base:      " + base);
		System.out.println("Altura:    " + altura);
		System.out.println("Área:      " + calcularArea());
		System.out.println("----------------------");
	}
}
