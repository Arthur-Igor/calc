import java.util.Scanner;
public class Main {
//class main - branch-master
private static Scanner leia;
	

	public static void main(String[] args) {
leia = new Scanner(System.in);
//variaveis
	double a1;
	double a2;
	int operacao=0;
	boolean proximo = true;
	String nome = "usu�rio";
//inicio do bloco de repeticao
	while (proximo == true){

		Calculadora calc = new Calculadora(nome);


		System.out.println("Qual opera��o voc� quer realizar?\n "
					+ "1-somar;\n 2-subtrair;\n 3-dividir;\n 4-multiplicar;\n 5-potencia");
		//menu
			operacao = leia.nextInt();
		System.out.println("agr escolhe 1 numero");
			a1 = leia.nextDouble();
		System.out.println("agr escolhe 1 numero");
			a2 = leia.nextDouble();
		//fimMenu
			//inicio da sele��o dos itens do menu
			switch(operacao){
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
    	System.out.println("Opera��o inv�lida! Tente novamente!");
    	
    	}
			//fimSelecao

			//selecao para repetir alguma operacao
		System.out.println("deseja repetir? [s|n]");
		String continua = leia.next();
			if(continua.equals("n") || continua.equals("N")){
				System.out.println("Good bye");
				proximo = false;
			}
	
			//fimSelecao
		}
	}
	//Implementacao para imprimir o resultado das operacoes
	public static void imprime(String nomeOper, double resultado) {
		System.out.println("O resultado da " + nomeOper + " foi: " + resultado);
		//
	}
	//Implementa�oa para verificar se o que foi digitado � valido
	public static double verificaDouble(){
		boolean naoEDouble = true;
		double valor = 0;
		while (naoEDouble) {
			Scanner leitor = new Scanner(System.in);
			System.out.println("Digite o valor: ");
			try {
				valor = leitor.nextDouble();
				naoEDouble = false;
			} catch (Exception e) {
				System.out.println("Os dados digitados nao s�o v�lidos!");
			}
		}
		return valor;
	}
}
