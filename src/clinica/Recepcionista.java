package clinica;
import java.util.Scanner;
public class Recepcionista {
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
