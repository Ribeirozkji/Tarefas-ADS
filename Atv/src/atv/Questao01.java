package atv;
import java.util.Scanner;
public class Questao01 {
		public void calcularSalario () {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Escreva seu salário-base R$: ");
			double salarioBase = scanner.nextDouble();
			scanner.nextLine();
			
			double gratificacao = salarioBase * 0.08;
			double impostoRenda;
			if (salarioBase <= 1500) {
				impostoRenda = 0;
			} else if (salarioBase <= 3000) {
				impostoRenda = salarioBase * 0.05;
			}else {
				impostoRenda = salarioBase * 0.11;
			}
			double salarioReceber = salarioBase + gratificacao - impostoRenda;

		   
		    System.out.println("Resumo do Salário:");
		    System.out.println(salarioBase);
		    System.out.println(gratificacao);
		    System.out.println(impostoRenda);
		    System.out.println(salarioReceber);	
		
	
	
	
	


}}