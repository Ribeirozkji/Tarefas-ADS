package clinica;
import java.util.Scanner;
public class Consulta {
	  private String data;
	    private Cliente cliente;
	    private Veterinario veterinario;
	    private Animal animal;

	    public static Consulta agendar(Scanner scanner, Cliente cliente, Veterinario vet, Animal animal) {
	        Consulta consulta = new Consulta();
	        System.out.print("Digite a data da consulta: ");
	        consulta.setData(scanner.nextLine());
	        consulta.setCliente(cliente);
	        consulta.setVeterinario(vet);
	        consulta.setAnimal(animal);
	        System.out.println("Consulta agendada com sucesso");
	        return consulta;
	    }

	    public void emitirRelatorio() {
	        System.out.println("=== Relatório de Consulta ===");
	        System.out.println(getData());
	        System.out.println(getVeterinario().getNome() + getVeterinario().getEspecialidade());
	        System.out.println(getCliente().getNome() +getCliente().getCpf() + getCliente().getTelefone());
	        System.out.println( getAnimal().getNome() + getAnimal().getEspecie() + getAnimal().getRaca());
	        System.out.println(+ getAnimal().calcularIdade());
	    }

	    public String getData() {
	        return data;
	    }
	    public void setData(String data) {
	        this.data = data;
	    }
	    public Cliente getCliente() {
	        return cliente;
	    }
	    public void setCliente(Cliente cliente) {
	        this.cliente = cliente;
	    }
	    public Veterinario getVeterinario() {
	        return veterinario;
	    }
	    public void setVeterinario(Veterinario veterinario) {
	        this.veterinario = veterinario;
	    }
	    public Animal getAnimal() {
	        return animal;
	    }
	    public void setAnimal(Animal animal) {
	        this.animal = animal;
	    }
	}

