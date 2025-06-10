package atv04;

import java.util.Scanner;
public class ImpostoRenda {
public static void cadastrar4(Scanner teclado) {
	Scanner scanner = new Scanner(System.in);
   System.out.println("Insira as informações");
   System.out.println("Escreva seu Nome");
   String nome = scanner.nextLine();
  
   System.out.println("Escreva salario");
   double salario = scanner.nextDouble();
   scanner.nextLine();
  
   System.out.println("Escreva dias trabalhados");
   double diastrabalhados = scanner.nextDouble();
   scanner.nextLine();
  
   double diasmes = 30;
   double valortotal = (diastrabalhados / diasmes) + salario;
   System.out.println("Valor total é R$: " + valortotal);
  double valortotal2 = valortotal - salario;
 System.out.println("O valor do Desconto é R$: " + valortotal2);
  boolean temfolga = (diastrabalhados >= diasmes);
 System.out.println("tem folga de: " + temfolga);
   scanner.close();
	
	}
}
