package ProjetoJava;

import java.util.Scanner;

public class ClasseVidro {
		
	Scanner leia = new Scanner (System.in);
	
	private double pesovidro;
	private double precovidro;
	private double compensacaovidro;
	
	
	public double getCompensacaovidro() {
		return compensacaovidro;
	}
	public void setCompensacaovidro(double compensacaovidro) {
		this.compensacaovidro = compensacaovidro;
	}
	public double getPesovidro() {
		return pesovidro;
	}
	public void setPesovidro(double pesovidro) {
		this.pesovidro = pesovidro;
	}
	public double getPrecovidro() {
		return precovidro;
	}
	public void setPrecovidro(double precovidro) {
		this.precovidro = precovidro;
	}
	
	////cálculo para vidro
	public void compensacaoVidro() {
		
		System.out.println ("Digite a quantidade em Kg de vidro trazido");
		double resposta = leia.nextDouble();
		
		this.compensacaovidro = resposta * 0.75;
				
			
		
	}
	
	
}
