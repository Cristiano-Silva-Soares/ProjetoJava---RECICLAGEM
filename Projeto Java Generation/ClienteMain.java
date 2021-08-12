package ProjetoJava;

import java.util.Scanner;

public class ClienteMain {

	public static void main(String[] args) {
		
		ClasseCliente cliente = new ClasseCliente ();
		ClasseVidro vidro = new ClasseVidro();
		ClasseMetal metal = new ClasseMetal();
		ClassePapel papel = new ClassePapel();
		ClassePlastico plastico = new ClassePlastico();
		Scanner leia = new Scanner (System.in);
		int contadorIdade= 0;
		int somaIdade = 0;
		int mediaidade = 0;
		double compensacao;
		int x=0;
		int y=0;
		int bonus;
		boolean condicaobonus= false;
		
		System.out.println(" _____   _____   __  __      __   __   __   __  __   _____     _____\n"+
				   "|  _  | |  ___| |  \\/  |    |  | |  | |  | |  \\|  |   |   \\   |  ___|\n"+
				   "| |_| | | |___  |      |    |  | |  | |  | |      |   |  _ \\  | |___ \n"+
				   "|  _ |  |  ___| |  \\/  |    \\  \\ /  / |  | |  |   |   | |_| | |  ___|\n"+
				   "| |_| | | |___  |  ||  |     \\     /  |  | |  | \\ |   |    /  | |___ \n"+
				   "|_____| |_____| |__||__|      \\___/   |__| |__|  \\|  _|___/   |_____|");
		
		System.out.println("\n");
		
		do {
			cliente.infoCliente();   
			vidro.compensacaoVidro();
			papel.compensacaoPapel();               //M�todos para pegar dados do cliente e calcular compensa��o
			plastico.compensacaoPlastico();
			metal.compensacaoMetal();
			
			if(vidro.getCompensacaovidro()>0 || papel.getCompensacaopapel()>0 
					|| plastico.getCompensacaoplastico()>0 || metal.getCompensacaometal()>0) {
				condicaobonus = true;
			}

		if(cliente.isRecorrente() == true && condicaobonus == true)  // Condi��es para se enquadrar para e pegar o b�nus
		{
		bonus = 100; // incentivo a reciclagem
		compensacao = (vidro.getCompensacaovidro()) + (papel.getCompensacaopapel()) + 
					(plastico.getCompensacaoplastico()) + (metal.getCompensacaometal()) + bonus;
 			
		}
		else 
		{
		bonus = 0;
		compensacao = (vidro.getCompensacaovidro()) + (papel.getCompensacaopapel()) + 
					(plastico.getCompensacaoplastico()) + (metal.getCompensacaometal());
		}
		
		contadorIdade = cliente.getContadorIdade();
		somaIdade += cliente.getSomaIdade();
		mediaidade = somaIdade /contadorIdade; //c�lculo para media de idade (campanha de marketing)
		x++;
		y++;
		System.out.println("*****************************************************************************************************");
		System.out.println ("\t\t\t     O cliente n�mero " + y + " apresenta os dados:");
		System.out.print("\n\t\t- Nome: " + cliente.getNome());
		System.out.print("\n\t\t- CPF : " + cliente.getCPF());
		System.out.print("\n\t\t- Bairro : " + cliente.getBairro());
		System.out.print("\n\t\t- Recorrente : " + cliente.isRecorrente());
		System.out.print("\n\t\t- Idade : " + cliente.getIdade());
		System.out.println("\n");
		System.out.println("\tA compensa��o monet�ria do cliente " + y + 
				" foi igual a " + compensacao + " com direito a b�nus de "+ bonus+ "reais!");
		System.out.println("******************************************************************************************************");
		System.out.println("\n");
		}	while(x<3);
		 
		System.out.println("Muito obrigado! Atingimos a meta de hoje!");
		 System.out.println("A M�dia de idade entre os participantes foi de " + mediaidade + " anos.");
		 
		  if (mediaidade >= 20 && mediaidade < 60) {
			 System.out.println("Volte seu marketing � popula��o adulta!");
		 }
		 else if(mediaidade >= 60) {
			 System.out.println("Volte seu marketing � popula��o idosa!");     //sugest�es para campanha de marketing futura
			 
		 }
		 else {
			 System.out.println("Volte seu marketing ao p�blico juvenil!");
		 }
		  System.out.println(" _____   _____   _____    __   _____   _____   _____     _____\n"+
				   "|  _  | |  _  | |  _  |  |  | | ____| |  _  |   |   \\   |  ___|\n"+
				   "| | | | | |_| | | |_| |  |  | | |  _  | |_| |   |  _ \\  | |___ \n"+
				   "| | | | |  _ |  |    \\   |  | | | | | |  _  |   | |_| | |  ___|\n"+
				   "| |_| | | |_| | |  |  \\  |  | | |_| | | | | |   |    /  | |___ \n"+
				   "|_____| |_____| |__| __\\ |__| |_____| |_| |_|  _|___/   |_____| \n");
	}

}
