package ProjetoJava;

import java.util.Scanner;

public class ClassePapel {

	Scanner leia = new Scanner (System.in);
	
	private double pesopapel;
	private double precopapel;
	private double compensacaopapel;
	
	
	public double getPesopapel() {
		return pesopapel;
	}
	public void setPesopapel(double pesopapel) {
		this.pesopapel = pesopapel;
	}
	public double getPrecopapel() {
		return precopapel;
	}
	public void setPrecopapel(double precopapel) {
		this.precopapel = precopapel;
	}
	public double getCompensacaopapel() {
		return compensacaopapel;
	}
	public void setCompensacaopapel(double compensacaopapel) {
		this.compensacaopapel = compensacaopapel;
	}
	
	////cálculo para papel
	public void compensacaoPapel() {
		
		System.out.println ("Digite a quantidade em Kg de papel trazido");
		double resposta = leia.nextDouble();
		
		this.compensacaopapel = resposta * 0.30;
	}
	
	
}
