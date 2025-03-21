//Desenvolvido por Gustavo Pereira

package br.com.engsenai.projeto_formas;

import br.com.engsenai.projeto_formas.model.Quadrado;
import br.com.engsenai.projeto_formas.model.Retangulo;
import br.com.engsenai.projeto_formas.model.Trapezio;
import br.com.engsenai.projeto_formas.model.Triangulo;


public class Main {

	public static void main(String[] args) {
		
		Quadrado q1= new Quadrado();
		q1.setLado(5);
		
		q1.mostrarDados();
		
		
		Trapezio t1 = new Trapezio();
		t1.setAltura(3);
		t1.setBaseMaior(4);
		t1.setBaseMenor(2);
		t1.mostrarDados();
		
		Retangulo r1 = new Retangulo();
		r1.setAltura(5);
		r1.setBase(3);
		r1.mostrarDados();
		
		Triangulo tr1 = new Triangulo();
		tr1.setAltura(3);
		tr1.setBase(4);
		tr1.mostrarDados();
				
				
	}


}
