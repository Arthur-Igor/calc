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
//inicio do bloco de repetição
while (proximo){

Calculadora calc = new Calculadora("um teste legal");


System.out.println("escole um ai \n 1=soma \n 2=subtracao \n 3 = divisao \n 4 = multiplicacao");
a = leia.nextInt();
System.out.println("agr escolhe 1 numero");
a1 = leia.nextDouble();
System.out.println("agr escolhe 1 numero");
a2 = leia.nextDouble();

switch(a){
    case 1:
    	System.out.println(calc.somar(a1,a2));
           
            break;
    
    case 2:

    	System.out.println(calc.subtrair(a1, a2));
            break;
    
    case 3:
        System.out.println(calc.dividir(a1, a2));
            break;
    
    case 4:
    	System.out.println(calc.mutiplicar(a1, a2));	
    	break;
    case 5:
	System.out.println(calc.potencia(a1, a2));
		break;
    	
    	
    		
    default:
    	System.out.println("qr bagunçar?");
    	
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

}
