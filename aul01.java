package aula01;
import java.util.Scanner;
public class aul01 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
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
	               Produtos.MostrarProdutos(formas);
	               

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
	public void MostrarProdutos(String[] lista, String categoria) {
		System.out.println("\n=== " + categoria + " ===");
	    for (String item : lista) {
	        System.out.println("- " + item);
	}
			
	
	
	
	{
		String[] utensilios  ={
			"Espátula de Silicone",
			"tesoura",
			"ralador",
			"colher de pau",
			"funil",
			"Conjunto de medidores",
			"Abridor de latas",
			"Abridor de garrafas",
			"pinça",
			"saca-rolhas",
			"peneira média",
			"peneira pequena",
			"xícara de medidas",
			"Rolo para abrir massas (plástico ou madeira)"
		};
		String [] panelas = {
			"Panela grande",
			"Panela média",
			"Panela pequena",
			"Panela de pressão",
			"Frigideira média antiderente com tampa",
			"leitera ou caneca para ferver os liquidos"				
		};
		 String[] formas = {
		            "Forma para pizza", 
		            "Forma para pizza",
		            "Forma retangular", 
		            "Forma redonda", 
		            "Forma redonda com furo no meio"
		        };
	
			String[] facas = {
		            "Faca grande para corte de carnes", 
		            "Faca média", 
		            "Faca com serra para pães", 
		            "Faca com ponta fina para legumes"
		        };
			String[] acessorios = {
		            "Tábua de corte de vidro", 
		            "Concha grande", 
		            "Concha média", 
		            "Escumadeira", 
		            "Garfão para preparo de alimentos, especialmente carnes", 
		            "Escorredor de macarrão", 
		            "Formas de gelo ", 
		            "Pegadores de panela", 
		            "Pegadores de panela", 
		            "Luva de silicone", 
		            "Coador de café", 
		            "Chaleira"
		        };
			 MostrarProdutos(utensilios, "Utensílios de Cozinha");
		     MostrarProdutos(panelas, "Panelas");
		     MostrarProdutos(formas, "Formas");
		     MostrarProdutos(facas, "Facas");
		     MostrarProdutos(acessorios, "Acessórios");
		  
		     
	
	
	}  
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}}