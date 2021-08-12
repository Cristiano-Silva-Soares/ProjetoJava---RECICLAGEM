package ProjetoJava;

import java.util.Scanner;

public class ClassePlastico {
	Scanner leia = new Scanner (System.in);
	
	private double pesoplastico;
	private double precoplastico;
	private double compensacaoplastico;
	
	
	public double getPesoplastico() {
		return pesoplastico;
	}
	public void setPesoplastico(double pesoplastico) {
		this.pesoplastico = pesoplastico;
	}
	public double getPrecoplastico() {
		return precoplastico;
	}
	public void setPrecoplastico(double precoplastico) {
		this.precoplastico = precoplastico;
	}
	public double getCompensacaoplastico() {
		return compensacaoplastico;
	}
	public void setCompensacaoplastico(double compensacaoplastico) {
		this.compensacaoplastico = compensacaoplastico;
	}
	
	////cálculo para plastico
	public void compensacaoPlastico() {
		
		System.out.println ("Digite a quantidade em Kg de plástico trazido");
		double resposta = leia.nextDouble();
		
		this.compensacaoplastico = resposta * 0.80;
	}













}