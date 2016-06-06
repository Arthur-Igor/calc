public class Calculadora {
private String propietario;
public Calculadora (String nome){
	propietario = nome;
}
	public String toString()
	{
		return "calculadora de" + propietario;
	}

	public double somar(double v1, double v2){
		return v1 + v2;
	}
	
	public double subtrair(double v1, double v2){
		return v1 - v2;
	}
	public double dividir(double v1, double v2){
		return v1 / v2;
	}
		public double mutiplicar(double v1, double v2){
			return v1 * v2;
	}
		public double potencia(double a1, double a2) {
			double potencia = 1;
			for (int i = 0; i < a2; i++) {
				potencia = potencia * a1;
			}
			return potencia;
	}
		public boolean ehPar(double valor) {
			return valor % 2 == 0;
		}
	
}
