package atividade044;

import java.util.Scanner;

public class funcionario {

	public static void cadastrar1(Scanner teclado) {
		
		
	   Scanner entrada = new Scanner(System.in);
	  
	   System.out.println("=== Bem-Vindo Ao Cadastro de funcionários ===");
	   String nome = entrada.nextLine();
	   System.out.println("Escreve o seu email");
	   String email = entrada.nextLine();
	   System.out.println("Escreva o seu endereço");
	   String endereco = entrada.nextLine();
	   System.out.println("Informe o seu cargo");
	   String cargo = entrada.nextLine();
	   System.out.println("Imforme seu salário");
	   String salario = entrada.nextLine();
	   System.out.println("Informe a data de sua folga ");
	   String folga = entrada.nextLine();
	  
	  
	   teclado.close();

	

}
}