package clinica;
import java.util.Scanner;
public class Cliente {
	  private String nome;
	    private String telefone;
	    private String cpf;

	    public static Cliente cadastrar(Scanner scanner) {
	        Cliente cliente = new Cliente();
	        try {
	        	 System.out.print("Digite o nome do cliente: ");
	 	        cliente.setNome(scanner.nextLine());
	 	       
	 	        System.out.print("Digite o telefone do cliente: ");
	 	        cliente.setTelefone(scanner.nextLine());
	 	       
	 	        System.out.print("Digite o CPF do cliente: ");
	 	        cliente.setCpf(scanner.nextLine());
	 	       
	 	        System.out.println("Cliente cadastrado com sucesso!");
	 	        
			} catch (Exception e) {
				 System.out.println("Erro ao cadastrar cliente: " + e.getMessage());
			}
	        return cliente;
	       
	    }

	    public String getNome() {
	        return nome;
	    }
	    public void setNome(String nome) {
	        this.nome = nome;
	    }
	    public String getTelefone() {
	        return telefone;
	    }
	    public void setTelefone(String telefone) {
	        this.telefone = telefone;
	    }
	    public String getCpf() {
	        return cpf;
	    }
	    public void setCpf(String cpf) {
	        this.cpf = cpf;
	    }
}
