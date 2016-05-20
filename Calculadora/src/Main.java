import java.util.Scanner;
public class Main {
//class main - barnche-master
private static Scanner leia;
	

	public static void main(String[] args) {
leia = new Scanner(System.in);
//variaveis
	double a1;
	double a2;
	int a=0;
	boolean proximo = true;
	String nome = "usuário";
//inicio do bloco de repetiÃ§Ã£o
	while (proximo){

		Calculadora calc = new Calculadora(nome);


		System.out.println("escole um ai \n 1=soma \n 2=subtracao \n 3 = divisao \n 4 = multiplicacao \n 5 = potenciacao");
			a = leia.nextInt();
		System.out.println("agr escolhe 1 numero");
			a1 = leia.nextDouble();
		System.out.println("agr escolhe 1 numero");
			a2 = leia.nextDouble();

switch(a){
    case 1:
    	imprime("soma", calc.somar(a1, a2));
           
            break;
    
    case 2:

    	imprime("subtracao", calc.subtrair(a1, a2));
            break;
    
    case 3:
    	imprime("divisao", calc.dividir(a1, a2));
            break;
    
    case 4:
    	imprime("multiplicacao", calc.mutiplicar(a1, a2));	
    		break;
    
    case 5:
    	imprime("potenciacao", calc.potencia(a1, a2));
			break;
    	
    	
    		
    default:
    	System.out.println("Operação inválida! Tente novamente!");
    	
    	}



		System.out.println("deseja repetir? [s|n]");
		String continua = leia.next();
			if(continua.equals("n") || continua.equals("N"))
				System.out.println("Good bye");
			{
	proximo = false;
			}
		}
	}
	public static void imprime(String nomeOper, double resultado) {
		System.out.println("O resultado da " + nomeOper + " foi: " + resultado);
		//
	}
}
