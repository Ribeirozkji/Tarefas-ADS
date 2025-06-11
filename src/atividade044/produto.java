package atividade044;

import java.util.Scanner;

public class produto {

		
		public static void cadastrar2(Scanner teclado) {
		       Scanner entrada = new Scanner(System.in);
		       System.out.println("=== Bem-Vindo Aos Produtos ===");
		       System.out.println("Escolha o produto");
		       String nome = entrada.nextLine();
		       System.out.println("Escreva o seu email");
		       String email = entrada.nextLine();
		       System.out.println("Informe o endereço para entrega do produto");
		       String endereco = entrada.nextLine();
		       System.out.println("Informe o Telefone para contato");
		       double cargo = entrada.nextDouble();
		      
		       System.out.println("Pedido realizado com sucesso, agora só aguardar a chegada.");
			

	

}
}