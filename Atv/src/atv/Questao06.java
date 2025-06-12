package atv;
import java.util.Scanner;
public class Questao06 {

	public void calcularINSS () {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Escreva seu salário-base R$: ");
		double salarioBase = scanner.nextDouble();
		scanner.nextLine();
		
		double gratificacao = salarioBase * 0.10;
		
		double descontoINSS = salarioBase * 0.08;
		
		double descontoIR = 0;
		if (salarioBase <= 1500) {
			descontoINSS = 0;
		} else if (salarioBase <= 3000) {
			descontoINSS = salarioBase * 0.05;
		}else {
			descontoINSS = salarioBase * 0.10;
		}
		double salarioLiquido = salarioBase + gratificacao - descontoINSS - descontoIR;

	   
	    System.out.println("Resumo do Salário:");
	    System.out.println(salarioBase);
	    System.out.println(gratificacao);
	    System.out.println(descontoINSS);
	    System.out.println(descontoIR);
	    System.out.println(salarioLiquido);
	}
			

	}


