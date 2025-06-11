package clinica;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		   Scanner scanner = new Scanner(System.in);

	        System.out.println("===Bem-Vindo A Clínica Veterinária: Escolha uma opção");
	        Cliente cliente = null;
	        Veterinario veterinario = null;
	        Animal animal = null;
	        Consulta consulta = null;
	        Recepcionista recepcionista = null;

	        int opcao = 0;
	        while (opcao != 6) {
	            System.out.println("1 - Cadastrar Cliente");
	            System.out.println("2 - Cadastrar Veterinário");
	            System.out.println("3 - Cadastrar Animal");
	            System.out.println("4 - Agendar Consulta");
	            System.out.println("5 - Criar Recepcionista");
	            System.out.println("6 - Sair");
	            System.out.print("Escolha uma opção: ");
	           try {
	        	   opcao = scanner.nextInt();
		            scanner.nextLine();
			} catch (Exception e) {
				System.out.println("Erro, apenas números são aceitos");
				scanner.nextLine();
			}
	           






	            
	            if (opcao == 1) {
	                cliente = Cliente.cadastrar(scanner);
	            } else if (opcao == 2) {
	                veterinario = Veterinario.cadastrar(scanner);
	            } if (opcao == 3) {
	                animal = Animal.cadastrar(scanner);

	                if (animal != null) {
	                    System.out.println("Cadastro do animal finalizado, retornando ao menu.");
	                } else {
	                    System.out.println("Cadastro do animal falhou, retornando ao menu.");
	                }
	            }
	            else if (opcao == 4) {
	                if (cliente == null || veterinario == null || animal == null) {
	                    System.out.println("Preencha os dados anteriores (cliente, veterinário e animal) antes.");
	                } else {
	                    consulta = Consulta.agendar(scanner, cliente, veterinario, animal);
	                    consulta.emitirRelatorio();
	                }
	            } else if (opcao == 5) {
	                recepcionista = Recepcionista.criarPadrao();
	                recepcionista.agendarConsulta();
	            } else if (opcao == 6) {
	                System.out.println("Saindo do sistema");
	            } else {
	                System.out.println("Opção inválida, Tente novamente");
	            }
	        }

	}

}
