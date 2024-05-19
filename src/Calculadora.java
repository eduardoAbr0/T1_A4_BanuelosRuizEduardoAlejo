import java.text.DecimalFormat;

public class Calculadora {
	DecimalFormat decimalFormat = new DecimalFormat("#.##");

	public double suma(double n1, double n2) {
		String form = decimalFormat.format( n1+n2);
		return Double.parseDouble(form);
	}
	public double resta(double n1, double n2) {
		String form = decimalFormat.format( n1-n2);
		return Double.parseDouble(form);
	}

	public double multiplicacion(double n1, double n2) {
		String form = decimalFormat.format( n1*n2);
		return Double.parseDouble(form);
	}
	public double division(double n1, double n2) {
		String form = decimalFormat.format( n1/n2);
		return Double.parseDouble(form);
	}
	public double negativoPos(double n1) {
		String form = decimalFormat.format( -1*n1);
		return Double.parseDouble(form);
	}
	public double raiz(double n1) {
		String form = decimalFormat.format(Math.sqrt(n1));
		return Double.parseDouble(form);
	}
	public double residuo(double n1, double n2) {
		String form = decimalFormat.format( n1%n2);
		return Double.parseDouble(form);
	}
	public double potenciaCuadrada(double n1) {
		String form = decimalFormat.format(Math.pow(n1, 2));
		return Double.parseDouble(form);
	}
	public double division1(double n1) {
		String form = decimalFormat.format(1/n1);
		return Double.parseDouble(form);

	}
}
