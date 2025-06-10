package atv04;
import java.util.Scanner;
public class menu {
	public static void voltaraoMenu() {
       String[] args = null;
      
   }
	public static void main(String[] args) {
	       Scanner teclado = new Scanner(System.in);
	       System.out.println("--Bem vindo ao nosso sistema-- ");
	       System.out.println("--digite 1 para cadastrar funcionário-- ");
	       System.out.println("--digite 2 para produtos-- ");
	       System.out.println("--digite 3 para clientes-- ");
	       System.out.println("--digite 4 para ver o seu salário-- ");
	       int escolha = teclado.nextInt();
	       if (escolha == 1) {
	           funcionario.cadastrar1(teclado);
	       } else if (escolha == 2) {
	           produto.cadastrar2(teclado);
	       } else if (escolha == 3) {
	           CadastroCliente.cadastrar3(teclado);
	       } else if (escolha == 4) {
	           ImpostoRenda.cadastrar4(teclado);
	       } else {
	           System.out.println("Seção inválida.");
	       }
	       teclado.close();
}}
