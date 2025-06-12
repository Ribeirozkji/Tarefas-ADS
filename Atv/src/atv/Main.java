package atv;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        System.out.println("Escolha uma opção:");
		        System.out.println("1 - Calcular Salário");
		        System.out.println("2 - Calcular Combustível");
		        System.out.println("3 - Calcular INSS");
		        System.out.print("Digite sua escolha: ");
		        
		        int escolha = scanner.nextInt();

		        if (escolha == 1) {
		            Questao01 questao01 = new Questao01();
		            questao01.calcularSalario();
		        } else if (escolha == 2) {
		            Questao03 questao03 = new Questao03();
		            questao03.calcularCombustivel();
		        } else if (escolha == 3) {
		        	Questao06 questao06 = new Questao06();
		        	questao06.calcularINSS();
		        }
		
	}

}
