package br.com.engsenai.projeto_formas.model;

public class Circunferencia {

	private double raio;
	
	public void setRaio(double raio) {
		this.raio = raio;
	}
	public double getRaio() {
		return raio;
	}
	
	private double calcularArea() {
		double area = Math.PI * Math.pow(raio, 2);
		return area;
	}
	
	private double calcularCircunferencia() {
		double circunferencia = 2 * Math.PI * raio;
		return circunferencia;
	}
	public void mostrarDados() {
		System.out.println("-----------------------------");
		System.out.println("Dados da Circunferência:");
		System.out.println("-----------------------------");
		System.out.println("Raio:      " + raio);
		System.out.println("Área:      " + calcularArea());
		System.out.println("Circunferência da circunferência: " + calcularCircunferencia());
		System.out.println("------------------------------");
	}
}
