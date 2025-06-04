import java.util.Scanner;

public class Atv11 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        Paciente paciente = null;
        Medico medico = null;
        Consulta consulta = null;
        int opcao = 0;

        while (opcao != 5) {
            System.out.println("=== Sistema do Hospital ===");
            System.out.println("1 - Cadastrar Paciente");
            System.out.println("2 - Cadastrar Médico");
            System.out.println("3 - Registrar Consulta");
            System.out.println("4 - Ver Consulta do Paciente");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            if (opcao == 1) {
                paciente = new Paciente();
                System.out.println("Escreva o nome do paciente:");
                paciente.nome = scanner.nextLine();
                System.out.println("Escreva o CPF do paciente:");
                paciente.cpf = scanner.nextLine();
                System.out.println("Paciente cadastrado.");
            } else if (opcao == 2) {
                medico = new Medico();
                System.out.println("Escreva o nome do Médico:");
                medico.nome = scanner.nextLine();
                System.out.println("Escreva a especialidade do Médico:");
                medico.especialidade = scanner.nextLine();
                System.out.println("Médico cadastrado.");
            } else if (opcao == 3) {
                if (paciente == null || medico == null) {
                    System.out.println("Paciente ou médico não cadastrado!");
                } else {
                    consulta = new Consulta();
                    System.out.print("Data da consulta: ");
                    consulta.data = scanner.nextLine();
                    consulta.cpfPaciente = paciente.cpf;
                    consulta.nomeMedico = medico.nome;
                    medico.totalConsultas++;
                    System.out.println("Consulta registrada.");
                }
            } else if (opcao == 4) {
                if (consulta == null) {
                    System.out.println("Nenhuma consulta registrada.");
                } else {
                    System.out.println("Consulta marcada:");
                    System.out.println("Data: " + consulta.data);
                    System.out.println("Médico: " + consulta.nomeMedico);
                }
            } else if (opcao == 5) {
                System.out.println("Saindo do sistema");
            } else {
                System.out.println("Opção inválida.");
            }
        }

    
    }
}

class Paciente {
    String nome;
    String cpf;
}

class Medico {
    String nome;
    String especialidade;
    int totalConsultas = 0;
}

class Consulta {
    String data;
    String nomeMedico;
    String cpfPaciente;
}
