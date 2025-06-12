package atv;
import java.util.Scanner;
public class Questao03 {
public void calcularCombustivel () {
	Scanner scanner = new Scanner(System.in);
	
    System.out.print("Digite o tipo de combustível (a - Álcool, d - Diesel, g - Gasolina): ");
    String tipoCombustivel = scanner.next().toLowerCase(); 
    scanner.nextLine();
    
    System.out.print("Digite a quantidade de litros: ");
    double litros = scanner.nextDouble();
    scanner.nextLine();
    
    double precoPorLitro;
    if (tipoCombustivel.equals("a")) {
        precoPorLitro = 3.79;
    } else if (tipoCombustivel.equals("d")) {
        precoPorLitro = 4.39;
    } else if (tipoCombustivel.equals("g")) {
        precoPorLitro = 5.49;
    } else {
        System.out.println("Tipo de combustível inválido!");
        return;
    }

  
    double valorTotal = litros * precoPorLitro;

  
    System.out.printf("O valor a ser pago é R$ %.2f%n", valorTotal);
	
}
		
	}

