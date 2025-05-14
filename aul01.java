package aula01;
import java.util.Scanner;
public class aul01 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		 Produtos produtos = new Produtos();
		
		while (true) {
			System.out.println("Bem-Vindo ao ATACADÃO");
			System.out.println("Digite 1 Pra fazer login");
			System.out.println("Digite 2 Pra Ver Produtos");
			System.out.println("Digite 3 Pra Fazer o Pagamento");
			System.out.println("Digite 4 pra confirmar o pagamento");
			System.out.println("Digite 5 pra gerar nota Fiscal");
			System.out.println("Digite 6 pra sair do Sistema");
			System.out.println("Escolha uma opção");
			int opcao = tec.nextInt();
			
			
			
			
			
			 if (opcao == 1) {
	                Login.FazerLogin(); 

	            } else if (opcao == 2) {
	            	Produtos.ExibirTodasCategorias(); 
	            	 
	            } else if (opcao == 3) {
	                System.out.println("Processando pagamento...");
	                

	            } else if (opcao == 4) {
	                System.out.println("Confirmando pagamento...");
	                
	            } else if (opcao == 5) {
	                System.out.println("Gerando nota fiscal...");
	               

	            } else if (opcao == 6) {
	                System.out.println("Saindo do sistema...");
	                break;

	            } else {
	                System.out.println("Opção inválida. Tente novamente.");
	            }

		
		
		
		}
		
		
		
		
	
	}
}
class Login {
	public static void FazerLogin() {
		Scanner tec = new Scanner(System.in);
		
		String LoginCorreto = "imovel";
		String SenhaCorreto = "senha";
		
		int tentativas = 0;
		
		while (tentativas < 3 ) {
			System.out.println("Digite o login");
			String Login = tec.nextLine();
			System.out.println("--------");
			System.out.println("Digite a Senha");
			String Senha = tec.nextLine();
			
			if (LoginCorreto.equals(Login) && SenhaCorreto.equals(Senha)) {
				System.out.println("Login realizado com sucesso");
				return;
			} else {
				tentativas++;
				System.out.println("Login e Senha estão Incorretos");
			}
			
		}
		System.out.println("Número Máximo de tentativas atingido");
	}
}

class Produtos {
	static String[] utensilios = {
	        "Espátula de Silicone", "Tesoura", "Ralador", "Colher de Pau", "Funil",
	        "Conjunto de Medidores", "Abridor de Latas", "Abridor de Garrafas", "Pinça",
	        "Saca-Rolhas", "Peneira Média", "Peneira Pequena", "Xícara de Medidas",
	        "Rolo para Massas"
	    };

	    static String[] panelas = {
	        "Panela Grande", "Panela Média", "Panela Pequena", "Panela de Pressão",
	        "Frigideira Média Antiderente", "Leitera ou Caneca para Líquidos"
	    };

	    static String[] formas = {
	        "Forma para Pizza", "Forma Retangular", "Forma Redonda", "Forma Redonda com Furo"
	    };

	    static String[] facas = {
	        "Faca Grande para Carnes", "Faca Média", "Faca para Pães", "Faca para Legumes"
	    };

	    static String[] acessorios = {
	        "Tábua de Corte de Vidro", "Concha Grande", "Escumadeira", "Garfão", 
	        "Escorredor de Macarrão", "Formas de Gelo", "Luva de Silicone", "Coador de Café"
	    };
	    
	    public static void exibirProdutos(String[] categoria, String utensilios) {
	        System.out.println("\n=== " + utensilios + " ===");
	        for (String produto : categoria) {
	            System.out.println("- " + produto);
	        }

	    }
	    public static void ExibirTodasCategorias() {
		        exibirProdutos(utensilios, "Utensílios de Cozinha");
		        exibirProdutos(panelas, "Panelas");
		        exibirProdutos(formas, "Formas");
		        exibirProdutos(facas, "Facas");
		        exibirProdutos(acessorios, "Acessórios");
			
		}
		
	    
	
	
	
}
