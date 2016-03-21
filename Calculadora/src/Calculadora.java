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
	
}
