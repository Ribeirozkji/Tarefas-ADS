package clinica;
import java.util.Scanner;
public class Animal {
	private String nome;
    private String especie;
    private String raca;
    private int anoNascimento;

    
    public String getNome() {
        return nome;
    }
    public String getEspecie() {
        return especie;
    }
    public String getRaca() {
        return raca;
    }
    public int getAnoNascimento() {
        return anoNascimento;
    }

   
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setEspecie(String especie) {
        this.especie = especie;
    }
    public void setRaca(String raca) {
        this.raca = raca;
    }
    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public int calcularIdade() {
        return 2025 - anoNascimento;
    }

    public static Animal cadastrar(Scanner scanner) {
        Animal animal = new Animal();
        System.out.print("Digite o nome do animal: ");
        animal.setNome(scanner.nextLine());
        System.out.print("Digite a espécie do animal: ");
        animal.setEspecie(scanner.nextLine());
        System.out.print("Digite a raça do animal: ");
        animal.setRaca(scanner.nextLine());
       try {
    	   System.out.print("Digite o ano de nascimento do animal: ");
         int ano  = scanner.nextInt();
         scanner.nextLine();
    	  animal.setAnoNascimento(ano);
    	  System.out.println("Animal cadastrado com sucesso!");
          return animal;
         
	} catch (Exception e) {
		System.out.println("Erro: Ano de nascimento inválido");
		System.out.println("Animal não foi cadastrado");
	}
	return animal;
       
    }
}
