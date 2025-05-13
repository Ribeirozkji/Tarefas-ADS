package atv;
	
	import java.util.Scanner;

public class aula {
	public static void main(String[] args) {
	Scanner tec = new Scanner (System.in);
	Questao01 q1 = new Questao01();
    q1.calcularIdadeEmDias();
    
    Questao02 q2 = new Questao02();
    q2.calcularIPI();
  
   Questao03 q3 = new Questao03();
    q3.ExibirMensagem();
    
    Questao06 q6 = new Questao06();
    q6.CalcularQuatroMedidas();
   
    Questao07 q7 = new Questao07();
    q7.CalcularVolume();
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
		}
	}
	
class Questao01 {
	public void calcularIdadeEmDias() {
	Scanner tec = new Scanner (System.in);
System.out.println("Escreva a idade em anos");
double anos = tec.nextDouble();

System.out.println("Escreva a idade em meses");
double meses = tec.nextDouble();

System.out.println("Escreva a idade em dias");
double dias = tec.nextDouble();

double idade = (anos * 365) + (meses * 30) + dias;
	
System.out.println("Sua Idade em dias é " + idade);	
	
	}
	
}
class Questao02 {
	public void calcularIPI () {
		Scanner tec = new Scanner (System.in);
		
		System.out.println("Digite o valor dp IPI");
		double IPI = tec.nextDouble();
		
		//Peça 1
		System.out.println("Digite o código da Peça 1");
		double Codigo1 = tec.nextDouble();
		
		System.out.println("digite o valor unitário da Peça 1");
		double valor1 = tec.nextDouble();
		
		System.out.println("digite a quantidade das Peças 1");
		double Quantidade1 = tec.nextDouble();
		
		//Peça 2
		System.out.println("Digite o código da Peça 2");
		double Código2 = tec.nextDouble();
		
		System.out.println("digite o valor unitário da Peça 2");
		double valor2 = tec.nextDouble();
		
		System.out.println("digite a quantidade das Peças 2");
		double Quantidade2 = tec.nextDouble();
		
	
	
	double CalcularTotal =  (valor1*Quantidade1 + valor2*Quantidade2)*(IPI/100 + 1);
	System.out.println(CalcularTotal);
	
	
	}
	
}
class Questao03 {
public void ExibirMensagem () {
    for (int i = 1; i <= 20; i++) {
        System.out.println(i + " - Eu, Davi gosto de estudar Algoritmos!");
    }
}


}
class Questao06 {
	public void CalcularQuatroMedidas () {
		Scanner tec = new Scanner (System.in);
		
		System.out.println("Digite a Altura da Parede");
		double hp = tec.nextDouble();
		
		System.out.println("Digite a Largura da parede");
		double lp = tec.nextDouble();
		
		System.out.println("Digite a Altura do azulejo");
		double ha = tec.nextDouble();
		
		System.out.println("Digite a Largura do azulejo");
		double la = tec.nextDouble();
		
		double parede = hp * lp;
		double azulejo = ha * la;
		
		
		 double numeroAzulejos = (parede / azulejo);
		 System.out.println("Número de Azulejos necessários" + numeroAzulejos);
	}
}

class Questao07 {
	public void CalcularVolume (){
		Scanner tec = new Scanner (System.in);
		double PI = 3.14159;
		
		System.out.println("Digite o Raio da lata");
		double r = tec.nextDouble();
		
		System.out.println("Digite A Altura da lata");
		double a = tec.nextDouble();
		
		double V = PI * r * a;
		
		System.out.println(V);
	}
}
