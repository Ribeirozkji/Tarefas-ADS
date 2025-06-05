import java.util.Scanner;

public class SistemaVeterinario {

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
            opcao = scanner.nextInt();
            scanner.nextLine();






            
            if (opcao == 1) {
                cliente = Cliente.cadastrar(scanner);
            } else if (opcao == 2) {
                veterinario = Veterinario.cadastrar(scanner);
            } else if (opcao == 3) {
                animal = Animal.cadastrar(scanner);
                System.out.println("Cadastro do animal finalizado, retornando ao menu.");
            } else if (opcao == 4) {
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
                System.out.println("Saindo do sistema...");
            } else {
                System.out.println("Opção inválida! Tente novamente.");
            }
        }


    }
}
class Cliente {
    private String nome;
    private String telefone;
    private String cpf;

    public static Cliente cadastrar(Scanner scanner) {
        Cliente cliente = new Cliente();
        System.out.print("Digite o nome do cliente: ");
        cliente.setNome(scanner.nextLine());
        System.out.print("Digite o telefone do cliente: ");
        cliente.setTelefone(scanner.nextLine());
        System.out.print("Digite o CPF do cliente: ");
        cliente.setCpf(scanner.nextLine());
        System.out.println("Cliente cadastrado com sucesso!");
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
}class Veterinario {
    private String nome;
    private int idade;  
    private String especialidade;
    private int totalConsultas = 0;

 
    public static Veterinario cadastrar(Scanner scanner) {
        Veterinario vet = new Veterinario();
        System.out.print("Digite o nome do veterinário: ");
        vet.setNome(scanner.nextLine());
        System.out.print("Digite a idade do veterinário: ");
        vet.setIdade(scanner.nextInt());
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
 
} class Animal{
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
        System.out.print("Digite o ano de nascimento do animal: ");
        animal.setAnoNascimento(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Animal cadastrado com sucesso!");
        return animal;
    }
}











class Consulta {
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
        System.out.println("Consulta agendada com sucesso!");
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



class Recepcionista {
    private String nome;
    private String cpf;
    private String telefone;

    public static Recepcionista criarPadrao() {
        Recepcionista recep = new Recepcionista();
        recep.setNome("Ana");
        recep.setCpf("987.654.321-00");
        recep.setTelefone("98888-8888");
        return recep;
    }

    public void mostrarDados() {
        System.out.println("=== Dados da Recepcionista ===");
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Telefone: " + getTelefone());
    }

    public void agendarConsulta() {
        System.out.println("Recepcionista: " + getNome());
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
