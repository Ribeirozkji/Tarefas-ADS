package clinica;
import java.util.Scanner;
public class Veterinario {
	  private String nome;
	    private int idade;  
	    private String especialidade;
	    private int totalConsultas = 0;

	 
	    public static Veterinario cadastrar(Scanner scanner) {
	        Veterinario vet = new Veterinario();
	        System.out.print("Digite o nome do veterinário: ");
	        vet.setNome(scanner.nextLine());
	      try {
	    	  System.out.print("Digite a idade do veterinário: ");
		        vet.setIdade(scanner.nextInt());
		} catch (Exception e) {
	System.out.println("Erro de sintaxe");
		}
	        scanner.nextLine(); 
	       
	        System.out.print("Digite a especialidade do veterinário: ");
	        vet.setEspecialidade(scanner.nextLine());
	       
	        System.out.println("Veterinário cadastrado com sucesso!");
	        return vet;
	    }

	    public String getNome() {
	        return nome;
	    }
	    public void setNome(String nome) {
	        this.nome = nome;
	    }
	    public int getIdade() {
	        return idade;
	    }
	    public void setIdade(int idade) {
	        this.idade = idade;
	    }
	    public String getEspecialidade() {
	        return especialidade;
	    }
	    public void setEspecialidade(String especialidade) {
	        this.especialidade = especialidade;
	    }
 
		public int getTotalConsultas() {
			return totalConsultas;
		}

		public void setTotalConsultas(int totalConsultas) {
			this.totalConsultas = totalConsultas;
		}
}
