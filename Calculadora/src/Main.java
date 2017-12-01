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
	String nome = "usuário";
//inicio do bloco de repeticao
	while (proximo == true){

		Calculadora calc = new Calculadora(nome);


		System.out.println("Qual operação você quer realizar?\n "
					+ "1-soma;\n 2-subtração;\n 3-divisão;\n 4-multiplicação;\n 5-potenciação;");
	
			operacao = leia.nextInt();
		
			//inicio da seleção dos itens do menu
			switch(operacao){
    case 1:
    	System.out.println("============================================SOMA============================================");
    	a1 = verifica();
    	a2 = verifica();
    	imprime("soma", calc.somar(a1, a2));
           
            break;
    
    case 2:
    	System.out.println("============================================SUBTRAÇÃO============================================");
    	a1 = verifica();
    	a2 = verifica();

    	imprime("subtracao", calc.subtrair(a1, a2));
            break;
    
    case 3:
    	System.out.println("============================================DIVISÃO============================================");
    	a1 = verifica();
    	a2 = verifica();
    	imprime("divisao", calc.dividir(a1, a2));
            break;
    
    case 4:
    	System.out.println("============================================MULTIPLICAÇÃO============================================");
    	a1 = verifica();
    	a2 = verifica();
    	imprime("multiplicacao", calc.mutiplicar(a1, a2));	
    		break;
    
    case 5:
    	System.out.println("============================================POTENCIAÇÃO============================================");
    	a1 = verifica();
    	a2 = verifica();
    	imprime("potenciacao", calc.potencia(a1, a2));
			break;
    case 6:
    	System.out.println("============================================VERIFICA SE O NUMERO É PAR============================================");
    	
		a1 = verifica();

		System.out.println("O resultado de ehPar foi: " + calc.ehPar(a1));
		break;
    	
    		
    default:
    	System.out.println("Operação inválida! Tente novamente!");
    	
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
	//Implementaçoa para verificar se o que foi digitado é valido
	public static double verifica(){
		boolean naoEDouble = true;
		double valor = 0;
		while (naoEDouble) {
			Scanner leitor = new Scanner(System.in);
			System.out.println("Digite o valor: ");
			try {
				valor = leitor.nextDouble();
				naoEDouble = false;
			} catch (Exception e) {
				System.out.println("Os dados digitados nao são válidos!");
			}
		}
		return valor;
	}
}
